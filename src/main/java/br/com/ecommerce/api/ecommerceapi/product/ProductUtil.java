package br.com.ecommerce.api.ecommerceapi.product;

import br.com.ecommerce.api.ecommerceapi.category.CategoryUtil;

import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */
public class ProductUtil {

    public static Product createProduct(){
        Product product = new Product();
        product.setName("Pizza");
        product.setDescription("Made of Cheese");
        product.setPriceSale(new BigDecimal(15));
        product.setPriceSale(new BigDecimal(7));

        product.setCategory(CategoryUtil.createCategory());

        return product;
    }

}
