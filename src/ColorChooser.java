import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleState;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ColorChooser extends JComboBox {
	public static void main(String[] args) {
	
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
	      
	      ArrayList families = new ArrayList();
	      ArrayList styles = new ArrayList();
	    
	      for ( int x=0; x<names.length; x++ ){
	      	String convertNames= names[x];
	      	String[] splitName= convertNames.split(" ",2);
	      		if (!families.contains(splitName[0])) {families.add(splitName[0]);}
	      		if (!styles.contains(splitName[1])) {styles.add(convertNames);}
	      	 System.out.println(families);
	      	 System.out.println(styles);
	      
	      panel_two.add(labelb);
	      panel_two.add(families);
	      panel_two.add(labelc);
	      panel_two.add(fonts);
	      panel_two.add(panel_one);

	}
}
}