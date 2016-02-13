package step4;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

import java.util.Scanner;

/**
 * Lab 3: Step 5: Reverse, All over again
 */
public class ReverseInteger2 {

    //instance variable
    //int reversedNum = 0;
    //int input = 0;

    //Reverses an integer using a recursive process
    public int reverse2(int num){

        //input = num;

        if(num < 10){ //if single digit
            return num;
            //return reversedNum;
            //reversedNum = reversedNum * 10 + num; //add num to reversedNum and multiply by 10 to "push" the digit to the left
        }
        else{

            //reversedNum = (num % 10) * 10 + reverse2(num / 10);

            //reversedNum = num % 10;
            //reverse2(num / 10);

            //reversedNum = reversedNum * 10 + (num % 10); //%10 to get rightmost digit, add to reversedNum and multiply by 10
            //num = (num / 10); //chops off the rightmost digit and re-runs the reverse2 method to iterate through all of the digits

            return (num % 10) * (int)Math.pow(10, (int)Math.log10(num)) + reverse2(num / 10);
        }
        //return reversedNum;
        //return reverse2(num);
    }


    //test ReverseInteger2 class
    public static void main(String[] args) {

        //create objects
        ReverseInteger2 rev = new ReverseInteger2();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter an Integer: ");
        int input = scan.nextInt();

        while(input < 0){
            System.out.println("Error: Number must be greater than or equal to 0.");
            System.out.print("\nPlease Enter an Integer: ");
            input = scan.nextInt();
        }

        System.out.println("The Reverse of the Integer " + input + " = " + rev.reverse2(input));
        System.out.println("The 'Double' Reverse of the Integer " + input + " = " + rev.reverse2(rev.reverse2(input)));
    }
}
