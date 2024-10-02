package dsa1;
class LinkedList{
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	LinkedList()
	{
		head=null;
	}
	
	//Insert At Beginning
	
	public void insertAtbeginig(int val) 
	{
		Node newNode=new Node(val);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	//Display the all Element in the Linked list
	public void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	//Insert at Any position
	public void insertAtpos(int pos, int val)
	{
		Node newNode=new Node(val);
		if(pos==0)
		{
			insertAtbeginig(val);
			return;
		}
		else
		{
		Node temp=head;
		for(int i=1;i<pos;i++)
		{
			temp=temp.next;
			if(temp==null)
			{
				throw new IllegalArgumentException("Invalid Position "+pos);
			}
		}
		newNode.next=temp.next;
		temp.next=newNode;
		 }
	}
	
	//Get the Value from the Position
	public void getPosition(int pos)
	{
		Node temp=head;
		if(pos==0)
		{
			System.out.print(head.data);
			return;
		}
		
		for(int i=1;i<=pos;i++)
		{
			temp=temp.next;
		}
		
		System.out.println(temp.data+"");
	}
	
	//Update the Value From the Position
	public void updatePos(int pos,int val)
	{
		Node temp=head;
		
		for(int i=0;i<pos;i++)
		{
			temp=temp.next;
		}
		temp.data=val;
	}
	
	//Delete From the End of the list
	public void deleteAtend()
	{
		Node temp=head;
		
			while(temp.next.next !=null)
			{
				temp=temp.next;
			}
		temp.next=null;
	}
	
	//insert At the end of the Position
	public void insertAtEnd(int val)
	{
		Node newNode=new Node(val);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node temp=head;
		
		while(temp.next.next !=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	//Search the value from the list 
	public void search( int val)
	{
		Node temp=head;
		int c=0,d=0;
		while(temp!=null)
		{
			if(temp.data==val)
			{
				System.out.println("\nThe Position of the value is "+c);
				d=1;
			}
			temp=temp.next;
			c++;
		}
		if(d==0)
		{
			System.out.println("\nValue is Not Available");
		}
	}
	
	//Check the Value is contain or Not
	public void contain( int val)
	{
		Node temp=head;
		int d=0;
		while(temp!=null)
		{
			if(temp.data==val)
			{
				System.out.println(true);
				d=1;
			}
			temp=temp.next;
		}
		if(d==0)
		{
			System.out.println(false);
		}
	}
}
public class LinkedList_02
{
	public static void main(String[] args)
	{
		LinkedList link=new LinkedList();
		
		link.insertAtbeginig(10);
		link.insertAtbeginig(20);
		link.insertAtbeginig(12);
		link.insertAtbeginig(11);
		link.display();
		
		System.out.println("\ninsert at Postion");
		
		link.insertAtpos(2,100);
		link.insertAtpos(0, 55);
		link.display();
		
		System.out.println("\nGet  Postion");
		
		link.getPosition(0);
		
		System.out.println("\nUpdate Postion");
		
		link.updatePos(0, 45860);
		link.display();
		
		System.out.println("\nDelete At End ");
		
		link.deleteAtend();
		link.display();
		
		
		System.out.println("\nInsert At end");
		link.insertAtEnd(10);
		link.display();
		
		link.search(12);
		
		link.contain(12);
	}
}
