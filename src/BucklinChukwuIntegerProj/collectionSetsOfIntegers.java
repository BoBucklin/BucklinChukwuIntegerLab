package BucklinChukwuIntegerProj;
import java.util.*;

/* I wouldn't be against using this class for the rest of the methods and commands.
Feel like it'll be a bit easier that way. Let me know. */
public class collectionSetsOfIntegers {
    private final List<SetEntry> sets; // List of stored sets
    private int selectedIndex = -1; // Index of the currently selected set (-1 if none)

    public collectionSetsOfIntegers() {
        sets = new ArrayList<>();
    }

    private static class SetEntry {
        String label;
        Set<Integer> values;
        String state;

        SetEntry(String label, Set<Integer> values, String state) {
            this.label = label; // Assigned A, B, C, etc.
            this.values = values; // The actual set of integers
            this.state = state; // The state: increasing, decreasing, or random
        }
    }
    // Main method which handles the commands
    public void handleCommand(String command, String input) {
        switch (command.toLowerCase()) {
            case "new":
                addNewSet(input);
                break;
            case "show":
                showSets();
                break;
            default:
            	// I added this as a placeholder. We will delete this once we add all the commands
                System.out.println("Command not found.");
        }
    }
    /* This adds a new set of integers to the collection and removes duplicates, assigns a label,
    and initializes state to "random". */
    private void addNewSet(String input) {
        Set<Integer> newSet = new LinkedHashSet<>(); // Preserves order and eliminates any duplicates
        
        // Parse input string and collect integers
        if (input != null && !input.trim().isEmpty()) {
            Scanner lineScanner = new Scanner(input);
            while (lineScanner.hasNext()) {
                if (lineScanner.hasNextInt()) {
                    newSet.add(lineScanner.nextInt());
                } else {
                    lineScanner.next(); // skip non-integer tokens
                }
            }
            lineScanner.close();
        }

        // Assigns the next alphabetical label (A, B, C, etc.)
        char labelChar = (char) ('A' + sets.size());
        String label = String.valueOf(labelChar);
        
       // Creates and stores the new set
        SetEntry entry = new SetEntry(label, newSet, "random");
        sets.add(entry);

        // Displays a confirmation to the user that a new set is added
        System.out.printf("A new set, %s, has been added: [random] %s%n", label, newSet);
    }

    /* Displays all sets in the collection, one per line, labeled with letters
    Any set that is currently selected is marked with an asterisk */
    private void showSets() {
        if (sets.isEmpty()) {
            System.out.println("There are no sets");
            return;
        }

        for (int i = 0; i < sets.size(); i++) {
            SetEntry entry = sets.get(i);
            String selectionMark = (i == selectedIndex) ? "*" : " ";
            System.out.printf("%s. [%s] %s%n", entry.label + selectionMark, entry.state, entry.values);
        }
    }
}

/* (this switch statement may change location within or out of the class)
 * New, Sort, Reverse, Randomize, Save, Show, Select, Delete, Restore, Quit

switch(displayMenu) {
	case New: Prompt the user for a sequence of whitespace-separated integers terminated by a <RETURN>
break;
case Sort: If there is no currently selected set, print a warning message, "There is no currently selected set to sort."  Otherwise, sort the selected set in increasing order and change the set’s state to "increasing"
break;
case Reverse: If there is no currently selected set, print a warning message, "There is no currently selected set to reverse."  Otherwise, reverse the order of the elements within the currently selected set. If the state of the set was random, it remains "random"
break;
case Randomize: If there is no currently selected set, print a warning message, "There is no currently selected set to randomize."  Otherwise, randomly order the elements of the set and set its state to "random" and print an acknowledgement.
break;
case Save: Prompt the user for a name, N, and save the current state of the system in a file named 'N.txt'.  If there is already a file by that name, overwrite it.
break;
case Show: Output each set on its own line, each line annotated with a letter. The first set should be "A", the second "B", etc.  The currently selected set should be annotated with an '*'.
break;
case Select: Should prompt the user for a letter to make the corresponding set the currently selected set. It should print an acknowledgement.
break;
case Restore: Prompt the user for a name, N, and set the state of the system to match that stored in the file named 'N.txt'. 
break;
case Quit: Terminate the program, outputting an acknowledgement: "Quitting the program."
break;
default:
 */
// Stubs
//public void set(boolean addSetofIntegers) { System.out.println("This is for adding a new set of Integers to the collection"); return;}
//public void delete(boolean voidDeleteSets) { System.out.println("Deletes set at the particular index"); return;} // int index
//public List list(boolean integerSet) { System.out.println("This is for adding a new set of Integers to the collection"); return null;}
//public void save(boolean saveFileName) { System.out.println("Saves current sets"); return;} // string
//public void restore(boolean restoreFileName) { System.out.println("Stores the previous version of the sets from the file"); return;} // string