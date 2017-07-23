package br.com.ecommerce.api.ecommerceapi;

import br.com.ecommerce.api.ecommerceapi.category.Category;
import br.com.ecommerce.api.ecommerceapi.category.CategoryService;
import br.com.ecommerce.api.ecommerceapi.category.CategoryUtil;
import br.com.ecommerce.api.ecommerceapi.product.Product;
import br.com.ecommerce.api.ecommerceapi.product.ProductService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */

public class CayegoryTests extends ApplicationTests {

    private static Category category;

    @Test
    public void CRUDTest(){
        Category category = CategoryUtil.getInstance().createCategory();
        categoryService.save(category);
        if(!categoryService.findOne(category.getId()).equals(category)){
            throw new RuntimeException();
        }
        category.setDescription("Desc");
        categoryService.save(category);
        categoryService.delete(category.getId());
    }

}
