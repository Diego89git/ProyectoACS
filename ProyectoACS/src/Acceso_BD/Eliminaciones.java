/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Eliminaciones {    
    ConeccionMYSQL cn = new ConeccionMYSQL();
    ResultSet datos;
    public boolean eliminarObjeto(String tabla,int id) {
        String sentencia = getParametroEliminacion(tabla)+id;
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            int res = pst.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Eliminaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public String getParametroEliminacion(String tabla){
        String sentencia="DELETE FROM "+tabla+" WHERE ";
        String parametro="";
        switch (tabla.toUpperCase()){
            case "ROL":
                parametro= "ID_ROL";
                break;
            case "USUARIO":
                parametro= "ID_USU";
                break;
            case "COOPERATIVA":
                parametro= "ID_COP";
                break;
            case "BUS":
                parametro= "ID_BUS";
                break;
            case "ASIENTO":
                parametro= "ID_ASI";
                break;
            case "CIUDAD":
                parametro= "ID_CIU";
                break;
            case "RUTA":
                parametro= "ID_RUT";
                break;
            case "CLIENTE":
                parametro= "ID_CLI";
                break;
            case "RESERVA":
                parametro= "ID_RES";
                break;
            default:
                break;
        }
        
        return sentencia+parametro+"=";
    }
    
}
