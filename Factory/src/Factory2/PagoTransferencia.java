/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author Lenovot490
 */
public class PagoTransferencia implements Pagos {
    private static double totalTransferencia = 0;

    @Override
    public void procesarPago(double monto) {
        totalTransferencia += monto;
        System.out.println("Pago por transferencia de: $" + monto);
    }

    public static void mostrarTotal() {
        System.out.println("Total acumulado en Transferencia: $" + totalTransferencia);
    }
}
