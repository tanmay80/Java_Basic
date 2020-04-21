package programs;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int fact=1;
		for(int i=n;i>1;i=i-1)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

}
