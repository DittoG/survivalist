/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.control;

/**
 *
 * @author Madison
 */
public class GameControl {
    
    public static void startNewGame() {
        
        // create a new game
        GameControl.game = new Game();
        
        // save as current game
        Survivalist.setCurrentGame(game);
        
        // set (save) the player in the game object
        GameControl.game.setPlayer(Survivalist.getPlayer());
        
        GameControl.createInventoryList(); // create the invetory list
        GameControl.createActorList(); // create list of actors
        GameControl.createMap(); // create and initialize the map
        
        // move player to starting position
        MapControl.moveActorsToStartingLocation(0,3);
    }
    
    public static void startSavedGame() {
        System.out.println("\n*** Calling saved game ***");
    }
    
    private static void createInventoryList() {
        // created array(list) of inventory items
        InventoryItem[] inventory = 
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem lumber = new InventoryItem();
        lumber.setDescription("Lumber");
        lumber.setQuantityInStock(0);
        lumber.setRequiredAmount(0);
        inventory[Constants.LUMBER] = lumber;
        
        GameControl.game.setInventory(inventory);
    }
}
