package GUIs;

import static GUIs.Tabs.BUTTONPANEL;
import static GUIs.Tabs.TEXTPANEL;
import static GUIs.Tabs.WW;
import info.Almacenar;
import static info.Almacenar.arreglo_profesores;
import info.Curso;
import info.Profesores;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

import com.google.gson.Gson;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel; 

public class TabEst extends Tabs{   
    Almacenar nuevo_almacenar = new Almacenar();
    @Override
    public void addComponentToPane(Container pane) {
    JRadioButton male = new JRadioButton("Hombre",false);
        JRadioButton female = new JRadioButton("Mujer", false);
        ButtonGroup genero = new ButtonGroup();
        
        genero.add(male);
        genero.add(female);
                JTabbedPane tabbedPane = new JTabbedPane();

        JPanel card1 = new JPanel() {
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        };
        
         /***************** CARGA Y CONVERSION A GSON ***************/
        
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("profesores.json"));
                        
        String linea;
        while((linea = br.readLine()) != null){
            json += linea;
        }         
        br.close();                               
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TabEst.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TabEst.class.getName()).log(Level.SEVERE, null, ex);
        }              
        System.out.println(json);       
        Gson gson = new Gson(); 
        Profesores[] prof_obj = gson.fromJson(json, Profesores[].class); 
         System.out.println(prof_obj[0].getApellido());        
         System.out.println(prof_obj);        
         
        DefaultTableModel tableModel = new DefaultTableModel(); 
                                            // The 0 argument is number rows.
        JTable table = new JTable(tableModel);
        table.setRowHeight(30); 
          card1.add(table);
        tableModel.addColumn("Código");
        tableModel.addColumn("Nombre"); 
        tableModel.addColumn("Apellido"); 
        tableModel.addColumn("Correo"); 
        tableModel.addColumn("Género");  
        for (int i = 0; i < prof_obj.length; i++) {  
            tableModel.insertRow(0, new Object[] { prof_obj[i].getCodigo(),prof_obj[i].getNombre(), prof_obj[i].getApellido(), prof_obj[i].getCorreo(), prof_obj[i].getGenero() }); 
        
        }
      
        /***************** FIN -- CARGA Y CONVERSION A GSON ***************/

        card1.setLayout(new GridLayout(0, 1));
        card1.add(new JLabel("Codigo"));
        card1.add(codigo);

        card1.add(new JLabel("Nombre: "));
        card1.add(nombre);

        card1.add(new JLabel("Apellido:"));
        card1.add(apellido);

        card1.add(new JLabel("Correo Electronico: "));
        card1.add(correo);

        card1.add(new JLabel("Contraseña: "));
        card1.add(password);

        card1.add(new JLabel("Genero"));
        card1.add(male);
        card1.add(female);
        //Botones
        boolean auxiliar;
        if(male.isSelected()== true) {
            auxiliar = true;
        }else{
        auxiliar = false;
        }
        
        
        
     
        
               
        
        
        /// TABLE //
        
        card1.add(new JButton(new AbstractAction("Crear") {
        @Override
        public void actionPerformed(ActionEvent e) {
            nuevo_almacenar.GuardarProfesores(Integer.parseInt(codigo.getText()), nombre.getText(), apellido.getText(), password.getText(), correo.getText(), "1");
        
        }}));
        


        /********************************** PANEL 2 *************/
        
        JPanel card2 = new JPanel() {
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        };
        card2.add(new JButton("Cargar"));
        
        JPanel card3 = new JPanel(){
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        };
        card3.add(new JLabel("Pendiente..."
                + "Primeramente hacer posible su carga"));
        
        JPanel card4 = new JPanel(){
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        }; 
        
        JPanel card5 = new JPanel(){
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        };
        
        tabbedPane.addTab("Crear", card1);
        tabbedPane.addTab("Carga Masiva", card2);
        tabbedPane.addTab("Actualizar", card3);
        tabbedPane.addTab("Eliminar", card4);
        tabbedPane.addTab("Exportar", card5);

        pane.add(tabbedPane, BorderLayout.CENTER);
        
        

    }
}
