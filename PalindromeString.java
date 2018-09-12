import java.util.*;
public class PalindromeString {
    private static Boolean palindrome(String s)
     {
    	String b="";
    	char ar[]=s.toCharArray();
         for(int i=ar.length-1;i>=0;i--)
        	 b=b+ar[i];
         System.out.println(b);
    	if(b.equals(s))
    	 return true;
    	else
    		return false;
     }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		String s=scan.next();
		System.out.println(palindrome(s));
	}
}
