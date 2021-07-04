/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Acceso_BD.Inserciones;
import Objetos.*;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class Controlador {

    // paso 2
    public boolean cargarRol(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbRol(tab);
        return true;
    }

    public boolean cargarUsuario(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbUsuario(tab);
        return true;
    }

    public boolean cargarCiudad(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbCiudad(tab);
        return true;
    }

    public boolean cargarCooperativa(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbCooperativa(tab);
        return true;
    }

    public boolean cargarBus(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbBus(tab);
        return true;
    }

    public boolean cargarCliente(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbCliente(tab);
        return true;
    }
    public boolean cargarAsiento(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbAsiento(tab);
        return true;
    }
    public boolean cargarRuta(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbRuta(tab);
        return true;
    }
    public boolean cargarReserva(JTable tab) {
        CargarTab tab1 = new CargarTab();
        tab1.tbReserva(tab);
        return true;
    }

    // paso 2.1 cargar combo box si es nesesario
    public boolean cargarComboRol(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarRol(comb);
        return true;
    }

    public boolean cargarComboCooperativa(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarCop(comb);
        return true;
    }
    public boolean cargarComboBus(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarBus(comb);
        return true;
    }
     public boolean cargarComboUsuario(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarUsuario(comb);
        return true;
    }
      public boolean cargarComboCiudad(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarCiudad(comb);
        return true;
    }
       public boolean cargarComboAsiento(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarAsi(comb);
        return true;
    }
        /*public boolean cargarComboRuta(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarRuta(comb);
        return true;
    }*/
         public boolean cargarComboCliente(JComboBox comb) {
        InsertarComb comb1 = new InsertarComb();
        comb1.InsertarCliente(comb);
        return true;
    }


// paso 3 crear el objeto para cargar los datos en la tabla
    public void crearRol(String descripcion) {
        //Falta condiciones para validar datos
        Rol rol = new Rol();
        rol.setDescripcion(descripcion);
        Inserciones ins = new Inserciones();
        ins.insertarRol(rol);

    }

    public void crearUsuario(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String contraseña, Rol rol) {
        //Falta condiciones para validar datos
        Usuario usu = new Usuario();
        usu.setCedula(cedula);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
        usu.setCorreo(correo);
        usu.setDireccion(direccion);
        usu.setContraseña(contraseña);
        usu.setRol(rol);
        Inserciones ins = new Inserciones();
        ins.insertarUsuario(usu);

    }

    public void crearCiudad(String nombre, String codigoPostal) {
        //Falta condiciones para validar datos
        Ciudad ciu = new Ciudad();
        ciu.setNombre(nombre);
        ciu.setCodigoPostal(codigoPostal);
        Inserciones ins = new Inserciones();
        ins.insertarCiudad(ciu);

    }

    public void crearCooperativa(String nombre, String RUC, String direccion, String telefono, String correo) {
        //Falta condiciones para validar datos
        Cooperativa cop = new Cooperativa();
        cop.setNombre(nombre);
        cop.setRUC(RUC);
        cop.setDireccion(nombre);
        cop.setTelefono(telefono);
        cop.setCorreo(correo);
        Inserciones ins = new Inserciones();
        ins.insertarCooperativa(cop);

    }

    public void crearBus(String placa, int año, String marca, Cooperativa cooperativa) {
        //Falta condiciones para validar datos
        Bus bus = new Bus();
        bus.setPlaca(placa);
        bus.setAño(año);
        bus.setMarca(marca);
        bus.setCooperativa(cooperativa);
        Inserciones ins = new Inserciones();
        ins.insertarBus(bus);

    }

    public void crearCliente(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String contraseña) {
        //Falta condiciones para validar datos
        Cliente cli = new Cliente();
        cli.setCedula(cedula);
        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setTelefono(telefono);
        cli.setCorreo(correo);
        cli.setDireccion(direccion);
        cli.setContraseña(contraseña);
        Inserciones ins = new Inserciones();
        ins.insertarCliente(cli);

    }
    public void crearAsiento(String numero, String ubicacion, Bus bus) {
        //Falta condiciones para validar datos
        Asiento asi = new Asiento();
        asi.setNumero(numero);
        asi.setUbicacion(ubicacion);
        asi.setBus(bus);
        Inserciones ins = new Inserciones();
        ins.insertarAsiento(asi);

    }
    public void crearRuta( Date fechaHoraSalida, Date fechaHoraLlegada, double precioPasaje, String estado, Bus bus, Usuario usuario, Ciudad ciudadOrigen, Ciudad ciudadDestino) {
        //Falta condiciones para validar datos
        Ruta ruta = new Ruta();
        ruta.setFechaHoraSalida(fechaHoraSalida);
        ruta.setFechaHoraLlegada(fechaHoraLlegada);
        ruta.setPrecioPasaje(precioPasaje);
        ruta.setEstado(estado);
        ruta.setBus(bus);
        ruta.setUsuario(usuario);
        ruta.setCiudadOrigen(ciudadOrigen);
        ruta.setCiudadDestino(ciudadDestino);
        Inserciones ins = new Inserciones();
        ins.insertarRuta(ruta);

    }
    public void crearReserva(String estado, Ruta ruta, Cliente cliente, Asiento asiento) {
        //Falta condiciones para validar datos
        Reserva res = new Reserva();
        res.setEstado(estado);
        res.setRuta(ruta);
        res.setCliente(cliente);
        res.setAsiento(asiento);
        Inserciones ins = new Inserciones();
        ins.insertarReserva(res);

    }
}
