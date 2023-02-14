package com.comit.course;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comment Line
		// Comment2
		// Comment3
		
		/* Comment Text
		   Comment2
		   Comment3
		 */
		
		/* Comment 
		 
		  Primitive data types /* All types start if Lower Case is a primitive type 
		    
		    Integer Variables
		 */
		
		/* Declaration and Initialization */
		int a = 10;  /* 4 bytes */
		long b = 100_000; /* 8 bytes */
		
		short c = Short.MAX_VALUE; /* 2 bytes */ /* You can see the Maximum Value this number can have */
		byte d = Byte.MIN_VALUE; /* 1 bytes */ /* You can see the Minimum Value this number can have */
		
		/* Decimal Variables */
		
		double e = 10.456; /* 8 bytes */ /* Can run 15 digits */
		float f = 14.453568F; /* 4 bytes */ /* Can run just 8 digits */ /* For keep if float you need to put the F in the end of the number */
		
		/* Text Variables */
		
		char g = 'A'; /* 2 bytes */
		
		/* Reference type */ /* All types start if Upper Case is a reference type */
		
		String s = "Hello ComIT";
		
		boolean h = true;


	
		System.out.println(a); // for print and run the code 
		
		System.out.println(b); // for print and run the code 
		
		System.out.println((int)g); // cast  // Have a ASCII TABLE you can see the number who correspond to each characters letter, because internally the characters are 
		System.out.println(h);  
		
		
		/* reference type
	   	 
	   	  - never compare reference type variables with the == operator
	   	  - always compare reference type variables with equals() method.
	   	 
	   	  Ways to declare and initialize Strings
	   	 
	   	  1. String s = new String(“Hello”); // Standard way
	   	  2. String s = “Hello”;
	   	 */
		
	  	String s1 = "Hello";
	  	String s2 = "Hello";
	   	
	  	if ( s1.equals(s2) ) {
	  		System.out.println("Equal " + s1 + "-" + s2 );
	  	}
	  	else {
	  		System.out.println("Not Equal " + s1 + "-" + s2 );
	  	}
		
	}
 
}
