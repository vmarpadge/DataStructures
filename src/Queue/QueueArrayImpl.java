package Queue;
//Simple Implementation of Queue Using array
public class QueueArrayImpl {

		int size, cap;
		int arr[];

		QueueArrayImpl(int c) {
			cap = c;
			size = 0;
			arr = new int[cap];
		}

		boolean isfull() {
			return (size == cap);
		}

		boolean isEmpty() {
			return (size == 0);
		}

		void Enqueue(int x) {
			if (isfull()) {
				return;
			}
			arr[size] = x;
			size++;

		}

		void Dequeue() {
			if (isEmpty())
				return;

			for (int i = 0; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}

			size--;
		}

		public int getFront() {
			if (isEmpty())
				return -1;
			else
				return arr[0];
		}

		public int getRear() {
			if (isEmpty()) {
				return -1;
			} else
				return arr[size - 1];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArrayImpl queue= new QueueArrayImpl(5);
		queue.Enqueue(546);
		System.out.println(queue.getFront());
	}

}
