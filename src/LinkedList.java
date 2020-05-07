
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class SinglyLinkedList {
	Node head;

	void insertAtBegin(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	void insertAtEnd(int data) {
		Node temp = new Node(data);
		Node current=head;
		if(head==null) {
			head=temp;
			return;
		}
		while(current.next!=null) {
			current=current.next;
		}
		current.next=temp;
	}
	
	void printAll() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}

public class LinkedList {
	public static void main(String args[]) {
		SinglyLinkedList linkedlist = new SinglyLinkedList();
		
		linkedlist.insertAtEnd(789);
		linkedlist.insertAtEnd(56);
		linkedlist.printAll();
	}
}
