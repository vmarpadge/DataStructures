

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class SinglyLinkedList {
	Node head;

	void insertAtEnd(int x) {
		Node temp = new Node(x);
		if (head == null) {
			head = temp;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp;
	}

	void printAll() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	void meetMiddle() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println(slow.data);
	}
}

public class MeetMiddle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.insertAtEnd(20);
		llist.insertAtEnd(56);
		llist.insertAtEnd(45);
		
		llist.meetMiddle();

	}

}
