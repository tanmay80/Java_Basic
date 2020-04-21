package array;

import java.util.Scanner;

public class For_Each_loop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10];
		for(int i=0;i<10;i=i+1)
		{
			array[i]=sc.nextInt();
		}
		for(int element: array)
		{
			System.out.println(element);
		}
	}

}
