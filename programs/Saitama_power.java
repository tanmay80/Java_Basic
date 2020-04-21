package programs;

import java.util.Scanner;

public class Saitama_power {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int k=0;k<t;k=k+1)
		    {
		      int n=sc.nextInt();
		      int p=sc.nextInt();
		      int array[]=new int[n];
		      for(int i=0;i<n;i=i+1)
		      {
		        array[i]=sc.nextInt();
		      }
		      int sum=0;int temp=0;
		      for(int i=0;i<n-1;i=i+1)
		      {
		        temp=array[i]+p;
		        System.out.println(temp);
		        if(temp>array[i+1])
		        {
		          sum=sum+array[i+1]-array[i];
		          System.out.println(sum);
		        }
		        else
		        {
		          sum=sum+p;
		          System.out.println(sum);
		        }
		      }
		      sum=sum+p;
		      System.out.println(sum);
		    }

	}

}
