package br.com.ecommerce.api.ecommerceapi.orderdetail;

import br.com.ecommerce.api.ecommerceapi.order.Order;
import br.com.ecommerce.api.ecommerceapi.product.ProductUtil;

import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */
public class OrderDetailUtil {


    public static OrderDetail createOrderDetail(Order order){

        OrderDetail detail = new OrderDetail();

        detail.setPrice(new BigDecimal(10.00));
        detail.setQuantity(new BigDecimal(5.5));
        detail.setProduct(ProductUtil.createProduct());
        detail.setOrder(order);

        return detail;

    }

}
