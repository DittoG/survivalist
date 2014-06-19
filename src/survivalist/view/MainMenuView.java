/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.view;

import java.util.Scanner;
import survivalist.Survivalist;
import survivalist.control.ProgramControl;

/**
 *
 * @author Madison
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n| Main Menu                                    |"
                + "\n------------------------------------------------"
                + "\nG - Start game"
                + "\nH - How to Play"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n------------------------------------------------");
    }

    public void doAction(String choice) {

        switch (choice) {
            case "G": // display the game menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayMenu();
                break;
            case "H": // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "S": // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "Q": // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
}
