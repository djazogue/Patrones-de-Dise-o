/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Lenovot490
 */
public class Crema extends BebidaDecorada{

    public Crema(Bebida bebida) {
        super(bebida);
    }
        @Override
    public String getDescripcion() {
    return bebida.getDescripcion()+""+"Crema de Canela";
    }

    @Override
    public double getCosto() {
     return bebida.getCosto()+1;
    }

}
