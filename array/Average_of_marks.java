package array;

import java.util.Scanner;

public class Average_of_marks {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i=i+1)
		{
			array[i]=sc.nextInt();
		}
		int average=0;
		for(int i=0;i<n;i=i+1)
		{
			average+=array[i];
		}
		average=average/n;
		System.out.println(average);
	}

}
