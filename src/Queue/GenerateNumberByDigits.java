package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumberByDigits {

	void generateNumbers(int x, int y, int n) {
		Queue<String> q = new LinkedList<String>();
		q.add(x + "");
		q.add(y + "");

		for (int i = 0; i < n; i++) {
			String num = q.poll();
			System.out.println(num);
			q.add(num + x + "");
			q.add(num + y + "");
		}
	}

	public static void main(String[] args) {
		GenerateNumberByDigits g = new GenerateNumberByDigits();
		g.generateNumbers(5, 6, 10);
	}
}
