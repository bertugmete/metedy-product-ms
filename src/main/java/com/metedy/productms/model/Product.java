package com.metedy.productms.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // JPA varligi
@Table( name="product") // DB tarafi icin
@Data
public class Product {
    // AUTO -> Hibernate selects the generation strategy based on used dialect
    // IDENTITY -> Hibernate relies on auto increment db
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false, length = 100)
    private String name;

    @Column(name="price", nullable = false)
    private String price;

    @Column(name="create_time", nullable = false)
    private LocalDateTime createTime;
}
