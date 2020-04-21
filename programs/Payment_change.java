package programs;

import java.util.Scanner;

public class Payment_change {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		int b=sc.nextInt();
		int s=sc.nextInt();
		int flag=0;
		int bnote;
		int anote=s/n;
		if(a<=anote)
		{
			bnote=s-(anote*n);
			if(b>=bnote)
			{
				flag=1;
			}
		}
		else
		{
			bnote=s-(a*n);
			if(b>=bnote)
			{
				flag=1;
			}
		}
		
		if(flag==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		

	}

}
