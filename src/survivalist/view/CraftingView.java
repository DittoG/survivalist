/*
THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.Constants;
import survivalist.control.InventoryControl;
import survivalist.model.Item;

/**
 *
 * @author Madison
 */
public class CraftingView extends View{
    
    public CraftingView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|               Crafting Menu                  |"
            + "\n------------------------------------------------"
            + "\nH - Get Help on Crafting"
            + "\nK - Knife"
            + "\nB - Bow"
            + "\nA - Arrows"
            + "\nM - Machete"
            + "\nX - Axe"
            + "\nT - Hammer"
            + "\nF - Flint and Stone"
            + "\nG - Grappling Hook"
            + "\nQ - Exit to previous menu"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "H": // display the help menu
                HelpCraftView helpCraftView = new HelpCraftView();
                helpCraftView.display();
                break;
            case "K": // craft a knife
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.KNIFE]);
                break;
            case "B": // craft a bow
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.BOW]);
                break;
            case "A": // craft arrows
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.ARROW]);
                break;
            case "M": // craft a machete
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.MACHETE]);
                break;
            case "X": // craft an axe
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.AXE]);
                break;
            case "T": // craft a hammer
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.HAMMER]);
                break;
            case "F": // craft flint and stone
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.FLINTANDSTONE]);
                break;
            case "G": // craft a grappling hook
                this.craftItem(Survivalist.getCurrentGame().getInventory()[Constants.GRAPPLINGHOOK]);
                break;
            case "Q": // Exit to previous menu
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
    
    private void craftItem(Item item) {
        
        // get required resources from item
        
        Item[] requiredResources = item.getRequiredResources();
        
        // check to see if required resources are available
        
        boolean adequateResources = InventoryControl.checkAvailableResources(requiredResources);
        
        // IF required resources are available
        
        if(adequateResources) {
            double actualQuantity = item.getActualQuantity();
            actualQuantity++;
            item.setActualQuantity(actualQuantity);
            
               // craft item AND print "item has been crafted"
            
            System.out.println("You have crafted a " + item.getName());
        }
        
        // ELSE resources are not available
            // print "you don't have the required resources"
        
        else {
            System.out.println("You do not have the required resources to craft that.");
        }
    }
    
}