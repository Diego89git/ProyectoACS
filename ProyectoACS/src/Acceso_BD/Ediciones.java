/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_BD;

import Objetos.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Objetos.*;

public class Ediciones {
    ConeccionMYSQL cn;
    public Ediciones() {
    cn = new ConeccionMYSQL();
    }
    
    public boolean actualizarRol(Rol rol) {
        PreparedStatement pst;
        String sentencia="Update rol set DES_ROL=? Where ID_ROL=?";

        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, rol.getDescripcion());
            pst.setInt(2, rol.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarUsuario(Usuario usu) {
        PreparedStatement pst;
        String sentencia="Update usuario SET CED__USU=?, NOM_USU=?, APE_USU=?,"
                                            + "TEL_USU=?, COR_USU=?, DIR_USU=?, "
                                            + "PAS_USU=?, ID_ROL_PER=? "
                                            + "Where ID_ROL=?";

        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, usu.getCedula());
            pst.setString(2, usu.getNombre());
            pst.setString(3, usu.getApellido());
            pst.setString(4, usu.getTelefono());
            pst.setString(5, usu.getCorreo());
            pst.setString(6, usu.getDireccion());
            pst.setString(7, usu.getContraseña());
            pst.setInt(8, usu.getRol().getId());
            pst.setInt(9, usu.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarCooperativa(Cooperativa cop) {
        PreparedStatement pst;
        String sentencia="Update cooperativa set NOM_COP=?, RUC_COP=?, DIR_COP=?, TEL_COP=?,COR_COP=? Where ID_COP=?";

        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, cop.getNombre());
            pst.setString(2, cop.getRUC());
            pst.setString(3, cop.getDireccion());
            pst.setString(4, cop.getTelefono());
            pst.setString(5, cop.getCorreo());
            pst.setInt(6, cop.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarBus(Bus bus) {
        PreparedStatement pst;
        String sentencia="Update bus set PLA_BUS=?, ANI_BUS=?, MAR_BUS=?, ID_COP_PER=? Where ID_BUS=?";

        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, bus.getPlaca());
            pst.setInt(2, bus.getAño());
            pst.setString(3, bus.getMarca());
            pst.setInt(4, bus.getCooperativa().getId());
            pst.setInt(5, bus.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarAsiento(Asiento asi) {
        PreparedStatement pst;
        String sentencia="Update asiento set NUM_ASI=?, UBI_ASI=?, ID_BUS_PER=? Where ID_ASI=?";

        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, asi.getNumero());
            pst.setString(2, asi.getUbicacion());
            pst.setInt(3, asi.getBus().getId());
            pst.setInt(4, asi.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarCiudad(Ciudad ciu) {
        PreparedStatement pst;
        String sentencia="Update ciudad set NOM_CIU=?, CPS_CIU=? Where ID_CIU=?";
        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, ciu.getNombre());
            pst.setString(2, ciu.getCodigoPostal());
            pst.setInt(2, ciu.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarRuta(Ruta rut) {
        PreparedStatement pst;
        String sentencia="Update ruta set ID_CIO_RUT=?, ID_CID_RUT=?, FHS_RUT=?, FHL_RUT=?, PPJ_RUT=?, EST_RUT=?, ID_BUS_RUT=?, ID_USU_RUT=?  Where ID_RUT=?";
        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setInt(1, rut.getCiudadOrigen().getId());
            pst.setInt(2, rut.getCiudadDestino().getId());
            java.sql.Date fechaS = new java.sql.Date(rut.getFechaHoraSalida().getTime());
            pst.setDate(3, fechaS);
            java.sql.Date fechaE = new java.sql.Date(rut.getFechaHoraLlegada().getTime());
            pst.setDate(4, fechaE);
            pst.setDouble(5, rut.getPrecioPasaje());
            pst.setString(6, rut.getEstado());
            pst.setInt(7, rut.getBus().getId());
            pst.setInt(8, rut.getUsuario().getId());
            pst.setInt(9, rut.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarCiente(Cliente cli) {
        PreparedStatement pst;
        String sentencia="Update cliente set CEDCLI=?, NOM_CLI=?,APE_CLI=?, TEL_CLI=?, COR_CLI=?, DIR_CLI=?, PAS_CLI=? Where ID_CLI=?";
        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, cli.getCedula());
            pst.setString(2, cli.getNombre());
            pst.setString(3, cli.getApellido());
            pst.setString(4, cli.getTelefono());
            pst.setString(5, cli.getCorreo());
            pst.setString(6, cli.getDireccion());
            pst.setString(7, cli.getContraseña());
            pst.setInt(8, cli.getId());
            int res = pst.executeUpdate();
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
    public boolean actualizarReserva(Reserva res) {
        PreparedStatement pst;
        String sentencia="Update reserva set ID_RUT_RES=?, ID_CLI_RES=?, ID_ASI_RES=?, EST_RES=? Where ID_RES=?";

        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setInt(1, res.getRuta().getId());
            pst.setInt(2, res.getCliente().getId());
            pst.setInt(3, res.getAsiento().getId());
            pst.setString(4, res.getEstado());
            pst.setInt(2, res.getId());
            int res_ = pst.executeUpdate();
            if (res_ > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inserciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    public boolean editarEstadoRuta(String estado, int id) {
        PreparedStatement pst;
        String sentencia="Update ruta set EST_RUT=?  Where ID_RUT=?";
        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, estado);
            pst.setInt(2, id);
            int res = pst.executeUpdate();
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
    public boolean editarEstadoReserva(String estado, int id) {
        PreparedStatement pst;
        String sentencia="Update reserva set EST_RES=?  Where ID_RES=?";
        try {
            pst = cn.conectar().prepareStatement(sentencia);
            pst.setString(1, estado);
            pst.setInt(2, id);
            int res = pst.executeUpdate();
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
    
    
    
}
