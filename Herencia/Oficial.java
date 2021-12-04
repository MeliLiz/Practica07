/**
 * Clase Oficial
 * Clase para comprender herencia
 * @author Melissa Fernandez
 * @see Operador
 */
public class Oficial extends Operador{
    /**
     * Constructor sin parametros
     * Asigna el nombre del oficial por default
     */
    public Oficial(){
        super();
    }
    /**
     * Constructor que recibe el nombre del oficial y lo asigna
     * @param nombre El nombre del oficial
     */
    public Oficial(String nombre){
        super(nombre);
    }
    /**
     * Método toString
     * Representa al oficial el cadena de caracteres
     * @return String
     */
    @Override
    public String toString(){
        return "Oficial: " + getNombre();
    }
    /**
     * Método trabaja
     * Hace que el oficial diga que está trabajando
     * @return String
     */
    public String trabaja(){
        return "Estoy trabajando";
    }
}