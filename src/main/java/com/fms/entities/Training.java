package com.fms.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fms.entities.Category;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Training {
	

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private double price;

    private int difficulty;

    private boolean active ;

    private String photoName;

    private int quantity;

    @ManyToOne
    private Category category;

}