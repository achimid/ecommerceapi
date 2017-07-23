package br.com.ecommerce.api.ecommerceapi.product;

import br.com.ecommerce.api.ecommerceapi.category.Category;
import br.com.ecommerce.api.ecommerceapi.category.CategoryUtil;

import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */
public class ProductUtil {

    private static ProductUtil productUtil;

    public static ProductUtil getInstance(){
        if(productUtil == null){
            productUtil = new ProductUtil();
        }
        return productUtil;
    }

    public Product createProduct(){
        Product product = new Product();
        product.setName("Pizza");
        product.setDescription("Made of Cheese");
        product.setPriceSale(new BigDecimal(15));
        product.setPriceSale(new BigDecimal(7));
        product.setUrl("http://www.alexandroff.com.br/wordpress/wp-content/uploads/2010/08/fone-mockup-3d.jpg");

        product.setCategory(CategoryUtil.getInstance().createCategory());

        return product;
    }

    public Product createProduct(Category category){
        Product product = createProduct();
        product.setCategory(category);
        return product;
    }

}
