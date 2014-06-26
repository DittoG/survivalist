/*
THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */

package survivalist.view;

import survivalist.control.InventoryControl;
import survivalist.model.Item;

/**
 *
 * @author Madison
 */
public class InventoryView extends View{
    
    public InventoryView() {
        // display sorted list of inventory items and their actualQuantity/possibleQuantity
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
            case "Q": // Exit to game menu
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
    }
    
    public void displayInventoryList() {
    // get sorted list of inventory items
    Item[] sortedList = InventoryControl.getSortedList();
    // go through each item in the list
        for (Item item : sortedList) {
            System.out.println(item.getName() + " " + item.getActualQuantity() + "/" + item.getPossibleQuantity());
        }
        
        
        
    }
    
}
