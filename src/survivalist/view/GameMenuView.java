/*
THIS PAGE IS FINISHED
 */

package survivalist.view;

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
            + "\n|               Game Menu                      |"
            + "\n------------------------------------------------"
            + "\nH - Get help on how to play the game"
            + "\nM - Map/Move menu"
            + "\nE - Hunt and Gather Menu"
            + "\nI - Inventory"
            + "\nC - Crafting Menu"
            + "\nB - Building Menu"
            + "\nS - Save game"
            + "\nQ - Exit to previous menu"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "H": // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "M": // display the map/move menu
                MapView mapMenu = new MapView();
                mapMenu.display();
                break;
            case "E": // display the exploring menu
                LocationView locationMenu = new LocationView();
                locationMenu.display();
                break;
            case "I": // save the inventory menu
                InventoryView inventoryMenu = new InventoryView();
                inventoryMenu.display();
                break;
            case "C": // display the crafting menu
                CraftingView craftingMenu = new CraftingView();
                craftingMenu.display();
                break;
            case "B": // display the building menu
                BuildingView buildingMenu = new BuildingView();
                buildingMenu.display();
                break;
            case "S": // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "Q": // Exit to previous menu
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
