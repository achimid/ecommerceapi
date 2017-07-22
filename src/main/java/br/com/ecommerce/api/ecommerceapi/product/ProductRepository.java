package br.com.ecommerce.api.ecommerceapi.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);
}
