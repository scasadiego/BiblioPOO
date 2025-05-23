/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package usuarios;

/**
 *
 * @author Oscar
 */
public interface Usuario {
    String getName();
    void setName(String nombre);
    String getID();
    void setID(String id);
    void pedirPrestamo();
    void devolverPrestamo();
    int limitePrestamos();
    boolean puedePedirPrestamo();
    String tipoUser();
    void consultarMaterial(/*Material material*/);
    
    
}
