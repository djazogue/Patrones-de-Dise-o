/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DecoradorJuego;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class decoradorjuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner ac = new Scanner(System.in);
        
        int n;
        Personaje base= new PersonajeBase();
        do {
            System.out.println("===JUEGO CRASH POO===");
            System.out.println("1.- Personaje Basico");
            System.out.println("2.- Agregar Espada");
            System.out.println("3.- Agregar Escudo");
            System.out.println("4.- Suma Puntos a los atributos");
            System.out.println("5. SALIR");
            System.out.print("Ingrese una opcion: ");
            n=ac.nextInt();
            ac.nextLine();
            switch(n){
                case 1:
                    base= new PersonajeBase();
                    System.out.println(base.getDescripcion());
                    System.out.println("Ataque: "+base.getAtaque());
                    System.out.println("Defendsa: "+base.getDefensa());
                    break;
                case 2:
                    base= new Espada(base);
                    System.out.println(base.getDescripcion());
                    System.out.println("Espada Agregada");
                    System.out.println("Ataque: "+base.getAtaque());
                    System.out.println("Defendsa: "+base.getDefensa());
                    break;

                case 3:
                    base= new Escudo(base);
                    System.out.println(base.getDescripcion());
                    System.out.println("Escudo Agregdo");
                    System.out.println("Ataque: "+base.getAtaque());
                    System.out.println("Defendsa: "+base.getDefensa());
                    break;  
                case 4:
                    base= new Apoyo(base);
                    System.out.println(base.getDescripcion());
                    System.out.println("Ha subido puntos para atributos");
                    System.out.println("Ataque: "+base.getAtaque());
                    System.out.println("Defendsa: "+base.getDefensa());
                    break;  
                case 5:
                    System.out.println("JUEGO TERMINADO");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break; 
            }
        } while (n!=5);
        ac.close();
    }
   
    }
    
