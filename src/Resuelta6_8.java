//Javalandia fitiliplaustica
import java.util.Scanner;
public class Resuelta6_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final String prefijo = "Javalín, javalón";
        final String sufijo = "javalén, len, len";
        System.out.println("Escribe una frase: ");
        String entrada = sc.nextLine();
        boolean idiomaJavalandia = false; // suponemos que la entrada no está en javalandés
        if(entrada.startsWith(prefijo)) {// si empieza con..
            idiomaJavalandia = true;
            entrada = entrada.substring(prefijo.length());
        } else if (entrada.endsWith(sufijo)) {
            idiomaJavalandia=true;
            entrada= entrada.substring(0, entrada.length()-sufijo.length());
        }
            if(idiomaJavalandia){
                entrada=entrada.strip();//quitamos los espacios antes y después
                System.out.println(entrada);
            }else{
                System.out.println("No está escrito en idioma de Javalandia.");
            }
        }

}
