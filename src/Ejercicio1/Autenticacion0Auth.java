/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author saidm
 */
public class Autenticacion0Auth implements ServicioAutenticacion{
    
    @Override
    public void autenticarUsuario(String usuario, String contraseña){
        if("Usuario0Auth".equals(usuario)&& "contraseña0Auth".equals(contraseña)){
            System.out.println("Autenticacion de Usuario0Auth exitosa!");
        }
        else{
            System.out.println("Hubo un error en la autenticacion oauth");
        }
    }
}
