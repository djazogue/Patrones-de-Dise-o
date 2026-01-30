/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Lenovot490
 */
public abstract class BebidaDecorada implements Bebida{
    protected Bebida bebida;

    public BebidaDecorada(Bebida bebida) {
        this.bebida = bebida;
    }
    @Override
    public String getDescripcion() {
    return "Cafe Simple";
    }

    @Override
    public double getCosto() {
     return 1;
    }

}
