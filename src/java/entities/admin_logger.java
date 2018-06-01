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
public class admin_logger {
    private int id_log;
    private String log_donetime; // ne znam koji je TIMESTAMP tip 
    private String id_admina;
    private String opis;

    public admin_logger(int id_log, String log_donetime, String id_admina, String opis) {
        this.id_log = id_log;
        this.log_donetime = log_donetime;
        this.id_admina = id_admina;
        this.opis = opis;
    }

    public admin_logger() {
    }
    

    public int getId_log() {
        return id_log;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    public String getLog_donetime() {
        return log_donetime;
    }

    public void setLog_donetime(String log_donetime) {
        this.log_donetime = log_donetime;
    }

    public String getId_admina() {
        return id_admina;
    }

    public void setId_admina(String id_admina) {
        this.id_admina = id_admina;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
   
    
}
