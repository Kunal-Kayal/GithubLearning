package basicAlgorithmforCP;
import java.util.*;

class ListNode{
	int value;
	ListNode next;
	ListNode(int data){
		this.value=data;
		next=null;
	}
}
public class FloyedAlgo_DetectingCycle {

	public static void main(String[] args) {
		/*
		 * you are given a singly linkedlist and you have to find is there any loop or not
		 * 
		 * .......................................................................................
		 * if there is any loop then the last node of the pointer didn't have null pointer
		 * ..............................................................
		 * solution using Floyed algorithm:
		 * 1.Take two pointers ptr1 and ptr2 and initialize them to the start node.
		 * 2.move ptr 1 by 1 node nad ptr2 by 2 node
		 * 3. if ptr 2 face null then there are no loop in the linked list
		 * 4.else there is a loop
		 * 5,if there is a loop then after some times ptr 1 and ptr 2 meets a node the executes end.
		 * 
		 */
		
		ListNode head = new ListNode(2);
	    ListNode l1 = new ListNode(8);
	    head.next = l1;
	    ListNode l2 = new ListNode(3);
	    l1.next = l2;
	    ListNode l3 = new ListNode(5);
	    l2.next = l3;
	    ListNode l4 = new ListNode(10);
	    l3.next = l4;
	   l4.next=l1;
	    
	    System.out.println(hasCycle(head));
		
		
		

	}
	static boolean hasCycle(ListNode head) {
		ListNode ptr1;
		ListNode ptr2;
		ptr1=ptr2=head;
		
		while(ptr2!=null && ptr2.next!=null) {
			
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;
			if(ptr1==ptr2)return true;
			
			
		}
		return false;
	}

}
