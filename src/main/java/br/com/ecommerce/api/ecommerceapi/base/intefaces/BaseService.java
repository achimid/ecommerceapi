package br.com.ecommerce.api.ecommerceapi.base.intefaces;

import br.com.ecommerce.api.ecommerceapi.product.Product;

import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public interface BaseService<T> {

    List<T> findAll();

    public Product findOne(Long id);

    void save(T obj);

    void delete(Long id);
}
