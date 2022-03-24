package edu.wpi.YodelingYoshis;

import java.util.Scanner;

/** Manages the user interface for the location manager program. */
public class LocationManagerInterface {
  // message to display to show user input options
  final String displayMessage =
          "==========================================================\n"
          + "1 - Location Information\n"
          + "2 – Change Floor and Type\n"
          + "3 – Enter Location\n"
          + "4 – Delete Location\n"
          + "5 – Save Locations to CSV file\n"
          + "6 – Exit Program\n"
          + "==========================================================\n";
  final String inputMessage = "Please enter a number from 1 to 6."; // Message to prompt user input
  final String inputErrorMessage = "Input error."; // Message for user input error

  /** Starts the location manager user interface in the command line/console. */
  public void start() { // starts the interface
    System.out.println("\n");
    while (true) {
      System.out.println(displayMessage);
      System.out.println(inputMessage);
      int num = getInput();
      if (num == -1)
        continue; // if the user entered an invalid number, continue to the next iteration of the
      // loop
      switch (num) {
        case 1:
          // do something
          break;
        case 2:
          // do something
          break;
        case 3:
          // do something
          break;
        case 4:
          // do something
          break;
        case 5:
          // do something
          break;
        case 6: // exit condition
          System.exit(0); // exit the program
        default: // if the user entered an invalid number, continue to the next iteration of the
          // loop
          System.out.println(inputErrorMessage);
          break;
      }
    }
  }

  /**
   * Gets the user input and returns it as an integer.
   *
   * @return the number that the user entered or -1 if the user entered an invalid number
   */
  public int getInput() {
    Scanner scanner = new Scanner(System.in); // Scanner for user input
    String input = scanner.next();
    int num = -1;

    // try to parse input as a number
    try {
      num = Integer.parseInt(input);
    } catch (Exception e) {
      System.out.println(inputErrorMessage);
    }
    return num;
  }
}
