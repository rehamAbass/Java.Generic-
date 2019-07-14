package myGeneric;

public class OrderdObjects <T1 , T2> implements Pair<T1 , T2>{

	private T1 t1;
	private T2 t2;
	
	public OrderdObjects(T1 t1 , T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	
	@Override
	public T1 get1() {
		return this.t1;
	}
	
	@Override
	public T2 get2() {
		return this.t2;
	}

}
