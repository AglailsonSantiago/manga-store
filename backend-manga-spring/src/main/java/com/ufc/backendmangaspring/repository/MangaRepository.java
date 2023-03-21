package com.ufc.backendmangaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.backendmangaspring.model.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long>{
    
}
