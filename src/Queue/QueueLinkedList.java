package Queue;

public class QueueLinkedList {
	class Node {
		int data;
		Node next;

		Node(int x) {
			this.data = x;
		}
	}

	class Queue {
		Node front, rear;
		int size;

		Queue() {
			front = rear = null;
			size = 0;
		}

		void EnQueue(int x) {
			Node temp = new Node(x);
			if (front == null) {
				front = rear = temp;
			}
			rear.next = temp;
			rear = temp;
			size++;
		}

		void DeQueue() {
			 if(this.front==null){
                 System.out.println("Empty");
                 return;
             } 
             System.out.println(this.front.data);
             if(this.front==this.rear){
                 this.front = null;
                 this.rear = null;
             } else {
                 this.front=this.front.next;
             }
             size--;
		}

		int size() {
			return this.size;
		}
	}

	public static void main(String[] args) {
		QueueLinkedList queueLinkedList = new QueueLinkedList();
		Queue q = queueLinkedList.new Queue();

		q.EnQueue(154);
		System.out.println(q.size());
		q.DeQueue();
		System.out.println(q.size());
		q.DeQueue();
		System.out.println(q.size());
		q.DeQueue();
		System.out.println(q.size());
		
	}
}
