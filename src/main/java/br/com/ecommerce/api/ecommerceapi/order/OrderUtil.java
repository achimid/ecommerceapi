package br.com.ecommerce.api.ecommerceapi.order;

import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetail;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetailUtil;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public class OrderUtil {

    public static Order createOrder(){

        Order order = new Order();

        List<OrderDetail> details = new LinkedList<>();
        details.add(OrderDetailUtil.createOrderDetail(order));
        details.add(OrderDetailUtil.createOrderDetail(order));
        details.add(OrderDetailUtil.createOrderDetail(order));

        order.setDateOrder(GregorianCalendar.getInstance().getTime());
        order.setDetails(details);

        return order;

    }

}
