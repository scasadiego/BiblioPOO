
package biblioteca;

import java.util.Scanner;
import usuarios.Estudiante;
import usuarios.Profesor;

/**
 *
 * @author Oscar
 */
public class UI {
    
    Scanner scanner= new Scanner (System.in);
    public int menu(){
        System.out.println("Bienvenido a la biblioteca");
        System.out.println("1.Registrar Usuarios");
        int option = this.scanner.nextInt();
        
        return option;  
    }


    
    public void registrarUsuarios(){
        System.out.println("Eliga un item: ");
        System.out.println("1.Estudiante");
        System.out.println("2.Profesor");
        
        int option= this.scanner.nextInt();
        System.out.println("Ingrese nombre del usuario: ");
        scanner.nextLine();
        String name= this.scanner.nextLine();
        System.out.println("Ingrese id del usuario: ");
        scanner.nextLine();
        String id= this.scanner.nextLine();
        
        switch(option){
            case 1:
                Estudiante estudiante= new Estudiante(name, id);
                System.out.println("Estudiane registrado");
                break;
            case 2:
                Profesor profesor= new Profesor(name, id);
                System.out.println("Profesor registrado");
                break;
        }
    }
    
     
    
}
