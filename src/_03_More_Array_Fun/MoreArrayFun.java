package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] racecar =  {"r","a","c","e","c","a","r"};
		MoreArrayFun.print(racecar);
		System.out.println("\n");
		MoreArrayFun.reverse(racecar);
		System.out.println("\n");
		MoreArrayFun.other(racecar);
		System.out.println("\n");
		MoreArrayFun.random(racecar);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void print(String[] string){
		for(int i = 0;i<string.length;i++) {
			System.out.println(string[i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void reverse(String[] string){
		for(int i = string.length-1;i >= 0;i--) {
			System.out.println(string[i]);
		}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void other(String[] string){
		for(int i = 0;i<string.length;i++) {
			if(i%2==0) {
			System.out.println(string[i]);
			}
		}
	}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void random(String[] string){
		for(int i = 0; i<string.length;i++) {
			Random r = new Random();
			System.out.println(string[r.nextInt(string.length)]);
		}
	}
}
