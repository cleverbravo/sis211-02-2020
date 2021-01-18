package programa05;
import java.util.*;
public class Programa05 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int tam=5;
        double v[]=new double[tam];//estatico
        for(int i=0;i<tam;i++)
            v[i]=cin.nextDouble();
        double max=v[0],min=v[0];
        for(int i=1;i<tam;i++){
            if(max<v[i])
                max=v[i];
            if(min>v[i])
                min=v[i];
        }
        System.out.println("El maximo es:"+max);
        System.out.println("El minimo es:"+min);
    }
}
