import java.lang.String;

public class SplitMethod
{
   public static void main ( String [] args )
      {
	   String mystring = "the quick brown fox";
	   String arr[] = mystring.split(" ");

	   String firstWord = arr[0];   //the
	   String theRest = arr[1];     //quick brown fox
      
	   System.out.print(arr[1]);
      }
      
}
