/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int opcion;
Scanner ac = new Scanner(System.in);

do {
    System.out.println("\n=== Tipo de moneda ===");
    System.out.println("1.- Dolares a Euros");
    System.out.println("2.- Dolares a Pesos Colombianos");
    System.out.println("3.- Dolares a Libras Esterlinas");
    System.out.println("4.- Dolares a Pesos Mexicanos");
    System.out.println("5.- Salir");
    System.out.print("Ingrese una opcion: ");
    opcion = ac.nextInt();

    if (opcion >= 1 && opcion <= 4) {
        Pago pago = new PagoAdapter(opcion);
        System.out.print("Ingrese monto en dolares: ");
        double monto = ac.nextDouble();
        pago.pagar(monto);
    }

} while (opcion != 5);

ac.close();
    
    }}
