
package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import libros.LibroB;
import libros.Periodico;
import libros.Revista;
import usuarios.Estudiante;
import usuarios.Profesor;
import usuarios.Usuario;




/**
 *
 * @author Oscar
 */
public class UI {
    private ArrayList<Revista> revistasDisponibles= new ArrayList<>();
    private ArrayList<LibroB> librosDisponibles= new ArrayList<>();
    private ArrayList<Periodico> periodicosDisponibles= new ArrayList<>();
    private ArrayList<Estudiante> estudiantesRegistrados= new ArrayList<>();
    private ArrayList<Profesor> profesoresRegistrados= new ArrayList<>();

    Scanner scanner= new Scanner (System.in);
    public int menu(){
        System.out.println("\nBienvenido a la biblioteca");
        System.out.println("1. Registrar Usuarios");
        System.out.println("2. Mostrar usuarios");
        System.out.println("3. Registrar libros");
        System.out.println("4. Mostrar libros disponibles");
        System.out.println("5. Pedir Prestamo");
        int option = this.scanner.nextInt();
        
        return option;  
    }


    //ingresar nuevos estudiantes a la biblioteca
    public void registrarUsuarios(){
        System.out.println("Elija un item: ");
        System.out.println("1.Estudiante");
        System.out.println("2.Profesor");
        
        int option= this.scanner.nextInt();
        System.out.println("Ingrese nombre del usuario: ");
        scanner.nextLine();
        String name= this.scanner.nextLine();
        System.out.println("Ingrese id del usuario: ");
        
        String id= this.scanner.nextLine();
        

        switch(option){
            case 1:
                Estudiante estudiante= new Estudiante(name, id);
                estudiantesRegistrados.add(estudiante);
                System.out.println("Estudiante registrado");
                break;
            case 2:
                Profesor profesor= new Profesor(name, id);
                profesoresRegistrados.add(profesor);
                System.out.println("Profesor registrado");
                break;
        }
    }
    
    //mostrar estudiantes
    public void mostrarEstudiantes(){
        for (int i=0;i<estudiantesRegistrados.size();i++) {
            if(estudiantesRegistrados.get(i).puedePedirPrestamo()){
                System.out.println(estudiantesRegistrados.get(i).getID()  +". "+estudiantesRegistrados.get(i).getName());
            }        
        }
    }

    //mostrar profesores
    public void mostrarProfesores(){
        for (int i=0;i<profesoresRegistrados.size();i++) {
            if(profesoresRegistrados.get(i).puedePedirPrestamo()){
                System.out.println(profesoresRegistrados.get(i).getID() +". "+profesoresRegistrados.get(i).getName());
            }        
        }
    } 


    //interfaz para mostrar los usuarios
    public void mostrarUsuarios(){
        System.out.println("1. Mostrar Estudiantes ");
        System.out.println("2. Mostrar Profesores");
        int dispOption= this.scanner.nextInt();
        switch(dispOption){
            case 1:
                mostrarEstudiantes();
                break;
            case 2:
                mostrarProfesores();
                break;
        }
    }
    //ingresar nuevos materiales
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

    //Mostrar libros
    public void mostrarLibrosDisponibles(){
        for (int i=0;i<librosDisponibles.size();i++) {
            if(librosDisponibles.get(i).getState()){
                System.out.println(i+1 +". "+librosDisponibles.get(i).getName());
            }        
        }
    }

    //mostrar revistas
    public void mostrarRevistasDisponibles(){
        for (int i=0;i<revistasDisponibles.size();i++) {
            if(librosDisponibles.get(i).getState()){
                System.out.println(i+1 +". "+revistasDisponibles.get(i).getName());
            }
        }
    }

    //mostrar periodicos
    public void mostrarPeriodicosDisponibles(){
        for (int i=0;i<periodicosDisponibles.size();i++) {
            if(periodicosDisponibles.get(i).getState()){
                System.out.println(i+1 +". "+periodicosDisponibles.get(i).getName());
            }
        }
    }

    //interfaz para mostrar los materiales
    public void mostrarDisponibles(){
        System.out.println("1. Mostrar libros");
        System.out.println("2. Mostrar revistas");
        System.out.println("3. Mostrar periodicos");
        int dispOption= this.scanner.nextInt();
        switch(dispOption){
            case 1:
                mostrarLibrosDisponibles();
                break;
            case 2:
                mostrarRevistasDisponibles();
                break;
            case 3:
                mostrarPeriodicosDisponibles();
                break;
        }
    }
     
    //Menu pedir prestamos

    public int menuTipoPrestamo(){
        System.out.println("Ingrese el tipo de libro que quiere pedir prestado");
        System.out.println("1.Libro");
        System.out.println("2. Revista");
        System.out.println("3. Periodico");
        int option=this.scanner.nextInt();
        switch(option){
            case 1:
                mostrarLibrosDisponibles();
            case 2:
                mostrarRevistasDisponibles();
            case 3:
                mostrarPeriodicosDisponibles();
        }
        return option;
    }

    public void menuPrestamo(){
        System.out.println("Bienvenido al menu de prestamos ");
        System.out.println("Elige el indicador del tipo de usuario: ");
        System.out.println("1. Estudiante:");
        System.out.println("2. Profesor:");
        int option= this.scanner.nextInt();
        System.out.println("Escribe tu ID mostrado en la lista: ");
        switch(option){
            case 1:
                mostrarEstudiantes();
                break;
            case 2:
                mostrarProfesores();
                break;
        }

        scanner.nextLine();
        String idEscogido = this.scanner.nextLine();

        Usuario usuarioEncontrado = null;

        switch(option) {
            case 1:
                for (Estudiante est : estudiantesRegistrados) {
                    if (est.getID().equals(idEscogido)) {
                        usuarioEncontrado = est;
                        break;
                    }
                }
                break;
            case 2:
                for (Profesor prof : profesoresRegistrados) {
                    if (prof.getID().equals(idEscogido)) {
                        usuarioEncontrado = prof;
                        break;
                    }
                }
                break;
        }

        if (usuarioEncontrado != null) {
            System.out.println("Usuario encontrado: " + usuarioEncontrado.getName());
            if (usuarioEncontrado.puedePedirPrestamo()) {
                System.out.println("El usuario puede realizar un préstamo.");
                int opcion=menuTipoPrestamo();
                System.out.println("Ingrese la ID del material que desea pedir prestado: ");
                int IDRegistrada=this.scanner.nextInt();
                switch(opcion){
                    case 1:
                        for(int i=0;i<librosDisponibles.size();i++){
                            if(IDRegistrada==librosDisponibles.get(i).getID()){
                                LibroB libro=librosDisponibles.get(i);
                                usuarioEncontrado.prestamoLibro(libro);
                            }
                        }
                        break;
                    case 2:
                        for(int i=0;i<revistasDisponibles.size();i++){
                            if(IDRegistrada==revistasDisponibles.get(i).getID()){
                                Revista revista=revistasDisponibles.get(i);
                                usuarioEncontrado.prestamoRevista(revista);
                            }
                        }
                        break;
                    case 3:
                        for(int i=0;i<periodicosDisponibles.size();i++){
                            if(IDRegistrada==periodicosDisponibles.get(i).getID()){
                                Periodico periodico=periodicosDisponibles.get(i);
                                usuarioEncontrado.prestamoPeriodico(periodico);
                            }
                        }
                        break;
                }
            }
            else{
            System.out.println("Este usuario ya alcanzó el límite de préstamos.");
            }
        }
        else{
            System.out.println("El ID ingresado no corresponde a ningún usuario registrado.");
        }


        }
}
