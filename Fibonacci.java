package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	public static final int SENTINEL = 10000;

	// sequence of numbers that are different depending on the starting int
	// based on math equation

	public void run() {
		int fib1 = 0; 
		int fib2 = 1;
		
		println("This program lists the Fibonacci sequence");
		println(fib1);
		int sum = fib1+fib2; 
				
		while (sum < SENTINEL) { 
			println(sum);
			sum = fib1+fib2;
			fib1 = fib2; 
			fib2 = sum; 
			} 
			
												}
}
