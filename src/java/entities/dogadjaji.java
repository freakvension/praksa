/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dzoney
 */
@XmlRootElement
public class dogadjaji {
    private int dogadjaj_id;
    private String naslov_dogadjaja;
    private String tekst_dogadjaja;
    private String vrsta_dogadjaja;
    private String dogadjajiicol;
    private int uzrast_id;
    private int mesto_id;
    private int ulica_id;
    private String stavke_sifarnika;
    private int id_korisnika;

    public dogadjaji() {
    }

    public int getDogadjaj_id() {
        return dogadjaj_id;
    }

    public void setDogadjaj_id(int dogadjaj_id) {
        this.dogadjaj_id = dogadjaj_id;
    }

    public String getNaslov_dogadjaja() {
        return naslov_dogadjaja;
    }

    public void setNaslov_dogadjaja(String naslov_dogadjaja) {
        this.naslov_dogadjaja = naslov_dogadjaja;
    }

    public String getTekst_dogadjaja() {
        return tekst_dogadjaja;
    }

    public void setTekst_dogadjaja(String tekst_dogadjaja) {
        this.tekst_dogadjaja = tekst_dogadjaja;
    }

    public String getVrsta_dogadjaja() {
        return vrsta_dogadjaja;
    }

    public void setVrsta_dogadjaja(String vrsta_dogadjaja) {
        this.vrsta_dogadjaja = vrsta_dogadjaja;
    }

    public String getDogadjajiicol() {
        return dogadjajiicol;
    }

    public void setDogadjajiicol(String dogadjajiicol) {
        this.dogadjajiicol = dogadjajiicol;
    }

    public int getUzrast_id() {
        return uzrast_id;
    }

    public void setUzrast_id(int uzrast_id) {
        this.uzrast_id = uzrast_id;
    }

    public int getMesto_id() {
        return mesto_id;
    }

    public void setMesto_id(int mesto_id) {
        this.mesto_id = mesto_id;
    }

    public int getUlica_id() {
        return ulica_id;
    }

    public void setUlica_id(int ulica_id) {
        this.ulica_id = ulica_id;
    }

    public String getStavke_sifarnika() {
        return stavke_sifarnika;
    }

    public void setStavke_sifarnika(String stavke_sifarnika) {
        this.stavke_sifarnika = stavke_sifarnika;
    }

    public int getId_korisnika() {
        return id_korisnika;
    }

    public void setId_korisnika(int id_korisnika) {
        this.id_korisnika = id_korisnika;
    }
    
}
