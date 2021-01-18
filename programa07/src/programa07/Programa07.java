package programa07;
import java.util.*;
public class Programa07 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int tam=5;
        ArrayList<String> v=new ArrayList();
        for(int i=0;i<tam;i++)
            v.add(cin.next());
        String max=Collections.max(v);
        String min=Collections.min(v);
        
        System.out.println("El maximo es:"+max);
        System.out.println("El minimo es:"+min);
    }
    
}
