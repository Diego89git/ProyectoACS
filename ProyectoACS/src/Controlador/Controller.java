/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Acceso_BD.Consultas;
import Acceso_BD.Inserciones;
import Interfaz.Principal;
import Objetos.Asiento;
import Objetos.Bus;
import Objetos.Ciudad;
import Objetos.Cliente;
import Objetos.Cooperativa;
import Objetos.Rol;
import Objetos.Ruta;
import Objetos.Usuario;
import java.util.List;
import java.util.Set;

/**
 *
 * @author HP
 */
public class Controller {

    Consultas cons = new Consultas();
    Inserciones inser = new Inserciones();

    public boolean login() {
//        Principal plog= new Principal();
        try {
            int user;
            user = Integer.parseInt(Principal.jtxtUser.getText());
            String pass = Principal.jtxtPass.getText();
            Usuario us1 = cons.consultarUsuario(user);
            Cliente cli = cons.consultarCliente(user);
            if (us1 != null) {
                return true;
            } else if (cli != null) {
                return true;
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public List<Cliente> registroCliente() {
        Cliente cliente = new Cliente();
        String cedula = Principal.JTRCedula.getText();
        cliente.setCedula(cedula);
        String nombre = Principal.JTRNombre.getText();
        cliente.setNombre(nombre);
        String apellido = Principal.JTRApellido.getText();
        cliente.setApellido(apellido);
        String telefono = Principal.JTRTelefono.getText();
        cliente.setTelefono(telefono);
        String correo = Principal.JTRCorreo.getText();
        cliente.setCorreo(correo);
        String direccion = Principal.JTRDireccion.getText();
        cliente.setDireccion(direccion);
        String contraseña = Principal.JTRContraseña.getText();
        cliente.setContraseña(contraseña);
        inser.insertarCliente(cliente);
    }

    public List<Usuario> registroUsuario() {
        Usuario usuario = new Usuario();
        String cedula = Principal.JTUCedula.getText();
        usuario.setCedula(cedula);
        String nombre = Principal.JTUNombre.getText();
        usuario.setNombre(nombre);
        String apellido = Principal.JTUApellido.getText();
        usuario.setApellido(apellido);
        String telefono = Principal.JTUTelefono.getText();
        usuario.setTelefono(telefono);
        String correo = Principal.JTUCorreo.getText();
        usuario.setTelefono(telefono);
        String direccion = Principal.JTUDireccion.getText();
        usuario.setDireccion(direccion);
        String contraseña = Principal.JTUContraseña.getText();
        usuario.setContraseña(contraseña);
        inser.insertarUsuario(usuario);
    }

    public List<Ciudad> registroCiudad() {
        Ciudad ciudad = new Ciudad();
        String nombre = Principal.JTCNombre.getText();
        ciudad.setNombre(nombre);
        String codigoPostal = Principal.JTCCodPos.getText();
        ciudad.setCodigoPostal(codigoPostal);
        inser.insertarCiudad(ciudad);
    }

    public List<Cooperativa> registroCooperativa() {
        Cooperativa coop = new Cooperativa();
        String nombre = Principal.TXCNombre.getText();
        coop.setNombre(nombre);
        String RUC = Principal.TXCRuc.getText();
        coop.setRUC(RUC);
        String direccion = Principal.TXCDireccion.getText();
        coop.setDireccion(direccion);
        String telefono = Principal.TXCTelefono.getText();
        coop.setTelefono(telefono);
        String correo = Principal.TXCCorreo.getText();
        coop.setCorreo(correo);
        inser.insertarCooperativa(coop);
    }

    public List<Rol> registroRol() {
        Rol rol = new Rol();
        String descripcion = Principal.TXRDescripcion.getText();
        rol.setDescripcion(descripcion);
        inser.insertarRol(rol);
    }

    public List<Asiento> registroAsiento() {
        Asiento asiento = new Asiento();
        String numero = Principal.JTANumero.getText();
        asiento.setNumero(numero);
        String ubicacion = Principal.JTAUbicacion.getText();
        asiento.setUbicacion(ubicacion);
        inser.insertarAsiento(asiento);
    }

    public List<Bus> registroBus() {
        Bus bus = new Bus();
        String placa = Principal.JTBPlaca.getText();
        bus.setPlaca(placa);
        int año = Integer.parseInt(Principal.JTBAño.getText());
        bus.setAño(año);
        String marca = Principal.JTBMarca.getText();
        bus.setMarca(marca);
        inser.insertarBus(bus);
    }
    
    public List<Ruta> registroRuta(){
        Ruta ruta = new Ruta();
        double precioPasaje = Double.parseDouble(Principal.TXJPrecio.getText());
        ruta.setPrecioPasaje(precioPasaje);
        String estado = Principal.TXJEstado.getText();
        ruta.setEstado(estado);
        inser.insertarRuta(ruta);
    }
}
