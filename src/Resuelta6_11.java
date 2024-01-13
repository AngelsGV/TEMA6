//  Codificar texto, del conjunto 1 al dos en minusculas
import java.util.Scanner;
public class Resuelta6_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char[] codificado;//tabla que contendrá la codificación del tecto introducido
        String texto;
        System.out.println("Escribe el texto acodificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();// a minusculas
        codificado = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
        }
        texto = String.valueOf(codificado);
        System.out.println(texto);
    }
    static char codifica(char[] conjunto1, char[] conjunto2, char c){
        final String conj1 = String.valueOf(conjunto1);
        char codificado;
        int pos = conj1.indexOf(c);
        if(pos==-1){
            codificado = c;
        }else {
            codificado = conjunto2[pos];
        }
        return codificado;
    }
}
