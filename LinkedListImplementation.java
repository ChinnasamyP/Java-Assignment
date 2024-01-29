package java8;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	void printReverse() {
		printReverseRecursively(head);
	}

	void printReverseRecursively(Node node) {
		if (node == null) {
			return;
		}
		printReverseRecursively(node.next);
		System.out.print(node.data + " ");
	}
}

public class LinkedListImplementation {
	public static void main(String[] args) {
		
		try {

			LinkedList linkedList = new LinkedList();

			linkedList.insert(1);
			linkedList.insert(2);
			linkedList.insert(3);
			linkedList.insert(4);
			linkedList.insert(5);

			System.out.print("Linked List in Reverse Order: ");
			linkedList.printReverse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



