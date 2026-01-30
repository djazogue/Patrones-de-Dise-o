/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoradorJuego;

/**
 *
 * @author Lenovot490
 */
public class Espada extends PersonajeDecorador{

    public Espada(Personaje personaje) {
        super(personaje);
    }
    @Override
    public String getDescripcion() {
        return personaje.getDescripcion();
    }

    @Override
    public int getDefensa() {
        return personaje.getDefensa();
    }

    @Override
    public int getAtaque() {
       return personaje.getAtaque()+10;
    }
    
}
