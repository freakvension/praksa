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
public class ulica {
    private int ulica_id;
    private String ulica_naziv;
    private String Stavke_sifarnika;

    public ulica() {
    }

    public int getUlica_id() {
        return ulica_id;
    }

    public void setUlica_id(int ulica_id) {
        this.ulica_id = ulica_id;
    }

    public String getUlica_naziv() {
        return ulica_naziv;
    }

    public void setUlica_naziv(String ulica_naziv) {
        this.ulica_naziv = ulica_naziv;
    }

    public String getStavke_sifarnika() {
        return Stavke_sifarnika;
    }

    public void setStavke_sifarnika(String Stavke_sifarnika) {
        this.Stavke_sifarnika = Stavke_sifarnika;
    }
    
}
