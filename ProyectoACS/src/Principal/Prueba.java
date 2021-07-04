/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Objetos.*;
import Acceso_BD.*;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String[] args) {
        //Rol rol= new Rol(); 
        //Usuario usuario= new Usuario();
        Consultas con= new Consultas();
        //Cooperativa cop = new Cooperativa();
        //Inserciones ins= new Inserciones();
        //Bus bus= new Bus();
        //Ciudad ciu = new Ciudad();
        //Cliente cli = new Cliente();
        ArrayList<Asiento> asi= new ArrayList();
        int tamaño;
        int i=0;
        asi=con.consultarAsientos();
        tamaño=asi.size();
        while(i<tamaño){
            System.out.println(asi.get(i).getUbicacion());
            System.out.println(asi.get(i).getNumero());
            System.out.println(asi.get(i).getBus());
            System.out.println(asi.get(i).getId());
            i++;
        }
        /*rol.setDescripcion("Administrador");
        usuario.setCedula("1804816104");
        usuario.setNombre("Esthefania");
        usuario.setApellido("Villacres");
        usuario.setCorreo("s@gmail.com");
        usuario.setDireccion("Quero");
        usuario.setContraseña("Esthefania1");
        usuario.setTelefono("0990999992");   
        usuario.setRol(con.consultarRol(1));
        //ins.insertarUsuario(usuario);
        cop.setNombre("Cevallos");
        cop.setCorreo("c@gmail.com");
        cop.setDireccion("Cevallos");
        cop.setRUC("1801453456001");
        cop.setTelefono("09990897865");
       // ins.insertarCooperativa(cop);
        bus.setPlaca("PLO-827");
        bus.setMarca("Cepeda");
        bus.setAño(2014);
        bus.setCooperativa(con.consultarCooperativa(1));
        //ins.insertarBus(bus);
        
        ciu.setNombre("Puyo");
        ciu.setCodigoPostal("18025");
        //ins.insertarCiudad(ciu);
        
        cli.setCedula("1805");
        cli.setNombre("Esthefania");
        cli.setApellido("Lopez");
        cli.setTelefono("0990957324");
        cli.setDireccion("Ambato");
        cli.setCorreo("e@correo.com");
        cli.setContraseña("123");
        //ins.insertarCliente(cli);*/
        
//        System.out.println(con.consultarRol(1).getId());
//        ArrayList<Rol> rolp = con.consultarRoles();
//        for(int i=0 ; i<rolp.size();i++){
//            System.out.println(rolp.get(i).getId()); 
            
//        }
        
    }
}
