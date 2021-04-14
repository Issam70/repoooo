package com.example.stock.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Ville implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String libelle;
    String code;
  //  @ManyToOne
   // Pays pays;

    public Ville() {
        super();
    }

    public Ville(Long id, String libelle, String code) {
        this.id = id;
        this.libelle = libelle;
        this.code = code;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
