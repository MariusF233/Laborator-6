/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator6;
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
public class ConfigPanel extends JPanel {
 final MainFrame frame;
 JLabel label; // we’re drawing regular polygons
 JSpinner sidesField; // number of sides
 JComboBox colorCombo; // the color of the shape

 public ConfigPanel(MainFrame frame) {
 this.frame = frame;
 init();
 }
 private void init() {
 //create the label and the spinner
 sidesLabel = new JLabel("Number of sides:");
 sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
 sidesField.setValue(6); //default number of sides
 
 //create the colorCombo, containing the values: Random and Black
colorCombo = new JComboBox(Random,Black);
 add(sidesLabel); //JPanel uses FlowLayout by default
 add(sidesField);
 add(colorCombo);
 }
}
