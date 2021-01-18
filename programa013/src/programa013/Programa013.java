package programa013;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Programa013 {
    public static void main(String[] args) {
        // sumar dos numeros enteros
        Ventana v=new Ventana();
        v.setVisible(true);
    }    
}

class Ventana extends JFrame{
    JTextField txta,txtb;
    JButton btnSumar;
    Container pane;
    public Ventana(){
        //inicializar valores
        setSize(400,400);
        setTitle("programa para sumar dos números");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txta=new JTextField();
        txta.setSize(100,20);
        pane=getContentPane();
        pane.setLayout(null);
        pane.add(txta);
        txta.setLocation(150,10);
        
        txtb=new JTextField();
        txtb.setBounds(150,35,100,20);
        pane.add(txtb);
        
        btnSumar=new JButton("sumar");        
        btnSumar.setBounds(150,60,100,25);
        pane.add(btnSumar);
        
        
        btnSumar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(txta.getText());
                int b=Integer.parseInt(txtb.getText());
                int c=a+b;
                JOptionPane.showMessageDialog(null, "suma="+c);
            }
        });
        Font f=new Font("Arial",Font.BOLD,20);
        txta.setFont(f);
        txtb.setFont(f);
    }
}
/*class ClickEnElBoton implements ActionListener{
    JTextField txta,txtb;
    public ClickEnElBoton(JTextField a,JTextField b){
        this.txta=a;
        this.txtb=b;
    }
    
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(txta.getText());
        int b=Integer.parseInt(txtb.getText());
        int c=a+b;
        //System.out.println("hiciste click, la suma es:"+c);
        JOptionPane.showMessageDialog(null, "suma="+c);
    }
}*/
