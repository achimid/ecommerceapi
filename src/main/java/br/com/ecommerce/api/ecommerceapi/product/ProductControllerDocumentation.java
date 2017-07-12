package br.com.ecommerce.api.ecommerceapi.product;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public interface ProductControllerDocumentation {

    @ApiOperation(value = "Retorna todos os produtos.")
    List<Product> index();

    @ApiOperation(value = "Cadastra um novo produto no bando de dados.")
    public HttpEntity<Product> create(@RequestBody Product product);

    @ApiOperation(value = "Altera as informações do produto.")
    public HttpEntity<?> update(@Valid @RequestBody Product product);

    @ApiOperation(value = "Deleta o produto com o id informado")
    public HttpEntity<?> delete(@PathVariable Long id);

    @ApiOperation(value = "Retorna o produto com o id informado.")
    public HttpEntity<Product> get(@PathVariable Long id);

    @ApiOperation(value = "Cria um novo produto, para teste.")
    public HttpEntity<Product> get();
}
