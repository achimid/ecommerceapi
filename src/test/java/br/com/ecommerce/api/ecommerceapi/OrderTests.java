package br.com.ecommerce.api.ecommerceapi;

import br.com.ecommerce.api.ecommerceapi.order.Order;
import br.com.ecommerce.api.ecommerceapi.order.OrderUtil;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetail;
import br.com.ecommerce.api.ecommerceapi.product.Product;
import br.com.ecommerce.api.ecommerceapi.product.ProductUtil;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */

public class OrderTests extends ApplicationTests {

    @Test
    public void CRUDTest(){
        Order order = OrderUtil.getInstance().createOrder();

        for(OrderDetail detail : order.getDetails()){
            detail.setProduct(productService.findAll().iterator().next());
        }

        orderService.save(order);
        if(!orderService.findOne(order.getId()).equals(order)){
            throw new RuntimeException();
        }
        order.setFinalPrice(new BigDecimal(1));
        orderService.save(order);
        orderService.delete(order.getId());
    }

}
