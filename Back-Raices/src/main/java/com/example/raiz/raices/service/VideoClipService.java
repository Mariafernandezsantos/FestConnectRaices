package com.example.raiz.raices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.raiz.raices.model.VideoClip;
import com.example.raiz.raices.repository.VideoClipRepository;
import java.util.Optional;
import java.util.List;

@Service
public class VideoClipService {
    @Autowired
    private VideoClipRepository videoclipRepository;

    // Operación de lectura (Read): Obtener un Videoclip por ID
    public VideoClip getVideoclipById(Long id) {
        Optional<VideoClip> videoclip = videoclipRepository.findById(id);
        return videoclip.orElse(null); // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de creación (Create): Crear un nuevo Videoclip
    public VideoClip createVideoclip(VideoClip videoclip) {
        return videoclipRepository.save(videoclip);
    }

    // Operación de actualización (Update): Actualizar un Videoclip existente
    public VideoClip updateVideoclip(Long id, VideoClip updatedVideoclip) {
        if (videoclipRepository.existsById(id)) {
            updatedVideoclip.setId(id);
            return videoclipRepository.save(updatedVideoclip);
        }
        return null; // Maneja el caso de entidad no encontrada según tus necesidades
    }

    // Operación de eliminación (Delete): Eliminar un Videoclip por ID
    public void deleteVideoclip(Long id) {
        if (videoclipRepository.existsById(id)) {
            videoclipRepository.deleteById(id);
        }
    }

    // Operación de lectura (Read): Obtener todos los Videoclips
    public List<VideoClip> getAllVideoclips() {
        return videoclipRepository.findAll();
    }
}

