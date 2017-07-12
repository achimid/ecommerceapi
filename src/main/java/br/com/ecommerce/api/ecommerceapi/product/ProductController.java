package br.com.ecommerce.api.ecommerceapi.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        return productService.findAll();
    }

    @PostMapping
    public HttpEntity<Product> create(@RequestBody Product product){
        productService.save(product);
        return ResponseEntity.ok(product);
    }

    @PutMapping
    public HttpEntity<?> update(@Valid @RequestBody Product product){
        return create(product);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> delete(@PathVariable Long id){
        if(!productService.exists(id))
            return ResponseEntity.notFound().build();
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public HttpEntity<Product> get(@PathVariable Long id){
        Product product = productService.findOne(id);
        if(product == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(product);
    }

    @GetMapping("/newTest")
    public HttpEntity<Product> get(){
        return create(ProductUtil.createProduct());
    }

}
