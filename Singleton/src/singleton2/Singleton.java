/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton2;
import java.util.Scanner;
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
        Scanner ac= new Scanner(System.in);
        ModuloVentas ventas= new ModuloVentas();
        ModuloFacturacion factura= new ModuloFacturacion();
        
        int op;
        double monto;
        double montof;
        do {
            System.out.println("===============================");
            System.out.println("===SISTEMA CAJA REGISTRADORA===");
            System.out.println("1.- Registrar Venta");
            System.out.println("2.- Registrar Factura");
            System.out.println("3.- Ver total ventas");
            System.out.println("4.- Ver total facturas");
            System.out.println("5.- Ver total factura y ventas");
            System.out.println("6.- Salir");
            System.out.print("Ingrese opcion: ");
            op=ac.nextInt();
            ac.nextLine();
            System.out.println("==============================");
            switch(op){
                case 1:
                    System.out.print("Ingrese el monto de la venta: ");
                    monto=ac.nextDouble();
                    ventas.vender(monto);
                   
                break;
                case 2:
                    System.out.print("Total de venta con facturacion: : ");
                    montof=ac.nextDouble();
                    ac.nextLine();
                    factura.facturar(montof);
                    break;
                case 3: 
                    CajaRegistradora caja=CajaRegistradora.getInstancia();
                    System.out.println("Total acumalado ventas sin facturacion: "+caja.getTotalVentas());
                    break;
                case 4:
                    CajaRegistradora cajaf=CajaRegistradora.getInstancia();
                    System.out.println("Total acumulado facturacion: "+cajaf.getTotalFacturas());
                    break; 
                case 5 :
                    CajaRegistradora cajat=CajaRegistradora.getInstancia();
                    System.out.println("Total acumulado: "+cajat.getTotal());
                    break; 
                case 6: 
                    System.out.println("Saliendo del programa.........");
                    break;
                default:
                    System.out.println("Opcion inavalida");
                    break;
            }
        } while (op!=6);
        ac.close();
    }
    
}
