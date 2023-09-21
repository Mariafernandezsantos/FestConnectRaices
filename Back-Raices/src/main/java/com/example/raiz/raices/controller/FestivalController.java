package com.example.raiz.raices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.raiz.raices.model.Festival;
import com.example.raiz.raices.service.FestivalService;

import java.util.List;

@RestController
@RequestMapping("/api/festivals")
public class FestivalController {
    @Autowired
    private FestivalService festivalService;

    // Endpoint para obtener un Festival por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Festival> getFestivalById(@PathVariable Long id) {
        Festival festival = festivalService.getFestivalById(id);
        if (festival != null) {
            return new ResponseEntity<>(festival, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para crear un nuevo Festival
    @PostMapping
    public ResponseEntity<Festival> createFestival(@RequestBody Festival festival) {
        Festival createdFestival = festivalService.createFestival(festival);
        return new ResponseEntity<>(createdFestival, HttpStatus.CREATED);
    }

    // Endpoint para actualizar un Festival existente
    @PutMapping("/{id}")
    public ResponseEntity<Festival> updateFestival(@PathVariable Long id, @RequestBody Festival updatedFestival) {
        Festival festival = festivalService.updateFestival(id, updatedFestival);
        if (festival != null) {
            return new ResponseEntity<>(festival, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para eliminar un Festival por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFestival(@PathVariable Long id) {
        festivalService.deleteFestival(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Endpoint para obtener todos los Festivales
    @GetMapping
    public ResponseEntity<List<Festival>> getAllFestivals() {
        List<Festival> festivals = festivalService.getAllFestivals();
        return new ResponseEntity<>(festivals, HttpStatus.OK);
    }
}


