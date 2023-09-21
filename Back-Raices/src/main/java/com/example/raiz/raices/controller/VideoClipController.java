package com.example.raiz.raices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.raiz.raices.model.VideoClip;
import com.example.raiz.raices.service.VideoClipService;

import java.util.List;

@RestController
@RequestMapping("/api/videoclips")
public class VideoClipController {
    @Autowired
    private VideoClipService videoClipService;

    // Endpoint para obtener un VideoClip por su ID
    @GetMapping("/{id}")
    public ResponseEntity<VideoClip> getVideoClipById(@PathVariable Long id) {
        VideoClip videoClip = videoClipService.getVideoclipById(id);
        if (videoClip != null) {
            return new ResponseEntity<>(videoClip, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para crear un nuevo VideoClip
    @PostMapping
    public ResponseEntity<VideoClip> createVideoClip(@RequestBody VideoClip videoClip) {
        VideoClip createdVideoClip = videoClipService.createVideoclip(videoClip);
        return new ResponseEntity<>(createdVideoClip, HttpStatus.CREATED);
    }

    // Endpoint para actualizar un VideoClip existente
    @PutMapping("/{id}")
    public ResponseEntity<VideoClip> updateVideoClip(@PathVariable Long id, @RequestBody VideoClip updatedVideoClip) {
        VideoClip videoClip = videoClipService.updateVideoclip(id, updatedVideoClip);
        if (videoClip != null) {
            return new ResponseEntity<>(videoClip, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para eliminar un VideoClip por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideoClip(@PathVariable Long id) {
        videoClipService.deleteVideoclip(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Endpoint para obtener todos los VideoClips
    @GetMapping
    public ResponseEntity<List<VideoClip>> getAllVideoClips() {
        List<VideoClip> videoClips = videoClipService.getAllVideoclips();
        return new ResponseEntity<>(videoClips, HttpStatus.OK);
    }
}

