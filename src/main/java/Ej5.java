
/*
Un palíndromo es una palabra cuyo orden de letras sigue siendo el mismo si se lee de izquierda a derecha o de derecha a izquierda. Ejemplos: Kayak, Ana, radar, rotor, etc.

Escriba un algoritmo que pida al usuario una palabra sin acento, en minúsculas y seguida de # para indicar el final, y que le diga al usuario si esta palabra es un palíndromo o no.-1 para salir
 */
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        while (!palabra.equals("-1")) {
            System.out.println("Introduce una palabra sin acento, en minúsculas y seguida de un caracter especial (cualquiera que no sea una letra) para indicar el final (-1 para salir):");
            palabra = sc.nextLine();
            if (!palabra.equals("-1")) {
                palabra = palabra.substring(0, palabra.length() - 1);
                boolean palindromo = true;
                for (int i = 0; i < palabra.length() / 2; i++) {
                    if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                        palindromo = false;
                    }
                }
                if (palindromo) {
                    System.out.println("La palabra " + palabra + " es un palíndromo.");
                } else {
                    System.out.println("La palabra " + palabra + " no es un palíndromo.");
                }
            }
        }


    }
}
