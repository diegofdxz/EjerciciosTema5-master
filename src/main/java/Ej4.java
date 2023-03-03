/*
Cree un algoritmo que pida a los usuarios que voten (los usuarios se turnarán para usar su máquina de votación). Se proponen varios candidatos. Al final del día, el presidente de la mesa de votación introduce un código especial para finalizar la votación (68753421) y se muestran los resultados. Eso sí, este ejercicio es teórico, ya que la seguridad no está garantizada y un usuario puede votar varias veces...
 habra 4 candidatos y estos tendran nombre

 */
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[4];
        String[] candidatos = new String[4];
        int  votosTotales = 0;
        candidatos[0] = "Emilia TERREROS";
        candidatos[1] = "Gerardo ESCOBAR";
        candidatos[2] = "María AGUAVIVA";
        candidatos[3] = "Nadia LETUX";
        int voto = 0;
        while (voto != 68753421) {
            System.out.println("Introduce el número del candidato que quieras votar (68753421 para terminar):");
            System.out.println("1. " + candidatos[0]);
            System.out.println("2. " + candidatos[1]);
            System.out.println("3. " + candidatos[2]);
            System.out.println("4. " + candidatos[3]);

            voto = sc.nextInt();
            if (voto >= 1 && voto <= 4) {
                voto--;
                tabla[voto]++;
                votosTotales++;
                System.out.println("Voto registrado, ha votado por " + candidatos[voto] + ".");
            }
        }
        //los resultados en porcentaje
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("El candidato " + candidatos[i] + " ha obtenido un " + ((float)tabla[i]/votosTotales)*100  + "% de los votos.");
        }
    }
}


