/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obserever3;

/**
 *
 * @author Lenovot490
 */
public class Student implements Estudiante{
    private String nombre;

    public Student(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("El estudiante " + nombre +"\nRecibio el mensaje: " + mensaje);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
