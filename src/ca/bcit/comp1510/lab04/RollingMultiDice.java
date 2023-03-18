package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Drive class for MultiDie.java.
 * @author SoheeHwang
 * @version 2023
 *
 */
public class RollingMultiDice {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many sides for two dice:");
        int userInput1 = scan.nextInt();
        int userInput2 = scan.nextInt();
        
        MultiDie die1 = new MultiDie(userInput1);
        MultiDie die2 = new MultiDie(userInput2);
        
        System.out.println("Roll the die that you rolled:");
        System.out.println("Die1: " + die1 + ", Die2: " + die2);
        
        die1.roll();
        die2.roll();
        System.out.println("\nRoll again:");
        System.out.println("Die1: " + die1 + ", Die2: " + die2);
        
        die1.roll();
        die2.roll();
        System.out.println("\nRoll again:");
        System.out.println("Die One: " + die1 + ", Die2: " + die2);
        
        int sum = die1.getFaceValue() + die2.getFaceValue();
        
        System.out.println("Sum: " + sum);
        
        System.out.println("\nRoll again:");
        sum = die1.roll() + die2.roll();
        System.out.println("Die1: " + die1 + ", Die2: " + die2);
        System.out.println("Sum: " + sum);
        
        scan.close();
    }

}
