/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author saidm
 */
public class GestorReporte {
    private GeneradorReporte generadorReporte;
    
    public GestorReporte(GeneradorReporte generadorReporte){
        this.generadorReporte = generadorReporte;
        
    }
    public void generarReporte() {
        generadorReporte.generarReporte();
    }
}
