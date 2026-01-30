/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton2;
import java.util.ArrayList;
/**
 *
 * @author Lenovot490
 */
public class RegistrarEstudiante {
   private int totalEstudianteE;
   private int totalEstudianteS;
   private ArrayList<Estudiante> estudiantes;
   //Crear la variable 
   private static RegistrarEstudiante instancia;
   //Crear constructor privado
   private RegistrarEstudiante(){
   estudiantes=new ArrayList();
   totalEstudianteE=0;
   totalEstudianteS=0;
       System.out.println("Estudiante registrado");
   
      }
   //Meodos estaticos
       public static RegistrarEstudiante getInstancia(){
        if (instancia==null) {
            instancia= new RegistrarEstudiante();
            
        }
        return instancia;
    }
   // Metodos
     public void estudianteEscolar(String nombre, int edad){
     Estudiante e = new Estudiante(nombre,edad);
     estudiantes.add(e);
     totalEstudianteE++;
     }  
     public void estudianteSecundaria(String nombre, int edad){
     Estudiante e = new Estudiante(nombre,edad);
     estudiantes.add(e);
     totalEstudianteS++;
     }  
     public int getTotalEscolar(){
     return totalEstudianteE;
     }
     
    public int getTotalSecundaria(){
     return totalEstudianteS;
     }
    public int getTotalEstudiantes() {
    return totalEstudianteE + totalEstudianteS;
}
    public void listarEstudiantes() {
    for (int i = 0; i < estudiantes.size(); i++) {
        Estudiante e = estudiantes.get(i);
        System.out.println("Nombre: " + e.getNombre());
        System.out.println(" Edad: " + e.getEdad());
    }
}


   
   
   
}
