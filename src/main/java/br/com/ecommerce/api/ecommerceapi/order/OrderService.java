package br.com.ecommerce.api.ecommerceapi.order;

import br.com.ecommerce.api.ecommerceapi.base.intefaces.BaseService;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetail;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetailRepository;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetailService;
import br.com.ecommerce.api.ecommerceapi.product.Product;
import br.com.ecommerce.api.ecommerceapi.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
@Service
public class OrderService implements BaseService<Order> {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailService orderDetailService;

    @Override
    public List<Order> findAll() {
        return (List<Order>) orderRepository.findAll();
    }

    @Override
    public Order findOne(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    @Transactional
    public void save(Order order) {
        orderDetailService.save(order.getDetails());
        calculateOrder(order);
        orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        if (orderRepository.exists(id)) {
            orderRepository.delete(id);
        } else {
            throw new RuntimeException("Pedido não encontrado");
        }
    }

    public void calculateOrder(Order order){
        BigDecimal sum = BigDecimal.ZERO;
        for(OrderDetail detail: order.getDetails()){
            sum = sum.add(detail.getPrice());
        }
        order.setFinalPrice(sum);
    }

    public Boolean exists(Long id){
        return orderRepository.exists(id);
    }
}
