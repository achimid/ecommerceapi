package br.com.ecommerce.api.ecommerceapi.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

/**
 * Created by Lourran on 11/07/2017.
 */
@Data
@MappedSuperclass
public class BaseDomain {
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    protected LocalDateTime createdAt;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    protected LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
