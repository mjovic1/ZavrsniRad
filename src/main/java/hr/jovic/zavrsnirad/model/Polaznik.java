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
public class Polaznik {
    public boolean polozeni_propisi;
    public boolean polozena_prva_pomoc;
    public int broj_odvozenih_sati;

    public boolean isPolozeni_propisi() {
        return polozeni_propisi;
    }

    public void setPolozeni_propisi(boolean polozeni_propisi) {
        this.polozeni_propisi = polozeni_propisi;
    }

    public boolean isPolozena_prva_pomoc() {
        return polozena_prva_pomoc;
    }

    public void setPolozena_prva_pomoc(boolean polozena_prva_pomoc) {
        this.polozena_prva_pomoc = polozena_prva_pomoc;
    }

    public int getBroj_odvozenih_sati() {
        return broj_odvozenih_sati;
    }

    public void setBroj_odvozenih_sati(int broj_odvozenih_sati) {
        this.broj_odvozenih_sati = broj_odvozenih_sati;
    }
   
}
