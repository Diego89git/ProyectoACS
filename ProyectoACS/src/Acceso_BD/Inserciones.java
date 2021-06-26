/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_BD;

import Objetos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mauricio
 */
public class Inserciones {
  
    Connection cn;
    public Inserciones() {
       ConeccionMYSQL con= new ConeccionMYSQL();
       cn=con.conectar();
    }
    public boolean insertarCooperativa(Cooperativa cop) {
        String sql="Insert into Cooperativa values (null, ?,?,?,?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, cop.getNombre());
            pst.setString(2, cop.getRUC());
            pst.setString(3, cop.getDireccion());
            pst.setString(4, cop.getTelefono());
            pst.setString(5, cop.getCorreo());
            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public boolean insertarBus(Bus bus) {
        String sql="Insert into bus  values (null, ?,?,?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, bus.getPlaca());
            pst.setInt(2, bus.getAño());
            pst.setString(3, bus.getMarca());
            pst.setInt(4, bus.getCoopetativa().getId());
            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public boolean insertarAsiento(Asiento asi) {
        String sql="Insert into asiento values (null, ?,?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, asi.getNumero());
            pst.setString(2, asi.getUbicacion());
            pst.setInt(3, asi.getBus().getId());
 
            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public boolean insertarRol(Rol rol) {
        String sql="Insert into rol values (null, ?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, rol.getDescripcion());
            
            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public boolean insertarUsuario(Usuario usu) {
        String sql="Insert into usuario values (null, ?,?,?,?,?,?,?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, usu.getCedula());
            pst.setString(2, usu.getNombre());
            pst.setString(3, usu.getApellido());
            pst.setString(4, usu.getTelefono());
            pst.setString(5, usu.getCorreo());
            pst.setString(6, usu.getDireccion());
            pst.setString(7, usu.getContraseña());
            pst.setInt(8, usu.getRol().getId());
            
            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    public boolean insertarCiudad(Ciudad ciu) {
        String sql="Insert into Ciudad values (null, ?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, ciu.getNombre());
            pst.setString(2, ciu.getCodigoPostal());

            
            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    public boolean insertarRuta(Ruta rut) {
        String sql="Insert into ruta values (null, ?,?,?,?,?,?,?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, rut.getCiudadOrigen().getId());
            pst.setInt(2, rut.getCiudadDestino().getId());
            java.sql.Date fechaS= new java.sql.Date(rut.getFechaHoraSalida().getTime());
            pst.setDate(3, fechaS);
            java.sql.Date fechaE= new java.sql.Date(rut.getFechaHoraLlegada().getTime());
            pst.setDate(4, fechaE);
            pst.setDouble(5, rut.getPrecioPasaje());
            pst.setString(6, rut.getEstado());
            pst.setInt(7, rut.getBus().getId());
            pst.setInt(8, rut.getUsuario().getId());

            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public boolean insertarCliente(Cliente cli) {
        String sql="Insert into cliente values (null, ?,?,?,?,?,?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, cli.getCedula());
            pst.setString(2, cli.getNombre());
            pst.setString(3, cli.getApellido());
            pst.setString(4, cli.getTelefono());
            pst.setString(5, cli.getCorreo());
            pst.setString(6, cli.getDireccion());
            pst.setString(7, cli.getContraseña());

            int res=pst.executeUpdate();
           if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    public boolean insertarReserva(Reserva res) {
        String sql="Insert into reserva values (null, ?,?,?,?)";
        PreparedStatement pst;
        
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, res.getRuta().getId());
            pst.setInt(2, res.getCliente().getId());
            pst.setInt(3, res.getAsiento().getId());
            pst.setString(4, res.getEstado());

            int dev=pst.executeUpdate();
           if (dev > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
}
