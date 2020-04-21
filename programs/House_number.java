package programs;

import java.util.Scanner;

public class House_number {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		   long t=sc.nextInt();
		   for(int i=0;i<t;i=i+1)
		   {
		     long n=sc.nextInt();long sum=0;
		     long digits=0;
		     for(int j=1;j<=n;j=j+1)
		     {
		        digits=(int) (Math.log10(j)+1);
		        sum=sum+digits;
		     }
		     System.out.println(sum);

	}
	}
}
