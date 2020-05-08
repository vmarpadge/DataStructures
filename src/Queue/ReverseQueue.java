package Queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	// Itertive Solution
	void reverse(Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
	}

	// Recursive Solution
	void reverseR(Queue<Integer> q) {
		if (q.isEmpty())
			return;

		int x = q.remove();
		reverseR(q);
		q.add(x);
	}

}
