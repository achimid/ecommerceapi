package br.com.ecommerce.api.ecommerceapi.orderdetail;

import br.com.ecommerce.api.ecommerceapi.base.BaseDomain;
import br.com.ecommerce.api.ecommerceapi.order.Order;
import br.com.ecommerce.api.ecommerceapi.product.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by Lourran on 16/07/2017.
 */
@Data
@Entity
@Table(name = "orderdetails")
@EqualsAndHashCode(of = "id", callSuper = false)
public class OrderDetail extends BaseDomain{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @NotNull(message = "Price não pode ser null")
    private BigDecimal price;

    @NotNull(message = "Quantity não pode ser null")
    private BigDecimal quantity;

}
