package oops;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result= maxof(a,b);
		System.out.println(result);
	}
	
	static int maxof(int a,int b) {
		if(a>b)
		{
			return a ;
		}
		else
		{
			return b;
		}
	}

}
