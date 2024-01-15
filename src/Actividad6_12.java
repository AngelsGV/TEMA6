//Juego del ahorcado.
//1. Intentar que no se vea la palabra que se escribe
//2. Se muestren guiones para la cantidad de letras que hay.--> OK
//3. El jugador escribirá letras y se irán colocando en sus lugares. Los lugares no acertados seguirán con guiones. -->Ok
//4. Se debe mostrar las letras acertadas y las utilizadas.
//5. El jugador tendrá 7 intentos erróneos --> OK
//6. Finaliza al acertar la palabra o al consumir los 7 errores. --> Ok

import java.util.Scanner;

public class Actividad6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraA;

        //Vamos a introducir la palabra que será censurada
        System.out.println("Jugador A. Inroduzca la palabra: ");
        palabraA = sc.next(); //Usaremos solo next porque solo se tiene que guardar una palabra.

        char[] palabraAArray = palabraA.toCharArray();
        //Vamos a ocultar la palabra. Para esto convertiremos la palabra en un array y
        // cambiaremos todos caracteres por guión bajo.

        char[] palabra = new char[palabraA.length()];
        //Primero creamos un array vacío de la misma longitud de la palabra.
        //Luego creamos un bucle desde 0(inicio) hasta la largaría de los carácteres de la palabra.
        //Este bucle lo que hará es poner guión bajo en todas las letras.
        for (int i = 0; i < palabraA.length(); i++){
            palabra[i] = '_';
        }
        //Mostramos en pantalla
        System.out.println("La palabra secreta tiene " + palabraA.length() + " letras.");
        System.out.println(palabra);
        aciertos(palabra,palabraAArray,palabraA);
        //palabra A, para mostrarla uniamente en el resultado final. Si no me tocará gacer un Array.toString y
        // no se vería tan bien.
        // palabra es el array con guiones bajos
        // palabraAArray es el array formado por los caractéres de la palabra.
    }
    static void aciertos(char[] palabra, char[] palabraAArray, String palabraA){
        Scanner sc = new Scanner(System.in);
        int intentos= 7;
        String letrasFalladas = "";
        //Se requerirá un bucle para poner los aciertos en su lugar correspondiente.

        while (intentos > 0) {

            System.out.println("Jugador B: Escriba una leta (Tienes permitido " + intentos + " errores): ");
            char letra = sc.next().charAt(0);


            boolean acierto = false;// Empezamos así porque cuando se acierte, será true.
            //Si empezamos con 7 intentos y acabamos en 0.
            //Pedimos al jugador que introduzca un carácter.

            for (int i = 0; i < palabra.length; i++) {
                //Bucle que recorre la array para que cuuando una letra introducida coincida con una de la palabra
                // se cambie por el caracter que toca.
                if ( palabraAArray[i] == letra) {
                    palabra[i] = letra;
                    acierto = true;
                    //Nos cuenta un acierto
                }
            }
            //Empezamos con 7 intentos, cada vez que se falle, se resta 1 intento.
            if (!acierto) { //Si no hay aciertos se restan intentos y se suman las letras a letrasFalladas
                intentos--;
                letrasFalladas += letra + ", ";
                System.out.println("La letra " + letra + " no es correcta");
            }
            System.out.println("Letras falladas: " + letrasFalladas);
            

            System.out.println(palabra);

            //Mensaje si aciertas la palabra

            //if (!new String(palabra).contains("_")) {
               // System.out.println("Felicidades! Has adivinado la palabra.");
              //  break;
            //} Lo he buscado por internet, el que he puesto lo he pensado después.

            boolean palabraCompletada = true;

            for (char c : palabra) {//Recorremos array palabra, si encuentra un guión bajo, la palabra no está completa
                if (c == '_') {
                    palabraCompletada = false;
                    break;
                }
            }

            if (palabraCompletada) {//si se completa la palabra, se da la enorabuena.
                System.out.println("Felicidades! Has adivinado la palabra.");
                break;//No sabía como hacerlo sin el break.
            }
        }
        //Mensaje si pierdes.
        if (intentos == 0) {
            System.out.println("Has perdido. Se acabaron los intentos. La palabra era: " + palabraA);
        }
    }
}


//------------------------------------------------------------------

//COSAS QUE MEJORAR.
//1. No está la forma de escribirlo en invisible. Se me ha complicado bastante el ejercicio y
// he decidido no complicarlo más...
//2. Que no permita repetir las letras erroneas.
//3. Que separe las letras erróneas con espacios. --> OK
//4. Si se introduce más de una letra, pedirlo otra vez.

//Se me dificulta:
//1. Los booleanos... aún no hay manera.
//2.No usar el break.