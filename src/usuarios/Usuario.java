/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package usuarios;
import libros.LibroB;
import libros.Periodico;
import libros.Revista;

/**
 *
 * @author Oscar
 */
public interface Usuario {
    String getName();
    void setName(String nombre);
    String getID();
    void setID(String id);
    void prestamoLibro(LibroB libro);
    void prestamoRevista(Revista revista);
    void prestamoPeriodico(Periodico periodico);
    void devolverPrestamo();
    int limitePrestamos();
    boolean puedePedirPrestamo();
    String tipoUser();
    void consultarMaterial(/*Material material*/);
    
    
}
