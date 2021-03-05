
package GUIs;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Luciano Xiquín
 */
public class Tabs {
    final static String BUTTONPANEL = "Profesores";
    final static String TEXTPANEL = "Cursos";
    final static String OTHERPANEL = "Alumnos";
    final static int WW = 100;

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
        JPanel card2 = new JPanel();
        //card2.add(new JTextField("TextField", 20));
        JPanel card3 = new JPanel();
        //card3.add(new JLabel("desu"));

        tabbedPane.addTab(BUTTONPANEL, card1);
        tabbedPane.addTab(TEXTPANEL, card2);

        pane.add(tabbedPane, BorderLayout.CENTER);
        
}
}