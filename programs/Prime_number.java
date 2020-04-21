package programs;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Prime_number {

	public static void main(String[] args) {
		    
		    Scanner sc= new Scanner(System.in);
		    
		    int t=sc.nextInt();
		    for(int i=0;i<t;i=i+1)
		    {
		      int n=sc.nextInt();
		      int[] array= new int[n];
		      for(int j=0;j<n;j=j+1)
		      {
			        int flag=0;
			        array[j]=sc.nextInt();
			        if(array[j]==1)
			        {
			        	continue;
			        }
			        int sqrt=(int)Math.sqrt(array[j]);
			        for(int k=2;k<=sqrt;k=k+1)
				      {
				        if(array[j]%k==0)
				        {
				          flag=1;
				          break;
				        }
				        else
				        {
				          flag=0;
				        }
				      }
				     if(flag==0)
				     System.out.print(array[j]+" ");
		      }
		      System.out.println();
		      
		    }
		    
		  }
}
