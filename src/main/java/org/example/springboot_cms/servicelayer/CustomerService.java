package org.example.springboot_cms.servicelayer;

import org.example.springboot_cms.persistantlayer.Customer;
import org.example.springboot_cms.persistantlayer.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    private CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    public String createCustomer(Customer customer){
        return customerDao.save(customer).getName()+" has been added to the database";
    }

    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>) customerDao.findAll();
    }

    @Override
    public String deleteCustomer(Integer id) {
        customerDao.deleteById(id);
        return "customer with id "+id+" has been deleted from the database";
    }

    public Customer getCustomer(Integer id){
        return customerDao.findById(id).get();
    }
}
