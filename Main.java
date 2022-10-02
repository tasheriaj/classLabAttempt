package javaVariables;

import java.util.*;
public class Main {
public static void main(String[] args) {
	
 Scanner userInput = new Scanner(System.in);
 
 
System.out.println("Welcome to Find my Magic Number!" );
System.out.println("Im AddMe Sums!" + "Whats your name?");

String name = userInput.nextLine();


System.out.println("Cool! Nice to meet you " +  name + "!");
System.out.println("We are going to use some your name plus some \nbasic math skills to find \nyour magic number");
System.out.println("To begin, count the letters in your name and enter it below:");
int nameNumber = userInput.nextInt();
System.out.println("Let's start with some addition!"); 
System.out.println("Enter a number from 1-10:");

int a = userInput.nextInt();
System.out.println("Enter another number from 1-10:");

int b = userInput.nextInt();
int sum0 = a + b;

System.out.println("Now let's add " + a + " and " + b + " together! ");
try {
   
    // pause for 2 seconds
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace(); 
}
System.out.println(sum0);
try {
	   
    // pause for 2 seconds
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace(); 
}
System.out.println("How about some substraction!"); 
System.out.println("Enter a number from 10-20:");

int c = userInput.nextInt();
System.out.println("Enter another number from 1-10:");

int d = userInput.nextInt();
int sum1 = c - d;
System.out.println("Let's substract " + c + " from " + d + "  to get the final number! ");
try {
	   
    // pause for 2 seconds
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace(); 
}
System.out.println(sum1);

try {
	   
    // pause for 2 seconds
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace(); 
    
}
System.out.println("Let's switch it up a bit and take both answers from \nyour addition and subtraction problem and "
		+ "multiply them!"); 
int sum2 = sum0 * sum1;
try {
	   
    // pause for 2 seconds
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace(); 
    
}
System.out.println(sum2);

int sum3 = sum2 / nameNumber;
int magicNum = 3;
int finalsum = sum3%magicNum;
try {
	   
    // pause for 2 seconds
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace(); 
    
}
System.out.println("Awesome!" + " Now let's take " + sum2 + " and \ndivide it by " + nameNumber + "!");
try {
	   
    // pause for 2 seconds
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace(); 
    
}


System.out.println("Wow! We're so close to getting your magic number! \nSay the magic words" + " AddMe Sums" + " and it's yours!");
System.out.println(finalsum);
}
}