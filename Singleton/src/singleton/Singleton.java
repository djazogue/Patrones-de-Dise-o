/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author labesp
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Impresora usuario1= Impresora.getInstancia();
        Impresora usuario2= Impresora.getInstancia();
        Impresora usuario3= Impresora.getInstancia();
        
        usuario1.imprimir("Deber de POO");
        usuario1.imprimir("Taller 3.2 Fisica");
        usuario2.imprimir("Ejercicios de Fisica");
        usuario3.imprimir("Reporte de ceros");
        
        System.out.println("Total impresiones: "+usuario1.getTotalImpresiones());
        
        System.out.println(usuario1==usuario2);
      
    }
    
}
