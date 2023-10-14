package com.grpc.discount.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "external_id")
    private String externalId;
    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Discount> discounts;
}
