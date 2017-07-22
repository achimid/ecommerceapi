package br.com.ecommerce.api.ecommerceapi.orderdetail;

import br.com.ecommerce.api.ecommerceapi.base.intefaces.BaseControllerDocumentation;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public interface OrderDetailControllerDocumentation<T>  extends BaseControllerDocumentation<T>{

    @Override
    @ApiOperation(value = "Retorna todos os itens dos pedidos.")
    public List<T> index();

    @Override
    @ApiOperation(value = "Cadastra um novo item do pedido no bando de dados.")
    public HttpEntity<T> create(@RequestBody T obj);

    @Override
    @ApiOperation(value = "Altera as informações do item do pedido.")
    public HttpEntity<?> update(@Valid @RequestBody T obj);

    @Override
    @ApiOperation(value = "Deleta o pedido com o id informado")
    public HttpEntity<?> delete(@PathVariable Long id);

    @Override
    @ApiOperation(value = "Retorna o item do pedido com o id informado.")
    public HttpEntity<T> get(@PathVariable Long id);

    @Override
    @ApiOperation(value = "Cria um novo item do pedido, para teste.")
    public HttpEntity<T> get();
}
