package org.example.springboot_cms.persistantlayer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, Integer>{
}
