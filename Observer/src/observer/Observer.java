/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac= new Scanner(System.in);
        int n;
        String titulo = null;
        Canal canal = new Canal();
        do {
            System.out.println("===YOUTUBE===");
            System.out.println("1.- Suscribirse");
            System.out.println("2.- Subir Video");
            System.out.println("3.- Mostrar Notificaciones");
            System.out.println("4.- SALIR");
            System.out.print("Ingrese una opcion: ");
            n= ac.nextInt();
            ac.nextLine();
            switch(n){
                case 1: 
                    System.out.print("Ingrese el nombre: ");
                    String nombre= ac.nextLine();
                    canal.suscribir(new Usuario(nombre));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Video: ");
                    titulo=ac.nextLine();
                    canal.subir(titulo);
                    break;
                case 3:
                    canal.notificar(titulo);
                case 4:
                    break;
                default:
                    System.out.println("Opcion Invalidad");
            
            
            }
        } while (n!=4);
    }
    
}
