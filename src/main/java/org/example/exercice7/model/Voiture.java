package org.example.exercice7.model;

import java.time.LocalDate;

public class Voiture {
    private int id;
    private String marque;
    private int dateFabrication;
    private String couleur;

    public Voiture(String marque, int dateFabrication, String couleur) {
        this.marque = marque;
        this.dateFabrication = dateFabrication;
        this.couleur = couleur;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(int dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}