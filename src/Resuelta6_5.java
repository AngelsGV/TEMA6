//DEVULVE LA CADENA DE CARACTERES INVERTIDA.
import java.util.Scanner;
public class Resuelta6_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String antes, despues;
        System.out.print("Escribe una frase: ");
        antes = sc.nextLine();
        despues = alReves(antes);
        System.out.println(despues);
    }
    static String alReves(String orignal){
        String nueva = "";
        for (int i = 0; i<orignal.length(); i++){
            nueva = orignal.charAt(i) + nueva;
        }return  nueva;
    }
}


