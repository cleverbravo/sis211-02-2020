package programa015;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {
    JButton btnRegistrar,btnEditar,btnListar;
    Container pane;
    public VentanaPrincipal(){
        iniciar();
    }
    public void iniciar(){
        this.setSize(400,400);
        setTitle("ventana principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane=this.getContentPane();
        pane.setLayout(null);
        btnRegistrar=new JButton("Registrar Paciente");
        btnRegistrar.setBounds(100,50,150,30);
        btnEditar=new JButton("Editar Paciente");
        btnEditar.setBounds(100,100,150,30);
        btnListar=new JButton("Listar pacientes");
        btnListar.setBounds(100,150,150,30);
        pane.add(btnRegistrar);
        pane.add(btnEditar);
        pane.add(btnListar);
        
        btnRegistrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //invocar a una nueva ventana
                RegistrarPaciente p=new RegistrarPaciente();
                p.setVisible(true);
            }
        });
        btnEditar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //invocar a una nueva ventana
                EditarPaciente p=new EditarPaciente();
                p.setVisible(true);
            }
        });
        btnListar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //invocar a una nueva ventana
                ListarPacientes v=new ListarPacientes();
                v.setVisible(true);
            }
        });
    }
}
