/*
THIS PAGE ONLY NEEDS THE TEXT FILLED OUT
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.ProgramControl;

/**
 *
 * @author Jerry
 */
public class HelpCraftView extends View{
    
    public HelpCraftView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|                 How to Craft                 |"
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
            case "Q": // Exit to Help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
