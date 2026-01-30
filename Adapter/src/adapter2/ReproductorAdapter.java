/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter2;

/**
 *
 * @author Lenovot490
 */
public class ReproductorAdapter implements Reproductor {
    private Reproductormp4 mp4;

    public ReproductorAdapter(Reproductormp4 mp4) {
        this.mp4 = mp4;
    }
    

    @Override
    public void reproducir(String archivo) {
        mp4.playMP4(archivo);
    }
    
}
