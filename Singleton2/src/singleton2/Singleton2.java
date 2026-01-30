/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton2;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class Singleton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ac= new Scanner(System.in);
        String nombre;
        int edad;
        int n ;
        do {
            System.out.println("===Registrar Estudiante===");
            System.out.println("1.- Registrar Estudiante Escolar");
            System.out.println("2.- Registrar Estudiante de Secundaria");
            System.out.println("3.- Mostrar Datos");
            System.out.println("4.- Mostrar total de estudiantes escolares");
            System.out.println("5.- Mostrar total de estudiantes de secndaria");
            System.out.println("6.- Mostrar total de estudiantes");
            System.out.println("7.- Salir");
            System.out.print("Ingrese una opcion: ");
            n=ac.nextInt();
            ac.nextLine();
            RegistrarEstudiante registro = RegistrarEstudiante.getInstancia();

            switch (n) {

                case 1:
                    System.out.print("Nombre: ");
                    nombre = ac.nextLine();
                    System.out.print("Edad: ");
                    edad = ac.nextInt();
                    ac.nextLine();
                    registro.estudianteEscolar(nombre, edad);
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    nombre = ac.nextLine();
                    System.out.print("Edad: ");
                    edad = ac.nextInt();
                    ac.nextLine();
                    registro.estudianteSecundaria(nombre, edad);
                    break;

                case 3:
                    registro.listarEstudiantes();
                    break;

                case 4:
                    System.out.println("Total escolar: " + registro.getTotalEscolar());
                    break;

                case 5:
                    System.out.println("Total secundaria: " + registro.getTotalSecundaria());
                    break;

                case 6:
                    System.out.println("Total estudiantes: " + registro.getTotalEstudiantes());
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (n!= 7);
            
 
    }
    
}
