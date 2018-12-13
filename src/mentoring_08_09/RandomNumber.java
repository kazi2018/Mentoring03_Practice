package mentoring_08_09;

import java.util.Random;// A Java program to demonstrate random number generation 
//using java.util.Random; 

public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
        // create instance of Random class
		
		
		int number;
		
		for (int i =0;	i<100; i++)	{		
		
		
			number = random.nextInt(100)+1;					
			
			
			System.out.println("Random number is:" +number);				
		
		
		}
		
	}
	

	}

