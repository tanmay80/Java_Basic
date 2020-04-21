package programs;

import java.util.Scanner;

public class Operation_on_matrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int array1[][]=new int[m][n];
		int array2[][]=new int[m][n];
		for(int i=0;i<m;i=i+1)
		{
			for(int j=0;j<n;j=j+1)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i=i+1)
		{
			for(int j=0;j<n;j=j+1)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		//Matrix Addition
		int addition[][]=new int[m][n];
		
		for(int i=0;i<m;i=i+1)
		{
			for(int j=0;j<n;j=j+1)
			{
				addition[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		//Matrix Multiplication
		int multiplication[][]=new int[m][n];
		int sum;
		for(int i=0;i<m;i=i+1)
		{
			for(int j=0;j<n;j=j+1)
			{sum=0;
				for(int k=0;k<m;k=k+1)
				{
					sum=sum+array1[i][k]*array2[k][j];
				}
				multiplication[i][j]=sum;
			}
		}
		
		//PrintingOfAddition
		for(int i=0;i<m;i=i+1)
		{
			for(int j=0;j<n;j=j+1)
			{
				System.out.print(addition[i][j]+" ");
			}
			System.out.println();
		}
		
		//PrintingOfMultiplication
		for(int i=0;i<m;i=i+1)
			{
				for(int j=0;j<n;j=j+1)
				{
					System.out.print(multiplication[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
