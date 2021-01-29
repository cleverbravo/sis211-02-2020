package programa015;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditarPaciente extends RegistrarPaciente {
    JButton btnBuscar;
    JComboBox cbResultado;
    JLabel lblResultado;
    Paciente p=null;
    public EditarPaciente(){
        //iniciar();
        super();
    }
    public void iniciar(){
        super.iniciar();
        setTitle("Editar Paciente");
        btnBuscar=new JButton("Buscar");
        btnBuscar.setBounds(70,300,100,30);
        cbResultado=new JComboBox();
        cbResultado.addItem("Positivo");
        cbResultado.addItem("Negativo");
        cbResultado.addItem("N/A Error");
        cbResultado.setBounds(220,110,100,25);
        lblResultado=new JLabel("Resultado");
        lblResultado.setBounds(50,110,100,25);
        pane.add(btnBuscar);
        pane.add(cbResultado);
        pane.add(lblResultado);
        btnBuscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //System.out.println(txtCi.getLocation().x);
                int ci=Integer.parseInt(txtCi.getText());
                for(int i=0;i<Programa015.datos.pacientes.size();i++)
                    if(Programa015.datos.pacientes.get(i).getCi()==ci){
                        p=Programa015.datos.pacientes.get(i);
                        break;
                    }
                if(p==null){
                    JOptionPane.showMessageDialog(null, "El paciente no existe");
                    return;
                }
                txtNombre.setText(p.getNombre());
                txtDireccion.setText(p.getDireccion());
            }
        });
        btnOk.removeActionListener(quitar);
        btnOk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                btnOk.removeActionListener(null);
                p.setResultado(cbResultado.getSelectedItem().toString());
            }
        });
    }
}
