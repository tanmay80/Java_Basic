package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Fascinating_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int i=0;i<t;i=i+1)
		    {
		      int j,flag;
		      int n=sc.nextInt();
		      int array[]=new int[10];
		      for(;;)
		      {
		    	flag=1;
		        n=n+1;
		       
		       int temp=n;
		     
		        Arrays.fill(array, 0);
		        while(temp>0)
		        {
		          int last=temp%10;
		          if(array[last]==0)
		          {
		        	  flag=1;
		          array[last]=array[last]+1;
		          }
		          else
		          {
		        	  flag=0;
		        	  break;
		          }
		          temp=temp/10;
		        }
		        if(flag==1)
		        {
		        System.out.println(n);
		        break;
		        }
		      }
		    }
		    
	}

}
