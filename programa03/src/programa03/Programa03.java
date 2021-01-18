package programa03;
import java.util.*;

public class Programa03 {
    public static void main(String[] args) {
        String cadena;
        System.out.println("Introduzca un numero:");
        Scanner cin=new Scanner(System.in);
        cadena=cin.next();
        int i=0;
        for(i=0;i<cadena.length();i++)
            if(!Character.isDigit(cadena.charAt(i)))
                break;
        if(i==cadena.length()){
            int a=Integer.parseInt(cadena);
            System.out.println("El numero entero es:"+a);
        }
        
        int puntos=0;
        for(i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='.')
                puntos++;
            if(!Character.isDigit(cadena.charAt(i))&&cadena.charAt(i)!='.'||puntos>=2)
                break;
        }
        if(i==cadena.length()){
            double b=Double.parseDouble(cadena);
            System.out.println("El numero de doble precision es:"+b);
        }
    }
}

