
public class TestArrayAlg {
	public static void main(String[] args) {
		String[] a = { "Mary", "had", "a", "little", "lamb" }; 
		Integer[] Itg = { 1, 2, 3, 4, 5 };
		Double[] Db = { 1.01, 1.02, 2.01, 2.02, 3.12 };
		ArrayAlg.printArray(a); //2.a
		ArrayAlg.printArray(Itg, 2, 8);//2.b: Array Integer
	    ArrayAlg.printArray(Db, 2, 5);//2.b: Array Double
	    ArrayAlg.printArray(a, 1, 5);//2.b: Array String
	    Pair<String> AA=ArrayAlg.maxTwo(a);//2.c
	    System.out.println("Max = " + AA.getSecond());
	}
}