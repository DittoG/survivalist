/*
THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */

package survivalist.view;

/**
 *
 * @author Madison
 */
public class LocationView extends View{
    
    public LocationView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|                  Area Menu                   |"
            + "\n------------------------------------------------"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\nE - Explore the area"
            + "\nQ - Exit to previous menu"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "E": // Explore the location
                // ********INSERT FUNCTION HERE**********
                break;
            case "Q": // Exit to previous menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
