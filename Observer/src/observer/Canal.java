/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;
import java.util.*;

/**
 *
 * @author Lenovot490
 */
public class Canal {
    private List<Notificaciones> usuario= new ArrayList<>();
    private List<String> videos= new ArrayList<>(); 
    public void suscribir(Notificaciones notificaciones){
        usuario.add(notificaciones);
    }
    
    public void subir(String titulo){
        System.out.println("Youtube\nNuveo Video de Luisito Comunica: "+ titulo);
        notificar(titulo);
    }
    public void notificar(String mensaje){
        for (Notificaciones n: usuario) {
            n.actualizar(mensaje);
        }
    }
}
