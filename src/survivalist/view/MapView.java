/*
THIS PAGE HAS NOT YET BEEN CUSTOMIZED
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.ProgramControl;

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
            + "\n*******Press Q to return to the game menu*******"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "H": // display the help menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
            case "E": // display the exploring menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "I": // save the inventory menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "C": // display the crafting menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "B": // display the building menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "M": // display the hunting/gathering menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "S": // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "Q": // Exit the game
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
