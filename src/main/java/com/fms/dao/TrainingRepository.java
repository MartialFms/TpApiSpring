package com.fms.dao;

import com.fms.entities.Category;
import com.fms.entities.Training;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingRepository extends CrudRepository<Training, Long> {
    public List<Training> findAll();
    public List<Training> findByCategory(Category cat);
    public List<Training> findById(long id);
}