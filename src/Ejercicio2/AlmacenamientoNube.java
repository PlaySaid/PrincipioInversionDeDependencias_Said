/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author saidm
 */
public class AlmacenamientoNube implements Almacenamiento{
    
    @Override
    public void guardarArchivo(){
        System.out.println("Archivo de la nube guardado");
    }
    
    @Override
    public void recuperarArchivo(){
        System.out.println("Archivo de la nube recuperado");
    }
}
