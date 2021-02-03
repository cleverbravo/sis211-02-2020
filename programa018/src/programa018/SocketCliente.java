package programa018;

import java.io.*;
import java.net.*;
import java.util.*;

public class SocketCliente {
    String ip;
    int puerto;
    RecibirDatos recibir;
    EnviarDatos enviar;
    public SocketCliente(String ip,int p){
        this.ip=ip;
        puerto=p;
    }
    public void inicar(){
        try{
            Socket cliente=new Socket(ip,puerto);
            enviar=new EnviarDatos(cliente);
            recibir=new RecibirDatos(cliente,null);
            
            enviar.start();
            recibir.start();
        }catch(Exception ex){
            System.out.println("client exception:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
