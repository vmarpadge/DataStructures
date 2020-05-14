package Trie;

public class prefixTrie {

	private prefixTrie[] child;
	private boolean isEnd;

	public prefixTrie() {
			child = new prefixTrie[26];
	}

	public void insert(prefixTrie root, String key) {
		prefixTrie curr = root;
		for (char ch : key.toCharArray()) {
			int index = ch - 'a';
			if (curr.child[index] == null) {
				curr.child[index] = new prefixTrie();
			}
			curr = curr.child[index];
		}
		curr.isEnd = true;
	}

	public boolean search(prefixTrie root, String key) {
		prefixTrie curr = root;
		for (char ch : key.toCharArray()) {
			int index = ch - 'a';
			if (curr.child[index] == null) {
				return false;
			}
			curr = curr.child[index];
		}

		return curr.isEnd;
	}
	public static void main(String[] args) {
		prefixTrie root= new prefixTrie();
		
		root.insert(root, "vineeth");
		System.out.println(root.search(root, "v	ineeth"));
	}
}
