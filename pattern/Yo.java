package pattern;

import java.util.Scanner;

public class Yo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		
				for(int i=1;i<=5;i=i+1)
				{
				  for(int j=1;j<=i;j=j+1)
				  {
				    System.out.print(j);
				  }
				  for(int k=4;k>=i;k=k-1)
				  {
				    System.out.print("  ");
				  }
				  for(int l=i;l>=1;l=l-1)
				  {
				    System.out.print(l);
				  }
				  System.out.println();
				}
	}

}
