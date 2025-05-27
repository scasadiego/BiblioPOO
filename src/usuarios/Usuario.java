/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package usuarios;

import java.util.ArrayList;

import libros.Libro;

/**
 *
 * @author Oscar
 */
public interface Usuario {
    String getName();
    void setName(String nombre);
    String getID();
    void setID(String id);
    void devolverPrestamo(Libro material);
    int limitePrestamos();
    boolean puedePedirPrestamo();
    String tipoUser();
    ArrayList<Libro> getMaterialesPrestados();
    void agregarMaterialPrestado(Libro material);
    
    
}
