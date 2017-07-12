package br.com.ecommerce.api.ecommerceapi.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
@RestController
@RequestMapping( "/api/v1/products")
public class ProductController implements ProductControllerDocumentation {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> index(){
        productService.save(ProductUtil.createProduct());
        return productService.findAll();

    }




}
