/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton2;

/**
 *
 * @author labesp
 */
public class CajaRegistradora {
    //
    private double totalFacturas;
    private double totalVentas;
    private static CajaRegistradora instancia;
    // Contructor privado
    private CajaRegistradora(){
      totalVentas=0.0;
        System.out.println("Caja registradora ");
    }
    
    //Agregar un metodo publico estatico
    
    public static CajaRegistradora getInstancia(){
        if (instancia==null) {
            instancia= new CajaRegistradora();
            
        }
        return instancia;
    }
     // metodos
     public void registrarVenta(double monto){
      totalVentas+= monto;
         System.out.println("Venta registrada: "+monto);
     }
     
     public double getTotalVentas(){
        return totalVentas;
     }
          public void facturarVenta(double monto){
              totalVentas=0;
      totalVentas= totalVentas+monto;
         System.out.println("Factura registrada: "+monto);
     }
     
    
}
