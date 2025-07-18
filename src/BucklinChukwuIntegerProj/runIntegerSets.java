package BucklinChukwuIntegerProj;
import java.util.*;

public class runIntegerSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        collectionSetsOfIntegers collection = new collectionSetsOfIntegers();
        String command;
        // Do-while loop allows users to enter integers as many times as they want
        do {
            System.out.print("\nCommand Menu: show, new, quit\nEnter command: ");
            // I added the "quit" command just so that it'll be easier to exit the program
            command = scanner.nextLine().trim().toLowerCase();
            
            // Switch statement contains, for now, three commands and prompts the user to enter an input
            switch (command) {
                case "new":
                    System.out.print("Enter a set of integers (whitespace-separated), then press <RETURN>: ");
                    String input = scanner.nextLine();
                    collection.handleCommand("new", input);
                    break;
                case "show":
                    collection.handleCommand("show", null);
                    break;
                case "quit":
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Unrecognized command.");
            }
          // Program terminates
        } while (!command.equals("quit"));

        scanner.close();
    }
}