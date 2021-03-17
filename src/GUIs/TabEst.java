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
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

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
        card1.add(contraseña);

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
        //Aqui tengo mi problema con el Arreglo... Eso si puedieras ver el metodo tambíén, yo no soy cual será el problema
        card1.add(new JButton(new AbstractAction("Crear") {
        @Override
        public void actionPerformed(ActionEvent e) {
            nuevo_almacenar.GuardarProfesores(Integer.parseInt(codigo.getText()), nombre.getText(), apellido.getText(), correo.getText(), contraseña.getText(), auxiliar);
        }}));
        
        
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
