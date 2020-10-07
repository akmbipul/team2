package com.silhouette.team2.entity;

import javax.persistence.*;

@Entity
public class Payment {


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "payment")
    private Order order;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "customerID"))
    private Customer customer;

}
