
public class ArrayAlg {

	public static <T> void printArray(T[] a) {
		if (a == null || a.length == 0) {
			System.out.println("Not to exist array.");
		} 
		else {
			System.out.println("Array: ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static <T> void printArray(T[] a, int start, int end) { 
		int count = 0;
		if (start > end || start > a.length || end > a.length) {
			System.out.println("\nError");
		} 
		else {
			if (a == null || a.length == 0) {
				System.out.println("Not to exist array.");
			}
			else {	
				System.out.print("Array element from " + start +" to " + end + ": ");
				for (int i = start; i < end; i++) {
					count+=1;
					System.out.print(a[i] + " ");
				}
			}
			System.out.print("\nNumber of array elements are print: " + count + "\n");
		}
	}
	
	public static <T extends Comparable> Pair<T> maxTwo(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) min = a[i];
			if (max.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<T>(min, max);
	}
}
