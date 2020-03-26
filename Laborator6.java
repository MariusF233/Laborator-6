/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator6;
import java.awt .*;
/**
 *
 * @author me
 */
package laborator6;
import java.awt.BorderLayout;
import java.awt.Container;


import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MainFrame extends JFrame {
 ConfigPanel configPanel;
 ControlPanel controlPanel;
 DrawingPanel canvas;

 public MainFrame() {
 super("My Drawing Application");
 init();
 }

 private void init() {
 setDefaultCloseOperation(EXIT_ON_CLOSE);

 //create the components
 canvas = new DrawingPanel(this);
 configPanel= new ConfigPanel(this);
 controlPanel = new COntrolPanel(this);


 //arrange the components in the container (frame)
 //JFrame uses a BorderLayout by default
 add(canvas, CENTER); //this is BorderLayout.CENTER
 add(configPanel,NORTH);
 add(controlPanel,SOUTH);

 //invoke the layout manager
 pack();
 }
}
