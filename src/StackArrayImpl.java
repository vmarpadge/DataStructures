import java.util.ArrayList;

public class StackArrayImpl {
	ArrayList<Integer> stk = new ArrayList<>();
	private int top = -1;

	void Push(Integer x) {
		stk.add(x);
		top++;
	}

	Integer Pop() {
		if (isEmpty())
			System.out.println("Stack UnderFlow");
		Integer x = stk.get(top);
		stk.remove(top);
		top--;
		return x;
	}

	boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	Integer Peek() {
		return stk.get(top);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArrayImpl s = new StackArrayImpl();
		s.Push(25);
		s.Push(456);
		System.out.println(s.Pop());
		System.out.println(s.Peek());

	}

}
