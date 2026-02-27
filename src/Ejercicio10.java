import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] arrayRepetido = new int[10];
        int[] arraySinRepe = new int[10];
        int numero;
        int contador = 0;
        boolean existe;

        System.out.println("Escribe 10 números para llenar el array");
        for (int i = 0; i < arrayRepetido.length; i++) {
            numero = leer.nextInt();
            arrayRepetido[i] = numero;
        }

        System.out.println("Muestro el array con repetidos:");
        for (int i = 0; i < arrayRepetido.length; i++) {
            System.out.print(arrayRepetido[i] + " ");
        }

        for (int i = 0; i < arraySinRepe.length; i++) {
            existe = false;
            for (int j = 0; j < arraySinRepe.length; j++) {
                if (arrayRepetido[i] == arraySinRepe[j]) {
                    existe = true;
                }
            }
            if (existe == false) {
                arraySinRepe[contador] = arrayRepetido[i];
                contador++;
            }
        }

        System.out.println();
        System.out.println("Muestro el array completo sin repetidos:");
        for (int i = 0; i < arraySinRepe.length; i++) {
            System.out.print(arraySinRepe[i] + " ");
        }

        System.out.println();
        System.out.println("Muestro el array sin valores 0:");
        for (int i = 0; i < contador; i++) {
            System.out.print(arraySinRepe[i] + " ");
        }
    }
}
