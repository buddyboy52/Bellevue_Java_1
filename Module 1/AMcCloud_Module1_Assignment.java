/**
 * Andrew McCloud
 * 10/16/2022
 * Module 1 Assignment
 * 
 * The purpose of this assignment is to understand the differences between
 * floats and integers
 */

public class AMcCloud_Module1_Assignment {

    // Create a class to display results of the float
    static void floats() {

        // Print the results to a line in the terminal
        System.out.println(4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0));

    }

    // Create a function for the integers
    static void integers() {

        // Print the results to a line in the terminal
        System.out.println(4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13));

    }

    // Our main method to run the program
    public static void main(String[] args) {

        // Call the floats function
        floats();

        // Call the Integers function
        integers();

    }

}
