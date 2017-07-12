package br.com.ecommerce.api.ecommerceapi.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Lourran on 11/07/2017.
 */
@Data
@Entity
@EqualsAndHashCode(of = "id", callSuper = false)
public class Category extends BaseDomain {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
}
