package com.silhouette.team2.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.mapping.Set;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import javax.persistence.*;

import java.util.Set;

@Entity
@Table (name = "products")
public class Product {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;
    private String productName;
    private String productType;
    private String productDescription;
    private double retailPrice;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "products")
    private Set<Customer> customers;

    @ManyToMany(cascade =CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "products")
    private Set<Order> orders;

//     @OneToOne(cascade = CascadeType.ALL, fetch FetchType.LAZY, mappedBy = "products")
//     private Set<Payment> payments;


    public Product() { }

    public Product(int productID, String productName, String productType, String productDescription, double retailPrice, Set<Customer> customers, Set<Order> orders) {
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
        this.productDescription = productDescription;
        this.retailPrice = retailPrice;
        this.customers = customers;
        this.orders = orders;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", retailPrice=" + retailPrice +
                ", customers=" + customers +
                ", orders=" + orders +
                '}';
    }

}


