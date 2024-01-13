// 2. El programa mostrará la longitud de la contraseña y una cadena con
// los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.

import java.util.Scanner;
public class Resuelta6_3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String psswd, palabra;
        System.out.println("Jugador 1. Introduzca la contraseña: ");
        psswd = sc.nextLine();
        System.out.println("La contraseña tiene " + psswd.length() + " caracteres");
        System.out.println("Jugador 2. Palabra: ");
        palabra = sc.nextLine();
        while (!palabra.equals(psswd)){
            String pista = "";
            for (int i=0; i < psswd.length();i++){
                if (psswd.charAt(i) == palabra.charAt(i)){
                    pista += psswd.charAt(i);
                } else {
                    pista += '*';
                }
            }
            System.out.println(pista);
            System.out.println("Jugador 2. Introduzca la palabra de nuevo: ");
            palabra = new Scanner(System.in).next(); // leemos otra palabra
        }
        System.out.println("Acertaste!");
    }
}
