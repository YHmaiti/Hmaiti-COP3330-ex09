/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program calculates the gallons of paint needed to paint the ceiling of a room.
// Prompts for the length and width, and assumes one gallon covers 350
// square feet. Displays the number of gallons needed to paint the ceiling
// as a whole number.

package org.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // Set a constant to hold the conversion rate
        final int conversionRate = 350;

        // Prompt the user for the length and the width if the ceiling
        // and store it in the respective variables through using conversion
        // to integers
        System.out.print("What is the length of the ceiling? ");
        int length = Integer.valueOf(scanner.nextLine());
        System.out.print("What os the width of the ceiling? ");
        int width = Integer.valueOf(scanner.nextLine());

        // calculate the area and store it
        // create a variable gallonNum to store the num of gallons
        int area = length * width;
        int gallonNum = 1;

        // determine the number of gallons needed based on the comparison
        // of the area and the conversion rate
        if (area < conversionRate) {

            gallonNum = 1;

        }else if (area > conversionRate) {

            gallonNum += (area / conversionRate);

        }

        // handle pluralization of the output
        if (gallonNum == 1) {

            System.out.print("You will need to purchase " + Math.round(gallonNum) + " gallon of paint to cover " + area + " square feet.");

        }else {

            System.out.print("You will need to purchase " + Math.round(gallonNum) + " gallons of paint to cover " + area + " square feet.");

        }

    }

}
