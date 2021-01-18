package programa010;
import java.util.*;
public class Programa010 {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        Cliente cliente2=new Cliente();
        
        cliente1.leerDatos();
        cliente2.leerDatos();
        cliente2.mostrarDatos();
        cliente1.mostrarDatos();
    }
}

class Cliente{
    String nombre,ci,domicilio;
    int totalFactura;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca los datos de un cliente:");
        nombre=cin.next();
        ci=cin.next();
        totalFactura=cin.nextInt();
    }
    public void mostrarDatos(){
        System.out.println("nombre:"+nombre);
        System.out.println("ci:"+ci);
        System.out.println("total:"+totalFactura);
    }
}
class Cocinero{
    String nombre,ci;
    int horaEntrada,horaSalida;
    int sueldo,bono;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca los datos de un cocinero:");
        nombre=cin.next();
        ci=cin.next();
        horaEntrada=cin.nextInt();
        horaSalida=cin.nextInt();
        sueldo=cin.nextInt();
    }
    public void mostrarDatos(){
        System.out.println("nombre:"+nombre);
        System.out.println("ci:"+ci);
        System.out.println("Entrada:"+horaEntrada);
        System.out.println("Salida:"+horaSalida);
        System.out.println("sueldo:"+sueldo);
    }
}