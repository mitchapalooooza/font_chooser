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
      
      Vector<String> families = new Vector<>();
      Vector<String> styles = new Vector<>();			
      String[][] full = new String[names.length][5];
      
      for ( int x=0; x<names.length; x++ ){
      	String convertNames= names[x];
      	ArrayList<String> wordArrayList = new ArrayList<String>();
      		for(String word : convertNames.split(" ")) {
      			wordArrayList.add(word);}
      		for (int y = 0; y< wordArrayList.size(); y++) {
      			full[x][y] = wordArrayList.get(y);
      			//if (wordArrayList.get(y)==null){full[x][y]=" ";}
      					}
      		
  
     
//THIS CODE DOESENT WORK BECAUSE IT WONT TAKE "null"      
      for(int z = 1; z < names.length; z++) { 
    	  String convertNames1= names[z-1];
    	  int repeat= 0;
    		  if (!full[z][0].equals(full[z-1][0])) {
    			  families.add(full[z-1][0]);}
    		  else{
    			  if (!full[z][1].equals(full[z-1][1])) {
    				  families.add(full[z-1][1]);}
    			  else{
        			  if (!full[z][2].equals(full[z-1][2])) {
        				  families.add(full[z-1][2]);}
        			  else{
            			  if (!full[z][3].equals(full[z-1][3])) {
            				  families.add(full[z-1][3]);}
            			  else{
                			  if (!full[z][4].equals(full[z-1][4])) {
                				  families.add(full[z-1][0]);}
                			  }}}
    		  }}}
      }
      }

    		  
    		  
/*    		  
    		  families.add(full[z][0]);
    		  styles.add(full[z][1]+" "+full[z][2]+" "+full[z][3]+" "+ full[z][4]);}
    	  else {families.add("equal");}
      }
    	  
  System.out.println(families);
  System.out.println(styles);
      }}
  
convertNames.split(" ", repeat);

    	  
   /* 	  	  
    		
    		  for(int z = 1; z < names.length; z++) {  
    	  if (!full[z][0].equals(full[z-1][0])) {families.add(full[z][0]);}
    	  else{if (!full[z][1].equals(full[z-1][1])) {families.add(full[z][0]+full[z][1]);}
		  else{
			  if (!full[z][2].equals(full[z-1][2])) {families.add(full[z][0]+full[z][1]+full[z][2]);}
		    		  else{
		    			  if (!full[z][3].equals(full[z-1][3])) {families.add(full[z][0]+full[z][1]+full[z][2]+full[z][3]);}
		    		    		  else{
		    		    				if (!full[z][4].equals(full[z-1][4])) {families.add(full[z][0]+full[z][1]+full[z][2]+full[z][3]+full[z][4]);}
		    		    		    		  else{System.out.println("This family is giant");}
		    		    		  }}}}}
    		  
    		  
    /*		  
    		  if (!full[z][1].equals(full[z-1][1])) {families.add(full[z][1]);}
    
    		  else{
    		  if (!full[z][2].equals(full[z-1][2])) {families.add(full[z][2]);}
    		  else{
    		  if (!full[z][3].equals(full[z-1][3])) {families.add(full[z][3]);}
    		  else{
    		  if (!full[z][4].equals(full[z-1][4])) {
    			  families.add(full[z][4]);
    			  families.add(full[z-1][4]);}
    	    		  }}}}}
      
    	  
    	  
    	  
    	  
    	  System.out.println(families);
}
}

/*    	
    		      	  if (full[z][0].equals(full[z+1][0])) {
    		  if (full[z][1].equals(full[z+1][1])) {
    			  if (full[z][2].equals(full[z+1][2])) {
    	    		  if (full[z][3].equals(full[z+1][3])) {
    	    			  if (full[z][4].equals(full[z+1][4])) {System.out.print("This family is giant");}
    	    			  else {families.add(full[z][4]);}}
    	    		else {families.add(full[z][3]);}}
    	    		else {families.add(full[z][2]);}}
    	    		else {families.add(full[z][1]);}}
    	    		else {families.add(full[z][0]);}}
    	
    		  
    		  families.add(full[z][0]);}
    	  
    	  
    	  (!full[z][0].equals(full[z+1][0])) {families.add(full[z][0]);}
      }
      		
      }
      }

      

      

      



/*
    for(int z = 0, n = 0; z < names.length && n < names.length; z++, n++) {
    	if (!full[z][n].equals(full[z+1][n])) {families.add(full[z][n]);}
    	else{System.out.print("equal");}
          
    for(int z = 0; z < names.length; z++) {
    	  System.out.println(full[z][0]);
    System.out.println(families);
    System.out.println(full[]);
    		 */
    	 
    	  
      