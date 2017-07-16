package br.com.ecommerce.api.ecommerceapi.order;

import br.com.ecommerce.api.ecommerceapi.base.BaseDomain;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetail;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Lourran on 16/07/2017.
 */
@Data
@Entity
@Table(name = "orders")
@EqualsAndHashCode(of = "id", callSuper = false)
public class Order extends BaseDomain {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "Date nao pode ser null")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrder;

    @NotNull(message = "Final Price nao pode ser nulo")
    private BigDecimal finalPrice;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "order")
    private List<OrderDetail> details;

    // @NotNull(message = "Order Adress nao pode ser nulo.")
    // @ManyToOne(optional = false)
    // private OrderAdress orderAdress;
}
