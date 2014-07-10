/*
THIS PAGE IS FINISHED
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.ProgramControl;
import survivalist.model.Location;
import survivalist.model.Map;
import survivalist.model.Scene;

/**
 *
 * @author Madison
 */
public class GameMenuView extends View{
    
    public GameMenuView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|               Game Menu                      |"
            + "\n------------------------------------------------"
            + "\nH - Get help on how to play the game"
            + "\nM - Map/Move menu"
            + "\nE - Hunt and Gather Menu"
            + "\nI - Inventory"
            + "\nC - Crafting Menu"
            + "\nB - Building Menu"
            + "\nS - Save game"
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
            case "M": // display the map/move menu
                //displayMap(Map map, Scene[] scenes);
                break;
            case "E": // display the exploring menu
                HuntGatherView HuntGatherMenu = new HuntGatherView();
                HuntGatherMenu.display();
                break;
            case "I": // save the inventory menu
                InventoryView inventoryMenu = new InventoryView();
                inventoryMenu.display();
                break;
            case "C": // display the crafting menu
                CraftingView craftingMenu = new CraftingView();
                craftingMenu.display();
                break;
            case "B": // display the building menu
                BuildingView buildingMenu = new BuildingView();
                buildingMenu.display();
                break;
            case "S": // save the current game to disk
                ProgramControl.saveGame(Survivalist.getCurrentGame());
                break;
            case "Q": // Exit to previous menu
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
    
//    public static String displayMap(Map map, Scene[] scenes) {
//        Location[][] locations = map.getLocations();
//        //get the symbols from the scene assigned to each location
//        
//        //print each symbol in its corresponding coordinates on the map
//        
//        //print first line
//        
//        System.out.println(locations[0][0].getScene().getSymbol() + locations[0][1].getScene().getSymbol() + locations[0][2].getScene().getSymbol() + locations[0][3].getScene().getSymbol() + locations[0][4].getScene().getSymbol() + locations[0][5].getScene().getSymbol() + locations[0][6].getScene().getSymbol() + locations[0][7].getScene().getSymbol() + locations[0][8].getScene().getSymbol() + locations[0][9].getScene().getSymbol() + locations[0][10].getScene().getSymbol() + locations[0][11].getScene().getSymbol() + locations[0][12].getScene().getSymbol() + locations[0][13].getScene().getSymbol() + locations[0][14].getScene().getSymbol() + locations[0][15].getScene().getSymbol() + locations[0][16].getScene().getSymbol() + locations[0][17].getScene().getSymbol() + locations[0][18].getScene().getSymbol() + locations[0][19].getScene().getSymbol());
//        
//        //print second line
//        
//        System.out.println(locations[1][0].getScene().getSymbol() + locations[1][1].getScene().getSymbol() + locations[1][2].getScene().getSymbol() + locations[1][3].getScene().getSymbol() + locations[1][4].getScene().getSymbol() + locations[1][5].getScene().getSymbol() + locations[1][6].getScene().getSymbol() + locations[1][7].getScene().getSymbol() + locations[1][8].getScene().getSymbol() + locations[1][9].getScene().getSymbol() + locations[1][10].getScene().getSymbol() + locations[1][11].getScene().getSymbol() + locations[1][12].getScene().getSymbol() + locations[1][13].getScene().getSymbol() + locations[1][14].getScene().getSymbol() + locations[1][15].getScene().getSymbol() + locations[1][16].getScene().getSymbol() + locations[1][17].getScene().getSymbol() + locations[1][18].getScene().getSymbol() + locations[1][19].getScene().getSymbol());
//        
//        //print third line
//        
//        System.out.println(locations[2][0].getScene().getSymbol() + locations[2][1].getScene().getSymbol() + locations[2][2].getScene().getSymbol() + locations[2][3].getScene().getSymbol() + locations[2][4].getScene().getSymbol() + locations[2][5].getScene().getSymbol() + locations[2][6].getScene().getSymbol() + locations[2][7].getScene().getSymbol() + locations[2][8].getScene().getSymbol() + locations[2][9].getScene().getSymbol() + locations[2][10].getScene().getSymbol() + locations[2][11].getScene().getSymbol() + locations[2][12].getScene().getSymbol() + locations[2][13].getScene().getSymbol() + locations[2][14].getScene().getSymbol() + locations[2][15].getScene().getSymbol() + locations[2][16].getScene().getSymbol() + locations[2][17].getScene().getSymbol() + locations[2][18].getScene().getSymbol() + locations[2][19].getScene().getSymbol());
//        
//        //print fourth line
//        
//        System.out.println(locations[3][0].getScene().getSymbol() + locations[3][1].getScene().getSymbol() + locations[3][2].getScene().getSymbol() + locations[3][3].getScene().getSymbol() + locations[3][4].getScene().getSymbol() + locations[3][5].getScene().getSymbol() + locations[3][6].getScene().getSymbol() + locations[3][7].getScene().getSymbol() + locations[3][8].getScene().getSymbol() + locations[3][9].getScene().getSymbol() + locations[3][10].getScene().getSymbol() + locations[3][11].getScene().getSymbol() + locations[3][12].getScene().getSymbol() + locations[3][13].getScene().getSymbol() + locations[3][14].getScene().getSymbol() + locations[3][15].getScene().getSymbol() + locations[3][16].getScene().getSymbol() + locations[3][17].getScene().getSymbol() + locations[3][18].getScene().getSymbol() + locations[3][19].getScene().getSymbol());
//        
//        //print fifth line
//        
//        System.out.println(locations[4][0].getScene().getSymbol() + locations[4][1].getScene().getSymbol() + locations[4][2].getScene().getSymbol() + locations[4][3].getScene().getSymbol() + locations[4][4].getScene().getSymbol() + locations[4][5].getScene().getSymbol() + locations[4][6].getScene().getSymbol() + locations[4][7].getScene().getSymbol() + locations[4][8].getScene().getSymbol() + locations[4][9].getScene().getSymbol() + locations[4][10].getScene().getSymbol() + locations[4][11].getScene().getSymbol() + locations[4][12].getScene().getSymbol() + locations[4][13].getScene().getSymbol() + locations[4][14].getScene().getSymbol() + locations[4][15].getScene().getSymbol() + locations[4][16].getScene().getSymbol() + locations[4][17].getScene().getSymbol() + locations[4][18].getScene().getSymbol() + locations[4][19].getScene().getSymbol());
//        
//        //print sixth line
//        
//        System.out.println(locations[5][0].getScene().getSymbol() + locations[5][1].getScene().getSymbol() + locations[5][2].getScene().getSymbol() + locations[5][3].getScene().getSymbol() + locations[5][4].getScene().getSymbol() + locations[5][5].getScene().getSymbol() + locations[5][6].getScene().getSymbol() + locations[5][7].getScene().getSymbol() + locations[5][8].getScene().getSymbol() + locations[5][9].getScene().getSymbol() + locations[5][10].getScene().getSymbol() + locations[5][11].getScene().getSymbol() + locations[5][12].getScene().getSymbol() + locations[5][13].getScene().getSymbol() + locations[5][14].getScene().getSymbol() + locations[5][15].getScene().getSymbol() + locations[5][16].getScene().getSymbol() + locations[5][17].getScene().getSymbol() + locations[5][18].getScene().getSymbol() + locations[5][19].getScene().getSymbol());
//        
//        //print seventh line
//        System.out.println(locations[6][0].getScene().getSymbol() + locations[6][1].getScene().getSymbol() + locations[6][2].getScene().getSymbol() + locations[6][3].getScene().getSymbol() + locations[6][4].getScene().getSymbol() + locations[6][5].getScene().getSymbol() + locations[6][6].getScene().getSymbol() + locations[6][7].getScene().getSymbol() + locations[6][8].getScene().getSymbol() + locations[6][9].getScene().getSymbol() + locations[6][10].getScene().getSymbol() + locations[6][11].getScene().getSymbol() + locations[6][12].getScene().getSymbol() + locations[6][13].getScene().getSymbol() + locations[6][14].getScene().getSymbol() + locations[6][15].getScene().getSymbol() + locations[6][16].getScene().getSymbol() + locations[6][17].getScene().getSymbol() + locations[6][18].getScene().getSymbol() + locations[6][19].getScene().getSymbol());
//        
//        //print eighth line
//        
//        System.out.println(locations[7][0].getScene().getSymbol() + locations[7][1].getScene().getSymbol() + locations[7][2].getScene().getSymbol() + locations[7][3].getScene().getSymbol() + locations[7][4].getScene().getSymbol() + locations[7][5].getScene().getSymbol() + locations[7][6].getScene().getSymbol() + locations[7][7].getScene().getSymbol() + locations[7][8].getScene().getSymbol() + locations[7][9].getScene().getSymbol() + locations[7][10].getScene().getSymbol() + locations[7][11].getScene().getSymbol() + locations[7][12].getScene().getSymbol() + locations[7][13].getScene().getSymbol() + locations[7][14].getScene().getSymbol() + locations[7][15].getScene().getSymbol() + locations[7][16].getScene().getSymbol() + locations[7][17].getScene().getSymbol() + locations[7][18].getScene().getSymbol() + locations[7][19].getScene().getSymbol());
//        
//        //print ninth line
//        
//        System.out.println(locations[8][0].getScene().getSymbol() + locations[8][1].getScene().getSymbol() + locations[8][2].getScene().getSymbol() + locations[8][3].getScene().getSymbol() + locations[8][4].getScene().getSymbol() + locations[8][5].getScene().getSymbol() + locations[8][6].getScene().getSymbol() + locations[8][7].getScene().getSymbol() + locations[8][8].getScene().getSymbol() + locations[8][9].getScene().getSymbol() + locations[8][10].getScene().getSymbol() + locations[8][11].getScene().getSymbol() + locations[8][12].getScene().getSymbol() + locations[8][13].getScene().getSymbol() + locations[8][14].getScene().getSymbol() + locations[8][15].getScene().getSymbol() + locations[8][16].getScene().getSymbol() + locations[8][17].getScene().getSymbol() + locations[8][18].getScene().getSymbol() + locations[8][19].getScene().getSymbol());
//        
//        //print tenth line
//        
//        System.out.println(locations[9][0].getScene().getSymbol() + locations[9][1].getScene().getSymbol() + locations[9][2].getScene().getSymbol() + locations[9][3].getScene().getSymbol() + locations[9][4].getScene().getSymbol() + locations[9][5].getScene().getSymbol() + locations[9][6].getScene().getSymbol() + locations[9][7].getScene().getSymbol() + locations[9][8].getScene().getSymbol() + locations[9][9].getScene().getSymbol() + locations[9][10].getScene().getSymbol() + locations[9][11].getScene().getSymbol() + locations[9][12].getScene().getSymbol() + locations[9][13].getScene().getSymbol() + locations[9][14].getScene().getSymbol() + locations[9][15].getScene().getSymbol() + locations[9][16].getScene().getSymbol() + locations[9][17].getScene().getSymbol() + locations[9][18].getScene().getSymbol() + locations[9][19].getScene().getSymbol());
//        
//       // return ;
//    }
}
