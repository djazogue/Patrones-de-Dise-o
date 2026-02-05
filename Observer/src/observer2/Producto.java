/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer2;
import java.util.*;
/**
 *
 * @author Lenovot490
 */
public class Producto {
   private String nombre;  
   private List<Cliente>clientes= new ArrayList<>();

    public Producto(String nombre) {
        this.nombre = nombre;
    }
   public void agregarCliente(Cliente cliente){
       clientes.add(cliente);
   }
   
   public void notificar(String mensaje){
       for (Cliente c:clientes) {
           c.actualizar(mensaje);
           
       }
   }
   public void mostrarClienteNotificados(){
       System.out.println("================================");
       System.out.println("Cliente notificados "+nombre+":");
       int i=1;
       for (Cliente c: clientes) {
           System.out.println(i+".- Cliente "+c.getNombre());
           i++;
       }
       System.out.println("===============================");
   }
}
