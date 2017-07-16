package br.com.ecommerce.api.ecommerceapi.base.intefaces;

import br.com.ecommerce.api.ecommerceapi.order.Order;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public interface BaseControllerDocumentation<T> {

    @ApiOperation(value = "Retorna todos os Objetos.")
    List<T> index();

    @ApiOperation(value = "Cadastra um novo Objeto no bando de dados.")
    public HttpEntity<T> create(@RequestBody T obj);

    @ApiOperation(value = "Altera as informações do Objeto.")
    public HttpEntity<?> update(@Valid @RequestBody T obj);

    @ApiOperation(value = "Deleta o Objeto com o id informado")
    public HttpEntity<?> delete(@PathVariable Long id);

    @ApiOperation(value = "Retorna o Objeto com o id informado.")
    public HttpEntity<T> get(@PathVariable Long id);

    @ApiOperation(value = "Cria um novo Objeto, para teste.")
    public HttpEntity<T> get();
}
