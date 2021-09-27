package datastructure;


public class SinglyLinkedList2 {

	private ListNode head;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList2 sli= new SinglyLinkedList2();
		sli.head= new ListNode(10);
		ListNode second= new ListNode(1);
		ListNode third= new ListNode(8);
		ListNode fourth= new ListNode(11);
		
		
		sli.head.next=second;
		second.next=third;
		third.next=fourth;
	}
}
