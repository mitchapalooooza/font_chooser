import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DropdownBox {
	
	JTextField sampleText = new JTextField(); // This makes a text field, where the user can some sample text they want to test their options with
	JLabel sampleText_q = new JLabel ("Enter some sample text here:"); // This displays text, we ask questions with this.

	String[] fontFamilyChoices = {"Family 1","Family 2"}; //Defines the choices in the drop down box for font family
	JComboBox fontFamily = new JComboBox(fontFamilyChoices); // Create a drop down box.
	JLabel fontFamilyLabel = new JLabel ("Font Family");// Label the Desired Box

	String[] fontStyleChoices = {"Style 1","Style 2"}; // Dropdown box for font style
	JComboBox fontStyle = new JComboBox(fontStyleChoices); 
	JLabel fontStyleLabel = new JLabel ("Font Style");
	
	String[] fontColorChoices = {"Color 1","Color 2"}; // Dropdown box for font color
	JComboBox fontColor = new JComboBox(fontColorChoices); 
	JLabel fontColorLabel = new JLabel ("Font Color");
	
	String[] backgroundColorChoices = {"BgColor 1","BgColor 2"}; // Dropdown box for background color
	JComboBox backgroundColor = new JComboBox(backgroundColorChoices); 
	JLabel backgroundColorLabel = new JLabel ("Background Color");
	
	JButton selectOptions = new JButton("Select Options"); // This creates a button.
	
	//JLabel emptyspace = new JLabel (""); //This creates an empty space, so the GUI looks nice.

	
	
	public DropdownBox() {
		
		frame(); // This creates a frame. The frame is the pop up window.
	}
	
public void frame() {
	
	JFrame f = new JFrame();
	f.setVisible(true); // The pop up window is now visible.
	f.setSize(700,500); // The pop up window has these dimensions.
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The pop up window can be closed now by clicking close.
	
	JPanel p = new JPanel(new GridLayout(0,2)); //We must make a panel. The Gridlayout allows us to organize the features in two columns.
	p.add(sampleText_q); // On the panel, we add the different features (JLabel, JComboBox, JButton, etc.)
	p.add(sampleText);
	p.add(fontFamilyLabel);
	p.add(fontFamily);
	p.add(fontStyleLabel);
	p.add(fontStyle);
	p.add(fontColorLabel);
	p.add(fontColor);
	p.add(backgroundColorLabel);
	p.add(backgroundColor);
	p.add(selectOptions);

	f.add(p); // Now we add the panel to the frame.

	//selectOptions.addActionListener(new ActionListener () { //When the button is clicked...
		//public void actionPerformed (ActionEvent e) {
			//String laptoptype_s = laptoptype.getSelectedItem().toString(); // Obtain the answer choice from the drop down box.
			//String computercost_s = computercost.getText();	// Obtain the input in the text field as a string.		
			//double computercost_n = Double.parseDouble(computercost_s); // This converts the string into a double.
			//computer_costcalculations.setText("Computer Cost: $" + computercost_n); // Set the text in the JLabel to this.
			//total_costcalculations.setFont(new Font("Calibri", Font.BOLD, 16));

	//	}
//	});
	
}
	

public static void main(String[] args)
	{
	new DropdownBox();
	}
}