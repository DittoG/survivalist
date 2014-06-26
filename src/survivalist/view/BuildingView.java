/*
THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.BuildingControl;
import survivalist.control.Constants;
import survivalist.control.GameControl;
import survivalist.control.ProgramControl;
import survivalist.model.Building;
import survivalist.model.Location;

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
        
        Location currentLocation = Survivalist.getCurrentGame().getCurrentLocation(); 
        
        switch (choice) {
            case "H": // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "C": // build a cabin
                //do the buildings already exist? are they predefined? 
                //create new cabin or building
                //get location of where you want it to be. *need to make move function.
                Building cabin = Survivalist.getCurrentGame().getBuildings()[Constants.CABIN];
                BuildingControl.addBuildingToLocation(cabin, currentLocation);
                break;
            case "L": // build a lean-to
                // ********INSERT FUNCTION HERE**********
                Building leanTo = Survivalist.getCurrentGame().getBuildings()[Constants.LEANTO];
                BuildingControl.addBuildingToLocation(leanTo, currentLocation);
                break;
            case "T": // build a tower
                // ********INSERT FUNCTION HERE**********
                Building tower = Survivalist.getCurrentGame().getBuildings()[Constants.TOWER];
                BuildingControl.addBuildingToLocation(tower, currentLocation);
                break;
            case "Q": // exit to previous menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
                // should we put return here? 
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
