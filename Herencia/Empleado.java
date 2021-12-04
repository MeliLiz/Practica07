/**
 * Clase Empleado
 * Clase para utilizar Herencia
 * @author Melissa Fernandez
 */
public class Empleado{
    
    protected String nombre; //Nombre del empleado

    /**
     * Constructor sin parametros
     * Asigna el nombre del empleado por defecto
     */
    public Empleado(){
        nombre = "Kim Jin";
    }
    /**
     * Constructor que recibe el nombre del empleado y lo asigna
     * @param nombre El nombre del empleado
     */
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    /**
     * Método getNombre
     * Nos permite conocer el nombre del empleado
     * @return String El nombre del empleado
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Método setNombre
     * Nos permite asignar un nombre al empleado
     * @param nombre El nombre del empleado
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Método toString
     * Representa al empleado en cadena de caracteres
     * @return String
     */
    @Override
    public String toString(){
        return "Empleado: " + nombre;
    }
    /**
     * Método equals
     * Nos permite saber si dos empleados tienen el mismo nombre
     * @param empleado El empleado a comparar
     * @return boolean true si tienen el mismo nombre y false en otro caso
     */
    @Override
    public boolean equals(Object empleado){
        Empleado emp = (Empleado) empleado;
        return this.nombre.equals(emp.nombre);
    }
}