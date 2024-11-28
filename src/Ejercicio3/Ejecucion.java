/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author saidm
 */
public class Ejecucion {
    public static void main(String[] args) {
        
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReporte gestorPDF = new GestorReporte(reportePDF);
        gestorPDF.generarReporte();
        
        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReporte gestorExcel = new GestorReporte(reporteExcel);
        gestorExcel.generarReporte();
    }
    
}
