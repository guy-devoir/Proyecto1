package GUIs;

import static GUIs.Tabs.BUTTONPANEL;
import static GUIs.Tabs.TEXTPANEL;
import static GUIs.Tabs.WW;
import com.google.gson.Gson;
import info.Estudiantes;
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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TabAlum extends Tabs{
    DefaultTableModel tableModel = new DefaultTableModel();
    JTable table = new JTable(tableModel);
    
    JRadioButton male2 = new JRadioButton("Hombre",false);
        JRadioButton female = new JRadioButton("Mujer", false);
        ButtonGroup genero = new ButtonGroup();
        

       @Override
        
       public void addComponentToPane(Container pane) {
        JTabbedPane tabbedPane = new JTabbedPane();
           genero.add(male2);
           genero.add(female);

        JPanel card1 = new JPanel() {
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        };
        /*card1.add(new JButton("Button 1"));
        card1.add(new JButton("Button 2"));
        card1.add(new JButton("Button 3"));
*/
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
                Estudiantes[] obj = gson.fromJson(json, Estudiantes[].class);
                System.out.println(obj[0].getApellido());
                System.out.println(obj);

                // The 0 argument is number rows.
                tableModel.addColumn("Código");
                tableModel.addColumn("Nombre");
                tableModel.addColumn("Apellido");
                tableModel.addColumn("Correo");
                tableModel.addColumn("Contraseña");
                tableModel.addColumn("Género");
                for (int i = 0; i < obj.length; i++) {
                    tableModel.insertRow(0, new Object[]{obj[i].getCodigo(), obj[i].getNombre(), obj[i].getApellido(), obj[i].getCorreo(), obj[i].getGenero()});

                }
            }

            /**
             * FIN -- CARGA Y CONVERSION A GSON
             */
        }
        ));
        //card2.add(new JTextField("TextField", 20));
        JPanel card3 = new JPanel(){
            //Esto se queda aqui
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += WW;
                return size;
            }
        };
        //card3.add(new JLabel("desu"));
        tabbedPane.addTab(BUTTONPANEL, card1);
        tabbedPane.addTab(TEXTPANEL, card2);
        pane.add(tabbedPane, BorderLayout.CENTER);
        
}
}