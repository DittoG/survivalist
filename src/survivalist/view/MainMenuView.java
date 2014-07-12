/*
 THIS PAGE ONLY NEEDS THE CORRECT FUNCTIONS IMPLEMENTED
 */
package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.GameControl;
import survivalist.control.ProgramControl;

/**
 *
 * @author Madison
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n|                 Main Menu                    |"
                + "\n------------------------------------------------"
                + "\nG - Start game"
                + "\nH - How to Play"
                + "\nS - Save game"
                + "\nL - Load game"
                + "\nQ - Quit"
                + "\n------------------------------------------------");
    }

    @Override

    public void doAction(String choice) {

        switch (choice) {
            case "G": // display the game menu
                GameControl.startNewGame();
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
            case "H": // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "S": // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "L": // Load an existing game from disk
                // ********INSERT FUNCTION HERE**********
                break;
            case "Q": // Exit the program
                // ********INSERT FUNCTION HERE**********
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
}
