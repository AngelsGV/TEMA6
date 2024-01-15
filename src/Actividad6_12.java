import java.util.Scanner;

//Juego del ahorcado.
//1. Intentar que no se vea la palabra que se escribe
//2. Se muestren guiones para la cantidad de letras que hay.
//3. El jugador escribirá letras y se irán colocando en sus lugares. Los lugares no acertados seguirán con guiones.
//4. Se debe mostrar las letras acertadas y las utilizadas.
//5. El jugador tendrá 7 intentos erróneos
//6. Finaliza al acertar la palabra o al consumir los 7 errores.
import java.util.Scanner;
import java.util.Scanner;

public class Actividad6_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Palabra secreta
        System.out.println("Jugador 1. Introduzca la palabra: ");
        String palabraSecreta = scanner.nextLine().toLowerCase();

        // Palabra ocultada por _
        char[] palabraOculta = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        // Variables
        int intentosRestantes = 7;
        char[] letrasIncorrectas = new char[7];
        int indiceLetrasIncorrectas = 0;


        while (intentosRestantes > 0 && !esPalabraAdivinada(palabraOculta)) {
            System.out.println("Palabra oculta: " + new String(palabraOculta));
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Letras incorrectas: ");
            mostrarLetrasIncorrectas(letrasIncorrectas, indiceLetrasIncorrectas);

            // Jugador 2 intenta adivinar una letra
            System.out.println("Jugador 2, introduce una letra:");
            char letra = scanner.next().toLowerCase().charAt(0);

            // Verificar si la letra ya fue intentada
            if (letraYaIntentada(letra, letrasIncorrectas, indiceLetrasIncorrectas) ||
                    letraYaAdivinada(letra, palabraOculta)) {
                System.out.println("Ya has intentado esa letra. Prueba con otra.");
                continue;
            }

            // Verificar si la letra está en la palabra secreta
            boolean acierto = actualizarPalabraOculta(letra, palabraSecreta, palabraOculta);

            // Actualizar letras incorrectas y disminuir intentos si no hay acierto
            if (!acierto) {
                letrasIncorrectas[indiceLetrasIncorrectas] = letra;
                indiceLetrasIncorrectas++;
                intentosRestantes--;
            }
        }

        // Mostrar resultado final
        if (esPalabraAdivinada(palabraOculta)) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("¡Lo siento! La palabra correcta era: " + palabraSecreta);
        }

        scanner.close();
    }

    // Función para verificar si la letra ya fue intentada
    private static boolean letraYaIntentada(char letra, char[] letrasIncorrectas, int indice) {
        for (int i = 0; i < indice; i++) {
            if (letrasIncorrectas[i] == letra) {
                return true;
            }
        }
        return false;
    }

    // Función para verificar si la letra ya fue adivinada
    private static boolean letraYaAdivinada(char letra, char[] palabraOculta) {
        for (char c : palabraOculta) {
            if (c == letra) {
                return true;
            }
        }
        return false;
    }

    // Función para actualizar la palabra oculta con la letra adivinada
    private static boolean actualizarPalabraOculta(char letra, String palabraSecreta, char[] palabraOculta) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraOculta[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }

    // Función para mostrar las letras incorrectas
    private static void mostrarLetrasIncorrectas(char[] letrasIncorrectas, int indice) {
        for (int i = 0; i < indice; i++) {
            System.out.print(letrasIncorrectas[i] + " ");
        }
        System.out.println();
    }

    // Función para verificar si se ha adivinado la palabra
    private static boolean esPalabraAdivinada(char[] palabraOculta) {
        for (char c : palabraOculta) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
//------------------------------------------------------------------
//1. No está la forma de escribirlo en invisible. Se me ha complicado bastante el ejercicio y
// he decidido no complicarlo más...
//2. Ok. He convertido la palabra en array y he codificado todos sus elementos en _
//3.  He buscado la funcion : char letra = scanner.next().toLowerCase().charAt(0);