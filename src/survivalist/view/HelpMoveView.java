/*
THIS PAGE ONLY NEEDS THE TEXT FILLED OUT
 */

package survivalist.view;

/**
 *
 * @author Jerry
 */
public class HelpMoveView extends View{
    
    public HelpMoveView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|                 How to Move                  |"
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
