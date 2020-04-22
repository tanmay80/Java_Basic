package queue;

import java.util.*;

public class Implement_queue_using_two_stack {

	static Stack<Integer> stack1=new Stack<>();
	static Stack<Integer> stack2=new Stack<>();
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many value you want to enter in the queue");
		int n=sc.nextInt();
		for(int i=0;i<n;i=i+1)
		{
			System.out.println("Enter the number");
			int number=sc.nextInt();
			Stack_push(number);
			
			System.out.println("Do You Want to pop the value");
			char reply=sc.next().charAt(0);
			if(reply=='y')
			{
				System.out.println("How many value you want to pop?");
				int number_to_pop=sc.nextInt();
				Stack_pop(number_to_pop);
			}
			else
			{
				continue;
			}
		}
	}
	
			static void Stack_pop(int number_to_pop) {
				int count=0;
					if(!stack2.isEmpty())
					{
						while(!stack2.isEmpty())
						{
							if(count==number_to_pop)
							{
								//System.out.println("dasd");
								return;
							}
							count=count+1;
							
							int temp=stack2.pop();
							System.out.println(temp);
						}
					}
					if(count==number_to_pop)
					{
						return;
					}
					if(!stack1.isEmpty())
					{
						while(!stack1.isEmpty())
						{
							stack2.push(stack1.pop());
						}
					}
					else
					{
							System.out.println("There is No value in the queue");
							return;
					}
						Stack_pop(number_to_pop-count);
			}
	

	
	static void Stack_push(int number) {
		
		stack1.push(number);
		
	}	
}
