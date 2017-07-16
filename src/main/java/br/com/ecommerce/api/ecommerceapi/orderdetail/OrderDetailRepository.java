package br.com.ecommerce.api.ecommerceapi.orderdetail;

import br.com.ecommerce.api.ecommerceapi.order.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Lourran on 11/07/2017.
 */
@Repository
public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {

}
