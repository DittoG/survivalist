/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.view;

import java.util.Scanner;

/**
 *
 * @author rtacklingman50
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {

        String value;

        do {
            System.out.println(this.promptMessage); // display the main menu
            value = this.getInput(); // get the user's selection
            this.doAction(value); // do action based on selection

        } while (!value.equals("Q"));

    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        boolean valid = false; // indicates if input has been received
        String selection = null;

        while (!valid) { // while input has not been received

            System.out.println("\t\nEnter your selection below:");

            // get the input from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            selection = selection.toUpperCase();

            if (selection.length() < 1) { // blank value entered
                System.out.println("\n*** Invalid Selection *** Try Again");
                continue;
            }
            break;
        }

        return selection; // return the selection
    }
}
