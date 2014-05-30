/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.view;

import java.util.Scanner;
import survivalist.control.ProgramControl;
import survivalist.model.Player;

/**
 *
 * @author Madison
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram() {
        
        // Display the banner screen
        this.displayBanner();
        
        // prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        // Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // Display the Main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
    }

    public void displayBanner() {
        System.out.println("\n\n************************************************");
        
        System.out.println("*                                              *"
                       + "\n* You are a college student going to visit     *"
                       + "\n* your uncle in western Canada. He is flying   *"
                       + "\n* you there in his small bushplane when a      *"
                       + "\n* storm appears and crashes the plane into a   *"
                       + "\n* lake. Suddenly you are in the middle of      *"
                       + "\n* nowhere, left to survive with only what you  *"
                       + "\n* have with you. Do you have what it takes?    *");
        
        System.out.println("*                                              *"
                       + "\n* The Canadian wilderness is a harsh place.    *"
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
                       + "\n* to civilization and see your family again.   *");
        
        System.out.println("*                                              *"
                       + "\n*     Good luck! You're going to need it!      *"
                       + "\n*                                              *");
        
        System.out.println("************************************************");
    }

    public String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.toUpperCase().equals("Q")) { // Quitting?
                return null;
            }
            
            // if the name is invalid (non-blank and < two characters)
            if (playersName.length() < 2) {
                // display an error
                System.out.println("Invalid name - the name must be non blank "
                                 + "and greater than one character in length");
            }
            else {
                valid = true; // signal that a valid name was entered
            }
        }
        
        return playersName; // return the name
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n================================================");
        System.out.println("\tWelcome to the game " + player.getName() + ".");
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("================================================");
        
    }
    
}
