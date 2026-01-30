/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author labesp
 */
public class Impresora {
    
    private int totalImpresiones;
    
    // Definir una variable estatica
    private static Impresora instancia;
    
   // Crear un constructor privado
    private Impresora() {
        System.out.println("Impresora encendida");
    }
    // Agregar un metodo punlico estatico
    public static Impresora getInstancia(){
    
        if (instancia==null) {
            instancia= new Impresora();
        }
        return instancia;
    }
    
    //metodo para imprimir
    public void imprimir(String documento){
      totalImpresiones++;
        System.out.println("Documento impreso: "+documento);
    }
    public int getTotalImpresiones(){
    return totalImpresiones;
    }
}
