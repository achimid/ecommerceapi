package br.com.ecommerce.api.ecommerceapi.category;

import br.com.ecommerce.api.ecommerceapi.product.ProductUtil;

/**
 * Created by Lourran on 11/07/2017.
 */
public class CategoryUtil {

    private static CategoryUtil categoryUtil;

    public static CategoryUtil getInstance(){
        if(categoryUtil == null){
            categoryUtil = new CategoryUtil();
        }
        return categoryUtil;
    }

    public Category createCategory(){
        Category category = new Category();

        category.setName("Pizzas");
        category.setDescription("Pizzas category");

        return category;
    }

}
