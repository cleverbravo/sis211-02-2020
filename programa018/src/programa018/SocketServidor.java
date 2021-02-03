package programa018;

import java.io.*;
import java.net.*;
import java.util.*;

public class SocketServidor extends Thread{
    int puerto;
    ArrayList<AtenderCliente>clientes;
    public SocketServidor(int p){
        puerto=p;
        clientes=new ArrayList();
    }
    public void distribuir(String mensaje){
        for(AtenderCliente ac:clientes){
            ac.enviar.setDistribuirMensaje(mensaje);
        }
    }
    private void iniciar(){
        try{
            ServerSocket servidor=new ServerSocket(puerto);
            while(true){
                Socket clienteConectado=servidor.accept();
                AtenderCliente atender=new AtenderCliente(clienteConectado,this);
                clientes.add(atender);
                atender.run();
            }
        }catch(Exception ex){
            System.out.println("server exception:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
    public void run(){
        iniciar();
    }
}

class AtenderCliente/* extends Thread*/{
    String distribuirMensaje=null;
    String ok="::::ok::";
    String hayMensajes="::::hayMensajes::";
    Socket clienteConectado;
    RecibirDatos recibir;
    EnviarDatos enviar;
    SocketServidor instanciaServidor;
    public AtenderCliente(Socket cliente,SocketServidor instancia){
        clienteConectado=cliente;
        instanciaServidor=instancia;
    }
    public void run(){
        try{
            recibir=new RecibirDatos(clienteConectado,instanciaServidor);
            enviar=new EnviarDatos(clienteConectado);
            /*while(true)*/{
                recibir.start();
                enviar.start();
            }
        }catch(Exception ex){
            System.out.println("server exception:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}

