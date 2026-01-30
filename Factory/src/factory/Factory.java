/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac= new Scanner(System.in);
        int n;
        do {
            System.out.println("===FABRICA DE JUGUTES===");
            System.out.println("1.- Peluche");
            System.out.println("2.- Carrito");
            System.out.println("3.- Figuura de Accion");
            System.out.println("4.- Salir");
            System.out.print("Seleccione una opcion: ");
            n=ac.nextInt();
            ac.nextLine();
    
            Juguete juguete= JugueteFactory.crearJuguete(n);
            if (juguete!=null) {
                juguete.crear();
            }else{
                System.out.println("No se ha podido crear el jugute");
            }
        } while (n!=4);
        ac.close();
    }
    
}
