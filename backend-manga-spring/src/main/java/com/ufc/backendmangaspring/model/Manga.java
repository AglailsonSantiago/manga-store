package com.ufc.backendmangaspring.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "manga")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "cover")
    private String cover;

    @Column(name = "number")
    private int number;

    @Column(name = "summary")
    private String summary;

    @Column(name = "price")
    private float price;

    @OneToMany(mappedBy = "manga")
    private List<Comentario> comments;

}
