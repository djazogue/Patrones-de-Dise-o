/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author Lenovot490
 */
public class PagoDeuna implements Pagos {
    private static double totalDeuna = 0;
    @Override
    public void procesarPago(double monto) {
        totalDeuna += monto;
        System.out.println("Pago con Deuna por: $" + monto);
    }

    public static void mostrarTotal() {
        System.out.println("Total acumulado en Deuna: $" + totalDeuna);
    }
}
