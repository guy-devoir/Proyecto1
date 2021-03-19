package GUIs;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import proyecto1.Login;

public class AdminGUI extends GUI implements ActionListener{
    
    @Override
    public void launch(){
        JScrollPane sp = new JScrollPane();
        
        frame.setTitle("Admin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        out.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        out.setTitle("Admin");
        out.add(panel);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        panel.add(regresar);
        regresar.addActionListener(this);

        TabsAdmin demo = new TabsAdmin();
        //demo.addComponentToPane(frame.getContentPane());
        //Añadí al panel del
        demo.addComponentToPane(panel);
        
        out.setSize(50, 50);
        out.pack();
        out.setVisible(true);
        
        /*frame.pack();
        frame.setVisible(true);
        */
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Login login = new Login();
        login.launch();
        frame.setVisible(false);
        out.setVisible(false);
        
    }
    
}
