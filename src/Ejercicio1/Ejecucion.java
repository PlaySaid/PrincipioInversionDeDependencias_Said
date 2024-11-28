/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author saidm
 */
public class Ejecucion {
    public static void main(String[] args) {
        // Autenticación local //
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(local);
        gestor.autenticarUsuario("UsuarioLocal", "contraseñaLocal");

        // Autenticación OAuth //
        ServicioAutenticacion oauth = new Autenticacion0Auth();
        GestorAutenticacion gestorOauth = new GestorAutenticacion(oauth);
        gestorOauth.autenticarUsuario("Usuario0Auth", "contraseñaIncorrecta"); //la contraseña correcta es contraseña0Auth
    }
}
