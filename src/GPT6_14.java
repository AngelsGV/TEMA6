//AGENDA
//1. Crear menú de usuario.
//1.1. Añadir nuevo contacto (nombre y teléfono)
//1.2. Buscar el teléfono de un contacto con un nombre
//1.3. Mostrar la información de todos los contactos ordenados mediante el nombre.
//(Nombre y tel se pueden codificar como una única cadena "nombre:telefono")

import java.util.Arrays;
import java.util.Scanner;

public class GPT6_14 {
    private static String[] contactos = new String[10]; // Puedes ajustar el tamaño según tus necesidades.
    private static int numContactos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Menú de Agenda ***");
            System.out.println("a) Añadir nuevo contacto");
            System.out.println("b) Buscar teléfono de un contacto");
            System.out.println("c) Mostrar todos los contactos ordenados alfabéticamente");
            System.out.println("d) Salir");
            System.out.print("Seleccione una opción: ");

            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    añadirContacto(scanner);
                    break;
                case 'b':
                    buscarTelefono(scanner);
                    break;
                case 'c':
                    mostrarContactosOrdenados();
                    break;
                case 'd':
                    System.out.println("Saliendo de la aplicación.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void añadirContacto(Scanner scanner) {
        if (numContactos < contactos.length) {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el teléfono del contacto: ");
            String telefono = scanner.next();

            contactos[numContactos++] = nombre + ":" + telefono;

            System.out.println("Contacto añadido con éxito.");
        } else {
            System.out.println("Agenda llena. No se pueden agregar más contactos.");
        }
    }

    private static void buscarTelefono(Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombreBuscar = scanner.next();

        for (String contacto : contactos) {
            if (contacto != null && contacto.startsWith(nombreBuscar + ":")) {
                String[] partes = contacto.split(":");
                System.out.println("El teléfono de " + partes[0] + " es: " + partes[1]);
                return;
            }
        }

        System.out.println("Contacto no encontrado.");
    }

    private static void mostrarContactosOrdenados() {
        Arrays.sort(contactos, 0, numContactos);

        System.out.println("\nLista de contactos ordenados alfabéticamente:");
        for (int i = 0; i < numContactos; i++) {
            System.out.println(contactos[i]);
        }
    }
}
