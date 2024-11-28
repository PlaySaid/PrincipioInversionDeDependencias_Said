/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author saidm
 */
public class AlmacenamientoLocal implements Almacenamiento{
    
    @Override
    public void guardarArchivo(){
        System.out.println("Archivo local guardado.");
    }
    
    @Override
    public void recuperarArchivo(){
        System.out.println("Archivo local recuperado.");
    }
    
}
