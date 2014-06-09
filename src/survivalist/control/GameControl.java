/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.control;

import survivalist.Survivalist;
import survivalist.model.Animal;
import survivalist.model.Building;
import survivalist.model.Game;
import survivalist.model.Item;
import survivalist.model.Location;
import survivalist.model.Map;
import survivalist.model.Npc;

/**
 *
 * @author Madison
 */
public class GameControl {
    private static Game game;
    
    public static void startNewGame() {
        
        // create a new game
        GameControl.game = new Game();
        
        // save as current game
        Survivalist.setCurrentGame(game);
        
        // set (save) the player in the game object
        GameControl.game.setPlayer(Survivalist.getPlayer());
        
        // create the inventory list and save in the game.
        Item[] inventoryList = GameControl.createInventoryList();
        GameControl.game.setInventory(inventoryList);
        
         // create list of Npcs
        Npc[] npc = GameControl.createNpcList();
        GameControl.game.setNpc(npc);
        
        Map map = GameControl.createMap();
        GameControl.game.setMap(map); // create and initialize the map
        
    }
    
    public static void startSavedGame() {
        System.out.println("\n*** Calling saved game ***");
    }
    
    private static void createAnimalList() {
        
        Animal[] animal = 
                new Animal[Constants.NUMBER_OF_ANIMALS];
        
        // Animal codes************************************************************************************
        // DOCILE animals**********************************************************************************
        // Deer
        
        Animal deer = new Animal();
        deer.setName("Deer");
        deer.setDescription("A medium sized, agile animal that scares easily.");
        deer.setType("docile");
        deer.setMeat(20);
        deer.setHitpoints(20);
        animal[Constants.DEER] = deer;
        
        // Elk
        
        Animal elk = new Animal();
        elk.setName("Elk");
        elk.setDescription("A large animal that scares easily.");
        elk.setType("docile");
        elk.setMeat(30);
        elk.setHitpoints(40);
        animal[Constants.ELK] = elk;
        
        // Rabbit

        Animal rabbit = new Animal();
        rabbit.setName("Rabbit");
        rabbit.setDescription("A small, quick animal that scares easily.");
        rabbit.setType("docile");
        rabbit.setMeat(5);
        rabbit.setHitpoints(5);
        animal[Constants.RABBIT] = rabbit;
        
        // Raccoon
        
        Animal raccoon = new Animal();
        raccoon.setName("Raccoon");
        raccoon.setDescription("A small, curious animal that doesn't scare easily and likes to steal food!");
        raccoon.setType("docile");
        raccoon.setMeat(5);
        raccoon.setHitpoints(10);
        animal[Constants.RACCOON] = raccoon;
        
        // DANGEROUS animals**************************************************************************************
        // Wolf
        
        Animal wolf = new Animal();
        wolf.setName("Wolf");
        wolf.setDescription("medium sized carnivore that is dangerous. Careful about hunting wolves, they'll fight back!");
        wolf.setType("dangerous");
        wolf.setMeat(10);
        wolf.setHitpoints(30);
        animal[Constants.WOLF] = wolf;
        
        // Moose
        
        Animal moose = new Animal();
        moose.setName("Moose");
        moose.setDescription("A huge animal that is very dangerous. Hunting a moose is a daunting task!");
        moose.setType("dangerous");
        moose.setMeat(50);
        moose.setHitpoints(60);
        animal[Constants.MOOSE] = moose;
        
        // Bear
        
        Animal bear = new Animal();
        bear.setName("Bear");
        bear.setDescription("A huge animal that is extremely dangerous! Stay away from this animal!!");
        bear.setType("dangerous");
        bear.setMeat(40);
        bear.setHitpoints(80);
        animal[Constants.BEAR] = bear;
        
    }
    
    
    private static Item[] createInventoryList() {
        // created array(list) of inventory items
        Item[] inventory = 
                new Item[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        // WEAPON codes*************************************************************************
        // Knife
        
        Item knife = new Item();
        knife.setName("Knife");
        knife.setDescription("A hunting knife.");
        knife.setType("weapon");
        knife.setPossibleQuantity(1);
        knife.setActualQuantity(0);
        inventory[Constants.KNIFE] = knife;
        
        // Bow
        
        Item bow = new Item();
        bow.setName("Bow");
        bow.setDescription("Used with arrows to take down animals from a distance.");
        bow.setType("weapon");
        bow.setPossibleQuantity(1);
        bow.setActualQuantity(0);
        inventory[Constants.BOW] = bow;

        
        // Arrow
        
        Item arrow = new Item();
        arrow.setName("Arrow");
        arrow.setDescription("Arrows can be shot using a bow, to hunt animals from a distance.");
        arrow.setType("weapon");
        arrow.setPossibleQuantity(20);
        arrow.setActualQuantity(0);
        inventory[Constants.ARROW] = arrow;
        
        // Machete
        
        Item machete = new Item();
        machete.setName("Machete");
        machete.setDescription("A machete can be used to hunt larger animals and is also useful for clearing a path through dense undergrowth.");
        machete.setType("weapon");
        machete.setPossibleQuantity(1);
        machete.setActualQuantity(0);
        inventory[Constants.MACHETE] = machete;
        
        // TOOL codes*******************************************************************************
        // Axe
        
        Item axe = new Item();
        axe.setName("Axe");
        axe.setDescription("An axe is used for chopping down trees.");
        axe.setType("tool");
        axe.setPossibleQuantity(1);
        axe.setActualQuantity(0);
        inventory[Constants.AXE] = axe;
        
        // Hammer
        
        Item hammer = new Item();
        hammer.setName("Hammer");
        hammer.setDescription("A hammer is used to build structures.");
        hammer.setType("tool");
        hammer.setPossibleQuantity(1);
        hammer.setActualQuantity(0);
        inventory[Constants.HAMMER] = hammer;
        
        // Flint and Stone
        
        Item flintAndStone = new Item();
        flintAndStone.setName("Flint and Stone");
        flintAndStone.setDescription("Flint and Stone are used to make fires.");
        flintAndStone.setType("tool");
        flintAndStone.setPossibleQuantity(1);
        flintAndStone.setActualQuantity(0);
        inventory[Constants.FLINTANDSTONE] = flintAndStone;
        
        // Hook
        
        Item grapplingHook = new Item();
        grapplingHook.setName("Grappling Hook");
        grapplingHook.setDescription("A hook attached to a rope, this is used to climb rocks by throwing it up the side of a cliff and climbing it up a string.");
        grapplingHook.setType("tool");
        grapplingHook.setPossibleQuantity(1);
        grapplingHook.setActualQuantity(0);
        inventory[Constants.GRAPPLINGHOOK] = grapplingHook;
        
        // INGREDIENT codes********************************************************************************
        // Branch
        
        Item branch = new Item();
        branch.setName("Branch");
        branch.setDescription("A branch from a tree.");
        branch.setType("ingredient");
        branch.setPossibleQuantity(15);
        branch.setActualQuantity(0);
        inventory[Constants.BRANCH] = branch;
        
        // Flat Rock
        
        Item flatRock = new Item();
        flatRock.setName("Flat Rock");
        flatRock.setDescription("A flat rock");
        flatRock.setType("ingredient");
        flatRock.setPossibleQuantity(3);
        flatRock.setActualQuantity(0);
        inventory[Constants.FLATROCK] = flatRock;
        
        // Sharp Rock
        
        Item sharpRock = new Item();
        sharpRock.setName("Sharp Rock");
        sharpRock.setDescription("A sharp rock.");
        sharpRock.setType("ingredient");
        sharpRock.setPossibleQuantity(3);
        sharpRock.setActualQuantity(0);
        inventory[Constants.SHARPROCK] = sharpRock;
        
        // Animal Skin
        
        Item animalSkin = new Item();
        animalSkin.setName("Animal Skin");
        animalSkin.setDescription("A skin obtained from a dead animal.");
        animalSkin.setType("ingredient");
        animalSkin.setPossibleQuantity(5);
        animalSkin.setActualQuantity(0);
        inventory[Constants.ANIMALSKIN] = animalSkin;
        
        // Raw Meat
        
        Item rawMeat = new Item();
        rawMeat.setName("Raw Meat");
        rawMeat.setDescription("Raw meat obtained from killing an animal.");
        rawMeat.setType("ingredient");
        rawMeat.setPossibleQuantity(5);
        rawMeat.setActualQuantity(0);
        inventory[Constants.RAWMEAT] = rawMeat;
        
        // Leather Strip
        
        Item leatherStrip = new Item();
        leatherStrip.setName("Leather Strip");
        leatherStrip.setDescription("A strip of leather cut from an animal skin.");
        leatherStrip.setType("ingredient");
        leatherStrip.setPossibleQuantity(20);
        leatherStrip.setActualQuantity(0);
        inventory[Constants.LEATHERSTRIP] = leatherStrip;
        
        // Flint
        
        Item flint = new Item();
        flint.setName("Flint");
        flint.setDescription("A piece of flint.");
        flint.setType("ingredient");
        flint.setPossibleQuantity(5);
        flint.setActualQuantity(0);
        inventory[Constants.FLINT] = flint;
        
        // Stone
        
        Item stone = new Item();
        stone.setName("Stone");
        stone.setDescription("A small stone.");
        stone.setType("ingredient");
        stone.setPossibleQuantity(5);
        stone.setActualQuantity(0);
        inventory[Constants.STONE] = stone;
        
        // Log
        
        Item log = new Item();
        log.setName("Log");
        log.setDescription("A large log obtained by cutting down a tree.");
        log.setType("ingredient");
        log.setPossibleQuantity(2);
        log.setActualQuantity(0);
        inventory[Constants.LOG] = log;
        
        // Gut String
        
        Item gutString = new Item();
        gutString.setName("Gut String");
        gutString.setDescription("String made from animal gut. Can be used as bow string or thread.");
        gutString.setType("ingredient");
        gutString.setPossibleQuantity(10);
        gutString.setActualQuantity(0);
        inventory[Constants.GUTSTRING] = gutString;
        
        
        // FOOD codes***************************************************************************************
        // Berry
        
        Item berry = new Item();
        berry.setName("Berry");
        berry.setDescription("A wild berry. Provides fruit to round out your diet!");
        berry.setType("ingredient");
        berry.setPossibleQuantity(50);
        berry.setActualQuantity(0);
        inventory[Constants.BERRY] = berry;
        
        // Cooked Meat
        
        Item cookedMeat = new Item();
        cookedMeat.setName("Cooked Meat");
        cookedMeat.setDescription("Cooked meat, ready to eat! Has lots of protein to keep your strength up!");
        cookedMeat.setType("ingredient");
        cookedMeat.setPossibleQuantity(10);
        cookedMeat.setActualQuantity(0);
        inventory[Constants.COOKEDMEAT] = cookedMeat;
        
        // Building codes*************************************************************************************
        // Cabin
        
        Building cabin = new Building();
        cabin.setName("Cabin");
        cabin.setDescription("A sturdy shelter.");
        cabin.setType("permanent");
        cabin.setLength(0);
        cabin.setWidth(0);
        cabin.setHeight(0);
        
        // Tower
        
        Building tower = new Building();
        tower.setName("Tower");
        tower.setDescription("A tall, solid structure that will reveal the surrounding area for miles.");
        tower.setType("permanent");
        tower.setLength(0);
        tower.setWidth(0);
        tower.setHeight(0);
        
        // Lean-to
        
        Building leanTo = new Building();
        leanTo.setName("Lean-to");
        leanTo.setDescription("A small makeshift shelter that provides protection for a night.");
        leanTo.setType("temporary");
        leanTo.setLength(0);
        leanTo.setWidth(0);
        leanTo.setHeight(0);
        
        GameControl.game.setInventory(inventory);
        return inventory;
    }
    
    private static map createMap() {
        // create the map
        
        
        
        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        
        for (int row = 0; row < Constants.MAP_ROW_COUNT; row++) {
            for(int column = 0; column < Constants.MAP_COLUMN_COUNT; column++) {
                
                
                Location location = new location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                map[row][column] = location;
            }
            
        }
    
        Scene grass = new Scene();
        location.setAmountOfRabbit(2000);
        location.setAmountOfWolf();
        wheat.setBlocked(false);
        wheat.setBlocked(false);
        wheat.setMapSymbol()
        return map;
        
    }
    
    private static Npc[] createNpcList() {
        // created array(list) of Npcs
        Npc[] npcList =
                new Npc[Constants.NUMBER_OF_NPCS];
        
        // Npc codes******************************************************************************************
        // Uncle Darwin
        
        Npc uncleDarwin = new Npc();
        uncleDarwin.setName("Uncle Darwin");
        npcList[Constants.UNCLEDARWIN] = uncleDarwin;
        
        // Aviator Bill
        
        Npc aviatorBill = new Npc();
        aviatorBill.setName("Aviator Bill");
        npcList[Constants.AVIATORBILL] = uncleDarwin;
        
        // Forest Ranger Dan
        
        Npc rangerDan = new Npc();
        rangerDan.setName("Ranger Dan");
        npcList[Constants.RANGERDAN] = uncleDarwin;
        return npcList;
        
        
    }

    private static class game {

        public game() {
        }
    }
    
}
