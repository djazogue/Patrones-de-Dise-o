/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter2;

/**
 *
 * @author Lenovot490
 */
public class Adapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reproductor reproduce= new ReproductorAdapter(new Reproductormp4());
        reproduce.reproducir("VideoMusical");
    }
    
}
