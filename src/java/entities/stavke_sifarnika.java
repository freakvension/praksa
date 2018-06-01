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
public class stavke_sifarnika {
    private int sifarnik_id;
    private String stavka;
    private String rok_trajanja;
    private String pocetak_trajanja;

    public stavke_sifarnika() {
    }

    public int getSifarnik_id() {
        return sifarnik_id;
    }

    public void setSifarnik_id(int sifarnik_id) {
        this.sifarnik_id = sifarnik_id;
    }

    public String getStavka() {
        return stavka;
    }

    public void setStavka(String stavka) {
        this.stavka = stavka;
    }

    public String getRok_trajanja() {
        return rok_trajanja;
    }

    public void setRok_trajanja(String rok_trajanja) {
        this.rok_trajanja = rok_trajanja;
    }

    public String getPocetak_trajanja() {
        return pocetak_trajanja;
    }

    public void setPocetak_trajanja(String pocetak_trajanja) {
        this.pocetak_trajanja = pocetak_trajanja;
    }
    
}
