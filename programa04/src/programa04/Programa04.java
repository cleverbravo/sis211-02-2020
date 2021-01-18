package programa04;
import java.util.*;
public class Programa04 {
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner cin=new Scanner(System.in);
        for(int i=0;i<5;i++)
            array[i]=cin.nextInt();
        double avg=0;
        for(int i=0;i<5;i++)
            avg+=array[i];
        avg=avg/5;
        System.out.println("El promedio es:"+avg);
    }
}
