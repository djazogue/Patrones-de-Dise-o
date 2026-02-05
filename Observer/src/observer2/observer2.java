/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer2;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class observer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac= new Scanner(System.in);
        int n;
        Producto producto= null;
        String nombre;
        String p;
        do {
            System.out.println("======TIENDA DANNY==============");
            System.out.println("1.- Agregar Producto ");
            System.out.println("2.- Agrergar Clientes");
            System.out.println("3. Verclientes notificados");
            System.out.println("4.- Salir");
            System.out.print("Ingrese una opcion: ");
            n=ac.nextInt();
            ac.nextLine();
            System.out.println("==============================");
            switch(n){
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    p=ac.nextLine();
                    producto=new Producto(p);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre=ac.nextLine();
                    producto.agregarCliente(new Tienda(nombre));
                    break;
                case 3:
                    producto.notificar("Producto Disponible");
                    producto.mostrarClienteNotificados();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    System.out.println("Opcion Invalida...");
            
            
            }
            
        } while (n!=4);
    }
    
}
