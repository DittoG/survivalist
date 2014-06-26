/*
THIS PAGE ONLY NEEDS THE CORRECT FUNTIONS IMPLEMENTED
 */

package survivalist.view;

/**
 *
 * @author Madison
 */
public class MapView extends View{
    
    public MapView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|               Map/Move Menu                  |"
            + "\n------------------------------------------------"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n*******Press Q to return to previous menu*******"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "S": // move the player according to their row/column input
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
