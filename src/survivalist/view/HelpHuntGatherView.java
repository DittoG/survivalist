/*
THIS PAGE ONLY NEEDS THE TEXT FILLED OUT
 */

package survivalist.view;

/**
 *
 * @author Jerry
 */
public class HelpHuntGatherView extends View{
    
    public HelpHuntGatherView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|            How to Hunt and Gather            |"
            + "\n------------------------------------------------"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n*******Press Q to return to the help menu*******"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "Q": // Return to previous menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
