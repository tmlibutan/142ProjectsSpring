import java.util.Scanner;
import java.util.*;

/**
 * Description of this class here
 */


public class Lab5 {

    //----- NOTE: To close BlueJ terminal window after output is displayed you
    // might have to press CTRL + Z then close the window ------// 

    public static void main(String[] args)  {
        
    	Scanner console = new Scanner(System.in);
    	int num;
    	do {
    		System.out.println("Welcome to Lab5!");
    		System.out.println("Enter 1 to check how " +
    		            " long it takes to get rich on a magic dollar coin.");
    		System.out.println("Enter 2 to calculate e^x for any real x.");
    		System.out.println("Enter 3 to enter palindrome words.");
    		System.out.println("Enter 4 to re-print the menu.");
    		System.out.println("Enter 0 to exit.");
    		System.out.println("What is your choice?");
    		num = console.nextInt();
    		switch(num) {
    		case 1:
    			getRichQuick();
    			break;
    		case 2:
    			System.out.println("Enter an x: ");
    			double x = console.nextDouble();
    			System.out.println(eTaylor(x));
    			break;
    		case 3:
    			palindromeCheck();
    			break;
    		case 4:
    			continue;
    		}
    		
    	} while (num != 0);
    	
    	System.out.println("Thanks for participating! Goodbye.");
    }
    
    public static double helper (double x, double n) {
    	double power = 1;
    	double factorial = 1;
    	
    	for (int i = 1; i <= n; i++) {
    		power = power * x;
    		factorial = factorial * i;
    	}
    	
    	return power / factorial;
    	
    }
    
    // Part 1
     public static void getRichQuick() {
        // Declare your variables here and implement your logic
        int day = 1;
        double money = 1;
        
        while (money < 1000000) {
        	System.out.printf("Day %2d: %.2f %n", day, money);
        	money = money + (1 + (money/2));
        	day++;
        	
        }
        
    }
    
    // Part 2 
    public static double eTaylor( double x ) {
    	double taylorNumber = 1 + x;
        // Your logic goes here
    	int power = 2;
    	while(helper(x, power) > 10e-16) {
    		taylorNumber += helper(x, power);
    		power++;
    	}
        
        return taylorNumber;
    }
      
      
      
    // Part 3
    /**
     * This program reads words, identifies, counts and writes all the palindromes and the total
     * palindrome count.
     */
    public static void palindromeCheck(){
    	
        // you could use any of the words below to test your method:
        // banana, sneeze, radar, roof, kayak, mine, racer, racecar, refer, james, joyce
        // tattarrattat, toyota, madam, goodbye

       String someWord = ""; // Stores words read from user input
       int count = 0;        // keeps track of Palindrome words only (define algorithm to count # of palindrome words
       int total = 0;        // Counts the total number of lines read from the given text file

       System.out.println(" Enter some words separated by white space");    // Ask for user input
      
       // declare your Scanner object here
       Scanner keyboard = new Scanner(System.in);

       // hint 1: Using keybord.next() will only return what comes before a space.
       // hint 2: Using keybord.nextLine() automatically reads the entire current line.
       
       // for each word user enters
       while (keyboard.hasNext()) {
           someWord = keyboard.next();          // store each word in a string variable and then do your operations
           total++;                             // increment number of words as you read each one
           boolean palindrome = true; 
           for(int i = 0; i < someWord.length(); i++) {
        	   if(someWord.charAt(i) != someWord.charAt(someWord.length()-1-i)) {
        		   palindrome = false;
        		   break;
        	   }
           }
           if(palindrome == true) {
        	   total++;
           }
           count++;
           if (someWord.equals("exit")) {
        	   break;
           }
           // #1. Code your logic for how to determine if a word is Palindrome first, then complete # 2
           

          
          System.out.println("  " + total + " " + someWord);   // test
        }
       
        // if encountered ENTER then close scanner stream and terminate
        keyboard.close();
      
       
           // x is a variable for count and y is variable total
           // #2. print “There are x palindromes out of y words” 
    
        }

       // Part 4 goes here, write a menu using the following specifications
       
		//Welcome to Lab5!
		//Enter 1 to check how long it takes to get rich on a magic dollar coin. 
		//Enter 2 to calculate e^x for any real x. 
		//Enter 3 to enter palindrome words.
		//Enter 4 to re-print the menu. 
		//Enter 0 to exit. 
		
		// -- Sample outputs, delete these after completing the lab and verifying your output --
		//What is your choice? 3        
		//Enter an x: 1 e^1 = 2.7182818284590452  
		//What is your choice? 0 
		//Thanks for participating! Goodbye. 


    }



 

