package com.fms.dao;

import com.fms.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    public List<Category> findAll();
    public List<Category> findById(long id);
}