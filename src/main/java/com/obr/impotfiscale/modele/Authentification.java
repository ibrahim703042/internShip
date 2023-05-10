/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.obr.impotfiscale.modele;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author Ibrahim
 */
public class Authentification {
     private String email;
    private String motPasse;

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
    
    public void save() {
        FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage("Welcome " + email + " " + motPasse) );
    }
}
