/*
 * Francis Bui
 * CMIS 141: Rebecca Rowson
 *
 * Homework 4: State Bird & Flower
 *
 * Description of program: The purpose of this program
 * is to allow the user to enter the state name which
 * the program would output the state bird and flower
 */

import java.util.Scanner;

public class TestState {

    public static void main(String[] args) {

        // Initialize variables
        String summary = "";
        String stateScanned;
        Scanner scanner = new Scanner(System.in);


        // Enter do-while loop; typing state will retrieve data, "none" will exit, anything else will continue loop
        do {
            System.out.println();
            System.out.println("Enter a State or None to exit");
            stateScanned = scanner.nextLine();

            // Passed user input to state constructor
            State chosenState = new State(stateScanned.trim());

            if (stateScanned.trim().equalsIgnoreCase(chosenState.getState())) {
                System.out.println("Bird: " + chosenState.getStateBird());
                System.out.println("Flower: " + chosenState.getStateFlower());
                System.out.println();

                // Record data output in an array to be used in thank you summary
                summary = summary + chosenState.getState() + ", " + chosenState.getStateBird() + ", " + chosenState.getStateFlower() + System.lineSeparator();
            } else if (!stateScanned.trim().equalsIgnoreCase(stateScanned)) {
                break;
            }
        }
        while (!stateScanned.trim().equalsIgnoreCase("None"));
        System.out.println();
        System.out.println("* * * * Thank You * * * *");
        System.out.println("A summary report for each State, Bird, and Flower is: ");

        // Data here shows the user's valid search history
        System.out.println(summary);
        System.out.println("Please visit our site again!");


    }
}