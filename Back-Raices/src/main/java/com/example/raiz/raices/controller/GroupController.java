package com.example.raiz.raices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.raiz.raices.model.Gruop;
import com.example.raiz.raices.service.GroupService;

import java.util.List;

import javax.swing.GroupLayout.Group;

@RestController
@RequestMapping("/api/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    // Endpoint para obtener un Grupo por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Group> getGroupById(@PathVariable Long id) {
        Group group = groupService.getGroupById(id);
        if (group != null) {
            return new ResponseEntity< >(group, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para crear un nuevo Grupo
    @PostMapping
    public ResponseEntity<Gruop> createGroup(@RequestBody Gruop group) {
        Gruop createdGroup = groupService.createGroup(group);
        return new ResponseEntity<>(createdGroup, HttpStatus.CREATED);
    }

    // Endpoint para actualizar un Grupo existente
    @PutMapping("/{id}")
    public ResponseEntity<Gruop> updateGroup(@PathVariable Long id, @RequestBody Gruop updatedGroup) {
        Gruop group = groupService.updateGroup(id, updatedGroup);
        if (group != null) {
            return new ResponseEntity<>(group, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para eliminar un Grupo por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable Long id) {
        groupService.deleteGroup(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Endpoint para obtener todos los Grupos
    @GetMapping
    public ResponseEntity<List<Group>> getAllGroups() {
        List<Group> groups = groupService.getAllGroups();
        return new ResponseEntity<>(groups, HttpStatus.OK);
    }
}
