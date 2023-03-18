package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * IntegerWrapper class.
 * @author SoheeHwang
 * @version 2023
 *
 */
public class IntegerWrapper {
    /**
     * Drives the program.
     * @param args unused.
     */
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a integer number.");
        Integer originalInput = scan.nextInt();
        System.out.println("The number you enter is " + originalInput + " .");
        System.out.println("The original number comverts to base 2 is " 
                + Integer.toBinaryString(originalInput) + " .");
        System.out.println("The original number comverts to base 8 is " 
                + Integer.toOctalString(originalInput) + " .");
        System.out.println("The original number comverts to base 16 is "
                + Integer.toHexString(originalInput) + " .");

        System.out.println("The maximum possible Java integer values is " 
                + Integer.MAX_VALUE);
        System.out.println("The minimum possible Java integer values is " 
                + Integer.MIN_VALUE);

        System.out.println("Please enter two integers, one per line.");
        String number1 = scan.next();
        String number2 = scan.next();
        System.out.println("The sum of these two number is "
                + (Integer.parseInt(number1) + Integer.parseInt(number2)));
        
        scan.close();

    }

}
