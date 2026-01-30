/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author Lenovot490
 */
public class PagoTarjeta implements Pagos{
    private static double totalTarjeta = 0;

    @Override
    public void procesarPago(double monto) {
        totalTarjeta += monto;
        System.out.println("Pago con Tarjeta por: $" + monto);
    }

    public static void mostrarTotal() {
        System.out.println("Total acumulado en Tarjeta: $" + totalTarjeta);
    }
}
