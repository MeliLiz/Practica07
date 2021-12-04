/**
 * Clase Directivo
 * Clase para comprender herencia
 * @author Melissa Fernandez
 * @see Empleado
 */
public class Directivo extends Empleado{
    /**
     * Constructor sin parametros
     * Asigna el nombre del directivo por default
     */
    public Directivo(){
        super();
    }
    /**
     * Constructor que recibe el nombre del directivo y lo asigna
     * @param nombre El nombre del directivo
     */
    public Directivo(String nombre){
        super(nombre);
    }
    /**
     * Método toString
     * Representa al directivo en cadena de caracteres
     * @return String
     */
    @Override
    public String toString(){
        return "Directivo: " + nombre;
    }
}