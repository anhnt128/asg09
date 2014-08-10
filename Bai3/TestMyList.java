
public class TestMyList {
	public static void main(String args[]) {
	
		MyList<String> l = new MyList<String>();
		l.append(new NumeralItem(1)); 
		l.append(new NumeralItem(2));
		System.out.println(l); // (1, 2)
		MyList l2 = new MyList();
		l2.append(new StringItem("a")); 
		l2.append(new StringItem("b"));
		System.out.println(l2); // (a, b)
		l.append(l2);
		System.out.println(l + " length = " + l.length()); // (1, 2, (a, b))
		l.appendList(l2);
		
		System.out.println(l + " length = " + l.length()); // (1, 2, (a, b), a, b)
		l2.append(new NumeralItem(5));
		System.out.println(l2); // (a, b, 5)
		
		//MyList newList = (MyList)l.clone();
		//System.out.println(newList); // (1, 2, (a, b), a, b)
		MyList l3= new MyList();
		l3.append(new StringItem("a")); 
		l3.append(new StringItem("b"));
		l3.append(new StringItem("4"));
		System.out.println(l3);
		System.out.println(l3.length() + " lll " + l2.length()); 
		System.out.println(l3.equals(l2));
		
		System.out.println(l); // (1, 2, (a, b), a, b)
		l.invert();
		System.out.println(l); // (b, a, (a, b), 2, 1)
	}	
}