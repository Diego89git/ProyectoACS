/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Acceso_BD.Consultas;
import javax.swing.JComboBox;
import Objetos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class InsertarComb {

    String primero = "Seleccione ...";

    public void InsertarRol(JComboBox<Rol> rol) {
        ArrayList<Rol> rol2;
        Consultas cons = new Consultas();
        try {

            rol2 = cons.consultarRoles();
            int i = 0;
            int tamaño = rol2.size();
            Rol rol3 = new Rol();
            rol3.setDescripcion(primero);
            rol.addItem(rol3);
            while (i < tamaño) {
                rol.addItem(rol2.get(i));
                System.out.println(rol2);
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void InsertarCop(JComboBox<Cooperativa> cop) {
        ArrayList<Cooperativa> cop2;
        Consultas cons = new Consultas();
        try {

            cop2 = cons.consultarCooperativas();
            int i = 0;
            int tamaño = cop2.size();
            Cooperativa cop3 = new Cooperativa();
            cop3.setNombre(primero);
            cop.addItem(cop3);
            while (i < tamaño) {
                cop.addItem(cop2.get(i));
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void InsertarAsi(JComboBox<Asiento> asi) {
        ArrayList<Asiento> asi2;
        Consultas cons = new Consultas();
        try {

            asi2 = cons.consultarAsientos();
            int i = 0;
            int tamaño = asi2.size();
            Asiento asi3 = new Asiento();
            asi3.setNumero(primero);
            asi.addItem(asi3);
            while (i < tamaño) {
                asi.addItem(asi2.get(i));
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void InsertarBus(JComboBox<Bus> bus) {
        ArrayList<Bus> bus2;
        Consultas cons = new Consultas();
        try {

            bus2 = cons.consultarBuses();
            int i = 0;
            int tamaño = bus2.size();
            Bus bus3 = new Bus();
            bus3.setPlaca(primero);
            bus.addItem(bus3);
            while (i < tamaño) {
                bus.addItem(bus2.get(i));
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void InsertarCiudad(JComboBox<Ciudad> ciu) {
        ArrayList<Ciudad> ciu2;
        Consultas cons = new Consultas();
        try {

            ciu2 = cons.consultarCiudades();
            int i = 0;
            int tamaño = ciu2.size();
            Ciudad ciu3 = new Ciudad();
            ciu3.setNombre(primero);
            ciu.addItem(ciu3);
            while (i < tamaño) {
                ciu.addItem(ciu2.get(i));
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void InsertarCliente(JComboBox<Cliente> cli) {
        ArrayList<Cliente> cli2;
        Consultas cons = new Consultas();
        try {

            cli2 = cons.consultarClientes();
            int i = 0;
            int tamaño = cli2.size();
            Cliente cli3 = new Cliente();
            cli3.setCedula(primero);
            cli.addItem(cli3);
            while (i < tamaño) {
                cli.addItem(cli2.get(i));
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    /*public void InsertarRuta(JComboBox<Ruta> ruta) {
        ArrayList<Ruta> ruta2;
        Consultas cons = new Consultas();
        try {

            ruta2 = cons.consultarRutas();
            int i = 0;
            int tamaño = ruta2.size();
            Ruta ruta3 = new Ruta();
            ruta3.setCiudadDestino((primero);
            ruta.addItem(ruta3);
            while (i < tamaño) {
                ruta.addItem(ruta2.get(i));
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }*/

    public void InsertarUsuario(JComboBox<Usuario> usu) {
        ArrayList<Usuario> usu2;
        Consultas cons = new Consultas();
        try {

            usu2 = cons.consultarUsuarios();
            int i = 0;
            int tamaño = usu2.size();
            Usuario usu3 = new Usuario();
            usu3.setCedula(primero);
            usu.addItem(usu3);
            while (i < tamaño) {
                usu.addItem(usu2.get(i));
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

}
