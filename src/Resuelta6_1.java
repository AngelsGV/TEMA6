// Programa que muestre todos los caracteres Unicode junto a su code point ,
// cuyo valor esté entre /u0000 y /uFFFF
public class Resuelta6_1 {
    public static void main(String[] args){
        //num en base hexadecimal anteponiendo 0x
        for (int codePoint = 0x0000; codePoint<= 0xFFFF; codePoint++){
            String xxxx = Integer.toHexString(codePoint);
            //convierte un núm en su hexadecimal
            System.out.println("\\u" + xxxx + ": " + (char)codePoint);
        }
    }
}
