package com.fms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Cart {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String contents;

    private Long client;


    @OneToMany(mappedBy="id")
    @MapKey(name="id")
    Map<Long, OrderedTraining> orderedTraining = new HashMap<>();
}