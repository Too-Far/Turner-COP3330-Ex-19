/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class App
{
    public static void performCalc(float height, float weight) {
        DecimalFormat df = new DecimalFormat("0.00");
        float bmi = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + df.format(bmi));
        if ( bmi < 26.0 && bmi > 18.5) {
            System.out.println("You are within the ideal weight range");
        } else if (bmi < 18.5) {
            System.out.println("You are underweight, you should consult your doctor.");
        } else if (bmi >= 26) {
            System.out.println("You are overweight, you should consult your doctor.");
        }

    }

    public static void collectUserData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float weight;
        float height;
        while (true){
            try {
                System.out.println("Please enter your weight: ");
                weight = Float.parseFloat(reader.readLine());
                break;
            } catch (InputMismatchException e)
            {
                //
            }
        }

        while (true) {
            try {
                System.out.println("Please enter your height in inches: ");
                height = Float.parseFloat(reader.readLine());
                break;
            } catch (InputMismatchException e) {
                //
            }
        }
        performCalc(height, weight);
    }
    public static void main( String[] args ) throws IOException {
        collectUserData();
    }
}
