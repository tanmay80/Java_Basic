package string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		    Scanner sc= new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int i=0;i<t;i=i+1)
		    {
		      String o=sc.next();
		      String f=sc.next();
		      int ol=o.length();
		      int fl=f.length();
		      if(fl!=ol)
		      {
		        System.out.println("No");
		        continue;
		      }
		      else
		      {
		    	  String ans= f.substring(2) + f.substring(0,2);
		    	  String ans1=f.substring(fl-2,fl)+f.substring(0,fl-2);
		    	  System.out.println(ans+" "+o);
		    	  System.out.println(ans1+" "+o);
		    	  if(f.equals(o))
		    	  {
		    		  System.out.println("Yes");
		    	  }
		   
		    	  else
		    	  {
		    		  System.out.println("No");
		    	  }
		    	  
		      }
		    }
	}
}
	