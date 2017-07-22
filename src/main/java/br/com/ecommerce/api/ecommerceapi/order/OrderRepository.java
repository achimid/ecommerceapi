package br.com.ecommerce.api.ecommerceapi.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Lourran on 11/07/2017.
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
