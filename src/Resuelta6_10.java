//Frase palindroma sin tildes
import java.util.Scanner;
public class Resuelta6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, sinEspacios, invertida;
        System.out.println("Escriba una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase(); // trabajaremos con las letras en minusculas
        sinEspacios = eliminarEspacios(frase);
        invertida = alReves(sinEspacios);
        if (sinEspacios.equals(invertida)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
    }

    static String alReves(String orignal) {
        String nueva = "";
        for (int i = 0; i < orignal.length(); i++) {
            nueva = orignal.charAt(i) + nueva;
        }
        return nueva;
    }

    static String eliminarEspacios(String cadena) {
        String sin = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (!Character.isWhitespace(c)) {
                sin = sin + c;
            }
        }
        return sin;
    }
}