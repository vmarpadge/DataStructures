package practice;

import java.util.Stack;

public class BalancedParanthesis {
	public static boolean Matching(char a, char b) {
		if (a == '{' && b == '}' || a == '[' && b == ']' || a == '(' && b == ')') {
			return true;
		}

		return false;
	}

	public static boolean isBalanced(String s) {
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
				stk.push(s.charAt(i));
			} else {
				if (stk.isEmpty()) {
					return false;
				} else if (Matching(stk.peek(), s.charAt(i)) == false) {
					return false;
				} else {
					stk.pop();
				}
			}
		}

		return (stk.isEmpty() == true);
	}

	public static void main(String[] args) {
		String s = "{([}}])}";
		System.out.println(isBalanced(s));
	}
}
