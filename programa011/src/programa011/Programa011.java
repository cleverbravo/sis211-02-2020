package programa011;
//tenemos que dictar un curso 10, inscripcion.
/*
1.-Registrar nuevo estudiante (nombre completo,ci,monto)
2.-Listar los estudiantes inscritos
3.-Eliminar a un estudiante.
4.-Salir.
*/
import java.util.*;
public class Programa011 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<Estudiante> lista=new ArrayList();
        while(true){
            System.out.println("1.-Registrar Estudiante");
            System.out.println("2.-Listar Estudiantes registrados");
            System.out.println("3.-Eliminar a un estudiante");
            System.out.println("4.-Salir");
            System.out.print("Introduzca la opcion:");
            int opcion;
            opcion=cin.nextInt();
            switch(opcion){
                case 1:Estudiante e=new Estudiante();
                    e.leerDatos();
                    lista.add(e);
                    break;
                case 2:
                    double total=0;
                    for(int i=0;i<lista.size();i++){
                        lista.get(i).mostrarDatos();
                        total+=lista.get(i).monto;
                    }
                    System.out.println("El total recaudado es:"+total);
                    break;
                case 3:System.out.print("Introduca el CI del estudiante que desea eliminar:");
                    String ci=cin.next();
                    for(int i=0;i<lista.size();i++)
                        if(ci.compareTo(lista.get(i).ci)==0){
                            lista.remove(i);
                            System.out.println("Estudiante eliminado.");
                            break;
                        }
                    break;
                case 4:System.exit(0);
                default:System.out.println("Opcion incorrecta. Try again.");
            }
        }
    }
}

class Estudiante{
    String nombres,apellidos,ci;
    double monto;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        nombres=cin.next();
        System.out.println("Introduzca el apellido:");
        apellidos=cin.next();
        System.out.println("Introduzca el ci:");
        ci=cin.next();
        System.out.println("Introduzca el monto de dinero pagado:");
        monto=cin.nextDouble();
    }
    public void mostrarDatos(){
        System.out.println("Nombre:"+nombres+" "+apellidos);
        System.out.println("CI:"+ci);
        System.out.println("Monto:"+monto);
    }
}