package br.com.ecommerce.api.ecommerceapi;

import br.com.ecommerce.api.ecommerceapi.product.Product;
import br.com.ecommerce.api.ecommerceapi.product.ProductService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */

public class ProductTests extends ApplicationTests {

    @InjectMocks
    @Autowired
    ProductService productService;

    public static Product createProduct(){
        Product product = new Product();
        product.setName("Pizza");
        product.setDescription("Made of Cheese");
        product.setPriceSale(new BigDecimal(15));
        product.setPriceSale(new BigDecimal(7));
        return product;
    }

    @Test
    public void save(Product product){
        productService.save(createProduct());
    }

}
