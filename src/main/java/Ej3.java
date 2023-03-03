
/*
Producir un algoritmo agregando notas en una tabla. Al final, mostrar todas las calificaciones y su media
ejemplo de resultado final La media de las notas (12; 15; 8; 7) es 10,5.
 */
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];
        int nota = 0;
        int suma = 0;
        int contador = 0;
        while (nota != -1) {
            System.out.println("Introduce una nota (-1 para terminar):");
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {
                tabla[contador] = nota;
                suma += nota;
                contador++;
            }
        }
        System.out.printf("la media de las notas (");
        for (int i = 0; i < contador; i++) {
            System.out.printf("%d", tabla[i]);
            if (i < contador - 1) {
                System.out.printf("; ");
            }
        }
        System.out.printf(") es %.1f", (float)suma / contador);
        

    }
}
