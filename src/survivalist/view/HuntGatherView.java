/*
 THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */
package survivalist.view;

/**
 *
 * @author Jerry
 */
public class HuntGatherView extends View {

    public HuntGatherView() {
        // go to where the location data is saved
        // check to see if the location has been explored yet
        // if the player has not yet explored the area, display the option to explore.
        // if the player has explored the area, display the following options.
        super("\n"
                + "\n------------------------------------------------"
                + "\n|          Hunting and Gathering Menu          |"
                + "\n------------------------------------------------"
                + "\nH - Get Help on Hunting and Gathering"
                + "\nT - Hunt"
                + "\nG - Gather"
                + "\nQ - Exit to previous menu"
                + "\n------------------------------------------------");
    }

    @Override

    public void doAction(String choice) {

        switch (choice) {
            case "H": // display the help menu
                HelpHuntGatherView HelpHuntGatherView = new HelpHuntGatherView();
                HelpHuntGatherView.display();
                break;
            case "T": // hunt
                // ********INSERT FUNCTION HERE**********
                break;
            case "G": // gather ingredients or food
                // ********INSERT FUNCTION HERE**********
                break;
            case "Q": // Exit to previous menu
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
}
