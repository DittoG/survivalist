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
            + "\n|                 How to Play                  |"
            + "\n------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nH - How to hunt and gather ingredients"
            + "\nC - How to craft"
            + "\nQ - Return to previous menu"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "G": // display the game goal screen
                HelpGoalView goalView = new HelpGoalView();
                goalView.displayGameGoalView();
                break;
            case "M": // display the move help screen
                HelpMoveView moveView = new HelpMoveView();
                moveView.display();
                break;
            case "H": // display the hunting help screen
                HelpHuntGatherView helpHuntGatherView = new HelpHuntGatherView();
                helpHuntGatherView.display();
                break;
            case "C": // display the crafting help screen
                HelpCraftView helpCraftView = new HelpCraftView();
                helpCraftView.display();
            case "Q": // exit to the previous menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }    
}
