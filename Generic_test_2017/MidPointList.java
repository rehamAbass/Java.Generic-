package testWin2017_a;

public class  MidPointList <E>  implements IMidPointList<E>{

	protected Node<E> head;
	protected Node<E> tail;
	protected Node<E> mid;
	protected MidPointList pointer;
	protected int n;
////////////////////////////////////////////////////////////////////////////////////
	public MidPointList() {
	pointer = new MidPointList();
	n = 0;
	this.head =null;
	this.tail= null;
	this.mid = null;
	}
//////////////////////////////////////////////////////////////////////////////	
	public void add_value(E value){ // add to tail& update it
		Node <E> temp;
		if(n == 0) {
			temp = new Node <E> (value,null,null);
			this.head = temp;
			this.tail = temp;
			this.mid = temp;
			n = 1;
			return;
		} 
		temp = new Node <E> (value ,this.tail,null );  
		this.tail.setNext(temp);
		this.tail= temp;
		n++;
		if( n%2 == 1) { //we have added uneven node
			this.mid = this.mid.getNext();
		}
	}
	/////////////////////////////////////////////////////////////////////////////
	public E getFirstValue() {
		return this.head.getValue();
	}
	public E getMidValue() {
		return this.mid.getValue();
	}
	public E getLastValue() {
		return this.tail.getValue();
	}
	
	///////////////////////////////////////////////////////////////////////
	public void printList() {
		Node<E>temp;
		System.out.println("\n The list is :");
		for(temp = this.head ; temp != null; temp = temp.getNext())
			System.out.print(temp.getValue()+" ,");
	}
///////////////////////////////////////////////////////////////////////////////
}
