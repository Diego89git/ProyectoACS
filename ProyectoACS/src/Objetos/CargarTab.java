/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Acceso_BD.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author USUARIO
 */
// implemetar el metodo de cargar tabla del objeto en cuestion *paso 1
public class CargarTab {

    public void tbRol(JTable tabla) {
        ArrayList<Rol> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarRoles();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Descripcion");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getDescripcion(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(315);
            modeloColumna.getColumn(1).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Rol ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbUsuario(JTable tabla) {
        ArrayList<Usuario> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarUsuarios();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("DIreccion");
            modelo.addColumn("Contraseña");
            modelo.addColumn("Rol");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getCedula(),
                    ob.get(i).getNombre(), ob.get(i).getApellido(),
                    ob.get(i).getTelefono(), ob.get(i).getCorreo(),
                    ob.get(i).getDireccion(), ob.get(i).getContraseña(),
                    ob.get(i).getRol(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(315);
            modeloColumna.getColumn(1).setPreferredWidth(315);
            modeloColumna.getColumn(2).setPreferredWidth(315);
            modeloColumna.getColumn(3).setPreferredWidth(315);
            modeloColumna.getColumn(4).setPreferredWidth(315);
            modeloColumna.getColumn(5).setPreferredWidth(315);
            modeloColumna.getColumn(6).setPreferredWidth(315);
            modeloColumna.getColumn(7).setPreferredWidth(315);
            modeloColumna.getColumn(8).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Usuario ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbCiudad(JTable tabla) {
        ArrayList<Ciudad> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarCiudades();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Nombre");
            modelo.addColumn("Codigo Postal");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getNombre(),
                    ob.get(i).getCodigoPostal(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Ciudad ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbCooperativa(JTable tabla) {
        ArrayList<Cooperativa> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarCooperativas();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Nombre");
            modelo.addColumn("RUC");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getNombre(),
                    ob.get(i).getRUC(), ob.get(i).getDireccion(),
                    ob.get(i).getTelefono(), ob.get(i).getCorreo(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(50);
            modeloColumna.getColumn(4).setPreferredWidth(50);
            modeloColumna.getColumn(5).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Cooperativas ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbBus(JTable tabla) {
        ArrayList<Bus> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarBuses();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Placa");
            modelo.addColumn("Año");
            modelo.addColumn("Marca");
            modelo.addColumn("Cooperativa");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getPlaca(),
                    ob.get(i).getAño(), ob.get(i).getMarca(),
                    ob.get(i).getCooperativa(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(50);
            modeloColumna.getColumn(4).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Bus ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbCliente(JTable tabla) {
        ArrayList<Cliente> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarClientes();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("Direccion");
            modelo.addColumn("Contraseña");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getCedula(),
                    ob.get(i).getNombre(), ob.get(i).getApellido(),
                    ob.get(i).getTelefono(), ob.get(i).getCorreo(),
                    ob.get(i).getDireccion(), ob.get(i).getContraseña(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(50);
            modeloColumna.getColumn(4).setPreferredWidth(50);
            modeloColumna.getColumn(5).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Cliente ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbAsiento(JTable tabla) {
        ArrayList<Asiento> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarAsientos();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Numero");
            modelo.addColumn("Ubicacion");
            modelo.addColumn("Bus");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getNumero(),
                    ob.get(i).getUbicacion(), ob.get(i).getBus(),
                    ob.get(i).getId()});
                i++;

            }
            
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Asiento ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbRuta(JTable tabla) {
        ArrayList<Ruta> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarRutas();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Fecha y hora salida");
            modelo.addColumn("Fecha y hora llegada");
            modelo.addColumn("Precio pasaje");
            modelo.addColumn("Estado");
            modelo.addColumn("Bus");
            modelo.addColumn("Usuario");
            modelo.addColumn("Ciudad Origen");
            modelo.addColumn("Ciudad Destino");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getFechaHoraSalida(),
                    ob.get(i).getFechaHoraLlegada(),
                    ob.get(i).getPrecioPasaje(), ob.get(i).getEstado(),
                    ob.get(i).getBus(), ob.get(i).getUsuario(),
                    ob.get(i).getCiudadOrigen(), ob.get(i).getCiudadDestino(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(50);
            modeloColumna.getColumn(4).setPreferredWidth(50);
            modeloColumna.getColumn(5).setPreferredWidth(50);
            modeloColumna.getColumn(6).setPreferredWidth(50);
            modeloColumna.getColumn(7).setPreferredWidth(50);
            modeloColumna.getColumn(8).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Ruta ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tbReserva(JTable tabla) {
        ArrayList<Reserva> ob;

        try {
            Consultas cons = new Consultas();
            ob = cons.consultarReservas();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            modelo.addColumn("Estado");
            modelo.addColumn("Ruta");
            modelo.addColumn("Cliente");
            modelo.addColumn("Asiento");
            modelo.addColumn("");
            int tamaño = ob.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{ob.get(i).getEstado(),
                    ob.get(i).getRuta(), ob.get(i).getCliente(), ob.get(i).getAsiento(),
                    ob.get(i).getId()});
                i++;
            }
            TableColumnModel modeloColumna = tabla.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(50);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(50);
            modeloColumna.getColumn(4).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Reserva ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
