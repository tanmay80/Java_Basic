package programs;

import java.util.*;

public class MinValue_MinIndex {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();                           
		int array[]=new int [n];
		for(int i=0;i<n;i=i+1)
		{
			array[i]=sc.nextInt();                  
		}
		
		int indexArray[]=new int[n];            
		
		for(int i=0;i<n;i=i+1)
		{
			int count=1;
			for(int j=0;j<n;j=j+1)
			{
				if(array[i]>array[j])              
				{
					count=count+1;
				}
			}
			indexArray[i]=count;
		}
		
//		for(int i=0;i<n;i=i+1)
//		{
//			for(int j=0;j<n;j=j+1)
//			{
//				if(i==j)
//				{
//					continue;
//				}
//				else
//				{
//					if(indexArray[i]==indexArray[j])
//					{
//						if(j>i)
//						{
//							indexArray[j]=indexArray[j]+1;
//							for(int k=0;k<n;k=k+1)
//							{
//								if(j==k)
//								{
//									continue;
//								}
//								else
//								{
//									
//								}
//							}
//						}
//					}
//					else
//					{
//						continue;
//					}
//				}
//			}
//		}
		
		for(int i=0;i<n;i=i+1)
		{
			System.out.println(indexArray[i]);
		}

	}
}

