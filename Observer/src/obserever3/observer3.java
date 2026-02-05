/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obserever3;
import java.util.Scanner;
/**
 *
 * @author Lenovot490
 */
public class observer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int op;
        Materia materia = null;
        String nombre;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1.- Crear Materia");
            System.out.println("2.- Agregar Estudiante");
            System.out.println("3.- Notificar a Estudiantes");
            System.out.println("4.- Ver Estudiantes Notificados");
            System.out.println("5.- Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el nombre de la materia: ");
                    nombre = sc.nextLine();
                    materia = new Materia(nombre);
                    System.out.println("Materia creada correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombre = sc.nextLine();
                    materia.agregarEstudiante(new Student(nombre));
                    System.out.println("Estudiante agregado.");
                    break;

                case 3:
                    System.out.println("\n--- NOTIFICACIONES ---");
                    System.out.println("1.- Nueva tarea");
                    System.out.println("2.- Cambio de horario");
                    System.out.println("3.- Publicacion de notas");
                    System.out.print("Seleccione una opcion: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                     switch (tipo) {
                     case 1:
                     materia.notificar("Hay una nueva tarea disponible.");
                    break;
                case 2:
                    materia.notificar("Se ha realizado un cambio de horario.");
                     break;
                case 3:
                    materia.notificar("Ya se publicaron las notas.");
                    break;
                    default:
                    System.out.println("Opcion no valida.");
                    }
                    break;

                case 4:
                    materia.mostrarEstudiantesNotificados();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }

        } while (op!=5);
    }        
    }
    

