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

        Scanner sc = new Scanner(System.in);
        String[] contactos = new String[1];
        // Pongo un valor grande para no tener que pensar en la función. Después lo arreglare.
        int numContactos = 0; //Al iniciar tenemos 0 contactos porque no se han registrado.

        while (true) {
            //Usamos ese bucle para volver a empezar y volver a pedir una opción.
            System.out.println("\n AGENDA");
            System.out.println("\na) Añadir nuevo contacto.");
            System.out.println("b) Buscar teléfono.");
            System.out.println("c) Mostrar todos los contactos ordenados alfabéticamente.");
            System.out.println("d) Salir.");
            //De este último introducimos el dato en la máquina.
            System.out.print("Seleccione una opción: ");
            char opcion = sc.next().charAt(0); //función buscada por internet :)

            //Lo mejor en este caso, es que para cada opción del menú crear una función.
            //Se usa char porque solo es una letra.

            switch (opcion) {
                case 'a':{
                    //Cada vez que se añade un contacto el contador numContactos se ha de incrementar.
                    agregarContacto(contactos,numContactos);
                    numContactos++;
                    break;}

                case 'b':{

                    buscarTelefono(contactos, numContactos);
                    break;}

                case 'c':{

                    mostrarContactos(contactos, numContactos);
                    break;}

                case 'd': {

                    System.out.println("Saliendo...");
                    System.exit(0); //Lo he buscado para salir del bucle.
                }
                default:
                    System.out.println("Error. Intentelo de nuevo.");
            }
        }
    }

    //Función para opcion a)
    static String[] agregarContacto(String[] contactos, int numContactos) {
        Scanner sc = new Scanner(System.in);

        // Duplicar la capacidad de la array si está llena
        if (numContactos == contactos.length) {
            contactos = Arrays.copyOf(contactos, contactos.length + 1);
        }

        System.out.print("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca el teléfono: ");
        String telefono = sc.nextLine();

        contactos[numContactos] = nombre + ":" + telefono;
        numContactos++;

        Arrays.sort(contactos, 0, numContactos); // Ordenar alfabéticamente por nombre
        System.out.println("Contacto agregado correctamente.");

        return contactos;
    }


    //Función para opcion b)
    static void buscarTelefono( String[] contactos, int numContactos) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String buscarNombre = sc.nextLine();

        //Recorremos la array
        for (int i = 0; i < numContactos; i++) {

            String[] partes = contactos[i].split(":");
            //Split.Divide la cadena usando : en 2 partes
            String nombre = partes[0];
            String telefono = partes[1];

            if (nombre.equalsIgnoreCase(buscarNombre)) {
                System.out.println("Teléfono de " + nombre + ": " + telefono);
                return;
            }
        }

        System.out.println("Contacto no encontrado.");
    }

    //Función para opcion c)
    static void mostrarContactos(String[] contactos, int numContactos) {
        System.out.println("Lista de contactos ordenados alfabéticamente: \n");
        //recorremos toda la Array que estaba previamente ordenada y los mostramos en pantalla
        for (int i = 0; i < numContactos ; i++) {
            System.out.println(contactos[i]);
        }
    }
}
//----------------------------------------------------------------------------------

//Lo único que tenía claro al empezar es que debo usar un switch para el menu.
//Es lo primero que hago. Después iré agragando cosas.
//1. Escribo el menú.
//2. Switch con las opciones del menú.
//3. Funciones de cada opción.


//COSAS QUE MEJORAR:
// - La array de contactos deberá ampliarse si se apmlia el número de contactos.
// - No me salen los contactos en pantalla
// - No consigo tener los contactos recopilados en el programa para que otras funciones los puedan usar.

