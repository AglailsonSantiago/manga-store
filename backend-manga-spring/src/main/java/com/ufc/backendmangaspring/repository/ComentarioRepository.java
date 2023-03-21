package com.ufc.backendmangaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.backendmangaspring.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    
}
