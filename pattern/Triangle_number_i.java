package pattern;

import java.util.Scanner;

public class Triangle_number_i {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int number=1;
		for(int i=0;i<n;i=i+1)
		{
			for(int j=i;j<n-1;j=j+1)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j=j+1)
			{
				System.out.print(number+++"  ");
			}
			System.out.println();
		}

	}

}
