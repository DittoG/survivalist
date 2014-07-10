/*\
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist;

import survivalist.frames.StartProgramFrame;
import survivalist.model.Game;
import survivalist.model.Player;
import survivalist.view.StartProgramView;

/**
 *
 * @author Madison
 */
public class Survivalist {

    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Survivalist.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Survivalist.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // try {
            
           StartProgramView startView = new StartProgramView();
           startView.display();
//           create StartProgramView and start the program
//           java.awt.EventQueue.invokeLater(
//                    new Runnable() {
//                        public void run() {
//                            StartProgramFrame startProgramFrame = new StartProgramFrame();
//                            startProgramFrame.setVisible(true);
//                        }
//                    }
//            );
            
            return;
        //}
    }

}
