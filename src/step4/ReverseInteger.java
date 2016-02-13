package step4;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

import java.util.Scanner;

/**
 * Lab 3: Step 4: Reversing An Integer
 */
public class ReverseInteger {

    //Reverses an integer using an iterative process
    public int reverse(int num){

        //local variable
        int reversedNum = 0;

        for(int i = num; i != 0; i /= 10){
                                                        //take %10 of i to get rightmost digit, add it to reversedNum. (1234 % 10 = 4)
            reversedNum = reversedNum * 10 + i % 10;  	//Then multiply by 10 to "push" the digit left (4 * 10 = 40)
        }												//Divide i by 10 to cut off rightmost digit (1234 / 10 = 123)
        return reversedNum;								//iterate(repeat) for all digits of num (123 % 10 = 3....etc.)
    }


    //test ReverseInteger class
    public static void main(String[] args) {

        //create objects
        ReverseInteger rev = new ReverseInteger();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter an Integer: ");
        int input = scan.nextInt();

        while(input < 0){
            System.out.println("Error: Number must be greater than or equal to 0.");
            System.out.print("\nPlease Enter an Integer: ");
            input = scan.nextInt();
        }

        System.out.println("The Reverse of the Integer " + input + " = " + rev.reverse(input));
        System.out.println("The 'Double' Reverse of the Integer " + input + " = " + rev.reverse(rev.reverse(input)));
    }
}
