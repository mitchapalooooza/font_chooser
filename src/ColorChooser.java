import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
<<<<<<< HEAD
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
||||||| merged common ancestors
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
=======
>>>>>>> 4bbd809f0eca95f3e6783aced8e32f0e732e3138

<<<<<<< HEAD
public class ColorChooser {
	 	 
	//Take JD's code, generate a list of families (first word of font) and a list of styles (full font name)
	public void GenerateFamilyList(){
		 GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); //JD's code to get available names
	     String[] names = ge.getAvailableFontFamilyNames();
	    
	     for ( int x=0; x<names.length; x++ ){
	     	String convertNames= names[x]; //take the list that JD gave us "names" and investigate each individual font
	     	String[] splitName= convertNames.split(" ",2); //for each font, split into two sections: one string before the first space and one string that contains all words after the space 
	     	styles.add(convertNames); //add the whole font to the vector string "styles"
	     		if (!families.contains(splitName[0])) {families.add(splitName[0]);} //add just the first word of the font to the vector string "families", UNLESS the string "families" already contains that word
	     		}
	     }
		     
		  String output = "<html>"  //Create a string of sample text that will be displayed in the Example window, based on the options you choise
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
	  	
		  //Create labeled panes for the foreground, background, and the "example window"
		  JLabel example = new JLabel (output,JLabel.CENTER);
		  JPanel fore_pane = new JPanel();
		  JColorChooser fore_chooser = new JColorChooser();
		  JPanel back_pane = new JPanel();
		  JColorChooser back_chooser = new JColorChooser();
	      JPanel preview = new JPanel(new BorderLayout());
	     
	     
	 	 //initialize a vector string "family" and a vector string "styles"
	 	 //The reason this is a vector string is so that I can easily add strings, and also so it is acceptable to JList
	 	 //I don't care if this in't the best way to do that, it works and I'm rolling with it
	 	     Vector<String> families = new Vector<String>();
	 	     Vector<String> styles = new Vector<String>();
	 	     
	 	 //Create JList for font families that utilizes the Vector<Strings> created in the generate families method
		  	  JLabel font_style_label = new JLabel ("Font Style");
		      JList fontstyles_list = new JList(styles);
		      JScrollPane fonts = new JScrollPane(fontstyles_list);
		      
		 //Create JList for font styles that utilizes the Vector<Strings> created in the generate families method    
			  JLabel font_family_label = new JLabel ("Font Family");
			  JList fontfamily_list = new JList(families);
		      JScrollPane familiespane = new JScrollPane(fontfamily_list);
		  	  

public ColorChooser() {
	GenerateFamilyList();	
	GUI();
		}
	      
public void GUI() {
	//Create the GUI that displays all of the panels, labels and lists we have created
	JFrame main_window = new JFrame();
	
	//Panel one is where the font family information is displayed
		Box panel_one = Box.createVerticalBox();
			panel_one.add(font_family_label);
			familiespane.setPreferredSize(new Dimension(100,0));
			fontfamily_list.setCellRenderer(new FontCellRenderer());
			panel_one.add(Box.createVerticalStrut(15));
	    	panel_one.add(familiespane);
	    	panel_one.add(Box.createVerticalStrut(50));
	
	 // Panel Two is where the font style information is displayed 	
	    Box panel_two = Box.createVerticalBox();
	    	panel_two.add(font_style_label);
	    	fonts.setPreferredSize(new Dimension(100,0));
	    	fontstyles_list.setCellRenderer(new FontCellRenderer());
	    	panel_two.add(Box.createVerticalStrut(15));
	    	panel_two.add(fonts);
	    	panel_two.add(Box.createVerticalStrut(50));
	   
	 //Create the template for the pane by putting in panel one and panel two
		Box panel_template = Box.createHorizontalBox();
			panel_template.add(Box.createHorizontalStrut(20));
			panel_template.add(panel_one);
			panel_template.add(Box.createGlue());
			panel_template.add(panel_two);
			panel_template.add(Box.createGlue());
	
	//Make the whole GUI cool by implementing tabbed panes
	    JTabbedPane jtp1 = new JTabbedPane();
	    jtp1.setFont(new java.awt.Font("Arial", Font.PLAIN,16));			
	    jtp1.addTab("Font Families and Styles", panel_template);
	    jtp1.addTab("Font Color", fore_pane);
	    	fore_chooser.setPreviewPanel(fore_pane);
	    	fore_pane.add(fore_chooser);
	    jtp1.addTab("Background Color", back_pane);
	        back_chooser.setPreviewPanel(back_pane);
	        back_pane.add(back_chooser);	        		       
	
	   //Open one window that serves as the "Text Editor"
	    main_window.add(jtp1);
	    main_window.setVisible(true);
	    main_window.setSize(700,400); 
	    main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    main_window.setTitle("Text Editor");
	  
	   //Open Another window that contains the example text
	    JFrame show_example = new JFrame();
	    show_example.setVisible(true); 
	    show_example.setSize(550,500); 
	    show_example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    show_example.setTitle("Example Text");
	 
	    //Set the example box default characteristics
	    show_example.add(preview);
	    preview.setBackground(Color.WHITE);
	    example.setFont(new Font("Default",Font.PLAIN,20));		
	    preview.add(example);
	
	    //Add an action listener that reacts to when the font style is changed
		fontstyles_list.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent e) {
		    	  String font_selected = fontstyles_list.getSelectedValue().toString();
		    	  example.setFont(new Font(font_selected,Font.PLAIN, 16));
		      }
		    });
	
		
	    //Add an action listener that reacts to when the background color is changed
	    ColorSelectionModel back_mod = back_chooser.getSelectionModel();
	    ChangeListener backgroundchangeListener = new ChangeListener() {
	      public void stateChanged(ChangeEvent changeEvent) {
	        Color back_color = back_chooser.getColor();
	        preview.setBackground(back_color);
	      }
	    };
	    back_mod.addChangeListener(backgroundchangeListener);
	  

	    //Add an action listener that reacts to when the text color is changed is changed
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
||||||| merged common ancestors

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
	      panel_two.add(labelb);
	      //family code
	      
	      panel_two.add(labelc);
	      panel_two.add(fonts);
	      panel_two.add(panel_one);
=======

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
			
>>>>>>> 4bbd809f0eca95f3e6783aced8e32f0e732e3138

public static void main(String[] args) {
	new ColorChooser();
	}
	});
	
}
public static void main(String[] args)
{new DropdownBox();}

}


