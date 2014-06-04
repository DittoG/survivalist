/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.view;

import java.util.Scanner;
import survivalist.Survivalist;
import survivalist.control.ProgramControl;

/**
 *
 * @author Madison
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n------------------------------------------------"
            + "\n| Main Menu                                    |"
            + "\n------------------------------------------------"
            + "\nG - Start game"
            + "\nH - How to Play"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n------------------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'Q'); // a selection is not Exit
        
    }

    public void doAction(char choice) {
        
        switch (choice) {
            case 'G': // display the game menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayMenu();
                break;
            case 'H': // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                break;
            case 'S': // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case 'Q': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }

    public String getInput() {
        boolean valid = false; // indicates if Input has been received
        String Input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while input has not been received
            
            // get the input from the keyboard and trim off the blanks
            Input = keyboard.nextLine();
            Input = Input.trim();
            
            if (Input.toUpperCase().equals("Q")) { // Quitting?
                return null;
            }
            else {
                valid = true; // signal that a valid Input was entered
            }
        }
        
        return Input; // return the input
    }
}
