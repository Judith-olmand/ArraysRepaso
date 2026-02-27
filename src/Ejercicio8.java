import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double notas;
        int tamanio;
        double suma = 0;
        double media;
        double minima = 10;
        double maxima = 0;
        int aprobados = 0;
        double porcentaje;

        System.out.println("Introduce el tamaño del array");
        tamanio = leer.nextInt();
        double[] notasArray = new double[tamanio];

        for(int i = 0; i < tamanio; i++){
            System.out.println("Escribe una nota");
            notas = leer.nextDouble();
            notasArray[i] = notas;
            suma += notas;
        }
        media = suma / tamanio;
        System.out.println("La media es: " + media);

        for (int i = 0; i < tamanio; i++) {
            if (notasArray[i] > maxima) {
                maxima = notasArray[i];
            }
            if (notasArray[i] < minima) {
                minima = notasArray[i];
            }
            if(notasArray[i] >= 5){
                aprobados++;
            }
        }
        porcentaje = Math.round((double) (aprobados * 100) /tamanio);

        System.out.println("La nota maxima es: " + maxima);
        System.out.println("La nota minima es: " + minima);
        System.out.println("el porcentaje de alumnos aprobados es de " + porcentaje);
    }
}
