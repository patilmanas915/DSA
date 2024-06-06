package org.example.springboot_cms;

import org.example.springboot_cms.persistantlayer.Customer;
import org.example.springboot_cms.servicelayer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCmsApplication {

    public static void main(String[] args) {
        ApplicationContext con = SpringApplication.run(SpringBootCmsApplication.class, args) ;
    }

}
