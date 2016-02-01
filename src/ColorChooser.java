import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DropdownBox {
	
	String output = "<html>"
  			+ "The quick brown fox jumped over the lazy dog’s back.<br>"
  			+ "Pack my box with five dozen liquor jugs.<br>"
  			+ "Jackdaws love my big sphinx of quartz.<br>"
  			+ "Mr. Jock, TV quiz PhD, bags few lynx.<br>"
  			+ "abcdefghijklmnopqrstuvwxyz<br>"
  			+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>"
  			+ "01234567890<br>"
  			+ "€†™´¸¢©¤°÷½¼¾>¡¿«‘’<¯µ ·¬ªº¶±£\"»®§­¹²³ß×™¨¥<br>"
  			+ "ÀÁÂÃÄÅÆÇÈÉ ÊËÌÍÎÏÐÑÒÓÔ ÕÖØÙÚÛÜÝÞÿ<br>"
  			+ "àáâãäåæçèé êëìíîïðñòóô õöøùúûüýþÿ<br>"
  			+ "!\"#$%&\'()*+,-./:;<=>?@[\\^_z{|}~<br>"
  			+ "uvw wW gq9 2z 5s il17|!j oO08 `'\" ;:,. m nn rn {[()]}u<br>"
  			+ "</html>";
  	  JLabel example = new JLabel (output,JLabel.CENTER);
	
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      JList fontstyles = new JList(names);
      JScrollPane fonts = new JScrollPane(fontstyles);
      class FontCellRenderer extends DefaultListCellRenderer {
    	    public Component getListCellRendererComponent(
    	        JList list,
    	        Object value,
    	        int index,
    	        boolean isSelected,
    	        boolean cellHasFocus) {
    	        JLabel labela = (JLabel)super.getListCellRendererComponent(
    	            list,value,index,isSelected,cellHasFocus);
    	        Font font = new Font((String)value, Font.PLAIN, 16);
    	        labela.setFont(font);
    	        return labela;
    	    }
    	}
      fontstyles.setCellRenderer(new FontCellRenderer());
      JLabel labelb = new JLabel("Font families available:");
      JLabel labelc = new JLabel("Select a style:");
      JButton button1 = new JButton ("Text Color");
      JButton button2 = new JButton ("Background Color");
	
public DropdownBox() {
		
		frame(); // This creates a frame. The frame is the pop up window.
	}
	
public void frame() {
	
	JFrame f = new JFrame();
	f.setVisible(true); // The pop up window is now visible.
	f.setSize(700,500); // The pop up window has these dimensions.
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The pop up window can be closed now by clicking close.
	
	JPanel panel_one = new JPanel();
    panel_one.setLayout(new GridLayout(0,1));
    panel_one.setSize(new Dimension(300, 300));
    
    JPanel panel_two = new JPanel();
    panel_two.setSize(new Dimension(300,300));
    
    JTabbedPane panel_three = new JTabbedPane();
    JColorChooser fore = new JColorChooser();
    JColorChooser back = new JColorChooser();
    panel_three.addTab("Font Styles", panel_two);
    panel_three.addTab("Text Color", fore);
    panel_three.addTab("Background Color", back);
    
    JFrame preview = new JFrame("Preview");
    preview.setLayout(new FlowLayout());
    preview.add(panel_three);
    preview.add(example);
    preview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    preview.setSize(900, 500);
    preview.setVisible(true);
    panel_two.add(labelb);
    //family code
    
    panel_two.add(labelc);
    panel_two.add(fonts);
    panel_two.add(panel_one);

}
}

	selectOptions.addActionListener(new ActionListener () { //When the button is clicked...
		public void actionPerformed (ActionEvent e) {
			String desiredText = sampleText.getText();	// Obtain the input in the text field as a string.		
			String familyChosen = fontFamily.getSelectedItem().toString(); // Obtain the answer choice from the drop down box, add it to a string for the chosen
			String styleChosen = fontStyle.getSelectedItem().toString();
			String foregroundChosen = fontColor.getSelectedItem().toString();
			String bgChosen = backgroundColor.getSelectedItem().toString();
			chosenOptions.setText(familyChosen + styleChosen + foregroundChosen +bgChosen);  //set text in the JLabel equal to the chosen options
			

	}
	});
	
}
public static void main(String[] args)
{new DropdownBox();}

}


