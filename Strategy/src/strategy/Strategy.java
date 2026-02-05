/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac= new Scanner(System.in);
        Compra compra= new Compra();
        
        
        double pago;
        int n;
        do {
            System.out.println("===SISTEMA DE PAGOS===");
            System.out.println("1.- Pago con tarjeta");
            System.out.println("2.- Pago con Paypal");
            System.out.println("3.- Pago con transferencia");
            System.out.println("4.- Salir");
            System.out.println("=====================");
            System.out.print("Ingrese una opcion: ");
            n=ac.nextInt();
            ac.nextLine();
            System.out.println("----------------------");
            switch(n){
                case 1:
                    compra.setMetdoPago(new PagoTarjeta());
                    System.out.print("Ingrese el Pago: ");
                    pago=ac.nextDouble();
                    compra.realizarPago(pago);
                    break;
                case 2:
                    compra.setMetdoPago(new PagoPayPal());
                    System.out.print("Ingrese el Pago: ");
                    pago=ac.nextDouble();
                    compra.realizarPago(pago);
                    break;
                case 3:
                    compra.setMetdoPago(new PagoTransferencia());
                    System.out.print("Ingrese el Pago: ");
                    pago=ac.nextDouble();
                    compra.realizarPago(pago);
                    break;
                case 4:
                    System.out.println("GRACIAS POR SU COMPRA");
                    break;
                default: 
                    System.out.println("Opcion invalida");
            
            
            }
        } while (n!=4);
    }
    
}
