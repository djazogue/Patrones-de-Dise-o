/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author labesp
 */
public class PagoTransferencia implements MetodoPago{
    @Override
    public void pagar(double monto) {
        System.out.printf("Pago con Transeferencia: $%.2f\n",monto);
    }
    
}
