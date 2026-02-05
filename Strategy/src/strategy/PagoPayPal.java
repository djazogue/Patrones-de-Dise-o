
package strategy;

/**
 *
 * @author labesp
 */
public class PagoPayPal implements MetodoPago{
    @Override
    public void pagar(double monto) {
        System.out.printf("Pago con PayPal: $%.2f\n",monto);
    }
    
}
