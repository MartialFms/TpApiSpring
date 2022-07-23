package com.fms.web;

import com.fms.business.IBusinessImpl;
import com.fms.entities.Category;
import com.fms.entities.Training;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @Autowired
    IBusinessImpl businessImpl;

  @GetMapping("/categories")
  public List<Category> allCategories() {
      return businessImpl.getCategories();
  }
//    @GetMapping("/trainings")
//    public List<Training> allTrainings() {
//        return businessImpl.getTraining();
//    }

    @GetMapping("/trainings")
    public List<Training> allTrainingsByCategory(@RequestParam("cat") Category cat) {
        return businessImpl.getTrainingByCat(cat);
    }
    
    
    @PostMapping("/trainings")
    void addTraining(@RequestBody Training training) {
        businessImpl.saveTraining(training);
    }


    @DeleteMapping("/trainings/{id}")
    void deleteTraining(@PathVariable("id") Long id) {
        businessImpl.deleteTraining(id);
    }

    @GetMapping("/trainings/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable("id") Long id) {
        Optional<Training> training = Optional.of(businessImpl.showTraining(id));
        if(training.isPresent()) {
        	return new ResponseEntity<Training>(training.get(), HttpStatus.OK);}
        return null;
    

    }
}