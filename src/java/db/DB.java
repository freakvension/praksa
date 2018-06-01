/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dzoney
 */
public class DB {

    public static String user = "root";
    public static String pass = "1231";
    public static String protocol = "jdbc:mysql:";
    public static String ip = "localhost";
    public static String port = "3306";
    public static String dbName = "kurs";
    public static String dbDriver = "com.mysql.jdbc.Driver";
    public static String connectionString = protocol + "//" + ip + ":" + port + "/" +  dbName; 
    static{
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

