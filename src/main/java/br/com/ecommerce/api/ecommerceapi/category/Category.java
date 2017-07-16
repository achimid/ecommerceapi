package br.com.ecommerce.api.ecommerceapi.category;

import br.com.ecommerce.api.ecommerceapi.base.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Lourran on 11/07/2017.
 */
@Data
@Entity
@Table(name = "categories")
@EqualsAndHashCode(of = "id", callSuper = false)
public class Category extends BaseDomain {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
}
