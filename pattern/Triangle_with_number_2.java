package pattern;

import java.util.Scanner;

public class Triangle_with_number_2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int number=1;
		for(int i=0;i<n;i=i+1)
		{
			for(int j=i;j<n-1;j=j+1)
			{
				System.out.print("   ");
			}
			int a=2*i;
			System.out.print(number+"  ");
			for(int j=0;j<a-1;j=j+1)
			{
				System.out.print("0  ");
			}
			if(i>0)
			{
				System.out.print(number+"  ");
			}
			number=number+1;
			System.out.println();
		}

	}

}
