package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class getMaxMin {
	Deque<Integer> dq;

	public getMaxMin() {
		dq = new LinkedList<Integer>();
	}

	void insertMin(int x) {
		dq.addFirst(x);
	}

	void insertmax(int x) {
		dq.addLast(x);
	}

	int getMin() {
		return dq.peekFirst();
	}

	int getMax() {
		return dq.peekLast();
	}

	int extractMin() {
		return dq.pollFirst();
	}

	int extractMax() {
		return dq.pollLast();
	}

	public static void main(String[] args) {
		getMaxMin g = new getMaxMin();
		int arr[]= {5,6,1,4,2,34};
		g.insertMin(arr[0]);
		for(int x:arr) {
			if(x>g.getMin()) {
				g.insertmax(x);
			}else {
				g.insertMin(x);
			}
		}
		
		System.out.println(g.extractMin());
		System.out.println(g.extractMax());
	}

}
