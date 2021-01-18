package programa09;
import java.util.*;
/*
8
10 20 30 40 11 12 13 14
pares=6
impares=2
*/
public class Programa09 {
    public static boolean esPar(int x){
        return x%2==0;
    }
    public static int[] leerVector(int n){
        return null;
    }
    public static int[] contarParesEImpares(int v[]){
        return null;
    }
    /*
    modularizar un programa
    invocar a la funcion
    facilita la edicion de codigo
    facilita el testeo automatizado
    */
    
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int v[]=new int[n];
        for(int i=0;i<n;i++)
            v[i]=cin.nextInt();
        int pares=0,impares=0;
        for(int i=0;i<n;i++)
            if(esPar(v[i]))
                pares++;
            else
                impares++;
        System.out.println("pares="+pares);
        System.out.println("impares="+impares);
    }
}
