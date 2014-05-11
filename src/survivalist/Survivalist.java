/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist;

import survivalist.model.Item;
import survivalist.model.Map;
import survivalist.model.Npc;
import survivalist.model.Player;

/**
 *
 * @author Madison
 */
public class Survivalist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Player codes
        
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Map codes
        
        Map map = new Map();
        
        map.setRowCount(20);
        map.setColumnCount(10);
        
        String mapInfo = map.toString();
        System.out.println(map);
        
        //Item codes
        
        //Knife
        
        Item knife = new Item();
        
        knife.setName("Knife");
        knife.setDescription("A sharp object used for cutting that is not very dangerous.");
        knife.setType("weapon");
        knife.setPossibleQuantity(1);
        knife.setActualQuantity(0);
        
        String knifeInfo = knife.toString();
        System.out.println(knife);
        
        //Bow
        
        Item bow = new Item();
        bow.setName("Bow");
        bow.setDescription("A bow is used to hunt by shooting arrows and is good for taking down animals from a distance.");
        bow.setType("weapon");
        bow.setPossibleQuantity(1);
        bow.setActualQuantity(0);
        
        String bowInfo = bow.toString();
        System.out.println(bow);
        
        //Arrow
        
        Item arrow = new Item();
        arrow.setName("Arrow");
        arrow.setDescription("Arrows can be shot using a bow, to hunt animals from a distance.");
        arrow.setType("weapon");
        arrow.setPossibleQuantity(20);
        arrow.setActualQuantity(0);
        
        String arrowInfo = arrow.toString();
        System.out.println(arrow);
        
        //Machete
        
        Item machete = new Item();
        machete.setName("Machete");
        machete.setDescription("A machete can be used to hunt larger animals and is also useful for clearing a path through dense undergrowth");
        machete.setType("weapon");
        machete.setPossibleQuantity(1);
        machete.setActualQuantity(0);
        
        String macheteInfo = machete.toString();
        System.out.println(machete);
        
        //Axe
        
        Item axe = new Item();
        axe.setName("Axe");
        axe.setDescription("An axe is used for chopping down trees.");
        axe.setType("tool");
        axe.setPossibleQuantity(1);
        axe.setActualQuantity(0);
        
        String axeInfo = axe.toString();
        System.out.println(axe);
        
        //Hammer
        
        Item hammer = new Item();
        hammer.setName("Hammer");
        hammer.setDescription("A hammer is used to build structures");
        hammer.setType("tool");
        hammer.setPossibleQuantity(1);
        hammer.setActualQuantity(0);
        
        String hammerInfo = hammer.toString();
        System.out.println(hammer);
        
        //Flint and Stone
        
        Item flintAndStone = new Item();
        flintAndStone.setName("Flint and Stone");
        flintAndStone.setDescription("Flint and Stone are used to make fires");
        flintAndStone.setType("tool");
        flintAndStone.setPossibleQuantity(1);
        flintAndStone.setActualQuantity(0);
        
        String flintAndStoneInfo = flintAndStone.toString();
        System.out.println(flintAndStone);
        
        //Hook
        
        Item grapplingHook = new Item();
        grapplingHook.setName("Grappling Hook");
        grapplingHook.setDescription("A hook attached to a rope, this is used to climb rocks by throwing it up the side of a cliff and climbing it up a string");
        grapplingHook.setType("tool");
        grapplingHook.setPossibleQuantity(1);
        grapplingHook.setActualQuantity(0);
        
        String grapplingHookInfo = grapplingHook.toString();
        System.out.println(grapplingHook);
        
        //Npc codes
        
        //Uncle Darwin
        
        Npc uncleDarwin = new Npc();
        uncleDarwin.setName("Uncle Darwin");
        
        String uncleDarwinInfo = uncleDarwin.toString();
        System.out.println(uncleDarwin);
        
        
    }
    
}
