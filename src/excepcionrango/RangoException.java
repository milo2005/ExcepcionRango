/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionrango;

/**
 *
 * @author Dario
 */
//Creamos la Clase de la Excepcion heredando de Exception
public class RangoException extends Exception{

    //Constructor de la clase, como argumento de entrada tiene el mensaje
    public RangoException(String mensaje) {
        //Invocamos el constructor del padre (Clase Exception)
        super(mensaje);
    }
    
     
}
