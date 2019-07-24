package testWin2017_a;

public class Main {

	public Main( String []args) {
		IMidPointList <Double> m = new MidPointList<Double>();
		IMidPointList<Double> s= new SortedMidPointList<Double>();
		m.add_value(11.4);
		m.add_value(44.4);
		m.add_value(66.4);
		m.add_value(33.4);
	
		s.add_value(11.4);
		s.add_value(44.4);
		s.add_value(66.4);
		s.add_value(33.4);
		System.out.println("m List :");
		m.printList();

		System.out.println("\nHead is: "+m.getFirstValue()+"\n middle :"+m.getMidValue()+"\n tail:"+m.getLastValue());
		System.out.println(" S List :");
		s.printList();

		System.out.println("\nHead is: "+s.getFirstValue()+"\n middle :"+s.getMidValue()+"\n tail:"+s.getLastValue());
	}

}
