/*
 * Orders a permutation of integers 1-N
 */

import java.util.Random;


public class Task1a {

	private static int[] numbers;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initArray(111); // Set how many integers you want in the list
		printArray();
		myRandom();
		printArray();
	}
	
	// Put some numbers into the array
	private static void initArray(int _size){
		numbers = new int[_size];
		for(int i = 0; i < _size; i++){
			numbers[i] = i+1;
		}
	}
	
	// Print out numbers[]
	private static void printArray(){
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
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
