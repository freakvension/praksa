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
public class zahtev_zloupotreba {
    private int id_zahteva;
    private String opis_zahteva;
    private int status;
    private int id_korisnika;

    public zahtev_zloupotreba() {
    }

    public int getId_zahteva() {
        return id_zahteva;
    }

    public void setId_zahteva(int id_zahteva) {
        this.id_zahteva = id_zahteva;
    }

    public String getOpis_zahteva() {
        return opis_zahteva;
    }

    public void setOpis_zahteva(String opis_zahteva) {
        this.opis_zahteva = opis_zahteva;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_korisnika() {
        return id_korisnika;
    }

    public void setId_korisnika(int id_korisnika) {
        this.id_korisnika = id_korisnika;
    }
    
}
