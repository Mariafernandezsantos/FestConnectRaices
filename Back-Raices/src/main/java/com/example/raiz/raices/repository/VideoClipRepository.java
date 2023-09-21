package com.example.raiz.raices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.raiz.raices.model.VideoClip;

public interface VideoClipRepository extends JpaRepository<VideoClip, Long> {
}