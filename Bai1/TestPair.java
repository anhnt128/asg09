
public class TestPair {
	public static void main(String[] args) {
		
		Pair<String> Str = new Pair<String>("Red", "Black");
		Pair<Integer> Int = new Pair<Integer>(1,2);
		
		Str.toString();
		Int.toString();
		
		System.out.println(Str);
		System.out.println(Int);
	}
}