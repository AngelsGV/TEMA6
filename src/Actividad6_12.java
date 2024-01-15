import java.util.Scanner;

//Juego del ahorcado.
//1. Intentar que no se vea la palabra que se escribe
//2. Se muestren guiones para la cantidad de letras que hay.
//3. El jugador escribirá letras y se irán colocando en sus lugares. Los lugares no acertados seguirán con guiones.
//4. Se debe mostrar las letras acertadas y las utilizadas.
//5. El jugador tendrá 7 intentos erróneos
//6. Finaliza al acertar la palabra o al consumir los 7 errores.
import java.util.Scanner;
public class Actividad6_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String psswd, palabra;
        //Palabra secreta.
        System.out.println("Jugador 1. Introduzca la palabra: ");
        psswd = sc.nextLine();
        System.out.println("La contraseña tiene " + psswd.length() + " caracteres");
        char[] letras = new char[psswd.length()];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = '_';
        }
        System.out.println(new String(letras));

        //Aquí estoy intentando remplazar toda la palabra secreta por guiones bajos.
        //He decidido crear un array con las letras de la palabra y convertirlas en _

        System.out.println("Jugador 2. Palabra: ");
        palabra = sc.nextLine();
        while (!palabra.equals(psswd)){
            String pista = "";
            for (int i=0; i < psswd.length();i++){
                if (psswd.charAt(i) == palabra.charAt(i)){
                    pista += psswd.charAt(i);
                } else {
                    pista += '_';
                }
            }
            System.out.println(pista);
            System.out.println("Jugador 2. Introduzca la palabra de nuevo: ");
            palabra = new Scanner(System.in).next(); // leemos otra palabra
        }
        System.out.println("Acertaste!");
    }
}
//------------------------------------------------------------------
//1. No está la forma de escribirlo en invisible. Se me ha complicado bastante el ejercicio y
// he decidido no complicarlo más...
//2. Ok. He convertido la palabra en array y he codificado todos sus elementos en _
//3.