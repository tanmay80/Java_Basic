package programs;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
	
		int i = s.length()-1;
		String ans="";
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)==' ')
			{
				i=i-1;
			}
			int j=i;
			while(i>=0 && s.charAt(i)!=' ')
			{
				i=i-1;
			}
			
			if(ans.isEmpty()) {
				ans=ans.concat(s.substring(i+1,j+1));
			}
			else
			{
				ans=ans.concat(" "+s.substring(i+1,j+1));
			}
			
		}
		System.out.println(ans);

	}

}
