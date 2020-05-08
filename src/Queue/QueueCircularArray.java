package Queue;

public class QueueCircularArray {

	int size, front, cap;
	int arr[];

	public QueueCircularArray(int c) {
		// TODO Auto-generated constructor stub
		cap = c;
		arr = new int[c];
		front = size = 0;
	}

	boolean isFull() {
		return (size == cap);
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int getFront() {
		if (isEmpty())
			return -1;
		else
			return front;
	}

	public int getRear() {
		if (isEmpty())
			return -1;
		else
			return (front + size - 1 % cap);
	}

	void Enqueue(int x) {
		if (isFull())
			return;
		int rear = getRear();
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
