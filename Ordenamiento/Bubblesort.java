import java.util.Random;
import java.util.Scanner;
/**
 * Clase Bubblesort
 * Clase que implementa el argoritmo bubblesort para ordenar un arreglo
 * @author Melissa Fernandez
 */
public class Bubblesort{
    /**
     * Método que implementa Bubblesort
     * @param arreglo El arreglo a ordenar
     */
    public static void bubblesort(int[] arreglo){
        for(int i = 1; i<arreglo.length; i++){
            for (int j=0; j<arreglo.length-i; j++){
                if(arreglo[j] > arreglo[j+1]){
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1]= temporal;
                }
            }
        }
    }

    /**
     * Método principal para ordenar un arreglo
     * @param args Los argumentos
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //Hacer Scanner
        Random random = new Random(); //Hacer random
        System.out.println("¿Cuántos elementos quieres ordenar?");
        int respuesta = scan.nextInt();
        int[] numeros = new int[respuesta]; //Hacer arreglo
        for (int i=0; i<numeros.length; i++){ //Llenar arreglo
            numeros[i]=random.nextInt(1000);
        }
        //Imprimimos arreglo original
        System.out.println("\n***Arreglo original***\n\n");
        for (int i=0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n");

        bubblesort(numeros); //Ordenamos arreglo

        //Imprimimos el arreglo ordenado
        System.out.println("\n***Arreglo ordenado***\n\n");
        for (int i=0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n");
    }
}