package pattern;

import java.util.Scanner;

public class Missing_star {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println("*");
		
		for(int i=0;i<n-2;i=i+1)
		{
			System.out.print("* ");
			for(int j=0;j<i;j=j+1)
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
		
		for(int i=0;i<n;i=i+1)
		{
			System.out.print("* ");
		}

	}

}
