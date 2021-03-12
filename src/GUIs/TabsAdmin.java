/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import static GUIs.Tabs.BUTTONPANEL;
import static GUIs.Tabs.OTHERPANEL;
import static GUIs.Tabs.TEXTPANEL;
import static GUIs.Tabs.WW;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import static java.lang.System.out;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import proyecto1.Login;

/**
 *
 * @author Luciano Xiquín
 */
public class TabsAdmin extends Tabs implements ActionListener{
@Override
public void addComponentToPane(Container pane) {
    TabEst est = new TabEst();
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
    card1.setLayout(new GridLayout(2, 2));
    card1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    est.addComponentToPane(card1);



        JPanel card2 = new JPanel();
        card2.add(new JButton("Crear"));
        card2.add(new JButton("Carga Masiva"));
        card2.add(new JButton("Actualizar"));
        card2.add(new JButton("Eliminar"));
        card2.add(new JButton("Exportar a PDF"));
        card2.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        card2.setLayout(new GridLayout(2,2));
        
        JPanel card3 = new JPanel();
        card3.add(new JButton("Crear"));
        card3.add(new JButton("Carga Masiva"));
        card3.add(new JButton("Actualizar"));
        card3.add(new JButton("Eliminar"));
        card3.add(new JButton("Exportar a PDF"));
        card3.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        card3.setLayout(new GridLayout(2,2));

        tabbedPane.addTab(BUTTONPANEL, card1);
        tabbedPane.addTab(TEXTPANEL, card2);
        tabbedPane.addTab(OTHERPANEL, card3);

        pane.add(tabbedPane, BorderLayout.WEST);
        
}

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("[...]");
    }
}
