package com.silhouette.team2.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;
    private String customerName;
    private String dob;
    private String gender;
    private String ContactNo;
    private String customerEmail;
    private String address;


}
