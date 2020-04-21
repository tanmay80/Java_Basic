package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet_sum_zero {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int flag=0;
			int n=sc.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i=i+1)
			{
				array[i]=sc.nextInt();
			}
			
			Arrays.sort(array);
			
			int i=0;
			int j=n-1;
			while(i<j) {
				if(array[i]>array[j])
				{
					j=j-1;
				}
				else if(array[i]<array[j])
				{
					i=i+1;
				}
				else
				{
					flag=1;
				}
			}
		}
		

	}

}
