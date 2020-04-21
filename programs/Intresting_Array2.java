package programs;

import java.util.Scanner;

public class Intresting_Array2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int p=0;p<t;p=p+1)
		{
			int n=sc.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i=i+1)
			{
				array[i]=sc.nextInt();
			}
			int max=0;int min=100000;
			int k=sc.nextInt();
			int l=0;int r=n-1;int flag=0;
			while (l < r) {
				int currentSum = array[l] + array[r];
				if (currentSum == k) {
					flag=1;
					if(max<r)
					{
						max=r;
					}
					if(min>l)
					{
						min=l;
					}
					l++;
					r--;
				} else if (array[l] + array[r] < k)
					l++;
				else
					r--;
			}
			if(flag==0)
			{
			  System.out.println("no answer");
			}
			else
			{
			System.out.println(min+" "+max);
			}

	}

	}

}
