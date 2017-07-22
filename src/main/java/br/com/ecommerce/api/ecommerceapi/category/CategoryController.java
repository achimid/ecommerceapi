package br.com.ecommerce.api.ecommerceapi.category;

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
@RequestMapping( "/api/v1/categories")
public class CategoryController implements CategoryControllerDocumentation {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> index(){
        return categoryService.findAll();
    }

    @PostMapping
    public HttpEntity<Category> create(@RequestBody Category category){
        categoryService.save(category);
        return ResponseEntity.ok(category);
    }

    @PutMapping
    public HttpEntity<?> update(@Valid @RequestBody Category product){
        return create(product);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> delete(@PathVariable Long id){
        if(!categoryService.exists(id))
            return ResponseEntity.notFound().build();
        categoryService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public HttpEntity<Category> get(@PathVariable Long id){
        Category category = categoryService.findOne(id);
        if(category == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(category);
    }

    @GetMapping("/newTest")
    public HttpEntity<Category> get(){
        return create(CategoryUtil.createCategory());
    }

}
