package programa06;
import java.util.*;
public class Programa06 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int tam=5;
        ArrayList<Double> v=new ArrayList();
        for(int i=0;i<tam;i++)
            v.add(cin.nextDouble());
        double max=Collections.max(v);
        double min=Collections.min(v);
        
        System.out.println("El maximo es:"+max);
        System.out.println("El minimo es:"+min);
    }
}
