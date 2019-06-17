package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"a","b","c","d","e"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "f";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//6. make an array of 50 integers
		int[] intarray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < 50; i++) {
			intarray[i] = new Random().nextInt(1000);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small = 0;
		int big = 0;
		for(int i = 0; i <intarray.length; i++) {
			if(i == 0) {
				small = intarray[i];
				big = intarray[i];
			}
			else {
				if(intarray[i] < small) {
					small = intarray[i];
				}
				if(intarray[i] > big) {
					big = intarray[i];
				}
			}
			System.out.println(intarray[i]);
		}
		
		System.out.println();
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		System.out.println("small = " + small);
		System.out.println("big = " + big);
	}
}
