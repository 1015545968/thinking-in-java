package chapter04;// control/Exercise_09.java
// TIJ4 Chapter Control, Exercise 9, page 153
/* A Exercise_09 sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
* and so on, where each number (from the third on) is the sum of the previous
* two. Create a method that takes an integer as an argument and displays that
* many Exercise_09 numbers starting from the beginning, e.g.,if you run java
* Exercise_09 5 (where Exercise_09 is the name of the class) the output will be
* 1,1,2,3,5.
*/

public class Exercise_09 {
	int fib(int n) {
		if(n < 2) return 1;
		return (fib(n - 2) + fib(n - 1));
	}
	public static void main(String[] args) {
		Exercise_09 f = new Exercise_09();
		int k = Integer.parseInt(args[0]);
		System.out.println("First " + k + " Exercise_09 number(s): ");
		for(int i = 0; i < k; i++)
			System.out.println(f.fib(i));
	}	
}