/*
 THIS PAGE IS FINISHED
 */
package survivalist.view;

import java.util.Scanner;

/**
 *
 * @author Jerry
 */
public class HelpGoalView {

    private final String GOALVIEW = "\n"
            + "\n* You are a college student going to visit     *"
            + "\n* your uncle in western Canada. He is flying   *"
            + "\n* you there in his small bushplane when a      *"
            + "\n* storm appears and crashes the plane into a   *"
            + "\n* lake. Suddenly you are in the middle of      *"
            + "\n* nowhere, left to survive with only what you  *"
            + "\n* have with you. Do you have what it takes?    *"
            + "\n*                                              *"
            + "\n*                                              *"
            + "\n* The Canadian wilderness is a harsh place.    *"
            + "\n* The Canadian wilderness is a harsh place.    *"
            + "\n* To survive you will have to use everything   *"
            + "\n* To survive you will have to use everything   *"
            + "\n* at your disposal. You must quickly craft     *"
            + "\n* tools, clothing, and some kind of shelter    *"
            + "\n* to protect you from the deadly elements.     *"
            + "\n* You must forage or hunt for food, which will *"
            + "\n* require weapons; you must craft these if you *"
            + "\n* wish to slay the local beasts. Be wary, for  *"
            + "\n* many of them will fight back viciously! At   *"
            + "\n* some point you will need to discover a way   *"
            + "\n* out of the wilderness, if you wish to return *"
            + "\n* to civilization and see your family again.   *"
            + "\n*                                              *"
            + "\n*     Good luck! You're going to need it!      *"
            + "\n*                                              *"
            + "\n*******Press Q to return to the help menu*******";

    public void displayGameGoalView() {

        char selection = ' ';
        do {

            System.out.println(GOALVIEW); // display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); // do action based on selection

        } while (selection != 'Q'); // a selection is not "Exit"
    }

    public void doAction(char choice) {

        switch (choice) {
            case 'Q': // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }

    public String getInput() {
        boolean valid = false; // indicates if input has been received
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { // while input has not been received

            // get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();

            if (input.equals("Q")) { // Returning to previous menu?
                return input;
            } else {
                valid = true; // signal that a valid input was entered
            }
        }

        return input; // return the input
    }
}
