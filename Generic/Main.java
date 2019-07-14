package myGeneric;

public class Main {

	public static void main(String[] args) {
		
		ObjectBox b = new ObjectBox();
		b.set("reham is strong programmer");
		System.out.println(b.get().toString());
		
		// the other method;
		
		Box <String> b1 = new Box<String>();
		Box <Integer> b2 = new Box<Integer>();
		b1.set("first Generic class :) !\n");
		b2.set(86);
		System.out.format("<String>:%s<Integer>: %d\n",b1.get(),b2.get());
		
		// the third option :
		/*
		Pair < String , String>  p1 = new OrderdObjects<String , String>("Hi ","yellow");
		Pair < String , Integer> p2 = new OrderdObjects<String , Integer>("grid like nobody has ur back!", 99);
		Pair <String , Box<Integer>> p3 = new OrderdObjects <String , Box<Integer>>( "p3 String", new Box());
		Pair <String , Box<String>> p4 = new OrderdObjects <String , Box<String>> ( "p4String", new Box());
	    
	    */
		
		String[] arr = {"ab", "cd", "ef"};
	    
	//	Methods.<String>printArray(arr);
	 
	    Pair<Integer, String> p1 = new OrderdObjects<Integer , String>(1, "apple");
	    Pair<Integer, String> p2 = new OrderdObjects<>(2, "pear");
	        
	    boolean same = Methods.<Integer, String>areEqual(p1, p2);
	 
	    Methods.printArray(arr);
	    
	    boolean same2 = Methods.areEqual(p1, p2);
	    System.out.println("are equal ? "+same+"\n same 2 ?"+ same2);
	}

}
