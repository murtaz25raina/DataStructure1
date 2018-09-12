import java.util.*;
public class maxFrequency {
    private static char frequency(String s)
     {
    	char a[]=s.toCharArray();
    	int largest=0,lar=0;
    	int count[]=new int[123];
    	for(int i=0;i<a.length;i++)
    	{
    		count[(int)a[i]]++;
    		if(count[(int)a[i]]>largest)
    		{
    			largest=count[(int)a[i]];
    			lar=i;
    		}
    	}
    	return (char)a[lar];
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		String s=scan.next();
		System.out.println(frequency(s));
	}
}
