/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author saidm
 */
public class AutenticacionLocal implements ServicioAutenticacion{
    
    @Override
    public void autenticarUsuario(String usuario, String contraseña){
        if("UsuarioLocal".equals(usuario)&& "contraseñaLocal".equals(contraseña)){
            System.out.println("Autenticacion local Exitosa!");
        }
        else{
            System.out.println("Hubo un error en la autenticacion local");
        }
    }
}
