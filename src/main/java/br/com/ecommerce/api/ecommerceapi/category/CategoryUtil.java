package br.com.ecommerce.api.ecommerceapi.category;

/**
 * Created by Lourran on 11/07/2017.
 */
public class CategoryUtil {

    public static Category createCategory(){
        Category category = new Category();

        category.setName("Pizzas");
        category.setDescription("Pizzas category");

        return category;
    }

}
