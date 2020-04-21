package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Quality {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int array[]=new int[n];
	    int rahul[]=new int[n];
	    for(int i=0;i<n;i=i+1)
	    {
	      array[i]=sc.nextInt();
	    }
	    int sum=0;
	    for(int i=0;i<n;i=i+1)
	    {
	      if(rahul[i]==array[i])
	      {
	        continue;
	      }
	      else if(rahul[i]<array[i])
	      {
	        int temp=array[i]-rahul[i];
	        
	        sum=sum+temp;
	        System.out.println(sum);
	        for(int j=i;j<n;j=j+1)
	        {
	          rahul[j]=rahul[j]+temp;
	        }
	      }
	      else
	      {
	        int temp=rahul[i]-array[i];
	        
	        sum=sum+temp;
	        System.out.println(sum);
	        for(int j=i;j<n;j=j+1)
	        {
	          rahul[j]=rahul[j]-temp;
	        }
	      }
	    }
	    System.out.println(sum);
		    
	}
}