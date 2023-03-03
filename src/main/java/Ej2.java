
/*
Realizar un algoritmo que haga que el usuario introduzca tantas cifras comprendidas entre cero y nueve como desee. Una vez que el usuario ha terminado su serie introduciendo -1, el algoritmo muestra el número de veces que se ha escrito cada dígito.
 */
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int numero = 0;
        while (numero != -1) {
            System.out.println("Introduce un número entre 0 y 9 (-1 para terminar):");
            numero = sc.nextInt();
            if (numero >= 0 && numero <= 9) {
                tabla[numero]++;
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("El número " + i + " se ha introducido " + tabla[i] + " veces.");
        }
    }
}
