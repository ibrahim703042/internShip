/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.obr.impotfiscale.modele;

import java.util.Date;

/**
 *
 * @author Ibrahim
 */
public class Administrateur {
    
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String motPasse;
    private String teliphone;
    private String BP;
    private Date date;
    
    public Administrateur(){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the motPasse
     */
    public String getMotPasse() {
        return motPasse;
    }

    /**
     * @param motPasse the motPasse to set
     */
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    /**
     * @return the teliphone
     */
    public String getTeliphone() {
        return teliphone;
    }

    /**
     * @param teliphone the teliphone to set
     */
    public void setTeliphone(String teliphone) {
        this.teliphone = teliphone;
    }

    /**
     * @return the BP
     */
    public String getBP() {
        return BP;
    }

    /**
     * @param BP the BP to set
     */
    public void setBP(String BP) {
        this.BP = BP;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
