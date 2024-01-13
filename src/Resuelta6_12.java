//pedir 2 palabras y decir si son anagramas.
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Resuelta6_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la primera palabra: ");
        String palabra1 = sc.next();
        palabra1  = palabra1.toLowerCase();
        System.out.println("Escribe la segunad palabra: ");
        String palabra2 = sc.next();
        palabra2 = palabra2.toLowerCase();
        if ( palabra1.length()!=palabra2.length()){
            System.out.println("No son anagramas.");
        }else{
            char p1[] =palabra1.toCharArray();
            char p2[] = palabra2.toCharArray();
            Arrays.sort(p1);
            Arrays.sort(p2);
            if ( Arrays.equals(p1,p2)){
                System.out.println("Son anagramas");
            }else{
                System.out.println("No son anagramas.");
            }
        }

    }
}
