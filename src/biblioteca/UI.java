
package biblioteca;
import java.lang.reflect.Array;
import java.util.Scanner;
import javax.naming.LinkRef;
import usuarios.Estudiante;
import usuarios.Profesor;
import libros.Revista;
import libros.Libro;
import libros.Periodico;
import libros.LibroB;
/**
 *
 * @author Oscar
 */
public class UI {
    
    Scanner scanner= new Scanner (System.in);
    public int menu(){
        System.out.println("Bienvenido a la biblioteca");
        System.out.println("1.Registrar Usuarios");
        System.out.println("2. Registrar libros");
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

    public void registrarLibros(){
        String nombre,autor;
        int ID;
        System.out.println("Elija un tipo de libro: ");
        System.out.println("1. Revista");
        System.out.println("2. Libro");
        System.out.println("3. Periodico");
        int option= this.scanner.nextInt();

        switch(option){
            case 1: 
                Revista revista= new Revista();
                System.out.println("Ingrese el nombre de la revista: ");
                nombre=this.scanner.nextLine();
                revista.setName(nombre);
                System.out.println("Ingrese el autor de la revista: ");
                autor=this.scanner.nextLine();
                revista.setAuthor(autor);
                System.out.println("Ingrese el ID de la revista");
                ID=this.scanner.nextInt();
                revista.setID(ID);
                break;
            case 2:
                LibroB libro= new LibroB();
                System.out.println("Ingrese el nombre del libro: ");
                nombre=this.scanner.nextLine();
                libro.setName(nombre);
                System.out.println("Ingrese el autor del libro: ");
                autor=this.scanner.nextLine();
                libro.setAuthor(autor);
                System.out.println("Ingrese el ID del libro: ");
                ID=this.scanner.nextInt();
                libro.setID(ID);
                break;
            case 3: 
                Periodico periodico= new Periodico();
                System.out.println("Ingrese el nombre del periodico: ");
                nombre=this.scanner.nextLine();
                periodico.setName(nombre);
                System.out.println("Ingrese el autor del periodico: ");
                autor=this.scanner.nextLine();
                periodico.setAuthor(autor);
                System.out.println("Ingrese el ID del periodico");
                ID=this.scanner.nextInt();
                periodico.setID(ID);

        }
    }
    
     
    
}
