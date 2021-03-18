package GUIs;

import info.Almacenar;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Tabs {
     static String BUTTONPANEL = "Profesores";
     static String TEXTPANEL = "Cursos";
     static String OTHERPANEL = "Alumnos";
     static int WW = 100;
    JTextField codigo = new JTextField("Ingrese sólo números");
    JTextField nombre = new JTextField();
    JTextField apellido = new JTextField();
    JTextField correo = new JTextField();
    JTextField password = new JTextField();
    
    

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