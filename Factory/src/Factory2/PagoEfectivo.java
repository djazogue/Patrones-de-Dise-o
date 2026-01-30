/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author Lenovot490
 */
public class PagoEfectivo implements Pagos{
    private static double totalEfectivo = 0;

    @Override
    public void procesarPago(double monto) {
        totalEfectivo += monto;
        System.out.println("Pago en efectivo por: $" + monto);
    }

    public static void mostrarTotal() {
        System.out.println("Total acumulado en Efectivo: $" + totalEfectivo);
    }
    
}
