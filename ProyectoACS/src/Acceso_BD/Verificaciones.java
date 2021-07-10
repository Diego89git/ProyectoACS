/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio
 */
public class Verificaciones {
    ResultSet datos, dato;
    Statement st;
    Connection cn;
    public Verificaciones() {
       ConeccionMYSQL con= new ConeccionMYSQL();
       cn=con.conectar();
       }
    public boolean existeRolByDecripcion(){
        return false;
    }
    public boolean rolEstaEnUso(int id){
        String consulta = "Select * from usuario Where ID_ROL_PER="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    public boolean usuarioEstaEnUso(int id){
        String consulta = "Select * from ruta Where ID_USU_RUT="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    public boolean cooperativaEstaEnUso(int id){
        String consulta = "Select * from bus Where ID_COP_PER="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    public boolean busEstaEnUso(int id){
         
        String consulta = "Select * from asiento Where ID_BUS_PER="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    public boolean asientoEstaEnUso(int id){   
        String consulta = "Select * from reserva Where ID_ASI_RES="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    public boolean ciudadEstaEnUso(int id){
        String consulta = "Select * from ruta Where ID_CIO_RUT="+id+" OR ID_CID_RUT="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    public boolean clienteEstaEnUso(int id){
        String consulta = "Select * from reserva Where ID_CLI_RES="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    public boolean rutaEstaEnUso(int id){
        String consulta = "Select * from reserva Where ID_RUT_RES="+id;
        int contador=0;
        try {
            st= cn.createStatement();
            datos =st.executeQuery(consulta);
            
            while (datos.next()) {
               contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (contador>0){
            return true;
        }
        return false;
    }
    
}
