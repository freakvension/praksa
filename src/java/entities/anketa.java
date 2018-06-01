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
public class anketa {
    private int idAnketa;
    private String upit;
    private String odgovor1;
    private String odgovor2;
    private boolean rezultat1;
    private boolean rezultat2;
    private int id_kor;

    public anketa(int idAnketa, String upit, String odgovor1, String odgovor2, boolean rezultat1, boolean rezultat2, int id_kor) {
        this.idAnketa = idAnketa;
        this.upit = upit;
        this.odgovor1 = odgovor1;
        this.odgovor2 = odgovor2;
        this.rezultat1 = rezultat1;
        this.rezultat2 = rezultat2;
        this.id_kor = id_kor;
    }

    public anketa() {
    }
    

    public int getIdAnketa() {
        return idAnketa;
    }

    public void setIdAnketa(int idAnketa) {
        this.idAnketa = idAnketa;
    }

    public String getUpit() {
        return upit;
    }

    public void setUpit(String upit) {
        this.upit = upit;
    }

    public String getOdgovor1() {
        return odgovor1;
    }

    public void setOdgovor1(String odgovor1) {
        this.odgovor1 = odgovor1;
    }

    public String getOdgovor2() {
        return odgovor2;
    }

    public void setOdgovor2(String odgovor2) {
        this.odgovor2 = odgovor2;
    }

    public boolean isRezultat1() {
        return rezultat1;
    }

    public void setRezultat1(boolean rezultat1) {
        this.rezultat1 = rezultat1;
    }

    public boolean isRezultat2() {
        return rezultat2;
    }

    public void setRezultat2(boolean rezultat2) {
        this.rezultat2 = rezultat2;
    }

    public int getId_kor() {
        return id_kor;
    }

    public void setId_kor(int id_kor) {
        this.id_kor = id_kor;
    }
    
}
