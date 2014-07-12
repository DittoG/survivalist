/*
 THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */
package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.BuildingControl;
import survivalist.control.Constants;
import survivalist.model.Building;
import survivalist.model.Location;

/**
 *
 * @author Madison
 */
public class BuildingView extends View {

    public BuildingView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n|                Building Menu                 |"
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
                Building cabin = Survivalist.getCurrentGame().getBuildings()[Constants.CABIN];
                BuildingControl.addBuildingToLocation(cabin, currentLocation);
                break;
            case "L": // build a lean-to
                Building leanTo = Survivalist.getCurrentGame().getBuildings()[Constants.LEANTO];
                BuildingControl.addBuildingToLocation(leanTo, currentLocation);
                break;
            case "T": // build a tower
                Building tower = Survivalist.getCurrentGame().getBuildings()[Constants.TOWER];
                BuildingControl.addBuildingToLocation(tower, currentLocation);
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
