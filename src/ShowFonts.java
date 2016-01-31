import java.awt.GraphicsEnvironment;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class ShowFonts
{
   public static void main ( String [] args )
      {
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      
      ArrayList families = new ArrayList();
      ArrayList styles = new ArrayList();
    

      for ( int x=0; x<3; x++ ){
      	String convertNames= names[x];
      	String[] splitName= convertNames.split(" ",2);
      		if (!families.contains(splitName[0])) {families.add(splitName[0]);}
      		if (!styles.contains(splitName[1])) {styles.add(convertNames);}
      	 System.out.println(families);
      	 System.out.println(styles);
      	
      
      	
      	}
      	
      	//families.add(splitName[0]);
      	
      	//System.out.println(families);
      	
      	
      	//System.out.println(Arrays.toString(convertNames.split(" ", 2)));
      		
      }
}
      
      
      
      
      
   
    /*  public static String getFirstWord(String convertNames){
      	String[] numWord= convertNames.split(" ");
      	return numWord[0];}}
      	
    /*  	public static String getRestWord(String convertNames){
          	String[] restWord= convertNames.split(" ",2);
          	return System.out.println(Arrays.toString(convertNames.split(" ", 2)));
      
     
     
     
          	String o = "This is a string";
          	 System.out.println(Arrays.toString(o.split(" ", 2)));
          
          	 String o = "This is a string";
          	 String [] arr = o.split(" ", 2);

          	 arr[0] // This
          	 arr[1] // is a string
     *?
     
     
      }
}
      /*ArrayList family= new ArrayList();
      
      if (getFirstWord(names[0])==getFirstWord(names[1])){
    	  if (getSecondWord(names[0])==getSecondWord(names[1])){
    		  if (getThirdWord(names[0])==getThirdWord(names[1])){
    			  
    			  if (getFourthWord(names[0])==getFourthWord(names[1])){
    				  System.out.print("This is too big a family");}
    			  else{family.add(getFirstWord(names[0])+getSecondWord(names[0])+getThirdWord(names[0]));}
    			  }
    			  
    		  else{family.add(getFirstWord(names[0])+getSecondWord(names[0]));}
    		else{family.add(getFirstWord(names[0]));}
    		  
    		  
    			  family.add(getFirstWord(names[0]));
    			  getFirstWord(names[0])+getSecondWord(names[0])+getThirdWord(names[0])
    			  
    		  }
    	  }
    	  
    	  
    	  
    	  System.out.print("equal");}
    	  else{family.add(getFirstWord(names[0]));
    	  
    System.out.print(family);
      }
      //System.out.println(getFirstWord(names[0]));
   
      }
  
    public static String getFirstWord(String convertNames){
    	String[] numWord= convertNames.split(" ");
    	
    	return numWord[0];}
    public static String getSecondWord(String convertNames){
        String[] numWord= convertNames.split(" ");
        return numWord[1];}
    public static String getThirdWord(String convertNames){
        String[] numWord= convertNames.split(" ");
        return numWord[2];}
    public static String getFourthWord(String convertNames){
        String[] numWord= convertNames.split(" ");
        return numWord[3];}
    }
    
    
    
    
	for (int j = 0; j < 100; j++) {
		numWord = getFirstWord(names[j])
		Sting[] families = new string[100]
		families[j]= numWord[0];
		String[] types
		for (int z =1; z< numWord.length; z++) {
			types[j] += numWord[z]
		}
    }  
    for (int j = 0; j < 100; j++) {
    	while

//for ( int x=0; x<2; x++ ){
	//String convertNames= names[x];
	 //System.out.println(convertNames);
	  
	  //String[] numWord=convertNames.split(" ");}
      
      
      //x is the order of the list names
     // for ( int x=0; x<names.length; x++ )
   //      {
    	// System.out.println(names[0]+names[1]);

    	  //String convertNames= names[x];  
    	  //System.out.println(convertNames);
    	  
    	// for names[0]
    		//	if numWord[0]= numWord[0] of names[1]
    		//			 add numWord[0] to list "font family"
    		//	if numWord[0] does not equal numWord[0] of names[1]
    	    			
    	  
    	
   	  // 	  String[] numWord=convertNames.split(" ");
    	 
    	  
    	  //numWord[0]
    	  
    	  
    	  */
    	  
    	  
    	  
    	  
    	  
      
   

