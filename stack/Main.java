package stack;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner sc=new Scanner(System.in);
    Stack<Integer> stack=new Stack<Integer>();
    int n=sc.nextInt();
    for(int i=0;i<n;i=i+1)
    {
      String a=sc.next();
      int first=0;
      int last=0;
      if(a=="+")
      {
    	  System.out.println("dasda");
        last=stack.pop();
        first=stack.pop();
        stack.push(first+last);
      }
      else if(a=="-")
      {
        last=stack.pop();
        first=stack.pop();
        stack.push(first-last);
      }
      else if(a=="/")
      {
        last=stack.pop();
        first=stack.pop();
        stack.push(first/last);
      }
      else if(a=="*")
      {
        last=stack.pop();
        first=stack.pop();
        stack.push(first*last);
      }
      else
      {
        stack.push(Integer.parseInt(a));
        System.out.println(stack.peek());
      }
    }
    System.out.println(stack.pop());
  }
}