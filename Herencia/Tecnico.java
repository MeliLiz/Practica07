/**
 * Clase Tecnico
 * Clase para comprender Herencia
 * @author Melissa Fernandez
 * @see Operador
 */
public class Tecnico extends Operador{
     /**
      * Constructor sin parametros
      * Asigna el nombre del técnico por default
      */
    public Tecnico(){
        super();
    }
    /**
     * Constructor que recibe el nombre del técnico y lo asigna
     * @param nombre El nombre del técnico
     */
    public Tecnico(String nombre){
        super(nombre);
    }
    /**
     * Método toString
     * Regresa la representación del técnico en cadena de caracteres
     * @return String
     */
    @Override
    public String toString(){
        return "Técnico: " + getNombre();
    }
    /**
     * Método trabaja
     * Hace que el técnico diga que está trabajando
     * @return String
     */
    public String trabaja(){
        return "Estoy trabajando";
    }
}