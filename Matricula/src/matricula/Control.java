/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula;

/**
 *
 * @author Lenovot490
 */
public class Control {
    private Pago pago;

    public Control(Pago pago) {
        this.pago = pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    public void realizarPago(double monto){
      pago.pago(monto);
    }

    public Control() {
    }
    

}
