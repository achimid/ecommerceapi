package br.com.ecommerce.api.ecommerceapi.category;

import br.com.ecommerce.api.ecommerceapi.category.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    List<Category> findByName(String name);
}
