package com.silhouette.team2.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;
    private String customerName;
    private String customerDOB;
    private String customerGender;
    private String customerContactNo;
    private String customerEmail;
    private String customerAddress;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customers")
    private Set<Product> products;

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customers")
    private Set <Order> orders ;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private Set <Payment> payments;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String customerDOB, String customerGender, String customerContactNo, String customerEmail, String customerAddress, Set<Product> products, Set<Order> orders, Set<Payment> payments) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerDOB = customerDOB;
        this.customerGender = customerGender;
        this.customerContactNo = customerContactNo;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.products = products;
        this.orders = orders;
        this.payments = payments;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerDOB() {
        return customerDOB;
    }

    public void setCustomerDOB(String customerDOB) {
        this.customerDOB = customerDOB;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerContactNo() {
        return customerContactNo;
    }

    public void setCustomerContactNo(String customerContactNo) {
        this.customerContactNo = customerContactNo;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerDOB='" + customerDOB + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", customerContactNo='" + customerContactNo + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", products=" + products +
                ", orders=" + orders +
                ", payments=" + payments +
                '}';
    }
}
