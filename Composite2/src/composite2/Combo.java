/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lenovot490
 */
public class Combo implements Comida {
    private String nombre;
    private double precioCombo;
    private List<Comida> productos = new ArrayList<>();

    public Combo(String nombre, double precioCombo) {
        this.nombre = nombre;
        this.precioCombo = precioCombo;
    }

    public void agregar(Comida c) {
        productos.add(c);
    }

    @Override
    public void mostrar() {
        System.out.println("Combo: " + nombre);
        for (Comida c : productos) {
            c.mostrar();
        }
        System.out.println("Precio del combo: $" + precioCombo);
    }

    @Override
    public double getPrecio() {
        return precioCombo;
    }   
}
