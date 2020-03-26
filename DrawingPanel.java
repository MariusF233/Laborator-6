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
public class DrawingPanel extends JPanel {
 final MainFrame frame;
 final static int W = 800, H = 600;
 BufferedImage image; //the offscreen image
 Graphics2D graphics; //the "tools" needed to draw in the image
 public DrawingPanel(MainFrame frame) {
 this.frame = frame; createOffscreenImage(); init();
 }
 private void createOffscreenImage() {
 image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
 graphics = image.createGraphics();
 graphics.setColor(Color.WHITE); //fill the image with white
 graphics.fillRect(0, 0, W, H);
 }

private void init() {
 setPreferredSize(new Dimension(W, H)); //don’t use setSize. Why?
 setBorder(BorderFactory.createEtchedBorder()); //for fun
 this.addMouseListener(new MouseAdapter() {
 @Override
 public void mousePressed(MouseEvent e) {
 drawShape(e.getX(), e.getY()); repaint();
 } //Can’t use lambdas, JavaFX does a better job in these cases
 });
 }
 private void drawShape(int x, int y) {
 int radius = (int)(100*MATH.random()); //generate a random number
 int sides = getSides(); //get the value from UI (in ConfigPanel)
 Color color = new Color(c1); //create a transparent random Color.
 float c1=MATH.random();
 graphics.setColor(color);
 graphics.fill(new RegularPolygon(x, y, radius, sides));
 }
 @Override
 public void update(Graphics g) { } //Why did I do that?

 @Override
 protected void paintComponent(Graphics g) {
 g.drawImage(image, 0, 0, this);
 }
}
