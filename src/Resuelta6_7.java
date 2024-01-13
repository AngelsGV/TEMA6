//Pedir frase y palabra. Buscar las veces que aparece la palabra en la frase
import java.util.Scanner;
public class Resuelta6_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int veces = 0, pos;
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();
        System.out.println("Introduzca una palabra: ");
        palabra = sc.next(); //solo lee una palabra
        pos = frase.indexOf(palabra); //Se busca la primera ocurrencia
        while (pos!=-1){ // no era
            veces ++;
            pos = frase.indexOf(palabra, pos + 1);
            // volvemos a buscar en la posicion de después del pos
        }
        if (veces == 0){
            System.out.println("La palabra " + palabra + "está " + veces + "veces.");
        }else{
            System.out.println("\"" + palabra+ "\" está " + veces + " veces.");
        }
    }
}
