/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConeccionMYSQL {

    String driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://localhost/";
    String bd = "proyectomanejo";
    String usuario = "root";
    String password = "";

    public Connection conectar() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url + bd, usuario, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e);
        }
        return cn;
    }

}

