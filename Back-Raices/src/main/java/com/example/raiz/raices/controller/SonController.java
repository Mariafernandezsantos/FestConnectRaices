package com.example.raiz.raices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.raiz.raices.model.Son;
import com.example.raiz.raices.service.SonService;

import java.util.List;

@RestController
@RequestMapping("/api/sons")
public class SonController {
    @Autowired
    private SonService sonService;

    // Endpoint para obtener un Son por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Son> getSonById(@PathVariable Long id) {
        Son son = sonService.getSonById(id);
        if (son != null) {
            return new ResponseEntity<>(son, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para crear un nuevo Son
    @PostMapping
    public ResponseEntity<Son> createSon(@RequestBody Son son) {
        Son createdSon = sonService.createSon(son);
        return new ResponseEntity<>(createdSon, HttpStatus.CREATED);
    }

    // Endpoint para actualizar un Son existente
    @PutMapping("/{id}")
    public ResponseEntity<Son> updateSon(@PathVariable Long id, @RequestBody Son updatedSon) {
        Son son = sonService.updateSon(id, updatedSon);
        if (son != null) {
            return new ResponseEntity<>(son, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para eliminar un Son por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSon(@PathVariable Long id) {
        sonService.deleteSon(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Endpoint para obtener todos los Sons
    @GetMapping
    public ResponseEntity<List<Son>> getAllSons() {
        List<Son> sons = sonService.getAllSons();
        return new ResponseEntity<>(sons, HttpStatus.OK);
    }
}
