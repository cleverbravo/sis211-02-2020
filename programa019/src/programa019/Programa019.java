package programa019;

import java.io.*;
import java.util.*;

public class Programa019 {
    public static void main(String[] args) {
        // TODO code application logic here
        /*File lugar=new File("./archivo.txt");
        try{
            String cadena="archivo creado";
            FileOutputStream stream=new FileOutputStream(lugar);
            stream.write(cadena.getBytes());
            stream.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }*/
        /*File lugar=new File("./datos.txt");
        try{
            Estudiante e=new Estudiante("pepe","av las banderas");
            Nota materia1=new Nota(51,60,70);
            Nota materia2=new Nota(15,26,45);
            Datos d=new Datos(e);
            d.notas.add(materia1);
            d.notas.add(materia2);
            FileOutputStream fileStream=new FileOutputStream(lugar);
            ObjectOutputStream stream=new ObjectOutputStream(fileStream);
            stream.writeObject(d);
            stream.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }*/
        File lugar=new File("./datos.txt");
        try{
            Datos d;
            FileInputStream fileStream=new FileInputStream(lugar);
            ObjectInputStream stream=new ObjectInputStream(fileStream);
            d=(Datos)stream.readObject();            
            stream.close();
            System.out.println(d.estudiante.nombre);
            System.out.println(d.estudiante.direccion);
            System.out.println(d.notas.get(0).p1);
            System.out.println(d.notas.get(0).p2);
            System.out.println(d.notas.get(0).p3);
            System.out.println(d.notas.get(1).p1);
            System.out.println(d.notas.get(1).p2);
            System.out.println(d.notas.get(1).p3);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace(); 
        }
    }
}
class Datos implements Serializable{
    Estudiante estudiante;
    ArrayList<Nota> notas;
    public Datos(Estudiante e){
        estudiante=e;
        notas=new ArrayList();
    }
}
class Estudiante implements Serializable{
    String nombre,direccion;
    public Estudiante(String n,String d){
        nombre=n;
        direccion=d;
    }
}
class Nota implements Serializable{
    int p1,p2,p3,exfinal;
    public Nota(int p1,int p2,int p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        exfinal=(p1+p2+p3)/3;
    }
}
