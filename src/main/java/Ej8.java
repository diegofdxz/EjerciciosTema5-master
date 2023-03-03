/*
Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones:
Solo hay un jugador.
Solo hay cuatro filas y cuatro columnas.
Solo hay un barco que ocupa una única celda (este espacio se elige al azar).
Que se muestre el tablero con los disparos realizados y en caso de que se haya acertado, se muestre el barco.
 */
import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[4][4];
        int barcoX = (int) (Math.random() * 4);
        int barcoY = (int) (Math.random() * 4);
        int disparos = 0;
        int aciertos = 0;
        while (aciertos == 0) {

            System.out.println("Introduce la coordenada X del disparo:");
            int x = sc.nextInt();

            System.out.println("Introduce la coordenada Y del disparo:");
            int y = sc.nextInt();
            disparos++;
            if (x == barcoX && y == barcoY) {
                aciertos++;
                tablero[y][x] = 1;
            } else {
                tablero[y][x] = 2;
            }
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] == 0) {
                        System.out.print(" - ");
                    } else if (tablero[i][j] == 1) {
                        System.out.print(" X ");
                    } else if (tablero[i][j] == 2) {
                        System.out.print(" O ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Has acertado en " + disparos + " disparos.");
    }


}
