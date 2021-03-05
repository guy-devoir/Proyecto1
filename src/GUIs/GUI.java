/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Luciano Xiquín
 */
public class GUI {
    JFrame frame = new JFrame();
    JFrame out = new JFrame();
    JPanel panel = new JPanel();
    JButton regresar = new JButton("Cerrar Sesión");
    JLabel label = new JLabel();
    
    public void launch(){
        Tabs demo = new Tabs();
        demo.addComponentToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
}
