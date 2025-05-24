
package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import libros.LibroB;
import libros.Periodico;
import libros.Revista;
import usuarios.Estudiante;
import usuarios.Profesor;
/**
 *
 * @author Oscar
 */
public class UI {
    private ArrayList<Revista> revistasDisponibles= new ArrayList<>();
    private ArrayList<LibroB> librosDisponibles= new ArrayList<>();
    private ArrayList<Periodico> periodicosDisponibles= new ArrayList<>();
    Scanner scanner= new Scanner (System.in);
    public int menu(){
        System.out.println("\nBienvenido a la biblioteca");
        System.out.println("1.Registrar Usuarios");
        System.out.println("2. Registrar libros");
        System.out.println("3. Mostrar libros disponibles");
        int option = this.scanner.nextInt();
        
        return option;  
    }


    
    public void registrarUsuarios(){
        System.out.println("Elija un item: ");
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
                System.out.println("Estudiante registrado");
                break;
            case 2:
                Profesor profesor= new Profesor(name, id);
                System.out.println("Profesor registrado");
                break;
        }
    }

    public void registrarLibros(){        
        System.out.println("Elija un tipo de libro: ");
        System.out.println("1. Revista");
        System.out.println("2. Libro");
        System.out.println("3. Periodico");
        int option= this.scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del material: ");
        String nombre=this.scanner.nextLine();
        System.out.println("Ingrese el autor del material: ");
        String autor=this.scanner.nextLine();
        System.out.println("Ingrese el ID del material: ");
        int ID=this.scanner.nextInt();
        //Sacar todo ese texto de los case, preguntarlo antes y inicializar los cosos igual que como se hace en registrarUsuarios
        switch(option){
            case 1: 
                Revista revista= new Revista(nombre,autor,ID);
                revistasDisponibles.add(revista);
                System.out.println("La revista "+revista.getName()+" con autor "+revista.getAuthor()+" con ID "+revista.getID()+" fue registrada");
                break;
            case 2:
                LibroB libro= new LibroB(nombre,autor,ID);
                librosDisponibles.add(libro);
                System.out.println("El libro "+libro.getName()+" con autor "+libro.getAuthor()+" con ID "+libro.getID()+" fue registrado");             
                break;
            case 3: 
                Periodico periodico= new Periodico(nombre,autor,ID);  
                periodicosDisponibles.add(periodico);           
                System.out.println("El periodico "+periodico.getName()+" con autor "+periodico.getAuthor()+" con ID "+periodico.getID()+" fue registrado");
                break;
        }
    }
    public void mostrarDisponibles(){
        for (int i=0;i<librosDisponibles.size();i++) {
            System.out.println(librosDisponibles.get(i).getName());
        }
    }
     
    
}
