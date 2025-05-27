/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;





public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UI userInterface = new UI();
       
       
       int option = 1;
       while(option != 0){
            option = userInterface.menu();
           switch(option){
               case 1:
                   userInterface.registrarUsuarios();
                   
                   break;
                case 2:
                    userInterface.mostrarUsuarios();

                    break;
                case 3:
                    userInterface.registrarLibros();
                    break;
                case 4:
                    userInterface.mostrarDisponibles();
                    break;
                case 5:
                    userInterface.menuPrestamo();
                    break;
                case 6:
                    userInterface.menuDevolverMaterial();
                    break;
                case 7:
                    userInterface.mostrarPrestamosActuales();
           }
                 
       }
        
    }
    
}


