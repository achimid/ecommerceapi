package br.com.ecommerce.api.ecommerceapi.product;

import br.com.ecommerce.api.ecommerceapi.base.BaseDomain;
import br.com.ecommerce.api.ecommerceapi.category.Category;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */
@Data
@Entity
@Table(name = "products")
@EqualsAndHashCode(of = "id", callSuper = false)
public class Product extends BaseDomain {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O nome nao pode ser nulo")
    @NotEmpty(message = "O nome nao pode ser vazio")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "O preco nao pode ser nulo")
    @Column(nullable = false)
    private BigDecimal priceSale;

    private BigDecimal priceCost;

    private String url;

    private String description;

    @ManyToOne
    @JoinColumn(name="id_category")
    private Category category;

}
