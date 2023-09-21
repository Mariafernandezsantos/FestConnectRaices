package com.example.raiz.raices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Otros atributos y getters/setters si es necesario

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
