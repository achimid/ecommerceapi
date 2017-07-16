package br.com.ecommerce.api.ecommerceapi.order;

import br.com.ecommerce.api.ecommerceapi.base.intefaces.BaseControllerDocumentation;
import br.com.ecommerce.api.ecommerceapi.product.Product;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public interface OrderControllerDocumentation<T>  extends BaseControllerDocumentation<T>{

    @Override
    @ApiOperation(value = "Retorna todos os pedidos.")
    public List<T> index();

    @Override
    @ApiOperation(value = "Cadastra um novo pedido no bando de dados.")
    public HttpEntity<T> create(@RequestBody T obj);

    @Override
    @ApiOperation(value = "Altera as informações do pedido.")
    public HttpEntity<?> update(@Valid @RequestBody T obj);

    @Override
    @ApiOperation(value = "Deleta o pedido com o id informado")
    public HttpEntity<?> delete(@PathVariable Long id);

    @Override
    @ApiOperation(value = "Retorna o pedido com o id informado.")
    public HttpEntity<T> get(@PathVariable Long id);

    @Override
    @ApiOperation(value = "Cria um novo pedido, para teste.")
    public HttpEntity<T> get();
}
