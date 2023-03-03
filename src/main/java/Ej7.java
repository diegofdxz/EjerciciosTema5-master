/*
 * 7. Crear una tabla de caracteres bidimensional de tamaño 20×30, en la que se colocan caracteres elegidos al azar. Mostrar la tabla generada.
 */
public class Ej7 {
    public static void main(String[] args) {
        char[][] tabla = new char[20][30];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (char) (Math.random() * 26 + 'a');
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]);
            }
            System.out.println();
        }
    }
}
