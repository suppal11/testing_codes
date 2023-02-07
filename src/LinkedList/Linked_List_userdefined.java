package LinkedList;
//creating the custom defined linked list

public class Linked_List_userdefined 
{

	Node head;

	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void printLinkedList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		Linked_List_userdefined l1=new Linked_List_userdefined();
		Node first=l1.new Node(10);
		l1.head=first;
		
		Node second=l1.new Node(20);
		first.next=second;
		
		Node third=l1.new Node(30);
		second.next=third;
		
		l1.printLinkedList();
			

	}

}
