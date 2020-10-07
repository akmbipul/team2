package com.silhouette.team2.entity;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;
    private int amount;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "payment")
    private Order order;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "customerID"))
    private Customer customer;

    public Payment() {
    }

    public Payment(int transactionId, int amount, Order order, Customer customer) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.order = order;
        this.customer = customer;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", order=" + order +
                ", customer=" + customer +
                '}';
    }
}
