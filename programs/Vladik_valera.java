package programs;

import java.util.Scanner;

public class Vladik_valera {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int valera=sc.nextInt();
		int vladik=sc.nextInt();
		int flag=1;
		for(;;)
		{
			int i=1;
			if(flag==0)
			  {
			    valera-=i;
			    i=i+1;
			    if(valera<0)
			    {
			    	break;
			    }
			    flag=1;
			  }
			if(flag==1)
			  {
			    vladik-=i;
			    i=i+1;
			    if(vladik<0) 
			    {
			    	break;
			    }
			    flag=0;
			  } 
			}

			if(flag==0)
			{
				System.out.println("Vladik");
			}
			//print(vladik)
			if(flag==1) {
				System.out.println("Valera");
			}

		}

	}