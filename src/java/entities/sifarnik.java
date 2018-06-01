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
public class sifarnik {
    private int sifarnik_id;
    private String naziv_sifarnika;

    public sifarnik() {
    }

    public int getSifarnik_id() {
        return sifarnik_id;
    }

    public void setSifarnik_id(int sifarnik_id) {
        this.sifarnik_id = sifarnik_id;
    }

    public String getNaziv_sifarnika() {
        return naziv_sifarnika;
    }

    public void setNaziv_sifarnika(String naziv_sifarnika) {
        this.naziv_sifarnika = naziv_sifarnika;
    }
    
}
