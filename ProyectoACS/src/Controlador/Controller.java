/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Acceso_BD.Consultas;
import Interfaz.Principal;
import Objetos.Cliente;
import Objetos.Usuario;

/**
 *
 * @author HP
 */
public class Controller {

    public boolean login() {
//        Principal plog= new Principal();
        Consultas cons = new Consultas();
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
}
