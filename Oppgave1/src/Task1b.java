/*
 * Orders a permutation of integers -N-N
 */

import java.util.Random;


public class Task1b {

	private static int[] numbers;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initArray(-5, 5); // Set the range of numbers
		printArray(); // Print out before randomizing
		myRandom();
		printArray(); // Print out after randomizing
	}
	
	// Put some numbers into the array
	private static void initArray(int _minNumb, int _maxNumb){
		int size = _maxNumb - _minNumb + 1;
		int numb = _minNumb;
		
		numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = numb;
			numb++;
		}
	}
	
	// Print out numbers[]
	private static void printArray(){
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println(" | arraysize: " + numbers.length);
		
	}
	
	// My method for randomizing the array
	private static void myRandom(){
		int k = numbers.length;
		Random rand = new Random();
		for(int i = 0; i < k; i++){
			int swapNr = i + rand.nextInt(k - i);
			swap(numbers, i, swapNr);
		}
	}
	
	// Swap two elements in a List
	private static void swap(int[] list, int a, int b){
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
	
}
