package com.ufc.backendmangaspring.model;
/* 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "user")
@AllArgsConstructor
@Data */
public class Usuario {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //@Column(name = "username")
    private String username;
    
    //@Column(name = "email")
    private String email;

    //@Column(name = "password")
    private String password;

    //@Column(name = "confirmed")
    private boolean confirmed;

    //@Column(name = "blocked")
    private boolean blocked;

}
