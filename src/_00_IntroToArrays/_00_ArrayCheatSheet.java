package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] ultron = {"0","1","2","3","4"};
		//2. print the third element in the array
		System.out.println(ultron[3]);
		//3. set the third element to a different value
		ultron[3] = "8";
		//4. print the third element again
		System.out.println(ultron[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i<ultron.length;i++) {
			ultron[i] = "jarvis";
		}
		//6. use a for loop to print all the values in the array
		for(int i = 0; i<ultron.length;i++) {
			System.out.println(ultron[i]);
		}
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
		int[] fiddy = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<fiddy.length;i++) {
			Random r = new Random();
			fiddy[i] = r.nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int n = fiddy.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (fiddy[j] > fiddy[j+1])
                {
                    // swap temp and arr[i]
                    int temp = fiddy[j];
                    fiddy[j] = fiddy[j+1];
                    fiddy[j+1] = temp;
                }
    

		System.out.println(fiddy[0]);
		//10 print the entire array to see if step 8 was correct
		//11. print the largest number in the array.
		System.out.println(fiddy[49]);
		//12. print only the last element in the array
		System.out.println(fiddy[fiddy.length-1]);
	}
}
