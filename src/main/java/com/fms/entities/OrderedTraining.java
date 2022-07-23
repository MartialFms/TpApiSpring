package com.fms.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class OrderedTraining {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String price;

    private int quantity;

    @ManyToOne
    Ordered ordered;


}