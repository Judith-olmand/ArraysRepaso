import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean simetrica = true;

        System.out.println("Introduce un número: ");
        int n1 = sc.nextInt();
        int[][] matriz = new int[n1][n1];
        //int[][] matriz = {{1,2},{2,0}};
/*
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                matriz[i][j] = rand.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
*/
        int contador = 0;
        int contador2 = 0;
        while (contador < n1) {
            while (contador2 < n1) {
                matriz[contador][contador2] = rand.nextInt(10);
                System.out.print(matriz[contador][contador2] + " ");
                contador2 ++;
            }
            System.out.println();
            contador++;
            contador2 = 0;
        }

        /**
         * los bucles continuan mientras i sea menor que la longitud
         * de la matriz y miesntras simetrica siga siendo true
         */
        for (int i = 0; i < matriz.length && simetrica; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) { // solo mitad superior
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }


        if (simetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz NO es simétrica.");
        }
    }
}
