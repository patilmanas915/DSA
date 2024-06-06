package org.example.springboot_cms.weblayer;

import org.example.springboot_cms.persistantlayer.Customer;
import org.example.springboot_cms.servicelayer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@Controller
public class CMSController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/showcustomer")
    public String showCustomer(Map<String, Object> model){
        List<Customer>cstms =customerService.getCustomers();
        model.put("customers", cstms);
        return "customerlist";

    }

    @GetMapping("/addcustomer")
    public String addCustomer(){
        return "addcustomer";
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@ModelAttribute Customer customer){
        customerService.createCustomer(customer);
        return "redirect:/showcustomer";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id){
        System.out.println(customerService.deleteCustomer(id));
        return "redirect:/showcustomer";
    }

    @GetMapping("/update/{id}")
    public String updateCustomer(@PathVariable("id") Integer id, Model model){
        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customer", customer);
        return "updatecustomer";
    }

    @PostMapping("/update-customer")
    public String updateCustomer(@ModelAttribute Customer customer){
        customerService.createCustomer(customer);
        return "redirect:/showcustomer";
    }


}
