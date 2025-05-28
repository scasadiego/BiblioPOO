
package usuarios;

import java.util.ArrayList;
import libros.Libro;
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

    
    private final int MAXPRESTAMOS = 5;
    private ArrayList<Libro> materialesPrestados = new ArrayList<>();
    private ArrayList<LibroB> librosPrestados = new ArrayList<>();
    private ArrayList<Revista> revistasPrestadas = new ArrayList<>();
    private ArrayList<Periodico> periodicosPrestados = new ArrayList<>();
    
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
       return materialesPrestados.size() < 5; 
    }

    @Override
    public void agregarMaterialPrestado(Libro material) {
        materialesPrestados.add(material);
    }    
    

    @Override    
    public void devolverPrestamo(Libro material) {
        materialesPrestados.remove(material);
    }






    @Override
    public String tipoUser() {
        return "Profesor";
    }
    @Override
    public ArrayList<Libro> getMaterialesPrestados() {
        return materialesPrestados;

    }


    public ArrayList<LibroB> getLibrosPrestados() {
        return librosPrestados;
    }

    public ArrayList<Revista> getRevistasPrestadas() {
        return revistasPrestadas;
    }

    public ArrayList<Periodico> getPeriodicosPrestados() {
        return periodicosPrestados;
    }

    
    
}
