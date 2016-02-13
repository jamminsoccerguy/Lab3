package step2;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

import java.util.Scanner;

/**
 * Lab 3: Step 2: To the max
 */
public class ToTheMax {

    //finds the maximum digit in a number using iterative process
    public int maxDigit(int num){

        //local variable
        int maxNum = 0;

        while(num > 0){

            int rightDigit = num % 10; //takes just the right most digit in num
            num /= 10; //removes the right most digit in num

            if(rightDigit > maxNum){
                maxNum = rightDigit;
            }
        }
        return maxNum;
    }

    //test ToTheMax class
    public static void main(String[] args) {

        //create objectrs
        ToTheMax max = new ToTheMax();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter an Integer: "); //promt user
        int input = scan.nextInt();

        while(input < 0){ //validates that the input is greater than or equal to 0
            System.out.println("Error: Number must be greater than or equal to 0.");
            System.out.print("\nPlease Enter an Integer: ");
            input = scan.nextInt();
        }

        System.out.println("Largest Digit = " + max.maxDigit(input));
    }
}
