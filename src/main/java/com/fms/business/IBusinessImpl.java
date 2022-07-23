package com.fms.business;


import com.fms.dao.CategoryRepository;
import com.fms.dao.CustomerRepository;
import com.fms.dao.TrainingRepository;
import com.fms.entities.Category;
import com.fms.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.fms.entities.Training;

@Service
public class IBusinessImpl implements IBusiness{

    @Autowired
    public CustomerRepository customerRepository;

    @Autowired
    public TrainingRepository trainingRepository;
    
    @Autowired
    public CategoryRepository categoryRepository;




    public List<Training> getTraining(){ 

    	return trainingRepository.findAll();}
    
    public List<Category> getCategories(){ 

    	return categoryRepository.findAll();}
    
    
    
    public List<Training> getTrainingByCat(Category cat){
    	return trainingRepository.findByCategory(cat);}
    
    
    
    

    public void saveTraining(Training training) {
        trainingRepository.save(training);
    }

    public void deleteTraining(Long id) {
        trainingRepository.deleteById(id);
    }

    public Training showTraining(Long id) {
        return trainingRepository.findById(id).get();
    }


    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
        } catch (ParseException e) {
            return new Date();
        }
    }








}
