
package usuarios;

import java.util.ArrayList;
import libros.LibroB;
import libros.Periodico;
import libros.Revista;

/**
 *
 * @author Oscar
 */
public class Profesor implements Usuario {
    
    private String nombre;
    private String id;
    private ArrayList <LibroB> librosPrestados;
    private ArrayList <Periodico> periodicosPrestados;
    private ArrayList <Revista> revistasPrestadas;
    private int prestamosActuales = 0;
    private final int MAXPRESTAMOS = 5;
    
    public Profesor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    public Profesor(){
        
    }
    
    @Override
    public String getName() {
        return nombre;
        
    }

    @Override
    public void setName(String nombre) {
        this.nombre= nombre;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void setID(String id) {
        this.id=id;
    }

    @Override
    public int limitePrestamos() {
        return this.MAXPRESTAMOS;
    }


    @Override
    public boolean puedePedirPrestamo() {
       return prestamosActuales < limitePrestamos(); 
    }
    
    @Override
    public void prestamoLibro(LibroB libro){
        this.librosPrestados.add(libro);
        this.prestamosActuales++;
    }

    @Override
    public void prestamoRevista(Revista revista){
        this.revistasPrestadas.add(revista);
        this.prestamosActuales++;
    }

    @Override
    public void prestamoPeriodico(Periodico periodico){
        this.periodicosPrestados.add(periodico);
        this.prestamosActuales++;
    }

    @Override
    public void devolverPrestamo(){
        if (prestamosActuales > 0) {
        prestamosActuales--;
        System.out.println(nombre + " devolvió un material. Total: " + prestamosActuales);
        //poner el material en el array de materiales
        } 
        else {
        System.out.println(nombre + " no tiene préstamos para devolver.");
        }
    }




    @Override
    public String tipoUser() {
        return "Profesor";
    }

    @Override
    public void consultarMaterial() {
        System.out.println("mostrando material");
        //mostrar array de todos los materiales
    }
    
}
