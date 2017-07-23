package br.com.ecommerce.api.ecommerceapi.order;

import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetail;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetailUtil;
import br.com.ecommerce.api.ecommerceapi.product.Product;
import br.com.ecommerce.api.ecommerceapi.product.ProductUtil;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public class OrderUtil {

    private static OrderUtil productUtil;

    public static OrderUtil getInstance(){
        if(productUtil == null){
            productUtil = new OrderUtil();
        }
        return productUtil;
    }

    public Order createOrder(){
        Order order = new Order();
        order.setDateOrder(GregorianCalendar.getInstance().getTime());
        order.setFinalPrice(new BigDecimal(55));

        List<OrderDetail> details = new LinkedList<>();
        details.add(OrderDetailUtil.getInstance().createOrderDetail(order));
        details.add(OrderDetailUtil.getInstance().createOrderDetail(order));
        details.add(OrderDetailUtil.getInstance().createOrderDetail(order));
        details.add(OrderDetailUtil.getInstance().createOrderDetail(order));

        order.setDetails(details);
        return order;
    }

    public Order createOrder(List<OrderDetail> details){
        Order order = createOrder();
        //order.setDetails(details);
        return order;
    }

}
