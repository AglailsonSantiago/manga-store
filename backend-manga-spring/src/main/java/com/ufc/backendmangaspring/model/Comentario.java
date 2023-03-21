package com.ufc.backendmangaspring.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comentario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "rating")
    private int rating;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "manga_id", referencedColumnName = "id")
    private Manga manga;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "state")
    private boolean state;
}
