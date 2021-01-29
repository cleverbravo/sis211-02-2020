package programa015;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class ListarPacientes extends JFrame{
    JTable tabla;
    Container pane;
    public ListarPacientes(){
        iniciar();
    }    
    public void iniciar(){
        setSize(400,400);
        setTitle("Listar Pacientes");
        pane=getContentPane();
        
        tabla=new JTable();
        pane.add(tabla);
        String []titulos=new String[]{"Nombre","CI","Direccion","Resultado"};
        /*Object [][]datos=new Object[][]{new Object[]{"juancito pinto","123","asdf","Negativo"}
                ,new Object[]{"pinto juancito","123","asdf","Negativo"}};*/
        Object [][]datos=new Object[Programa015.datos.pacientes.size()][4];
        for(int i=0;i<Programa015.datos.pacientes.size();i++)
            datos[i]=new Object[]{Programa015.datos.pacientes.get(i).getNombre(),
            Programa015.datos.pacientes.get(i).getCi(),Programa015.datos.pacientes.get(i).getDireccion(),
            Programa015.datos.pacientes.get(i).getResultado()};
        tabla.setModel(new DefaultTableModel(datos,titulos));
        
    }
}
