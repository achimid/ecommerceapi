package br.com.ecommerce.api.ecommerceapi.orderdetail;

import br.com.ecommerce.api.ecommerceapi.order.Order;
import br.com.ecommerce.api.ecommerceapi.order.OrderUtil;
import br.com.ecommerce.api.ecommerceapi.product.ProductService;
import br.com.ecommerce.api.ecommerceapi.product.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public class OrderDetailUtil {

    @Autowired
    private static ProductService productService;

    private static OrderDetailUtil orderDetailUtil;

    public static OrderDetailUtil getInstance(){
        if(orderDetailUtil == null){
            orderDetailUtil = new OrderDetailUtil();
            productService = new ProductService();
        }
        return orderDetailUtil;
    }

    public OrderDetail createOrderDetail(){

        OrderDetail detail = new OrderDetail();

        detail.setPrice(new BigDecimal(10.00));
        detail.setQuantity(new BigDecimal(5.5));
        detail.setProduct(ProductUtil.getInstance().createProduct());

        productService.save(detail.getProduct());

        return detail;

    }

    public OrderDetail createOrderDetail(Order order){
        OrderDetail detail = createOrderDetail();
        detail.setOrder(order);
        return detail;

    }

}
