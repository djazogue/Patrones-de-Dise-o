/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author Lenovot490
 */
public class PagosFactory {
    

    public static double totalPago = 0;

    public static void acumular(double monto) {
        totalPago += monto;
    }

    public static void mostrar() {
        System.out.println("Total de pagos: $" + totalPago);
    }

    public static Pagos realizarPago(int n) {
        switch (n) {
            case 1: return new PagoEfectivo();
            case 2: return new PagoTransferencia();
            case 3: return new PagoTarjeta();
            case 4: return new PagoDeuna();
            default:
                System.out.println("Pago no realizado");
                return null;
        }
    }
}
