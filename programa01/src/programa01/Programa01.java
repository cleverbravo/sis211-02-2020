package programa01;
import java.util.*;
public class Programa01 {
    public static void main(String[] args) {
        System.out.println("Introduzca dos numeros:");
        int a,b;
        Scanner cin=new Scanner(System.in);
        a=cin.nextInt();
        b=cin.nextInt();
        int c=a+b;
        System.out.println("La suma de ambos numeros es:"+c);
    } 
}
