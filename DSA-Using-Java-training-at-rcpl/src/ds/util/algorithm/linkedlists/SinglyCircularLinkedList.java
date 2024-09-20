package ds.util.algorithm.linkedlists;

class SinglyCircularNode{
	int data;
	SinglyCircularNode next;
	SinglyCircularNode(){
		this.next=null;
	}
	SinglyCircularNode(int data){
		this.data=data;
		this.next=null;
	}
}
public class SinglyCircularLinkedList implements SinglyCircularLinkedListOperations{
	private SinglyCircularNode head;
	SinglyCircularLinkedList(){
		this.head=null;
	}
	@Override
	public SinglyCircularNode createLinkedList() {
		// TODO Auto-generated method stub
		return head;
	}

	@Override
	public SinglyCircularNode insertAtBegin(SinglyCircularNode head, int element) {
		// TODO Auto-generated method stub
		SinglyCircularNode newNode=new SinglyCircularNode(element);
		
		return head;
	}

	@Override
	public SinglyCircularNode insertAtEnd(SinglyCircularNode head, int element) {
		// TODO Auto-generated method stub
		SinglyCircularNode newNode=new SinglyCircularNode(element);
		if(head==null) {
			head=newNode;
			newNode.next=head;
		}else {
			SinglyCircularNode temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		return head;
	}

	@Override
	public SinglyCircularNode insertAtPosition(SinglyCircularNode head, int element, int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SinglyCircularNode deleteFromBegin(SinglyCircularNode head) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SinglyCircularNode deleteFromEnd(SinglyCircularNode head) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SinglyCircularNode deleteFromPosition(SinglyCircularNode head, int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean traverseLinkedList(SinglyCircularNode head) {
		// TODO Auto-generated method stub
		SinglyCircularNode pos=head;
		if(head!=null) {
				do {
				System.out.println(pos.data);
				pos=pos.next;
			}	while(pos!=head);
		return true;
		}
		return false;
	}
	
}