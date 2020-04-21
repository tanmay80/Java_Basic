package pattern;

import java.util.Scanner;

public class MirrorStar_i {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i=i+1)
		{
			for(int j=i;j<n;j=j+1)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
