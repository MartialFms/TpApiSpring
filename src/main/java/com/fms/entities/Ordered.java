package com.fms.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ordered {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private int client;



    @OneToMany(mappedBy="ordered")
    private Map<String, OrderedTraining> products ;
   

    private double totalAmount;


}