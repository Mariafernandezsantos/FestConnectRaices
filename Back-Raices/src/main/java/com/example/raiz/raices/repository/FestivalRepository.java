package com.example.raiz.raices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.raiz.raices.model.Festival;

public interface FestivalRepository extends JpaRepository<Festival, Long> {
}