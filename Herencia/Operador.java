/**
 * Clase Operador
 * Clase para comprender Herencia
 * @Author Melissa Fernandez
 * @see Empleado
 */
public class Operador extends Empleado{
    /**
     * Constructor sin parametros
     * Asigna el nombre del operador por default
     */
    public Operador(){
        super();
    }
    /**
     * Constructor que recibe el nombre del operador y lo asigna
     * @param nombre El nombre del operador
     */
    public Operador(String nombre){
        super(nombre);
    }
    /**
     * Método toString
     * Representa al operador en cadena de caracteres
     * @return String 
     */
    @Override
    public String toString(){
        return "Operador: " + nombre;
    }
}