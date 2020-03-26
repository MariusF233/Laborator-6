/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javax.awt.event;
/**
 *
 * @author me
 */
public class ControlPanel extends JPanel {
 final MainFrame frame;
 JButton saveBtn = new JButton("Save");
 //create all buttons (Load, Reset, Exit)
 JButton loadBtn = new  JButton("Load");
 JButton resetBtn = new  JButton("Reset");
 JButton exitBtn = new  JButton("Exit");

 public ControlPanel(MainFrame frame) {
 this.frame = frame; init();
 }
 private void init() {
 //change the default layout manager (just for fun)
 setLayout(new GridLayout(1, 4));
 setLayout(new FlowLayout ())
 //add all buttons ...TODO
    buttonPanel = new JPanel();
    frame.add(buttonPanel,BorderLayout.SOUTH);
   buttonPanel.add(saveBtn("Save"), BorderLayout.SOUTH );
   buttonPanel.add(loadBtn("Load"), BorderLayout.SOUTH );
   buttonPanel.add(resetBtn("Reset"), BorderLayout.SOUTH );
   buttonPanel.add(exitBtn("Exit"), BorderLayout.SOUTH );
 //configure listeners for all buttons
 saveBtn.addActionListener(this::save);
 loadBtn.addActionListener(this::load);
 resetBtn.addActionListener(this::reset);
 exitBtn.addActionListener(this::exit);
 
 }
 private void save(ActionEvent e) {
 try {
 ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
 } catch (IOException ex) { System.err.println(ex); }
 }
 private void load(ActionEvent e){
     try{
        Filereader reader = new FileReader(image);
    textComponent.read(reader, image);
    reader.close();
 }catch (IOException ex) { System.err.println(ex); }
     
 }  
 private void reset(ActionEvent e){
     try{if(e==reset){super.RemoveAll();
     repaint();
     }
     
     }catch (IOException ex) { System.err.println(ex); }
 }
 
 private void exit(ActionEvent e){
 try{System.exit(0);
 
 }catch (IOException ex) { System.err.println(ex); } 
     
 }
 }


