package myGeneric;

public class Methods {


	//Generic method 
	//static for all types of generic classes
	public static <E> void printArray( E[] arr) {
		for(E element : arr)
			System.out.print(element+",");
		System.out.println();
	}
	
	//Generic method
	public static <T1 , T2> boolean areEqual(Pair <T1 , T2> p1, Pair <T1 , T2> p2) {
		if(p1.get1().equals(p2.get1()) && p1.get2().equals(p2.get2()))
			return true;
		return false;
	}
	
 
}
