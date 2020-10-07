package com.silhouette.team2.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {






    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "products")
    private Set<Customer> customers;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "productID"))
    private Order order;
}
