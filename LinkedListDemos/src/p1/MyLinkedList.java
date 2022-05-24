package p1;

public class MyLinkedList {

	private Node head;

	private class Node {
		int data;
		Node next;

		public Node(int x) {
			this.data = x;
			this.next = null;
		}

	}

	public void add(int data) {

		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {
			Node last = this.head;

			// try to reach on the last node
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}

	}
	public void remove(int data) {

		//TODO

	}
	public boolean search(int data) {

		//TODO
		
		return false;

	}

	public void printIt() {

		Node start = this.head;

		while (start != null) {
			System.out.println(start.data);
			start = start.next;
		}

	}

}
