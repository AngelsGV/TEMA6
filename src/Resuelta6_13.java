//Cuantas veces se repiten las letras en una frase
import java.util.Scanner;
public class Resuelta6_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        int[] numVeces;
        System.out.println("Escriba su frase: ");
        frase = sc.nextLine().toLowerCase();
        numVeces = new int['z'-'a'+1];
        for(int i=0;i<frase.length();i++){
            if(Character.isLetter(frase.charAt(i))){
                numVeces[frase.charAt(i) - 'a']++;
            }
        }
        for(int i = 0;i<'z';i++){
            if(numVeces[i] !=0){
                System.out.println("La letra " + (char) (i+'a') + " se repite " + numVeces[i] + " veces.");
            }
        }
    }
}
