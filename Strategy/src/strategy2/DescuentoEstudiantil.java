/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy2;

/**
 *
 * @author labesp
 */
public class DescuentoEstudiantil implements Descuento{
    @Override
    public double aplicar(double monto) {
     return monto*0.1;   
    }
}
