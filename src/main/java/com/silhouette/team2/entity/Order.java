package com.silhouette.team2.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Order {



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "customerID"))
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "order")
    private Set<Product> products;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "order")
    private Payment payment;



}
