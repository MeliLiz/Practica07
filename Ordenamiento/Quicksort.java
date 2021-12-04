import java.util.Random;
import java.util.Scanner;
/**
 * Clase Quicksort
 * Clase que implementa el algoritmo quicksort para ordenar los elementos de un arreglo
 * @author Melissa Fernández
 */
public class Quicksort{
    /**
     * Método principal para ordenar un arreglo
     * @param args los argumentos
     */
    public static void main(String[] args){
        Random random = new Random(); //Hacemos random
        Scanner scan = new Scanner(System.in);//hacemos scanner
        System.out.println("¿Cuántos números quieres ordenar?");
        int respuesta = scan.nextInt();
        int[] numeros = new int[respuesta]; //Hacemos arreglo
        for (int i=0;i<numeros.length;i++){ //Llenamos arreglo
            numeros[i]=random.nextInt(1000);
        }
        //Imprimir arreglo original
        System.out.println("\n**Arreglo original**\n\n");
        for (int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i]+ " ");
        }
        System.out.println("\n");

        quicksort(numeros, 0, numeros.length-1); //ordenar arreglo

        //Imprimir arreglo ordenado
        System.out.println("\n**Arreglo ordenado**\n\n");
        for (int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i]+ " ");
        }
        System.out.println("\n");
    }

    /**
     * Método particion toma el último elemento como pivote
     * Pone a todos los elementos más pequeños a su izquierda y los mayores a la derecha
     * @param arreglo El arreglo
     * @param izquierda Primer elemento
     * @param derecha Ultimo elemento
     * @return int
     */
    public static int particion(int[] arreglo, int izquierda, int derecha){
       int i = izquierda-1; //índice i
       int pivote = arreglo[derecha]; //pivote es el elemento de la derecha del arreglo

       for (int j =izquierda; j<derecha; j++){
           //Si el valor del arreglo en j es menor o igual que el pivote
           if (arreglo[j]<=pivote){
               i++;
                //Intercambiar el valor de j con el de i y viceversa
               int temporal = arreglo[i];
               arreglo[i] = arreglo[j];
               arreglo[j] = temporal;
           }
       }
       //Intercambiar el valor del arreglo en i+1 por el que está hasta la derecha del arreglo.
       int temporal = arreglo[i+1];
       arreglo[i+1]= arreglo[derecha];
       arreglo[derecha] = temporal;

       return i+1;
    }

/**
 * Método quicksort que implementa el algoritmo quicksort
 * @param arreglo El arreglo por ordenar
 * @param izquierda ïndice inicial
 * @param derecha índice final
 */
    public static void quicksort(int[] arreglo, int izquierda, int derecha){
        if(izquierda < derecha){
            int pi = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, pi-1);
            quicksort(arreglo, pi+1, derecha);
        }
    }
}