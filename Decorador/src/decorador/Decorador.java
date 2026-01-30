/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac = new Scanner(System.in);
        
        int n;
        Bebida cafe= new CafeSimple();
        do {
            System.out.println("===CAFETERIA POO===");
            System.out.println("1.- Cafe Simple");
            System.out.println("2.- Agregar Azucar");
            System.out.println("3.- Agregar Crema Canela");
            System.out.println("4.- Agregar Leche");
            System.out.println("5.- Agregar Hielo");
            System.out.println("6. SALIR");
            System.out.print("Ingrese una opcion: ");
            n=ac.nextInt();
            ac.nextLine();
            switch(n){
                case 1:
                    cafe= new CafeSimple();
                    System.out.println(cafe.getDescripcion()+" $"+cafe.getCosto());
                    break;
                case 2:
                    cafe= new Azucar(cafe);
                    System.out.println(cafe.getDescripcion()+" $"+cafe.getCosto());
                    break;

                case 3:
                    cafe= new Crema(cafe);
                    System.out.println(cafe.getDescripcion()+" $"+cafe.getCosto());
                    break;    
                case 4:
                    cafe= new Leche(cafe);
                    System.out.println(cafe.getDescripcion()+" $"+cafe.getCosto());
                    break;    
                case 5:
                    cafe= new Hielo(cafe);
                    System.out.println(cafe.getDescripcion()+" $"+cafe.getCosto());
                    break;
                case 6:
                    System.out.println("GRACIAS POR SU PEDIDO");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            
            
            
            }
        } while (n!=6);
    }
    
}
