//Acierta la contraseña. 1. Se introduce una contraseña.
// 2. Teclear palabras hasta que acierte.
// 2 versiones:
// 1. Se dice si las palabras tienen más o menos caracteres.
// 2. El programa mostrará la longitud de la contraseña y una cadena con
// los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.

import java.util.Scanner;
public class Resuelta6_3_1 {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String psswd, palabra;
      System.out.println("Jugador 1. Introduzca la contraseña: ");
      psswd = sc.nextLine();
      do {
        System.out.println("Jugador 2. Palabra: ");
        palabra = sc.nextLine();
        int comparacion = psswd.compareTo(palabra); //comparamos alfabetcamente.
        if (comparacion == 0){
          System.out.println("Acetaste!");
        } else if (comparacion<0) {
          System.out.println("La contraseña es menor que " + palabra);
        }else{
          System.out.println("La contraseña es mayor que "+ palabra);
        }
      }while (!psswd.equals(palabra));
  }
}
