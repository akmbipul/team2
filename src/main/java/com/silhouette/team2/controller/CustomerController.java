package com.silhouette.team2.controller;

import com.silhouette.team2.entity.Customer;
import com.silhouette.team2.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/apiCustomer")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @GetMapping("/get-Customers")
    public ResponseEntity<Set<Customer>> getAllPerson() {

        Set<Customer> customers = customerService.retrieveCustomer();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @PostMapping("/savePerson")
    public ResponseEntity<Customer> savePerson(@RequestBody Customer customer) {

        Customer customer1 = customerService.createCustomer(customer);
        return new ResponseEntity<>(customer1, HttpStatus.OK);
    }

    @PutMapping("/UpdatePerson")
    public ResponseEntity<Customer> updatePerson(@RequestBody Customer customer,Integer customerID ) {

        Customer customer1 = customerService.updateCustomer(customer, customerID);
        return new ResponseEntity<>(customer1, HttpStatus.OK);
    }

    @DeleteMapping("/DeletePerson")
    public ResponseEntity<String> deleteProduct(@RequestParam(name = "personId") Integer customerID) {

        customerService.deleteCustomer(customerID);
        return new ResponseEntity<>("Person with ID :" + customerID + " deleted successfully", HttpStatus.OK);
    }
}
