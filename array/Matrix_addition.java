package array;

import java.util.Scanner;

public class Matrix_addition {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int a[][]= new int[row][column];
		int b[][]= new int[row][column];
		int c[][]= new int[row][column];
		
		for(int i=0;i<row;i=i+1)
		{
			for(int j=0;j<column;j=j+1)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i=i+1)
		{
			for(int j=0;j<column;j=j+1)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i=i+1)
		{
			for(int j=0;j<column;j=j+1)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<row;i=i+1)
		{
			for(int j=0;j<column;j=j+1)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
