package linked_list;

import java.util.Scanner;

class Node{
	 int data;
	 Node next;
	 Node prev;
	 
	 Node(int data)
	 {
		 this.data=data;
		 this.next=null;
		 this.prev=null;
	 }
 }

 class mylinkedlist{
	 
	 Node head=null;
	 
	 void add(int data)
	 {
		 Node newnode=new Node(data);
		 //System.out.print(newnode.data);
		 if(head==null)
		 {
			head=newnode;
			return;
		 }
		 Node temp=head;
		 while(temp.next!=null)
		 {
			 temp=temp.next;
		 }
		 temp.next=newnode;
		 newnode.prev=temp;
	 }
	 
	 void print()
	 {
		 Node temp=head;
		 while(temp.next!=null)
		 {
			 temp=temp.next;
		 }
		 while(temp!=null)
		 {
			 System.out.print(temp.data+" ");
			 temp=temp.prev;
		 }
	 }
 }

public class Linked_List {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		mylinkedlist ll=new mylinkedlist();
		for(int i=0;i<n;i=i+1)
		{
			int k=sc.nextInt();
			ll.add(k);
		}
		ll.print();

	}

}
