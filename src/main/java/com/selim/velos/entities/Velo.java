package com.selim.velos.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Velo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVelo;
    private String modelVelo;
    private Double prixVelo;
    private Date dateCreation;
    @ManyToOne
    private Type type;

    public Velo() {
        super();
    }

    public Velo(String modelVelo, Double prixVelo, Date dateCreation) {
        super();
        this.dateCreation = dateCreation;
        this.modelVelo = modelVelo;
        this.prixVelo = prixVelo;
    }

    public Long getIdVelo() {
        return idVelo;
    }

    public void setIdVelo(Long idVelo) {
        this.idVelo = idVelo;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getModelVelo() {
        return modelVelo;
    }

    public void setModelVelo(String modelVelo) {
        this.modelVelo = modelVelo;
    }

    public Double getPrixVelo() {
        return prixVelo;
    }

    public void setPrixVelo(Double prixVelo) {
        this.prixVelo = prixVelo;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "idVelo=" + idVelo +
                ", dateCreation='" + dateCreation + '\'' +
                ", modelVelo='" + modelVelo + '\'' +
                ", prixVelo=" + prixVelo +
                '}';
    }
}