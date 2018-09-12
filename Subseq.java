import java.util.*;
class Subseq{
     
    static void printSubsequences(String s)
    {
    	char ar[]=s.toCharArray();
    	    List<String> results = new ArrayList<String>();
    	    for ( int i = 1; i <= (1<<(ar.length))-1; i++ ) {
    	      StringBuilder builder = new StringBuilder();
    	      for ( int j = 0; j < ar.length; j++ ) {
    	        if ( (i & (1<<j)) != 0) {
    	          builder.append(ar[j]);
    	        }
    	      }
    	      results.add(builder.toString());
    	    }
    	    for(String i:results)
    	    System.out.println( i );
    	 }
    	

    
    public static void main(String[] args) 
    {
        printSubsequences("black");
    }
}