/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite2;

/**
 *
 * @author Lenovot490
 */
public class Producto implements Comida {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        System.out.println("- " + nombre);
    }

    @Override
    public double getPrecio() {
        return precio;
    }   
}
