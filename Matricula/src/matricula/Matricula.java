/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricula;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac= new Scanner(System.in);
        int n;
        Control control= new Control();
        double pago;
        do {
            System.out.println("===SISTEMA PAGOS DE MATRICULAS===");
            System.out.println("1.- Alto Recursos");
            System.out.println("2.- Recursos Medio");
            System.out.println("3.- Bajo Recursos");
            System.out.println("4.- Salir");
            System.out.print("Ingrese una opcion: ");
            n=ac.nextInt();
            ac.nextLine();
            switch(n){
                case 1: 
                    control.setPago(new AltoRecursos());
                    System.out.print("Ingrese el monto de pago de matricula: ");
                    pago=ac.nextDouble();
                    control.realizarPago(pago);
                    break;
                case 2: 
                    control.setPago(new Media());
                    System.out.print("Ingrese el monto de pago de matricula: ");
                    pago=ac.nextDouble();
                    control.realizarPago(pago);      
                    break;
                 case 3:
                    control.setPago(new BajoRecursos());
                    System.out.print("Ingrese el monto de la matricula: ");
                    pago = ac.nextDouble();
                    control.realizarPago(pago);
                    break;

                case 4:
                System.out.println("Saliendo del sistema...");
                break;

                default:
                System.out.println("Opcion no valida.");
                    
                   
            }
        } while (n!=4);
    }
    
}
