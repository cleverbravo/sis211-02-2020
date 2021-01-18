package programa012;
import java.util.*;
public class Programa012 {
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente p=new Paciente();
        p.leerDatos();
        System.out.println(p.nombre);
        System.out.println(p.diagnostico);
        Medico m=new Medico();
        m.leerDatos();
    }
}
class PersonaSinEdad{
    String nombre,ci,direccion,telf,nacionalidad;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        nombre=cin.next();
        ci=cin.next();
        telf=cin.next();
        direccion=cin.nextLine();
        direccion=cin.nextLine();
        nacionalidad=cin.next();
    }
}
class Persona extends PersonaSinEdad{
    int edad;
    public void leerDatos(){
        super.leerDatos();
        Scanner cin=new Scanner(System.in);
        edad=cin.nextInt();
    }
}
class Paciente extends Persona{
    String diagnostico;
    public void leerDatos(){
        super.leerDatos();//invocar a la funcion de la clase padre
        Scanner cin=new Scanner(System.in);
        diagnostico=cin.nextLine();
        diagnostico=cin.nextLine();
    }
}

class Medico extends Persona{
    
}

class Enfermera extends Persona{
    
}
class Administrativo extends PersonaSinEdad{
    
}
