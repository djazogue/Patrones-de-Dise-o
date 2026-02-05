
package strategy;

/**
 *
 * @author labesp
 */
public class PagoTarjeta implements MetodoPago{

    @Override
    public void pagar(double monto) {
        System.out.printf("Pago con Tarjeta: $%.2f\n",monto);
    }
    
}
