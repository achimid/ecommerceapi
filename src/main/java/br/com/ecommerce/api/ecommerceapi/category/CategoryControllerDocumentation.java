package br.com.ecommerce.api.ecommerceapi.category;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public interface CategoryControllerDocumentation {

    @ApiOperation(value = "Retorna todos as categorias.")
    List<Category> index();

    @ApiOperation(value = "Cadastra uma nova categoria no bando de dados.")
    public HttpEntity<Category> create(@RequestBody Category obj);

    @ApiOperation(value = "Altera as informações da categoria.")
    public HttpEntity<?> update(@Valid @RequestBody Category obj);

    @ApiOperation(value = "Deleta a categoria com o id informado")
    public HttpEntity<?> delete(@PathVariable Long id);

    @ApiOperation(value = "Retorna a categoria com o id informado.")
    public HttpEntity<Category> get(@PathVariable Long id);

    @ApiOperation(value = "Cria uma nova categoria, para teste.")
    public HttpEntity<Category> get();
}
