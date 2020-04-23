package queue;

import java.util.*;

public class Implement_queue_using_single_stack {

	static Stack<Integer> stack=new Stack<>();
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many value you want to enter in the queue");
		int n=sc.nextInt();
		for(int i=0;i<n;i=i+1)
		{
			System.out.println("Enter the number");
			int number=sc.nextInt();
			stack.push(number);
			
			System.out.println("Do You Want to pop the value");
			char reply=sc.next().charAt(0);
			if(reply=='y')
			{
				System.out.println("How many value you want to pop?");
				int number_to_pop=sc.nextInt();
				while(number_to_pop>0)
				{
					if(stack.isEmpty())
					{
						System.out.println("Stack is Empty");
						break;
					}
					reverse();
					number_to_pop-=1;
				}
			}
			else
			{
				continue;
			}
		}

	}
	
	static void reverse()
	{
		if(stack.size()==1)
		{
			System.out.println(stack.pop());
			return;
		}
		int temp=stack.pop();
		reverse();
		stack.push(temp);
	}

}
