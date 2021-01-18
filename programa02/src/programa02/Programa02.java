package programa02;
import java.util.*;
public class Programa02 {
    public static void main(String[] args) {
        String cadena;
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres");
        cadena=cin.nextLine();
        //****************************************
        System.out.println("La cadena introducida invertida es:");
        for(int i=cadena.length()-1;i>=0;i--)
            System.out.print(cadena.charAt(i));
        //****************************************
        StringBuilder aux=new StringBuilder(cadena);
        aux.reverse();
        cadena=aux.toString();
        System.out.println("\nLa cadena introducida invertida es:"+cadena);
        //****************************************
        System.out.println("\nLa cadena introducida invertida es:");
        //pendiente la inversion con arrays
    }
}

