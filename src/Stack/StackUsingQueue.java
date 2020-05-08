package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	class Stack {
		Queue<Integer> q1, q2;

		Stack() {
			q1 = new LinkedList<Integer>();
			q2 = new LinkedList<Integer>();
		}

		int top() {
			if (q1.isEmpty())
				return -1;
			return q1.peek();
		}

		void pop() {
			if (q1.isEmpty()) {
				System.out.println("Empty");
				return;
			}
			q1.remove();
		}

		void push(int x) {
			while (!q1.isEmpty()) {
				q2.offer(q1.peek());
				q1.remove();
			}
			q1.offer(x);
			while (!q2.isEmpty()) {
				q1.offer(q2.peek());
				q2.remove();
			}
		}

		int size() {
			return q1.size();
		}
	}
}
