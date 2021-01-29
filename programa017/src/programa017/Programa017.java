package programa017;
import java.io.*;
import java.util.*;
import java.net.*;
public class Programa017 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin=new Scanner(System.in);
        System.out.println("Usted desea sera el:");
        System.out.println("1.- Servidor");
        System.out.println("2.- Cliente");
        int op=cin.nextInt();
        switch(op){
            case 1:
                Servidor s=new Servidor();
                s.iniciar();
                break;
            case 2:
                Cliente c=new Cliente();
                c.iniciar();
                break;
            default:
                System.out.println("error");
        }
    }
}
class Cliente{
    public void iniciar(){
        try{
            Socket cliente=new Socket("192.168.100.59",9000);
            DataOutputStream stream=new DataOutputStream(cliente.getOutputStream());
            DataInputStream inputStream=new DataInputStream(cliente.getInputStream());
            stream.writeUTF("hola a todos");
            stream.flush();
            String respuesta=inputStream.readUTF();
            System.out.println("la respuesta del servidor es:"+respuesta);
            stream.close();
            cliente.close();
        }catch(Exception ex){
            System.out.println("client exception:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
class Servidor{
    public void iniciar(){
        try{
            ServerSocket servidor=new ServerSocket(9000);
            Socket cliente=servidor.accept();
            DataInputStream stream=new DataInputStream(cliente.getInputStream());
            String mensaje=stream.readUTF();
            System.out.println("El cliente mando:"+mensaje);
            DataOutputStream outStream=new DataOutputStream(cliente.getOutputStream());
            outStream.writeUTF("okey");
            cliente.close();
            servidor.close();
        }catch(Exception ex){
            System.out.println("server exception:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
