/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class FactoryPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac = new Scanner(System.in);
        int n;

        do {
            System.out.println("=== SISTEMA DE PAGOS ===");
            System.out.println("1.- Pago Efectivo");
            System.out.println("2.- Pago Transferencia");
            System.out.println("3.- Pago Tarjeta");
            System.out.println("4.- Pago Deuna");
            System.out.println("5.- Salir");
            System.out.print("Seleccione una opcion: ");
            n = ac.nextInt();

            if (n == 5) {
                System.out.println("\n=== RESUMEN DE PAGOS ===");

                PagoEfectivo.mostrarTotal();
                PagoTransferencia.mostrarTotal();
                PagoTarjeta.mostrarTotal();
                PagoDeuna.mostrarTotal();

                PagosFactory.mostrar();

                System.out.println("Saliendo del sistema...");
                break;
            }
            Pagos pagos = PagosFactory.realizarPago(n);

            if (pagos != null) {
                System.out.print("Ingrese el monto: ");
                double monto = ac.nextDouble();

                pagos.procesarPago(monto);      
                PagosFactory.acumular(monto);   
            } else {
                System.out.println("Pago no válido");
            }

        } while (true);

        ac.close();
    }
    }
    
    

