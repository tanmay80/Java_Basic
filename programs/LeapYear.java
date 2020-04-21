package programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
	     Scanner sc= new Scanner(System.in);
	     int n=sc.nextInt(); 
	    for(int i=0;i<n;i=i+1)
	    {
	      int year=sc.nextInt();
	      if(year%4==0)
	      {
	        if(year%100==0)
	        {
	          if(year%400==0)
	          {
	            System.out.println("YES");
	          }
	          else
	          {
	            System.out.println("NO");
	          }
	        }
	        else
	        {
	          System.out.println("YES");
	        }
	      }
	      else
	      {
	        System.out.println("NO");
	      }
	    }

	}

}
