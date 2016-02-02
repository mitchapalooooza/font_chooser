import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleState;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
import java.util.Vector;

public class ColorChooser {

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
		
	  	  JLabel font_family_label = new JLabel ("Font Family");
	  	  //Code for family
	  	  
	  	  JLabel font_style_label = new JLabel ("Font Style");
          GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	      String[] names = ge.getAvailableFontFamilyNames();
	      JList fontstyles_list = new JList(names);
	      JScrollPane fonts = new JScrollPane(fontstyles_list);
	      
	  	JPanel fore_pane = new JPanel();
		JColorChooser fore_chooser = new JColorChooser();
		
		JPanel back_pane = new JPanel();
		JColorChooser back_chooser = new JColorChooser();
		
	      JPanel preview = new JPanel(new BorderLayout());
	      
public ColorChooser() {
		GUI();
		}
	      
public void GUI() {
	
	JFrame main_window = new JFrame();
	
		Box panel_one = Box.createVerticalBox();
			panel_one.add(font_family_label);
			//families.setPreferredSize(new Dimension(500,0));
		    //fontfamilies_list.setCellRenderer(new FontCellRenderer());
			panel_one.add(Box.createVerticalStrut(15));
	    	//panel_one.add(families);
	    	panel_one.add(Box.createVerticalStrut(50));
	    	
	    Box panel_two = Box.createVerticalBox();
	    	panel_two.add(font_style_label);
	    	fonts.setPreferredSize(new Dimension(500,0));
	    	fontstyles_list.setCellRenderer(new FontCellRenderer());
	    	panel_two.add(Box.createVerticalStrut(50));
	    	panel_two.add(fonts);
	    	panel_two.add(Box.createVerticalStrut(50));
	    	
		Box panel_template = Box.createHorizontalBox();
			panel_template.add(Box.createHorizontalStrut(20));
			panel_template.add(panel_one);
			panel_template.add(Box.createGlue());
			panel_template.add(panel_two);
			panel_template.add(Box.createGlue());
			
	    JTabbedPane jtp1 = new JTabbedPane();
	    jtp1.setFont(new java.awt.Font("Arial", Font.PLAIN,16));			
	    jtp1.addTab("Font Families and Styles", panel_one);
	    jtp1.addTab("Font Color", fore_pane);
	    	fore_chooser.setPreviewPanel(fore_pane);
	    	fore_pane.add(fore_chooser);
	    jtp1.addTab("Background Color", back_pane);
	        back_chooser.setPreviewPanel(back_pane);
	        back_pane.add(back_chooser);	        		       
	    	
	    main_window.add(jtp1);
	    main_window.setVisible(true);
	    main_window.setSize(700,400); 
	    main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    main_window.setTitle("Text Editor");
	        
	    JFrame show_example = new JFrame();
	    show_example.setVisible(true); 
	    show_example.setSize(550,500); 
	    show_example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    show_example.setTitle("Example Text");
	    	
	    show_example.add(preview);
	    preview.setBackground(Color.WHITE);
	    example.setFont(new Font("Default",Font.PLAIN,20));		
	    preview.add(example);
	    	
		fontstyles_list.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent e) {
		    	  String font_selected = fontstyles_list.getSelectedValue().toString();
		    	  example.setFont(new Font(font_selected,Font.PLAIN, 16));
		      }
		    });
				
	    ColorSelectionModel back_mod = back_chooser.getSelectionModel();
	    ChangeListener backgroundchangeListener = new ChangeListener() {
	      public void stateChanged(ChangeEvent changeEvent) {
	        Color back_color = back_chooser.getColor();
	        preview.setBackground(back_color);
	      }
	    };
	    back_mod.addChangeListener(backgroundchangeListener);
	    
	    ColorSelectionModel fore_mod = fore_chooser.getSelectionModel();
	    ChangeListener fontchangeListener = new ChangeListener() {
	      public void stateChanged(ChangeEvent changeEvent) {
	        Color fore_color = fore_chooser.getColor();
	        example.setForeground(fore_color);     
	        }
	    };
	    fore_mod.addChangeListener(fontchangeListener);
	}	    	
		    	

class FontCellRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(
        JList list,
        Object value,
        int index,
        boolean isSelected,
        boolean cellHasFocus) {
        JLabel label = (JLabel)super.getListCellRendererComponent(
            list,value,index,isSelected,cellHasFocus);
        Font font = new Font((String)value, Font.PLAIN, 16);
        label.setFont(font);
        return label;
    }
}

public static void main(String[] args) {
	new ColorChooser();
	}
}