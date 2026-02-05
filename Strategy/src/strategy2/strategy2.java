/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy2;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class strategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac= new Scanner(System.in);
        /*System.out.print("Ingrese monto de la venta: ");
        double pago=ac.nextDouble();
        
        Venta venta= new Venta();
        venta.setDescuento(new DescuentoEstudiantil());
        System.out.println(pago -venta.calcularTotal(pago));*/
        Venta venta= new Venta();
        int n;
        double pago;

        System.out.print("Ingrese el pago: ");
        pago=ac.nextDouble();
        System.out.println("Seleccione un Descuento.........");
        do {
            System.out.println("====SISTEMA DE DESCUENTOS====");
            System.out.println("1.- Descuento normal");
            System.out.println("2.- Descuento Estudiantil");
            System.out.println("3.- Descuento VIP");
            System.out.println("4.- Salir");
            System.out.println("===========================");
            System.out.print("Ingrese una Opcion: ");
            n=ac.nextInt();
            switch(n){
                case 1:
                    venta.setDescuento(new DescuentoNormal());
                    System.out.println("Total a Pagar: "+(pago-venta.calcularTotal(pago)));
                    break;
                case 2:
                    venta.setDescuento(new DescuentoEstudiantil());
                    System.out.println("Total a Pagar: "+(pago-venta.calcularTotal(pago)));
                    break;
                case 3: 
                    venta.setDescuento(new DescuentoVip());
                    System.out.println("Total a Pagar: "+(pago-venta.calcularTotal(pago)));
                    break;
                case 4:
                    System.out.println("Gracias por su compra");
                    break;
                default: 
                    System.out.println("Opcion Incorrecta");
                      
            }
        } while (n!=4);
        
    }
    
}
