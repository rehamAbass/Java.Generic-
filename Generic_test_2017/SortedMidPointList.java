package testWin2017_a;

public class SortedMidPointList 
				< E extends  Comparable <E>>
								extends MidPointList<E>{
//	IMPORTANTS :
	//
	//Notes :
	//		1. THIS CLASS DOESN'T  EMPLEMENTS THE INTERFACE , UNLESS HE WANTS.
	//		2. THIS CLASS EXTENDS ANOTHER CLASS SO HE GONNA @OVERRIDE MAYBE ONE FUNCTION
	//		3. THIS CLASS GENERICALLY - EXTENDS THE COMPARABLE <E>
	//
	public SortedMidPointList() { super();}	
	@Override
	public void add_value(E value) {
		Node <E> temp;
		int i,Imid ;
		if( super.n == 0) {
			super.add_value(value);
			return;
		}
		Node<E> node1 = new Node<E>(value , null,null);
		for(temp = this.head ; temp != null ; temp = temp.getNext()) {
			if(node1.getValue().compareTo(temp.getValue()) < 0) { // must add here !
				node1.setNext(temp);
				node1.setPrev(temp.getPrev());
				temp.getPrev().setNext(node1);
				temp.setPrev(node1);
				break;
			}
		}
			if( temp == null ) { // doesn't change , we will add it in the end :
			//so  gonna add it to the end 
			node1.setPrev(super.tail);	
			super.tail.setNext(node1);
			super.tail = node1;
			}
		// dealing with mid :	
		super.n ++;
		if( super.n %2 == 1) { // un oven
			Imid = super.n /2 +1;
		}else { // n== Oven
			Imid = super.n /2;
		}
		for(super.mid =super.head ,i=1 ; i< Imid && super.mid != null; i++) {
			super.mid = super.mid.getNext();
		}
			
			
		} // end method
	///////////////////////////////////////
}   // end of the class
