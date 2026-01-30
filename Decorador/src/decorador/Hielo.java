/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Lenovot490
 */
public class Hielo extends BebidaDecorada{

    public Hielo(Bebida bebida) {
        super(bebida);
    }
        @Override
    public String getDescripcion() {
    return bebida.getDescripcion()+""+"Hielo";
    }

    @Override
    public double getCosto() {
     return bebida.getCosto()+0.6;
    }

}
