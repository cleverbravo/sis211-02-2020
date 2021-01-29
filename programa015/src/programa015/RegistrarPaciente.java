package programa015;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RegistrarPaciente extends JFrame {
    JTextField txtNombre,txtCi,txtDireccion;
    JLabel lblNombre,lblCi,lblDireccion;
    JButton btnOk;
    Container pane;
    ActionListener quitar;
    public RegistrarPaciente(){
        iniciar();
    }
    public void iniciar(){
        pane=getContentPane();
        setSize(400,400);
        setTitle("Registrar Paciente");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lblNombre=new JLabel("Nombre:");
        lblNombre.setBounds(50,20,150,25);
        lblCi=new JLabel("CI:");
        lblCi.setBounds(50,50,150,25);
        lblDireccion=new JLabel("Direccion:");
        lblDireccion.setBounds(50,80,150,25);
        
        txtNombre=new JTextField();
        txtNombre.setBounds(220,20,150,25);
        txtCi=new JTextField();
        txtCi.setBounds(220,50,150,25);
        txtDireccion=new JTextField();
        txtDireccion.setBounds(220,80,150,25);
        
        pane.setLayout(null);
        btnOk=new JButton("OK");
        btnOk.setBounds(180,300,100,30);
        pane.add(lblNombre);
        pane.add(lblCi);
        pane.add(lblDireccion);
        pane.add(txtNombre);
        pane.add(txtCi);
        pane.add(txtDireccion);
        pane.add(btnOk);
        
        btnOk.addActionListener(quitar=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Paciente nuevo=new Paciente();
                nuevo.setCi(Integer.parseInt(txtCi.getText()));
                nuevo.setDireccion(txtDireccion.getText());
                nuevo.setNombre(txtNombre.getText());
                nuevo.setResultado("En proceso");
                Programa015.datos.pacientes.add(nuevo);
                JOptionPane.showMessageDialog(null, "Paciente Registrado");
                RegistrarPaciente.this.dispose();
            }
        });
    }
}
