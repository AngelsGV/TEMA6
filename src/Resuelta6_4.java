//Introducir frase y señalar cuantos espacios en blanco tiene
import java.util.Scanner;
public class Resuelta6_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        int numEsaciosBlanco = 0;
        char c;
        System.out.println("Escriba su frase: ");
        frase = sc.nextLine();
        for (int i = 0; i<frase.length(); i++){
            c = frase.charAt(i);
            if (Character.isSpaceChar(c)){ //equivale c==
                numEsaciosBlanco ++;
            }
        }
        System.out.println("Tiene: "+numEsaciosBlanco+" espacios en blanco.");
    }
}
