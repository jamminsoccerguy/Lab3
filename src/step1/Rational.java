package step1;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

import java.util.Scanner;

/**
 * Lab 3: Step 1: Screen Input and Output
 */
public class Rational {

    //field variables
    private int numerator;
    private int denominator;

    //constructor
    public Rational(int numerator, int denominator){
        this.numerator = numerator;

        if(denominator == 0){
            throw new IllegalArgumentException("Error: Denominator can't be 0!");
        }
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Error: Denominator can't be 0!");
        }
        this.denominator = denominator;
    }

    //Returns the reciprocal of the rational number
    public Rational reciprocal(){
        return new Rational(denominator, numerator);
    }

    //Adds the rational number to another one that's passed as a parameter
    //	-finds the common denominator by multiplying the two denominators
    public Rational addRational(Rational rational2){
        int commonDenominator = denominator * rational2.getDenominator();
        int numerator1 = numerator * rational2.getDenominator();
        int numerator2 = rational2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new Rational(sum, commonDenominator);
    }

    //Subtracts the rational number passed as a parameter from the first rational number
    //	-finds the common denominator by multiplying the two denominators
    public Rational subRational(Rational rational2){

        int commonDenominator = denominator * rational2.getDenominator();
        int numerator1 = numerator * rational2.getDenominator();
        int numerator2 = rational2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new Rational(difference, commonDenominator);
    }

    //Multiplies the rational number by another one that's passed as a parameter
    public Rational mulRational(Rational rational2){

        int numerator = this.numerator * rational2.getNumerator();
        int denominator = this.denominator * rational2.getDenominator();

        return new Rational(numerator, denominator);
    }

    //Divides the rational number by another one that's passed as a parameter.
    //	-multiplies by the reciprocal of the 2nd rational
    public Rational divRational(Rational rational2){
        return mulRational(rational2.reciprocal());
    }

    //promts user to input a number for a numerator and denominator
    public void setRational(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter an Integer for a Numerator: ");

        int numerator = scan.nextInt();
        setNumerator(numerator);

        System.out.print("Please Enter an Integer for a Denominator: ");

        int denominator = scan.nextInt();
        setDenominator(denominator);
    }

    //returns a string representation of a rational.
    public String toString(){

        String result;

        if(getNumerator() == 0){
            result = "0";
        }
        else if(getDenominator() == 1){
            result = getNumerator() + "";
        }
        else{
            result = getNumerator() + "/" + getDenominator();
        }

        return result;
    }


    //tests Rational class
    public static void main(String[] args) {

        Rational ration = new Rational(5, 6); //original rational

        //display original rational
        System.out.println("Original Rational is: " + ration.toString());
        System.out.println("Numerator: " + ration.getNumerator());
        System.out.println("Denominator: " + ration.getDenominator());

        System.out.println();

        ration.setRational(); //get input from user

        //display new rational
        System.out.println("\nNew Rational is: " + ration.toString());
        System.out.println("Numerator: " + ration.getNumerator());
        System.out.println("Denominator: " + ration.getDenominator());

        System.out.println("\nSum = " + ration.addRational(new Rational(1,2))); //add two rationals
    }
}
