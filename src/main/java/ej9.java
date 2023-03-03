/*
Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.
 */

import java.util.Scanner;
public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tablero = new String[3][3];
        int turno = 0;
        int ganador = 0;
        while (ganador == 0) {
            if (turno == 0) {
                System.out.println("Turno del jugador 1 (X)");
            } else {
                System.out.println("Turno del jugador 2 (O)");
            }
            System.out.println("Introduce la coordenada X de la ficha:");
            int x = sc.nextInt();
            System.out.println("Introduce la coordenada Y de la ficha:");
            int y = sc.nextInt();
            if (turno == 0) {
                tablero[y][x] = "X";
                turno++;
            } else {
                tablero[y][x] = "O";
                turno--;
            }
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] == null) {
                        System.out.print(" - ");
                    } else {
                        System.out.print(" " + tablero[i][j] + " ");
                    }
                }
                System.out.println();
            }
            if (tablero[0][0] == "X" && tablero[0][1] == "X" && tablero[0][2] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
            } else if (tablero[1][0] == "X" && tablero[1][1] == "X" && tablero[1][2] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
            } else if (tablero[2][0] == "X" && tablero[2][1] == "X" && tablero[2][2] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
            } else if (tablero[0][0] == "X" && tablero[1][0] == "X" && tablero[2][0] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
} else if (tablero[0][1] == "X" && tablero[1][1] == "X" && tablero[2][1] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
            } else if (tablero[0][2] == "X" && tablero[1][2] == "X" && tablero[2][2] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
            } else if (tablero[0][0] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
            } else if (tablero[0][2] == "X" && tablero[1][1] == "X" && tablero[2][0] == "X") {
                ganador++;
                System.out.println("Gana el jugador 1");
            } else if (tablero[0][0] == "O" && tablero[0][1] == "O" && tablero[0][2] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            } else if (tablero[1][0] == "O" && tablero[1][1] == "O" && tablero[1][2] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            } else if (tablero[2][0] == "O" && tablero[2][1] == "O" && tablero[2][2] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            } else if (tablero[0][0] == "O" && tablero[1][0] == "O" && tablero[2][0] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            } else if (tablero[0][1] == "O" && tablero[1][1] == "O" && tablero[2][1] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            } else if (tablero[0][2] == "O" && tablero[1][2] == "O" && tablero[2][2] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            } else if (tablero[0][0] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            } else if (tablero[0][2] == "O" && tablero[1][1] == "O" && tablero[2][0] == "O") {
                ganador++;
                System.out.println("Gana el jugador 2");
            }

}
    }
}