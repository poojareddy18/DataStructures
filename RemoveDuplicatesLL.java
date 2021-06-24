//Remove duplicates from LinkedList (HashSet)
import java.util.HashSet;

public class removeDuplicates
{
	static class node
	{
	   int val;
	   node next;
	
	public node(int val) {
		this.val = val;
	}
}
	static void removeDuplicate(node head)
	{
		
		HashSet hs = new HashSet<>();
		node current = head;
		node previous = null;
		
		while(current != null)
		{
			int currentval = current.val;
			
			if(hs.contains(currentval))
			{
				previous.next = current.next;
				
			}
			else {
				hs.add(currentval);
				previous = current;
			}
			current = current.next;
		}
	}
		
		static void printList(node head)
		{
			 while (head != null)
		        {
		            System.out.print(head.val + " ");
		            head = head.next;
		        }			
		}
	
	public static void main(String[] args)
	{
		node start = new node(10);
		start.next = new node(11);
		start.next.next = new node(12);
		start.next.next.next = new node(11);
		start.next.next.next.next = new node(12);
		start.next.next.next.next.next = new node(13);
		
		System.out.println("linked list before removing duplicates : ");
		printList(start);
		removeDuplicate(start); 
		
		
		System.out.println("\nlinked list after removing duplicates : ");
		printList(start);

		
		
		
		


	}

}