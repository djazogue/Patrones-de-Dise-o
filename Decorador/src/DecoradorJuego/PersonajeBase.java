/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author Lenovot490
 */
public class PersonajeBase implements Personaje{

    @Override
    public String getDescripcion() {
        return "Crash";
    }

    @Override
    public int getDefensa() {
        return 10;
    }

    @Override
    public int getAtaque() {
       return 10;
    }
    
}
