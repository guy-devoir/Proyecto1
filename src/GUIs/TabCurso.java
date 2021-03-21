
package GUIs;

import com.google.gson.Gson;
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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TabCurso extends Tabs{
    JTable table = new JTable();
    DefaultTableModel tableModel = new DefaultTableModel();
       @Override
       public void addComponentToPane(Container pane) {
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
        
        //Pestaña 2
        JPanel card2 = new JPanel(){
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        };
        JTextField path = new JTextField();        
        path.setSize(10,1);
        card2.add(path);
        card2.setLayout(new GridLayout(0,1));
        table.setRowHeight(30);    
        card2.add(new JButton(new AbstractAction("Cargar Archivo") {
            /**
             * CARGA Y CONVERSION A GSON
             */
            @Override
               public void actionPerformed(ActionEvent e) {
                   String fichero = path.getText();
                   String json = "";
                   try {
                       BufferedReader br = new BufferedReader(new FileReader(fichero));
                       String linea;
                       while ((linea = br.readLine()) != null) {
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
                   Curso[] curso_obj = gson.fromJson(json, Curso[].class);
                   System.out.println(curso_obj[0].getName());
                   System.out.println(curso_obj);

                   // The 0 argument is number rows.
                   tableModel.addColumn("Código");
                   tableModel.addColumn("Nombre");
                   tableModel.addColumn("Creditos");
                   tableModel.addColumn("Profesor");
                   for (int i = 0; i < curso_obj.length; i++) {
                       tableModel.insertRow(0, new Object[]{curso_obj[i].getId(), curso_obj[i].getName(), curso_obj[i].getCreditos(), curso_obj[i].getProf_id()});
                   }
               }

               /**
                * FIN -- CARGA Y CONVERSION A GSON
                */
           }
           ));
           card2.add(new JLabel(""));
           card2.add(new JLabel(""));
           card2.add(new JLabel(""));
           card2.add(new JLabel(""));
           //Pestaña 2

           //card2.add(new JTextField("TextField", 20));
           JPanel card3 = new JPanel() {
               //Esto se queda aqui
               @Override
               public Dimension getPreferredSize() {
                   Dimension size = super.getPreferredSize();
                   size.width += WW;
                   return size;
               }
           };
           card3.add(table);
           JScrollPane sp = new JScrollPane();
           table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           table.setSize(1000, 1000);
           card3.add(sp);
           JPanel card4 = new JPanel() {
               //Esto se queda aqui
               @Override
               public Dimension getPreferredSize() {
                   Dimension size = super.getPreferredSize();
                   size.width += WW;
                   return size;
               }
           };
           JPanel card5 = new JPanel() {
               //Esto se queda aqui
               @Override
               public Dimension getPreferredSize() {
                   Dimension size = super.getPreferredSize();
                   size.width += WW;
                   return size;
               }
           };
        //card3.add(new JLabel("desu"));
        tabbedPane.addTab("Crear", card1);
        tabbedPane.addTab("Carga Masiva", card2);
        tabbedPane.addTab("Listado Oficial", card3);
        tabbedPane.addTab("Exportar", card4);
        tabbedPane.addTab("Gráfica", card5);
        pane.add(tabbedPane, BorderLayout.CENTER);
        
}
}
