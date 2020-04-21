package programs;

import java.util.Scanner;

public class Rearrange_Array {

	public static void main(String[] args) {
		    Scanner sc= new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int j=0;j<t;j=j+1)
		    {
		      int n=sc.nextInt();
		      int array[]=new int[n];
		      for(int i=0;i<n;i=i+1)
		      {
		        array[i]=sc.nextInt();
		      }
		      
		      int m=n;
		      if(n%2==0)
		      {
		    	  n=n/2-1;
		      }
		      else
		      {
		    	  n=n/2;
		      }
		    
		      
		      int array1[]=new int[m];
		      int p=m-1;
		      int k=0;
		      int L=0;
		      for(int i=0;i<=n;i=i+1)
		      {
		    	  if(p==k)
		    	  {
		    		  array1[L]=array[p];
		    		  break;
		    	  }
//		    	  System.out.println(i);
		        array1[L]=array[p];
		        p=p-1;
		        L=L+1;
//		        System.out.println(p+" "+L);
		        
		        array1[L]=array[k];
		        k=k+1;
		        L=L+1;
//		        System.out.println(k+" "+L);
		      }

		      
		      for(int i=0;i<m;i=i+1)
		      {
		        System.out.print(array1[i]+" ");
		      }
		      
		    }
		    
		  }
}