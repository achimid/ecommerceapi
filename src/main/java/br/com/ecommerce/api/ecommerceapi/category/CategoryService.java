package br.com.ecommerce.api.ecommerceapi.category;

import br.com.ecommerce.api.ecommerceapi.base.intefaces.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
@Service
public class CategoryService implements BaseService<Category> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Category findOne(Long id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        if (categoryRepository.exists(id)) {
            categoryRepository.delete(id);
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }

    public Boolean exists(Long id){
        return categoryRepository.exists(id);
    }
}
