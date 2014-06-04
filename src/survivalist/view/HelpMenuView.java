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
public class HelpMenuView {

    private final String HELPMENU = "\n"
            + "\n------------------------------------------------"
            + "\n| How to Play                                  |"
            + "\n------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nH - How to hunt"
            + "\nC - How to craft"
            + "\nR - How to collect resources"
            + "\nQ - Return to previous menu"
            + "\nE - Exit the Program"
            + "\n------------------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do{
            
            System.out.println(HELPMENU); // display the help menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // a selection is not "Exit"
    }
    
    public void doAction(char choice) {
        
        switch (choice) {
            case 'G': // display the game menu
                GameGoalView goalView = new GameGoalView();
                goalView.displayGameGoalView();
                break;
            case 'H': // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                break;
            case 'S': // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case 'Q': // Return to MainMenuView
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMenu();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
    
    public String getInput() {
        boolean valid = false; // indicates if input has been received
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while input has not been received
            
            // get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if (input.equals("Q")) { // Quitting?
                return input;
            }
            else {
                valid = true; // signal that a valid input was entered
            }
        }
        
        return input; // return the input
    }
        
}
