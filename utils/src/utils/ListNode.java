package utils;

public class ListNode {
	public int value;
	public ListNode next;
	public ListNode(int value) {
		this.value = value;
	}
	public String toString() {
		String result = "";
		ListNode cur = this;
		while (cur != null) {
			result += cur.value + ", ";
		}
		return result;
	}
}
