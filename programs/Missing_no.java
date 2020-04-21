package programs;

import java.util.Scanner;

public class Missing_no {

	public static void main(String[] args) {

		    Scanner sc= new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int i=0;i<t;i=i+1)
		    {
		      int n=sc.nextInt();
		      int sum=0;
		      for(int j=0;j<n-1;j=j+1)
		      {
		        int temp=sc.nextInt();
		        sum=sum+temp;
		      }
		      int sums=(n)*(n+1)/2;
		      int missing=sums-sum;
		      System.out.println(missing);
		    }
		    
	}
}