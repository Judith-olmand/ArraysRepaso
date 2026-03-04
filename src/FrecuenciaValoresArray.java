/**
 * Crea un programa java que trabaje con un array de 10 posiciones
 * en el que cada elemento será un número entero comprendido entre
 * 0 y 9 (ambos incluidos).
 * Crea un array de frecuencias donde cada posición i indica
 * cuántas veces aparece el número i en el array original
 */

import java.util.Random;
import java.util.Scanner;

public class FrecuenciaValoresArray {
    public static  void main(String args[]) {
        final int DIMENSION = 15;
        Random aleatorio = new Random();
        int contador = 0;
        int[] primerArray = new int[DIMENSION];
        int [] frecuencias = new int[DIMENSION];

        System.out.println("Array");
        for (int i = 0; i < primerArray.length; i++) {
            primerArray[i] = aleatorio.nextInt(10);
            System.out.print(primerArray[i] + " ");
        }

        for (int i = 0; i < primerArray.length; i++) {
            for (int j = 0; j < frecuencias.length; j++) {
                if (primerArray[j] == i){
                    contador++;
                }
            }
            frecuencias[i] = contador;
            contador = 0;
        }

        int max = 0;

        System.out.println();
        System.out.println("Frecuencias");
        for (int i = 0; i < frecuencias.length; i++) {
            System.out.print(frecuencias[i] + " ");
            if (frecuencias[i] > max){
                max = frecuencias[i];
            }
        }

        System.out.println();
        for (int j = 0; j < frecuencias.length; j++) {
            if (frecuencias[j] == max){
                System.out.println("El número " + j + " es el que más veces aparece");
            }
        }
    }
}
