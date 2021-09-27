package datastructure;


public class SinglyLinkedList3 {

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
	
	public void display() {
		
		ListNode current= head;
		while(current!=null)
		{
			System.out.println(current.data+ "-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList3 sli= new SinglyLinkedList3();
		sli.head= new ListNode(10);
		ListNode second= new ListNode(1);
		ListNode third= new ListNode(8);
		ListNode fourth= new ListNode(11);
		
		
		sli.head.next=second;
		second.next=third;
		third.next=fourth;
		sli.display();
	}
}
