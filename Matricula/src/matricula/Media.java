/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula;

/**
 *
 * @author Lenovot490
 */
public class Media implements Pago{
    @Override
    public void pago(double monto) {
        System.out.println("Total a pagar Matricula: "+monto+"\nEstado: Recursos Medios");
    }       
}
