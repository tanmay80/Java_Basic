package loops;

public class ForLoop {
	
	public static void main(String[] args)
	{
//		for(int i=0;i<100;i=i+1)
//		{
//			System.out.println("Hello World"+" "+i);
//		}
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i=i+1)
		{
		fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
