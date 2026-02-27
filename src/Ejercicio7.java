import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tamanio;
        int media;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce el tamaño del array");
        tamanio = sc.nextInt();

        int[] miarray = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            miarray[i] = rand.nextInt(100+1);
        }

        for (int i = 0; i < tamanio; i++) {
            System.out.print(miarray[i] + " ");
            suma += miarray[i];
        }
        media = suma / tamanio;

        System.out.println();
        System.out.println("La media es de: " + media);

        for (int i = 0; i < tamanio; i++) {
            if(miarray[i] > media){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " número mayores que la media");
    }
}
