/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Lenovot490
 */
public class Usuario implements Notificaciones{
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Ha recibido una notifiacion para: "+nombre+"\nMensaje: "+ mensaje);
    }
    
}
