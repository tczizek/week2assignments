package week2;

import acm.program.*;

public class Section3Questions {
	public static void main(String[]args) {
		System.out.println("The value of a local variable named i has no direct relationship with that of a variable named i in its caller. \n True. \n \n The value of a parameter named x has no direct relationship with that of a variable named x in its caller. \n True.");
		
		HarryPotter ();
	}
	public static void HarryPotter() {
		System.out.println("snitch: x = 4004, y = 1001\n" + 
				"quaffle: x = 2003, y = 1, z = 1001\n" + 
				"bludger: x = 1001, y = 2001, z = 2003");
	}
}