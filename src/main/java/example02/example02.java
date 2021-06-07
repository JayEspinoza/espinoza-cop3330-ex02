/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 2 - Counting the Number of Characters
 *  Create a program that prompts for an input string and displays output
 *  that shows the input string and the number of characters the string contains.
 *
 *  Constraint:
 *  Be sure the output contains the original string.
 *  Use a single output statement to construct the output.
 *  Use a built-in function of the programming language to determine
 *  the length of the string.
 *
 */

package example02;
import java.util.Scanner;

public class example02 {
    public static void main(String [] args)
    {
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        String name;

        // User Input Step
        System.out.print("What is the input string?");
        name = userInput.nextLine();

        // Single statement output contains original string
        System.out.print(name + " has " + (name.length() - 1) + " characters.");

    }
}
