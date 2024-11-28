/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author saidm
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(local);
        
        gestorLocal.guardar();
        gestorLocal.recuperar();
        
        Almacenamiento nube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(nube);
        
        gestorNube.guardar();
        gestorNube.recuperar();
    }
    
}
