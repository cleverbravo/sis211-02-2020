package programa08;
import java.util.*;
/*
ingenieria de sistemas
a=2
e=4
i=4
*/
public class Programa08 {
    public static void main(String[] args) {
        String cadena;
        Scanner cin=new Scanner(System.in);
        System.out.println("introduzca una cadena:");
        cadena=cin.nextLine();
        int i=0;
        int vocales[]=new int[5];
        while(i<cadena.length()){
            switch(cadena.charAt(i++)){
                case 'a':vocales[0]++;break;
                case 'e':vocales[1]++;break;
                case 'i':vocales[2]++;break;
                case 'o':vocales[3]++;break;
                case 'u':vocales[4]++;break;
            }
        }
        i=0;
        while(i<vocales.length){
            if(vocales[i]>0){
                switch(i){
                    case 0:System.out.print("a=");break;
                    case 1:System.out.print("e=");break;
                    case 2:System.out.print("i=");break;
                    case 3:System.out.print("o=");break;
                    case 4:System.out.print("u=");break;
                }
                System.out.println(vocales[i]);
            }
            i++;
        }
    }
}
