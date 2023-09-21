package com.example.raiz.raices.repository;

import javax.swing.GroupLayout.Group;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.raiz.raices.model.Gruop;

public interface GroupRepository extends JpaRepository<Group, Long> {

    Gruop save(Gruop group);
}

