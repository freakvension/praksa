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
public class korisnik {
    private int korisnik_id;
    private String naziv_org;
    private String kontakt_osoba;
    private String kontakt_telefon;
    private String email;
    private String istorijat;
    private String webiste;
    private String korisnicko_ime;
    private String lozinka;
    private int ulica_id;
    private int adresa_broj;
    private int status;
    private String stavke_sifarnika;
    private String stavke_sifarnika2;

    public korisnik() {
    }

    public int getKorisnik_id() {
        return korisnik_id;
    }

    public void setKorisnik_id(int korisnik_id) {
        this.korisnik_id = korisnik_id;
    }

    public String getNaziv_org() {
        return naziv_org;
    }

    public void setNaziv_org(String naziv_org) {
        this.naziv_org = naziv_org;
    }

    public String getKontakt_osoba() {
        return kontakt_osoba;
    }

    public void setKontakt_osoba(String kontakt_osoba) {
        this.kontakt_osoba = kontakt_osoba;
    }

    public String getKontakt_telefon() {
        return kontakt_telefon;
    }

    public void setKontakt_telefon(String kontakt_telefon) {
        this.kontakt_telefon = kontakt_telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIstorijat() {
        return istorijat;
    }

    public void setIstorijat(String istorijat) {
        this.istorijat = istorijat;
    }

    public String getWebiste() {
        return webiste;
    }

    public void setWebiste(String webiste) {
        this.webiste = webiste;
    }

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public int getUlica_id() {
        return ulica_id;
    }

    public void setUlica_id(int ulica_id) {
        this.ulica_id = ulica_id;
    }

    public int getAdresa_broj() {
        return adresa_broj;
    }

    public void setAdresa_broj(int adresa_broj) {
        this.adresa_broj = adresa_broj;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStavke_sifarnika() {
        return stavke_sifarnika;
    }

    public void setStavke_sifarnika(String stavke_sifarnika) {
        this.stavke_sifarnika = stavke_sifarnika;
    }

    public String getStavke_sifarnika2() {
        return stavke_sifarnika2;
    }

    public void setStavke_sifarnika2(String stavke_sifarnika2) {
        this.stavke_sifarnika2 = stavke_sifarnika2;
    }
    
}
