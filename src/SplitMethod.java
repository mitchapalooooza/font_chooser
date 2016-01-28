import java.lang.String;


public class SplitMethod
{
   public static void main ( String [] args )
      {
	   String[] mystring = {"the quick", "brown fox"};
	   String first = mystring[1];
	   String[] firstFirst= first.split(" ");
	  
	   System.out.print(firstFirst[0]);
      }
}


//List<String> list = Arrays.asList(string.split());

//for (int y = 0; y < vehicles.size(); y++) {
//details = (String)vehicles.get(y);
//detail_split = (ArrayList)details.split("$$", -1);

//String string = "004-034556";
//String[] parts = string.split("-");
//String part1 = parts[0]; // 004
//String part2 = parts[1]; // 034556


//String mystring = "the quick brown fox";
//String arr[] = mystring.split(" ");
//String firstWord = arr[0];   //the
//String theRest = arr[1];     //quick brown fox

//System.out.print(arr[1]);