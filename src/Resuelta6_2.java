//Introducir dos frases por teclado y decir cual es la más corta.
import java.util.Scanner;
public class Resuelta6_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la primera oración: ");
        String frase1 = sc.nextLine();
        System.out.println("Escribe la segunda oración: ");
        String frase2 = sc.nextLine();
        // Calculamos la longitud de cada frase
        int long1 = frase1.length();
        int long2 = frase2.length();
        //Comparamos
        if (long1 == long2){
            System.out.println("Las frases tienen el mismo número de caracteres.");
        } else if (long1 < long2) {
            System.out.println( "La primera frase es más corta que la segunda.");
        } else {
            System.out.println("La primera frase es más larga que la segunda.");
        }

    }
}
