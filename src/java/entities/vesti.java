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
public class vesti {
    private int vesti_id;
    private String naslov_vesti;
    private String tekst_vesti;
    private int kategorija_vesti_id;
    private String vreme_postavljanja;
    private int id_kor;

    public vesti() {
    }

    public int getVesti_id() {
        return vesti_id;
    }

    public void setVesti_id(int vesti_id) {
        this.vesti_id = vesti_id;
    }

    public String getNaslov_vesti() {
        return naslov_vesti;
    }

    public void setNaslov_vesti(String naslov_vesti) {
        this.naslov_vesti = naslov_vesti;
    }

    public String getTekst_vesti() {
        return tekst_vesti;
    }

    public void setTekst_vesti(String tekst_vesti) {
        this.tekst_vesti = tekst_vesti;
    }

    public int getKategorija_vesti_id() {
        return kategorija_vesti_id;
    }

    public void setKategorija_vesti_id(int kategorija_vesti_id) {
        this.kategorija_vesti_id = kategorija_vesti_id;
    }

    public String getVreme_postavljanja() {
        return vreme_postavljanja;
    }

    public void setVreme_postavljanja(String vreme_postavljanja) {
        this.vreme_postavljanja = vreme_postavljanja;
    }

    public int getId_kor() {
        return id_kor;
    }

    public void setId_kor(int id_kor) {
        this.id_kor = id_kor;
    }
    
}
