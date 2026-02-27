import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de datos de la matriz");
        int tamanio = leer.nextInt();

        int[][] matriz = new int[tamanio][tamanio];
        int[] sumasFilas = new int[tamanio];
        int[] sumasColumnas = new int[tamanio];
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal = 0;

        System.out.println("Introduce los " + (tamanio*tamanio) + " valores de la matriz");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            sumasFilas[i] = sumaFila;
            sumaFila = 0;
            sumasColumnas[i] = sumaColumna;
            sumaColumna = 0;
        }

        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("Suma diagonal " + sumaDiagonal);

        System.out.println("Suma filas");
        Ejercicio12.mostrarArray(sumasFilas);
        System.out.println("Suma columnas");
        Ejercicio12.mostrarArray(sumasColumnas);

    }

    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
