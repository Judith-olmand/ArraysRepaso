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

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                matriz[i][j] = rand.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
            }
        }
        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }
}
