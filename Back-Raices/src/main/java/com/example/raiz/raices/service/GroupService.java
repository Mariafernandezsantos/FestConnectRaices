package com.example.raiz.raices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.raiz.raices.model.Gruop;
import com.example.raiz.raices.repository.GroupRepository;

import java.util.Optional;

import javax.swing.GroupLayout.Group;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    // Operación de lectura (Read): Obtener un Grupo por ID
    public Group getGroupById(Long id) {
        Optional<Group> group = groupRepository.findById(id);
        return group.orElse(null); // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de creación (Create): Crear un nuevo Grupo
    public Gruop createGroup(Gruop group) {
        return groupRepository.save(group);
    }

    // Operación de actualización (Update): Actualizar un Grupo existente
    public Gruop updateGroup(Long id, Gruop updatedGroup) {
        if (groupRepository.existsById(id)) {
            updatedGroup.setId(id);
            return groupRepository.save(updatedGroup);
        }
        return null; // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de eliminación (Delete): Eliminar un Grupo por ID
    public void deleteGroup(Long id) {
        if (groupRepository.existsById(id)) {
            groupRepository.deleteById(id);
        }
    }

    // Operación de lectura (Read): Obtener todos los Grupos
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @GetMapping
    public ResponseEntity<List<Group>> getAllGroup() {
        List<Group> group = getAllGroups();
        return new ResponseEntity<>(group, HttpStatus.OK);
    }
}
