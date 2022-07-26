package com.fms.dao;

import com.fms.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    public List<Customer> findAll();
    public List<Customer> findById(long id);
}