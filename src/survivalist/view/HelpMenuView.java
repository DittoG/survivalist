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
public class HelpMenuView extends View{
  
    public HelpMenuView() {

            super("\n"
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
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "G": // display the game menu
                GameGoalView goalView = new GameGoalView();
                goalView.displayGameGoalView();
                break;
            case "H": // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "S": // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "Q": // Return to MainMenuView
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }    
}
