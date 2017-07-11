package br.com.ecommerce.api.ecommerceapi.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Lourran on 11/07/2017.
 */
@Data
@Entity
@EqualsAndHashCode(of = "id", callSuper = false)
public class Product extends BaseDomain {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal priceSale;
    private BigDecimal priceCost;
    private String description;

}
