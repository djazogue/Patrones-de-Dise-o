/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer2;

/**
 *
 * @author Lenovot490
 */
public class Tienda implements Cliente{
    private String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("----------------------------------------------------");
        System.out.println("El cliente: "+nombre+"\nRecibio el mensjae: "+mensaje);
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    

}
