package br.com.ecommerce.api.ecommerceapi.product;

import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
public interface ProductControllerDocumentation {

    @ApiOperation(value = "Retorna todos os produtos.")
    List<Product> index();

}
