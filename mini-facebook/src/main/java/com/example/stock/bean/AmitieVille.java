package com.example.stock.bean;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class AmitieVille implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @ManyToOne
    Ville ville;


    public AmitieVille() {
        super();
    }

    public AmitieVille(Long id, Ville ville, Amitie amitie) {

        this.id = id;
        this.ville = ville;
        this.amitie = amitie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Amitie getAmitie() {
        return amitie;
    }

    public void setAmitie(Amitie amitie) {
        this.amitie = amitie;
    }

    @ManyToOne
    Amitie amitie;


}
