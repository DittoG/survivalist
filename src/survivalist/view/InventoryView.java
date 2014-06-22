/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.ProgramControl;

/**
 *
 * @author Madison
 */
public class InventoryView extends View{
    
    public InventoryView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n|                  Inventory                   |"
                + "\n------------------------------------------------"
                + "\nH - Get Help on how to use the Inventory Menu"
                + "\nW - Weapons"
                + "\nT - Tools"
                + "\nI - Ingredients"
                + "\nF - Food"
                + "\nQ - Exit to previous menu"
                + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "H": // display the Inventory Help Menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "W": // display weapons
                // ********INSERT FUNCTION HERE**********
                break;
            case "T": // display tools
                // ********INSERT FUNCTION HERE**********
                break;
            case "I": // display ingredients
                // ********INSERT FUNCTION HERE**********
                break;
            case "F": // display food
                // ********INSERT FUNCTION HERE**********
                break;
            case "Q": // Exit to game menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
    }
    
}
