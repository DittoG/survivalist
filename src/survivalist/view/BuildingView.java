/*
THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */

package survivalist.view;

/**
 *
 * @author Madison
 */
public class BuildingView extends View{
    
    public BuildingView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|               Building Menu                  |"
            + "\n------------------------------------------------"
            + "\nH - Get help on how to build"
            + "\nC - Cabin"
            + "\nL - Lean-to"
            + "\nT - Tower"
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
            case "C": // build a cabin
                // ********INSERT FUNCTION HERE**********
                break;
            case "L": // build a lean-to
                // ********INSERT FUNCTION HERE**********
                break;
            case "T": // build a tower
                // ********INSERT FUNCTION HERE**********
                break;
            case "Q": // exit to previous menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
