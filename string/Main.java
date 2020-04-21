package string;
import java.util.*;
import java.io.*;

public class Main {
		  public static void main(String args[]) throws IOException {
		    
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int i=0;i<t;i=i+1)
		    {
		      int twentyeight=0;int twentynine=0;int ninetyone=0;int ninetythree=0;int onetwentythree=0;
		      int onetwentyfive=0;int sum=0;int sum1=0;int sum2=0;int flag=0;int flag1=0;
		      String s=sc.next();
		      int length=s.length();
		      if(length%2!=0||length==0)
		      {
		        System.out.println("No");
		        continue;
		      }
		      for(int j=0;j<length;j=j+1)
		      {
		        int temp=(int)s.charAt(j);
		        if(40==temp)
		        {
		          twentyeight=twentyeight+1;
		          sum=sum+1;
		    
		        }
		        if(41==temp)
		        {
		          twentynine=twentynine+1;
		          sum=sum-1;
		          if(sum<0)
		          {
		            flag=1;
		          }
		        }
		        if(91==temp)
		        {
		          ninetyone=ninetyone+1;
		          sum1=sum1+1;
		        }
		        if(93==temp)
		        {
		          ninetythree=ninetythree=+1;
		          sum1=sum1-1;
		          if(sum1<0)
		          {
		            flag=1;
		          }
		        }
		        if(123==temp)
		        {
		          onetwentythree=onetwentythree+1;
		          sum2=sum2+1;
		        }
		        if(125==temp)
		        {
		          onetwentyfive=onetwentyfive=+1;
		          sum2=sum2-1;
		          if(sum2<0)
		          {
		            flag=1;
		          }
		        }
		      }
		      if(flag==1)
		      {
		        if(twentynine==twentyeight)
		        {
		          flag1=1;
		        }
		        else
		        {
		          flag1=0;
		        }
		        if(flag1==1)
		        {
		        if(ninetythree==ninetyone)
		          {
		            flag1=1;
		          }
		          else
		          {
		            flag1=0;
		          }
		        }
		        if(flag1==1)
		        {
		          if(onetwentythree==onetwentyfive)
		            {
		               flag1=1;
		            }
		            else
		            {
		              flag1=0;
		            }
		        }
		        if(flag1==1)
		        {
		          System.out.println("Yes");
		        }
		        else
		        {
		          System.out.println("No");
		        }
		      }
		      else
		      {
		        System.out.println("No");
		      }
		      
		    }
		    
		  }
	}
