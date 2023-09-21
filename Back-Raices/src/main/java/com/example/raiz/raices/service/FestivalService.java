package com.example.raiz.raices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.raiz.raices.model.Festival;
import com.example.raiz.raices.repository.FestivalRepository;

import java.util.List;
import java.util.Optional; // Asegúrate de importar java.util.Optional

@Service
public class FestivalService {
    @Autowired
    private FestivalRepository festivalRepository;

    // Operación de lectura (Read)
    public Festival getFestivalById(Long id) {
        Optional<Festival> festival = festivalRepository.findById(id);
        return festival.orElse(null); // Cambia group a festival y maneja el caso de entidad no encontrada
    }

    // Operación de creación (Create)
    public Festival createFestival(Festival festival) {
        return festivalRepository.save(festival);
    }

    // Operación de actualización (Update)
    public Festival updateFestival(Long id, Festival updatedFestival) {
        if (festivalRepository.existsById(id)) {
            updatedFestival.setId(id);
            return festivalRepository.save(updatedFestival);
        }
        return null; // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de eliminación (Delete)
    public void deleteFestival(Long id) {
        if (festivalRepository.existsById(id)) {
            festivalRepository.deleteById(id);
        }
    }

    public List<Festival> getAllFestivals() {
        return null;
    }
}
