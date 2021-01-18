package programa1;
import java.util.*;
public class Programa1 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int x=10;
        int b=elevarAlCuadrado(x);
        System.out.println("x="+x);
        System.out.println("b="+b);
    }
    public static int elevarAlCuadrado(int x){
        x=x+100;
        return x;
    }
}
