package org.example.springboot_cms.servicelayer;

import org.example.springboot_cms.persistantlayer.Customer;

import java.util.List;

public interface ICustomerService {
    public String createCustomer(Customer customer);
    public List<Customer> getCustomers();

    public String deleteCustomer(Integer id);
}
