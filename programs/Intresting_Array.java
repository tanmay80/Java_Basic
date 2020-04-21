package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Intresting_Array {

	public static void main(String[] args) {

				Scanner sc= new Scanner(System.in);
				int t=sc.nextInt();
				for(int p=0;p<t;p=p+1)
				{
					int n=sc.nextInt();
					int array[]=new int[n];
					for(int i=0;i<n;i=i+1)
					{
						array[i]=sc.nextInt();
					}
					int max=0;int min=100000;
					int k=sc.nextInt();
					int newArray[]=new int[100000];
					Arrays.fill(newArray, -1);
					int flag=0;int temp2=-1;
					for(int i=0;i<n;i=i+1)
					{
						int temp=k-array[i];
						if(temp<0)
						{
							break;
						}
						if(newArray[temp]!=-1)
						{
							flag=1;
							max=i;
							min=newArray[temp];
							
						}
						else
						{
							if(temp2==array[i])
							{
								continue;
							}
							else
							{
								temp2=array[i];
								newArray[array[i]]=i;
							}
							
						}
					}
					if(flag==1)
					System.out.println(min+" "+max);
					else
						System.out.println("no answer");
				}

			}

		}

