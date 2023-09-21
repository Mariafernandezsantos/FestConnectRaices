package com.example.raiz.raices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.raiz.raices.model.Organization;
import com.example.raiz.raices.repository.OrganizationRepository;

import java.util.Optional;
import java.util.List;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    // Operación de lectura (Read): Obtener una Organización por ID
    public Organization getOrganizationById(Long id) {
        Optional<Organization> organization = organizationRepository.findById(id);
        return organization.orElse(null); // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de creación (Create): Crear una nueva Organización
    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    // Operación de actualización (Update): Actualizar una Organización existente
    public Organization updateOrganization(Long id, Organization updatedOrganization) {
        if (organizationRepository.existsById(id)) {
            updatedOrganization.setId(id);
            return organizationRepository.save(updatedOrganization);
        }
        return null; // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de eliminación (Delete): Eliminar una Organización por ID
    public void deleteOrganization(Long id) {
        if (organizationRepository.existsById(id)) {
            organizationRepository.deleteById(id);
        }
    }

    // Operación de lectura (Read): Obtener todas las Organizaciones
    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }
}


