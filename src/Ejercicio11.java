import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio;

        System.out.println("Ingrese el tamaño del array: ");
        tamanio = sc.nextInt();
        int[] arrayA = new int[tamanio];
        int[] arrayB = new int[tamanio];
        int[] arrayC = new int[tamanio];

        System.out.println("Escribe" + tamanio + "numeros para el array A");
        for (int i = 0; i < tamanio; i++) {
            int numero = sc.nextInt();
            arrayA[i] = numero;
        }
        System.out.println();
        System.out.println("Escribe" + tamanio + "numeros para el array B");
        for (int i = 0; i < tamanio; i++) {
            int numero = sc.nextInt();
            arrayB[i] = numero;
        }

        System.out.println();
        System.out.println("Array A");
        Ejercicio11.mostrarArray(arrayA);
        System.out.println("Array B");
        Ejercicio11.mostrarArray(arrayB);

        /* CAMBIO POR METODO
        for (int i = 0; i < tamanio; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();
        System.out.println("Array B");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(arrayB[i] + " ");
        }
        */

        for (int i = 0; i < tamanio; i++) {
            if(arrayA[i] + arrayB[i] < 0) {
                arrayC[i] = 0;
            } else {
                arrayC[i] = arrayA[i] + arrayB[i];
            }
        }
        //System.out.println();
        System.out.println("Array C");
        Ejercicio11.mostrarArray(arrayC);
        /* CAMBIO POR METODO
        for (int i = 0; i < tamanio; i++) {
            System.out.print(arrayC[i] + " ");
        }
        */
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
