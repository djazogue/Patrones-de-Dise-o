/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton2;

/**
 *
 * @author Lenovot490
 */
public class ModuloEscolar {
    public void registrar(String nombre, int edad){
    RegistrarEstudiante registrar= RegistrarEstudiante.getInstancia();
    registrar.estudianteEscolar(nombre, edad);
    }
}
