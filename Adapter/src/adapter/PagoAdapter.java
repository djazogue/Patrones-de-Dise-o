/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Lenovot490
 */
public class PagoAdapter implements Pago{

    private PagoEuros pagoEuros;
    private PagoPesosCol pagoPesosCol;
    private PagoLibras pagoLibras;
    private PagoPesosMex pagoPesosMex;
    private int tipoMoneda;

    public PagoAdapter(int tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
        this.pagoEuros = new PagoEuros();
        this.pagoPesosCol = new PagoPesosCol();
        this.pagoLibras = new PagoLibras();
        this.pagoPesosMex = new PagoPesosMex();
    }

    @Override
    public void pagar(double monto) {

        switch (tipoMoneda) {
            case 1: 
                pagoEuros.PagarenEuros(monto * 0.84);
                break;

            case 2: 
                pagoPesosCol.pagarPesosC(monto * 3648.04);
                break;

            case 3: 
                pagoLibras.pagarLibras(monto * 0.79);
                break;

            case 4:
                pagoPesosMex.pagarPesosM(monto * 17.10);
                break;
        }
    }
    
 
}
