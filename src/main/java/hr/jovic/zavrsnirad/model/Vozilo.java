/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.jovic.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ja
 */
@Entity
public class Vozilo {
    
    private String registracijska_oznaka;
    private String marka;
    private String boja;
    private int godina_proizvodnje;
    
    @ManyToOne
    private Autoskola autoskola;
    
    
    public String getRegistracijska_oznaka(){
        return registracijska_oznaka;
    }

    public void setRegistracijska_oznaka(String registracijska_oznaka) {
        this.registracijska_oznaka = registracijska_oznaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int getGodina_proizvodnje() {
        return godina_proizvodnje;
    }

    public void setGodina_proizvodnje(int godina_proizvodnje) {
        this.godina_proizvodnje = godina_proizvodnje;
    }
    
    
}
