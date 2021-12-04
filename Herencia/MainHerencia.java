/**
 * Clase MainHerencia
 * Clase Main para ejemplificar herencia
 * @author Melissa Fernandez
 * @see Empleado
 * @see Operador
 * @see Oficial
 * @see Tecnico
 * @see Directivo
 */
public class MainHerencia{
    /**
     * Método principal
     * @param args Los argumentos
     */
    public static void main(String[] args){

        //Creamos a los empleados
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Oscar Hernández");

        //Creamos a los operadores
        Operador operador1 = new Operador();
        Operador operador2 = new Operador("Kim Jin");

        //Creamos a los oficiales
        Oficial oficial1 = new Oficial();
        Oficial oficial2 = new Oficial("Marco Páez");

        //Creamos a los técnicos
        Tecnico tecnico1 = new Tecnico();
        Tecnico tecnico2 = new Tecnico("Edgar Díaz");

        //Creamos a los directivos
        Directivo directivo1 = new Directivo();
        Directivo directivo2 = new Directivo("Francisco Fernández");

        //Imprimimos a los empleados y los comparamos
        System.out.println("\n**Empleados**\n");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println("¿Iguales? "+ empleado1.equals(empleado2));

        //Imprimimos a los empleados y los comparamos
        System.out.println("\n**Operadores**\n");
        System.out.println(operador1);
        System.out.println(operador2);
        System.out.println("¿Iguales? "+ operador1.equals(operador2));

        //Imprimimos a los empleados y los comparamos
        System.out.println("\n**Directivos**\n");
        System.out.println(directivo1);
        System.out.println(directivo2);
        System.out.println("¿Iguales? "+ directivo1.equals(directivo2));

        //Imprimimos a los empleados, hacemos que trabajer y los comparamos
        System.out.println("\n**Oficiales**\n");
        System.out.println(oficial1 + "\n" + oficial1.trabaja());
        System.out.println(oficial2 + "\n" + oficial2.trabaja());
        System.out.println("¿Iguales? "+ oficial1.equals(oficial2));

        //Imprimimos a los empleados, hacemos que trabajer y los comparamos
        System.out.println("\n**Tecnicos**\n");
        System.out.println(tecnico1 + "\n" + tecnico1.trabaja());
        System.out.println(tecnico2 + "\n" + tecnico2.trabaja());
        System.out.println("¿Iguales? "+ tecnico1.equals(tecnico2));

        
    }
}