package step2;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

import java.util.Scanner;

/**
 * Lab 3: Step 3: Again, To the Max
 */
public class ToTheMax2 {

    //finds the maximum digit in a number using recursive process
    public int maxDigit2(int num){

        if(num == 0){ //base case: if num == 0, return 0
            return 0;
        }
        return Math.max(num % 10, maxDigit2(num / 10)); //return max of current digit and maxDigit2 of the rest
    }


    //test ToTheMax2 class
    public static void main(String[] args) {

        //create objects
        ToTheMax2 max = new ToTheMax2();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter an Integer: ");
        int input = scan.nextInt();

        while(input < 0){
            System.out.println("Error: Number must be greater than or equal to 0.");
            System.out.print("\nPlease Enter an Integer: ");
            input = scan.nextInt();
        }

        System.out.println("Largest Digit = " + max.maxDigit2(input));
    }
}
