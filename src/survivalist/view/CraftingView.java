/*
THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.ProgramControl;

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
            + "\nH - Get Help on how to use the Crafting Menu"
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
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "K": // craft a knife
                // ********INSERT FUNCTION HERE**********
                break;
            case "B": // craft a bow
                // ********INSERT FUNCTION HERE**********
                break;
            case "A": // craft arrows
                // ********INSERT FUNCTION HERE**********
                break;
            case "M": // craft a machete
                // ********INSERT FUNCTION HERE**********
                break;
            case "X": // craft an axe
                // ********INSERT FUNCTION HERE**********
                break;
            case "T": // craft a hammer
                // ********INSERT FUNCTION HERE**********
                break;
            case "F": // craft flint and stone
                // ********INSERT FUNCTION HERE**********
                break;
            case "G": // craft a grappling hook
                // ********INSERT FUNCTION HERE**********
                break;
            case "Q": // Exit to previous menu
                // ********INSERT FUNCTION HERE**********
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}