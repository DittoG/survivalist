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
public class GameMenuView extends View{
    
    public GameMenuView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n| Game Menu                                    |"
            + "\n------------------------------------------------"
            + "\nH - Get help on how to play the game"
            + "\nE - Exploring Menu"
            + "\nI - Inventory"
            + "\nC - Crafting Menu"
            + "\nB - Building Menu"
            + "\nM - Hunting/Gathering Menu"
            + "\nS - Save game"
            + "\nQ - Exit"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "H": // display the help menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
            case "E": // display the exploring menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "I": // save the inventory menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "C": // display the crafting menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "B": // display the building menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "M": // display the hunting/gathering menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "S": // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "Q": // Exit the game
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
