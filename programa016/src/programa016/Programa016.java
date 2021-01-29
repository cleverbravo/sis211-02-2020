package programa016;
//hilos = threads

public class Programa016 {
    public static void main(String[] args) {
        Hilo hilo=new Hilo();
        hilo.start();
        Algo a=new Algo();
        for(int i=0;i<100000;i++){
            System.out.println("main i="+i);
        }
    }
}
/*class Hilo{
    public void run(){
       for(int h=0;h<1000;h++){
            System.out.println("Hilo h="+h);
       } 
    }
}*/
class Algo{
    
}
class Hilo extends Thread{
    public void run(){
        Algo a=new Algo();
       for(int h=0;h<100000;h++){
            System.out.println("Hilo h="+h);
       } 
    }
}
