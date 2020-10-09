package com.silhouette.team2.services;

import com.silhouette.team2.dataRepository.CustomerRepository;
import com.silhouette.team2.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CustomerService {
   //Sohag vai wants to find out if that changes been updated with master
    @Autowired
    CustomerRepository customerRepository;


    public Set<Customer> retrieveCustomer(){
        Set<Customer> customerSet = (Set<Customer>)customerRepository.findAll();
        return customerSet;
    }

    public Customer createCustomer(Customer customer){
        customerRepository.save(customer);
        return customer;
    }

    public Optional<Customer> findCustomerById(Integer id){
        return customerRepository.findById(id);
    }

    public Customer updateCustomer(Customer customer, Integer id){

        return customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id){

        customerRepository.deleteById(id);
    }

}
