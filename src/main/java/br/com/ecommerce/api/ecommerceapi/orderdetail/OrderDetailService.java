package br.com.ecommerce.api.ecommerceapi.orderdetail;

import br.com.ecommerce.api.ecommerceapi.base.intefaces.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
@Service
public class OrderDetailService implements BaseService<OrderDetail> {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> findAll() {
        return (List<OrderDetail>) orderDetailRepository.findAll();
    }

    @Override
    public OrderDetail findOne(Long id) {
        return orderDetailRepository.findOne(id);
    }

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }

    public void save(List<OrderDetail> orderDetails) {
        orderDetailRepository.save(orderDetails);
    }

    @Override
    public void delete(Long id) {
        if (orderDetailRepository.exists(id)) {
            orderDetailRepository.delete(id);
        } else {
            throw new RuntimeException("Pedido não encontrado");
        }
    }

    public Boolean exists(Long id){
        return orderDetailRepository.exists(id);
    }
}
