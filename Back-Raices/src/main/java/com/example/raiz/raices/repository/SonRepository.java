package com.example.raiz.raices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.raiz.raices.model.Son;

public interface SonRepository extends JpaRepository<Son, Long> {
}