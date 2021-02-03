package programa018;

import java.io.DataOutputStream;
import java.net.Socket;

public class EnviarDatos extends Thread{
    String distribuirMensaje=null;//Cola,convertir a arraylist
    Socket clienteConectado;
    DataOutputStream outStream;
    public void setDistribuirMensaje(String d){
        distribuirMensaje=d;
    }
    public EnviarDatos(Socket cliente){
        clienteConectado=cliente;
    }
    public void run(){
        try{
            outStream=new DataOutputStream(clienteConectado.getOutputStream());
            while(true){
                while(distribuirMensaje==null)Thread.sleep(200); 
                System.out.println("enviando:"+distribuirMensaje);
                outStream.writeUTF(distribuirMensaje);
                distribuirMensaje=null;
            }
        }catch(Exception ex){
            System.out.println("server exception:"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}