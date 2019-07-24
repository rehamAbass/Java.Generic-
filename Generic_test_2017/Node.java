package testWin2017_a;

public class Node <E> {

	private E value;
	private Node <E> prev;
	private Node <E> next;
	
	public Node(E value , Node <E> prev , Node <E> next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	public Node <E> getNext() {return this.next;}
	public Node <E> getPrev() {return this.prev;}
	public void setPrev(Node<E> p) {this.prev =p;}
	public void setNext(Node <E> n) {this.next =n;}
	public E getValue() {return this.value;}
	public void setValue(E value) {this.value =value;}
	
}
