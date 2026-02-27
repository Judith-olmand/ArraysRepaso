import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamanio;
        //int valores;
        //int indice = 0;

        System.out.println("Introduce el tamaño del array");
        tamanio = leer.nextInt();
        int[] miarray = new int[tamanio];

        Ejercicio9.cargarValores(miarray, leer);

        //CAMBIO POR MÉTODOS
        /*

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Introduce el valores para el array ");
            valores = leer.nextInt();
            miarray[i] = valores;
        }
        */

        /*
        int[] arrayInvertido = new int[tamanio];
        for (int i = miarray.length-1; i >= 0; i--) {
            arrayInvertido[indice] =  miarray[i];
            indice++;
        }

        System.out.println("Array Invertido");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(arrayInvertido[i] + " ");
        }
         */
        System.out.println();
        System.out.println("Array normal");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(miarray[i] + " ");
        }
        System.out.println();

        System.out.println("Array Invertido");
        int[] nuevoArray = Ejercicio9.cargaInvertido(miarray);
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i] + " ");
        }
    }
    public static int[] cargaInvertido (int[] array) {
        int indice = 0;
        int[] arrayInvertido = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            arrayInvertido[indice] =  array[i];
            indice++;
        }
        return arrayInvertido;
    }

    public static int[] cargarValores (int[] array, Scanner leer) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valores para el array ");
            int valores = leer.nextInt();
            array[i] = valores;
        }
        return array;
    }
}
