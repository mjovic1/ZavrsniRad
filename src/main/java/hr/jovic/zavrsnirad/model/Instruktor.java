/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.jovic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 *
 * @author Ja
 */
@Entity
public class Instruktor {
    public String ugovor;

    public String getUgovor() {
        return ugovor;
    }

    public void setUgovor(String ugovor) {
        this.ugovor = ugovor;
    }
    
    
   
}
