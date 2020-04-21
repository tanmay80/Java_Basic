package userInput;
import java.util.Scanner;
public class ScannerUserInput2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int add=x+y;
		System.out.println(add);

	}

}
