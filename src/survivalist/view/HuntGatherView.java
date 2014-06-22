/*
THIS PAGE HAS NOT YET BEEN CUSTOMIZED
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.ProgramControl;

/**
 *
 * @author Jerry
 */
public class HuntGatherView extends View{
    
    public HuntGatherView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|          Hunting and Gathering Menu          |"
            + "\n------------------------------------------------"
            + "\nH - Get Help on how to use the Crafting Menu"
            + "\nK - Knife"
            + "\nB - Bow"
            + "\nA - Arrows"
            + "\nM - Machete"
            + "\nX - Axe"
            + "\nT - Hammer"
            + "\nF - Flint and Stone"
            + "\nG - Grappling Hook"
            + "\nQ - Exit to previous menu"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
        
        switch (choice) {
            case "H": // display the help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "K": // craft a knife
                
                break;
            case "B": // craft a bow
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "A": // craft arrows
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "M": // craft a machete
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "X": // craft an axe
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "T": // craft a hammer
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "F": // craft flint and stone
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "G": // craft a grappling hook
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "Q": // Exit to previous menu
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
}
