import java.awt.GraphicsEnvironment;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;


public class ShowFonts
{
   public static void main ( String [] args )
      {
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      
      		//initialize a vector string "family" and a vector string "styles"
      		//The reason this is a vector string is so that I can easily add strings, and also so it is acceptable to JComboBox
      		//I don't care if this in't the best way to do that, it works and I'm rolling with it
      Vector<String> families = new Vector<String>();
      Vector<String> styles = new Vector<String>();
    

      for ( int x=0; x<names.length; x++ ){
      	String convertNames= names[x]; //take the list that JD gave us "names" and investigate each individual font
      	String[] splitName= convertNames.split(" ",2); //for each font, split into two sections: one string before the first space and one string that contains all words after the space 
      	styles.add(convertNames); //add the whole font to the vector string "styles"
      		if (!families.contains(splitName[0])) {families.add(splitName[0]);} //add just the first word of the font to the vector string "families", UNLESS the string "families" already contains that word
      }
      	 System.out.println(families);
      	 System.out.println(styles);
      	
      
      	
      	}
}		 