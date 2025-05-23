
package usuarios;

/**
 *
 * @author Oscar
 */
public class Profesor implements Usuario {
    
    private String nombre;
    private String id;
    private int prestamosActuales = 0;
    
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
        return 5;
    }


    @Override
    public boolean puedePedirPrestamo() {
       return prestamosActuales < limitePrestamos(); 
    }

    @Override
    public void pedirPrestamo() {
         if (puedePedirPrestamo()) {
            prestamosActuales++;
            System.out.println(nombre + " pidió un préstamo. Total: " + prestamosActuales);
        } else {
            System.out.println(nombre + " alcanzó el límite de préstamos.");
        }
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
