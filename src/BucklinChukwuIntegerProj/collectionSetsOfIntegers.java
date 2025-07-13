package BucklinChukwuIntegerProj;
import java.util.*;
public class collectionSetsOfIntegers {

	public static void main(String[] args) {
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
}
		 */
	}
	// Stubs
	public void set(boolean addSetofIntegers) { System.out.println("This is for adding a new set of Integers to the collection"); return;}
	public void delete(boolean voidDeleteSets) { System.out.println("Deletes set at the particular index"); return;} // int index
	public List list(boolean integerSet) { System.out.println("This is for adding a new set of Integers to the collection"); return null;}
	public void save(boolean saveFileName) { System.out.println("Saves current sets"); return;} // string
	public void restore(boolean restoreFileName) { System.out.println("Stores the previous version of the sets from the file"); return;} // string

}
