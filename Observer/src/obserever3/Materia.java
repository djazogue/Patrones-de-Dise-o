/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obserever3;
import java.util.*;
/**
 *
 * @author Lenovot490
 */
public class Materia {
    private String nombre;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void notificar(String mensaje) {
        for (Estudiante e : estudiantes) {
            e.actualizar(mensaje);
        }
    }

    public void mostrarEstudiantesNotificados() {
        System.out.println("Estudiantes notificados en " + nombre + ":");
        int i = 1;
        for (Estudiante e : estudiantes) {
            System.out.println(i + ".- Estudiante: " + e.getNombre());
            i++;
        }
    }    
}
