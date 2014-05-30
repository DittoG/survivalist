/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.control;

import survivalist.Survivalist;
import survivalist.model.Game;
import survivalist.model.Player;

/**
 *
 * @author Madison
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        Player player = new Player();
        player.setName(playersName);
        
        Survivalist.setPlayer(player); // save the player
        
        return player;
    }

    public static void saveGame(Game currentGame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
