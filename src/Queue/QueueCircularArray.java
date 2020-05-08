package Queue;

public class QueueCircularArray {

	int size, front,rear, cap;
	int arr[];

	public QueueCircularArray(int c) {
		// TODO Auto-generated constructor stub
		cap = c;
		arr = new int[c];
		rear=front = size = 0;
	}

	boolean isFull() {
		return (size == cap);
	}

	public boolean isEmpty() {
		return (size == 0);
	}


	void Enqueue(int x) {
		if (isFull())
			return;
		arr[rear]=x;
		rear = (rear + 1) % cap;
		size++;
	}

	void Dequeue() {
		if (isEmpty())
			return;
		front = (front + 1) % cap;
		size--;
	}

	public static void main(String[] args) {
		QueueCircularArray queueCircularArray = new QueueCircularArray(5);
		queueCircularArray.Enqueue(456);
		System.out.println(queueCircularArray.isEmpty());
	}
}
