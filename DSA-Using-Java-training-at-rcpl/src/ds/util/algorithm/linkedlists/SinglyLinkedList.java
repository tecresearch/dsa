package ds.util.algorithm.linkedlists;

class SinglyNode{
	int data;
	SinglyNode next;
	SinglyNode(){
		this.next=null;
	}
	SinglyNode(int data){
		this.data=data;
		this.next=null;
	}
}
public class SinglyLinkedList implements SinglyLinkedListOperations{
	private SinglyNode head;
	SinglyLinkedList(){
		this.head=null;
	}
	@Override
	public SinglyNode createLinkedList() {
		// TODO Auto-generated method stub
		return head;
	}

	@Override
	public SinglyNode insertAtBegin(SinglyNode head, int element) {
		// TODO Auto-generated method stub
		SinglyNode newSinglyNode=new SinglyNode(element);
		if(head==null) {
			head=newSinglyNode;
		}else {
			newSinglyNode.next=head;
			head=newSinglyNode;
		}
		return head;
	}

	@Override
	public SinglyNode insertAtEnd(SinglyNode head, int element) {
		SinglyNode newNode=new SinglyNode(element);
		if(head==null) {
			head=newNode;
			head.next=null;
		}else {
			SinglyNode pos=head;
			while(pos.next!=null) {
				pos=pos.next;
			}
			pos.next=newNode;
			newNode.next=null;
		}
		return head;
	}

	@Override
	public SinglyNode insertAtPosition(SinglyNode head, int element, int position) {
		// TODO Auto-generated method stub
		int nodeCount=0;
		SinglyNode temp=head;
		while(temp!=null) {
			temp=temp.next;
			nodeCount++;
		}
		
		if(head!=null) {
			
			if(position>=1 && position<=nodeCount) {
				SinglyNode newNode=new SinglyNode(element);
				if(position==1) {
					newNode.next=head;
					head=newNode;
				}else {
					SinglyNode prev=head;
					for(int i=1; i<=position-2; i++) {
						prev=prev.next;
					}
					newNode.next=prev.next;
					prev.next=newNode;
				}
			}else {
				System.out.println("Invalid Node No");
			}
			
		}else {
			System.out.println("Empty Singly linked list");
		}
		
		return head;
	}

	@Override
	public SinglyNode deleteFromBegin(SinglyNode head) {
		if(head!=null) {
			if(head.next==null) {
				head=null;
			}else {
				head=head.next;
			}
		}else {
			System.out.println("No node to be deleted");
		}
		return head;
	}

	@Override
	public SinglyNode deleteFromEnd(SinglyNode head) {
		// TODO Auto-generated method stub
		if(head!=null) {
			if(head.next==null) {
				head=null;
			}else {
				SinglyNode secondLast=head;
				SinglyNode last=head;
				while(last.next!=null) {
					last=last.next;
				}
				while(secondLast.next!=last) {
					secondLast=secondLast.next;
				}
				secondLast.next=null;
				
			}
		}else {
			System.out.println("No node to delete");
		}
		return head;
	}

	@Override
	public SinglyNode deleteFromPosition(SinglyNode head, int position) {
		// TODO Auto-generated method stub
		if(head!=null) {
			int NodeCount=0;
			SinglyNode temp=head;
			while(temp!=null) {
				temp=temp.next;
				NodeCount++;
			}
			if(position>=1  && position<=NodeCount) {
				if(position==1) {
					head=head.next;
				}else {
					SinglyNode prevPos=head;
					for(int i=1; i<=position-2; i++) {
						prevPos=prevPos.next;
					}
					prevPos.next=prevPos.next.next;
				}
			}else {
				System.out.println("Invalid Node no");
			}
		}else {
			System.out.println("Node node to be deleted");
		}
		return head;
	}

	@Override
	public void traverseLinkedList(SinglyNode head) {
		// TODO Auto-generated method stub
		SinglyNode pos=head;
		if(head!=null) {
			while(pos!=null) {
				System.out.println(pos.data);
				pos=pos.next;
			}
		
		}else {
			System.out.println("No node to be traversed");
		}
		
	}
	
}