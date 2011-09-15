import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Random;


public class task1 {

	private static List<Integer> numbers;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initArray();
		printArray();
		//randomArray();
		myRandom();
		printArray();
	}
	
	// Put some numbers into the array
	private static void initArray(){
		numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	}
	
	// Print out numbers[]
	private static void printArray(){
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();
	}
	
	// Shuffles the array
	private static void randomArray(){
		Collections.shuffle(numbers);
	}
	
	// My method for randomizing the array
	private static void myRandom(){
		int k = numbers.size();
		Random rand = new Random();
		for(int i = 0; i < k; i++){
			int swapNr = i + rand.nextInt(k - i);
			swap(numbers, i, swapNr);
		}
	}
	
	// Swap two elements in a List
	private static void swap(List<Integer> list, int a, int b){
		int temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
	
}
