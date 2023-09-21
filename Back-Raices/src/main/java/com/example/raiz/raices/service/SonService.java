package com.example.raiz.raices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.raiz.raices.model.Son;
import com.example.raiz.raices.repository.SonRepository;

import java.util.Optional;
import java.util.List;

@Service
public class SonService {
    @Autowired
    private SonRepository sonRepository;

    // Operación de lectura (Read): Obtener un Son por ID
    public Son getSonById(Long id) {
        Optional<Son> son = sonRepository.findById(id);
        return son.orElse(null); // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de creación (Create): Crear un nuevo Son
    public Son createSon(Son son) {
        return sonRepository.save(son);
    }

    // Operación de actualización (Update): Actualizar un Son existente
    public Son updateSon(Long id, Son updatedSon) {
        if (sonRepository.existsById(id)) {
            updatedSon.setId(id);
            return sonRepository.save(updatedSon);
        }
        return null; // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de eliminación (Delete): Eliminar un Son por ID
    public void deleteSon(Long id) {
        if (sonRepository.existsById(id)) {
            sonRepository.deleteById(id);
        }
    }

    // Operación de lectura (Read): Obtener todos los Sons
    public List<Son> getAllSons() {
        return sonRepository.findAll();
    }
}

