//AGENDA
//1. Crear menú de usuario.
//1.1. Añadir nuevo contacto (nombre y teléfono)
//1.2. Buscar el teléfono de un contacto con un nombre
//1.3. Mostrar la información de todos los contactos ordenados mediante el nombre.
//(Nombre y tel se pueden codificar como una única cadena "nombre:telefono")

import java.util.*;

public class Actividad6_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> agenda = new TreeMap<>(); // TreeMap para almacenar contactos ordenados por nombre

        while (true) {
            System.out.println("Menú de Agenda:");
            System.out.println("a) Añadir un nuevo contacto");
            System.out.println("b) Buscar el teléfono de un contacto por nombre");
            System.out.println("c) Mostrar información de todos los contactos ordenados alfabéticamente");
            System.out.println("q) Salir");

            System.out.print("Seleccione una opción: ");
            char opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    agregarContacto(agenda, scanner);
                    break;
                case 'b':
                    buscarTelefono(agenda, scanner);
                    break;
                case 'c':
                    mostrarContactos(agenda);
                    break;
                case 'q':
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void agregarContacto(Map<String, String> agenda, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el teléfono del contacto: ");
        String telefono = scanner.next();
        agenda.put(nombre, telefono);
        System.out.println("Contacto agregado con éxito.");
    }

    private static void buscarTelefono(Map<String, String> agenda, Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombre = scanner.next();
        String telefono = agenda.get(nombre);
        if (telefono != null) {
            System.out.println("El teléfono de " + nombre + " es: " + telefono);
        } else {
            System.out.println("No se encontró el contacto con el nombre: " + nombre);
        }
    }

    private static void mostrarContactos(Map<String, String> agenda) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Lista de contactos ordenados alfabéticamente:");
            for (Map.Entry<String, String> entry : agenda.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
