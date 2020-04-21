package pattern;

import java.util.Scanner;

public class Triangle_with_number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i=i+1)
		{
			int number=1;
			for(int j=i;j<n-1;j=j+1)
			{
				System.out.print("   ");
			}
			int a=2*i;
			for(int j=0;j<=a;j=j+1)
			{
				System.out.print(number+"  ");
				number=number+1;
			}
			System.out.println();
		}

		
	}

}
