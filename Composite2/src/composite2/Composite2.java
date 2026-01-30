/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite2;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class Composite2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner ac = new Scanner(System.in);
        int op;

       
        Producto hamburguesa = new Producto("Hamburguesa", 3);
        Producto hotdog = new Producto("Hot Dog", 2);
        Producto pizza = new Producto("Pizza", 4);

        
        Combo combo1 = new Combo("Hamburguesa + Hot Dog", 5);
        combo1.agregar(hamburguesa);
        combo1.agregar(hotdog);

        Combo combo2 = new Combo("Pizza + Hamburguesa", 7);
        combo2.agregar(pizza);
        combo2.agregar(hamburguesa);

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Hamburguesa ($3)");
            System.out.println("2. Hot Dog ($2)");
            System.out.println("3. Pizza ($4)");
            System.out.println("4. Combo Hamburguesa + Hot Dog ($5)");
            System.out.println("5. Combo Pizza + Hamburguesa ($7)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            op = ac.nextInt();

            Comida pedido = null;

            switch (op) {
                case 1:
                    pedido = hamburguesa;
                    break;
                case 2:
                    pedido = hotdog;
                    break;
                case 3:
                    pedido = pizza;
                    break;
                case 4:
                    pedido = combo1;
                    break;
                case 5:
                    pedido = combo2;
                    break;
                case 6:
                    System.out.println("Gracias por su compra");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

            if (pedido != null) {
                pedido.mostrar();
                System.out.println("TOTAL A PAGAR: $" + pedido.getPrecio());
            }

        } while (op != 6);

        ac.close();
    }
    }
    

