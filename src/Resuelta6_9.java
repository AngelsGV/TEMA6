import java.util.Scanner;
    public class Resuelta6_9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String frase = "", palabra;
            System.out.println("Escriba una palabra: ");
            palabra=sc.next();
            while(!palabra.toLowerCase().equals("fin")){
                frase = frase +" " + palabra;
                System.out.println("Escriba una palabra: ");
                palabra=sc.next();
            }
            System.out.println(frase);
        }
}
