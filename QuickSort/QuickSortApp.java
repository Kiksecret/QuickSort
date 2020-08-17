package QuickSort;

public class QuickSortApp {

	public static void main(String[] args) {
		int maxSize = 16;
		QuickSortClass Quick;
		Quick = new QuickSortClass(maxSize);
		
		for(int j = 0; j < maxSize; j++) {
			long n = (int)(java.lang.Math.random()*199);
			Quick.insert(n);
		}
		
		Quick.display();
		
		long pivot = 99;
		System.out.print("Pivot is "+ pivot);
		int size = Quick.size();
		
		int partDex = Quick.partitionIt(0, size-1, pivot);
		
		System.out.println(", Partition is at index "+ partDex);
		Quick.display();

	}

}
