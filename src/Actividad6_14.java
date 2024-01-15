//AGENDA
//1. Crear menú de usuario.
//1.1. Añadir nuevo contacto (nombre y teléfono)
//1.2. Buscar el teléfono de un contacto con un nombre
//1.3. Mostrar la información de todos los contactos ordenados mediante el nombre.
//(Nombre y tel se pueden codificar como una única cadena "nombre:telefono")

import java.util.Arrays;
import java.util.Scanner;

public class Actividad6_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] contactos = new String[10];
        int numContactos = 0; //Al iniciar tenemos 0 contactos porque no se han registrado.

        while (true) {
            //Usamos ese bucle para volver a empezar y volver a pedir una opción.
            System.out.println("AGENDA");
            System.out.println("a) Añadir nuevo contacto.");
            System.out.println("b) Buscar teléfono.");
            System.out.println("c) Mostrar todos los contactos ordenados alfabéticamente.");
            System.out.println("d) Salir.");
            System.out.print("Seleccione una opción: ");

            char opcion = scanner.next().charAt(0);
            //Lo mejor en este caso, es que para cada opción del menú crear una función.

            switch (opcion) {
                case 'a':
                    añadirContacto(contactos, numContactos);
                    numContactos++;
                    break;
                case 'b':
                    buscarTelefono(scanner, contactos, numContactos);
                    break;
                case 'c':
                    mostrarContactos(contactos, numContactos);
                    break;
                case 'd':
                    System.out.println("Saliendo de la aplicación.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void añadirContacto(String[] contactos, int numContactos) {
        if (numContactos < contactos.length) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el teléfono del contacto: ");
            String telefono = scanner.next();

            contactos[numContactos] = nombre + ":" + telefono;

            System.out.println("Contacto añadido con éxito.");
        } else {
            System.out.println("Agenda llena. No se pueden agregar más contactos.");
        }
    }

    private static void buscarTelefono(Scanner scanner, String[] contactos, int numContactos) {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombreBuscar = scanner.next();

        for (int i = 0; i < numContactos; i++) {
            if (contactos[i] != null && contactos[i].startsWith(nombreBuscar + ":")) {
                String[] partes = contactos[i].split(":");
                System.out.println("El teléfono de " + partes[0] + " es: " + partes[1]);
                return;
            }
        }

        System.out.println("Contacto no encontrado.");
    }

    private static void mostrarContactos(String[] contactos, int numContactos) {
        Arrays.sort(contactos, 0, numContactos);

        System.out.println("\nLista de contactos ordenados alfabéticamente:");
        for (int i = 0; i < numContactos; i++) {
            System.out.println(contactos[i]);
        }
    }
}
//----------------------------------------------------------------------------------

//Lo único que tenía claro al empezar es que debo usar un switch para el menu.
//Es lo primero que hago. Después iré agragando cosas.


//COSAS QUE MEJORAR:
// - La array de contactos deberá ampliarse si se apmlia el número de contactos.
