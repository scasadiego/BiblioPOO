/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import usuarios.Estudiante;
import usuarios.Profesor;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UI userInterface = new UI();
       ArrayList<Estudiante> estudiantes = new ArrayList<>();
       ArrayList<Profesor> profesores = new ArrayList<>();
       
       
       int option = 1;
       while(option != 0){
            option = userInterface.menu();
           switch(option){
               case 1:
                   userInterface.registrarUsuarios();
                   break;
                case 2:
                    userInterface.registrarLibros();
                    break;
                case 3:
                    userInterface.mostrarDisponibles();
                    break;
           }
                 
       }
        
    }
    
}
