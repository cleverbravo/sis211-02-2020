package programa018;

import java.io.*;
import java.net.*;
import javax.swing.*;

public class RecibirDatos extends Thread{
    Socket clienteConectado;
    SocketServidor instanciaServidor;
    JTextArea mostrar;
    public RecibirDatos(Socket cliente,SocketServidor instancia){
        clienteConectado=cliente;
        instanciaServidor=instancia;
    }
    public void run(){
        try{
            DataInputStream stream=new DataInputStream(clienteConectado.getInputStream());
            while(true){
                String mensaje=stream.readUTF();
                System.out.println("El cliente mando:"+mensaje);
                if(instanciaServidor!=null)
                    instanciaServidor.distribuir(mensaje);
                if(mostrar!=null)
                    mostrar.setText(mostrar.getText()+"\n"+mensaje);
            }
        }catch(Exception ex){
            System.out.println("server exception:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
    public void setMostrar(JTextArea txt){
        mostrar=txt;
    }
}
