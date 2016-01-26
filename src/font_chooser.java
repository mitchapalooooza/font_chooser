import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class font_chooser extends JPanel {
 
  public static void main(String[] a){
    JFrame f = new JFrame();
    f.setSize(400,400);
    f.add(new font_chooser());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  
  public void paint(Graphics g) {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

    Font[] allFonts = ge.getAllFonts();

    for (int i = 0; i < allFonts.length; i++) {
      Font f = allFonts[i].deriveFont(10.0f);
      g.setFont(f);

      g.setColor(Color.black);
      g.drawString("Hello!", 10, 20*i);

    }
  }
}