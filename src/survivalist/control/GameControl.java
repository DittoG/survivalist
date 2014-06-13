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
import survivalist.model.Scene;

/**
 *
 * @author Madison
 */
public class GameControl {
    private static Game game;
    private static Building building;
    private static Animal animal;
    private static Item inventory;
    
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
        Npc[] npcList = GameControl.createNpcList();
        GameControl.game.setNpc(npcList);
        
        // create list of animals
        Animal[] animalList = GameControl.createAnimalList();
        GameControl.game.setAnimal(animalList);
        
        // create list of buildings
        Building[] buildingList = GameControl.createBuildingList();
        GameControl.game.setBuilding(buildingList);
        
        // create and initialize the map
        Map map = GameControl.createMap();
        GameControl.game.setMap(map);
        
        // create list of scenes
        Scene[] sceneList = GameControl.createSceneList();
        GameControl.game.setScene(sceneList);
        
        // assign scenes to each location
        
        
    }
    
    public static void startSavedGame() {
        System.out.println("\n*** Calling saved game ***");
    }
    
    private static Animal[] createAnimalList() {
        
        Animal[] animalList = 
                new Animal[Constants.NUMBER_OF_ANIMALS];
        
        // Animal codes************************************************************************************
        // DOCILE animals**********************************************************************************
        // Deer
        
        Animal deer = new Animal("Deer");
        deer.setDescription("A medium sized, agile animal that scares easily.");
        deer.setType("docile");
        deer.setMeat(20);
        deer.setHitpoints(20);
        animalList[Constants.DEER] = deer;
        
        // Elk
        
        Animal elk = new Animal("Elk");
        elk.setDescription("A large animal that scares easily.");
        elk.setType("docile");
        elk.setMeat(30);
        elk.setHitpoints(40);
        animalList[Constants.ELK] = elk;
        
        // Rabbit

        Animal rabbit = new Animal("Rabbit");
        rabbit.setDescription("A small, quick animal that scares easily.");
        rabbit.setType("docile");
        rabbit.setMeat(5);
        rabbit.setHitpoints(5);
        animalList[Constants.RABBIT] = rabbit;
        
        // Raccoon
        
        Animal raccoon = new Animal("Raccoon");
        raccoon.setDescription("A small, curious animal that doesn't scare easily and likes to steal food!");
        raccoon.setType("docile");
        raccoon.setMeat(5);
        raccoon.setHitpoints(10);
        animalList[Constants.RACCOON] = raccoon;
        
        // DANGEROUS animals**************************************************************************************
        // Wolf
        
        Animal wolf = new Animal("Wolf");
        wolf.setDescription("medium sized carnivore that is dangerous. Careful about hunting wolves, they'll fight back!");
        wolf.setType("dangerous");
        wolf.setMeat(10);
        wolf.setHitpoints(30);
        animalList[Constants.WOLF] = wolf;
        
        // Moose
        
        Animal moose = new Animal("Moose");
        moose.setDescription("A huge animal that is very dangerous. Hunting a moose is a daunting task!");
        moose.setType("dangerous");
        moose.setMeat(50);
        moose.setHitpoints(60);
        animalList[Constants.MOOSE] = moose;
        
        // Bear
        
        Animal bear = new Animal("Bear");
        bear.setDescription("A huge animal that is extremely dangerous! Stay away from this animal!!");
        bear.setType("dangerous");
        bear.setMeat(40);
        bear.setHitpoints(80);
        animalList[Constants.BEAR] = bear;
        
        GameControl.game.setAnimal(animalList);
        return animalList;
    }
    
    private static Building[] createBuildingList() {
        // create a building
        
         Building[] buildingList = 
                new Building[Constants.NUMBER_OF_BUILDINGS];
        
        // Building codes*************************************************************************************
        // Cabin
        
        Building cabin = new Building("Cabin");
        cabin.setDescription("A sturdy shelter.");
        cabin.setType("permanent");
        cabin.setLength(0);
        cabin.setWidth(0);
        cabin.setHeight(0);
        buildingList[Constants.CABIN] = cabin;
        
        // Tower
        
        Building tower = new Building("Tower");
        tower.setDescription("A tall, solid structure that will reveal the surrounding area for miles.");
        tower.setType("permanent");
        tower.setLength(0);
        tower.setWidth(0);
        tower.setHeight(0);
        buildingList[Constants.TOWER] = tower;
        
        // Lean-to
        
        Building leanTo = new Building("Lean-to");
        leanTo.setDescription("A small makeshift shelter that provides protection for a night.");
        leanTo.setType("temporary");
        leanTo.setLength(0);
        leanTo.setWidth(0);
        leanTo.setHeight(0);
        buildingList[Constants.LEANTO] = leanTo;
        
        GameControl.game.setBuilding(buildingList);
        return buildingList;
    }
    
    
    private static Item[] createInventoryList() {
        // created array(list) of inventory items
        Item[] inventoryList = 
                new Item[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        // WEAPON codes*************************************************************************
        // Knife
        
        Item knife = new Item("Knife");
        knife.setDescription("A hunting knife.");
        knife.setType("weapon");
        knife.setPossibleQuantity(1);
        knife.setActualQuantity(0);
        inventoryList[Constants.KNIFE] = knife;
        
        // Bow
        
        Item bow = new Item("Bow");
        bow.setDescription("Used with arrows to take down animals from a distance.");
        bow.setType("weapon");
        bow.setPossibleQuantity(1);
        bow.setActualQuantity(0);
        inventoryList[Constants.BOW] = bow;

        
        // Arrow
        
        Item arrow = new Item("Arrow");
        arrow.setDescription("Arrows can be shot using a bow, to hunt animals from a distance.");
        arrow.setType("weapon");
        arrow.setPossibleQuantity(20);
        arrow.setActualQuantity(0);
        inventoryList[Constants.ARROW] = arrow;
        
        // Machete
        
        Item machete = new Item("Machete");
        machete.setDescription("A machete can be used to hunt larger animals and is also useful for clearing a path through dense undergrowth.");
        machete.setType("weapon");
        machete.setPossibleQuantity(1);
        machete.setActualQuantity(0);
        inventoryList[Constants.MACHETE] = machete;
        
        // TOOL codes*******************************************************************************
        // Axe
        
        Item axe = new Item("Axe");
        axe.setDescription("An axe is used for chopping down trees.");
        axe.setType("tool");
        axe.setPossibleQuantity(1);
        axe.setActualQuantity(0);
        inventoryList[Constants.AXE] = axe;
        
        // Hammer
        
        Item hammer = new Item("Hammer");
        hammer.setDescription("A hammer is used to build structures.");
        hammer.setType("tool");
        hammer.setPossibleQuantity(1);
        hammer.setActualQuantity(0);
        inventoryList[Constants.HAMMER] = hammer;
        
        // Flint and Stone
        
        Item flintAndStone = new Item("Flint and Stone");
        flintAndStone.setDescription("Flint and Stone are used to make fires.");
        flintAndStone.setType("tool");
        flintAndStone.setPossibleQuantity(1);
        flintAndStone.setActualQuantity(0);
        inventoryList[Constants.FLINTANDSTONE] = flintAndStone;
        
        // Hook
        
        Item grapplingHook = new Item("Grappling Hook");
        grapplingHook.setDescription("A hook attached to a rope, this is used to climb rocks by throwing it up the side of a cliff and climbing it up a string.");
        grapplingHook.setType("tool");
        grapplingHook.setPossibleQuantity(1);
        grapplingHook.setActualQuantity(0);
        inventoryList[Constants.GRAPPLINGHOOK] = grapplingHook;
        
        // INGREDIENT codes********************************************************************************
        // Branch
        
        Item branch = new Item("Branch");
        branch.setDescription("A branch from a tree.");
        branch.setType("ingredient");
        branch.setPossibleQuantity(15);
        branch.setActualQuantity(0);
        inventoryList[Constants.BRANCH] = branch;
        
        // Flat Rock
        
        Item flatRock = new Item("Flat Rock");
        flatRock.setDescription("A flat rock");
        flatRock.setType("ingredient");
        flatRock.setPossibleQuantity(3);
        flatRock.setActualQuantity(0);
        inventoryList[Constants.FLATROCK] = flatRock;
        
        // Sharp Rock
        
        Item sharpRock = new Item("Sharp Rock");
        sharpRock.setDescription("A sharp rock.");
        sharpRock.setType("ingredient");
        sharpRock.setPossibleQuantity(3);
        sharpRock.setActualQuantity(0);
        inventoryList[Constants.SHARPROCK] = sharpRock;
        
        // Animal Skin
        
        Item animalSkin = new Item("Animal Skin");
        animalSkin.setDescription("A skin obtained from a dead animal.");
        animalSkin.setType("ingredient");
        animalSkin.setPossibleQuantity(5);
        animalSkin.setActualQuantity(0);
        inventoryList[Constants.ANIMALSKIN] = animalSkin;
        
        // Raw Meat
        
        Item rawMeat = new Item("Raw Meat");
        rawMeat.setDescription("Raw meat obtained from killing an animal.");
        rawMeat.setType("ingredient");
        rawMeat.setPossibleQuantity(5);
        rawMeat.setActualQuantity(0);
        inventoryList[Constants.RAWMEAT] = rawMeat;
        
        // Leather Strip
        
        Item leatherStrip = new Item("Leather Strip");
        leatherStrip.setDescription("A strip of leather cut from an animal skin.");
        leatherStrip.setType("ingredient");
        leatherStrip.setPossibleQuantity(20);
        leatherStrip.setActualQuantity(0);
        inventoryList[Constants.LEATHERSTRIP] = leatherStrip;
        
        // Flint
        
        Item flint = new Item("Flint");
        flint.setDescription("A piece of flint.");
        flint.setType("ingredient");
        flint.setPossibleQuantity(5);
        flint.setActualQuantity(0);
        inventoryList[Constants.FLINT] = flint;
        
        // Stone
        
        Item stone = new Item("Stone");
        stone.setDescription("A small stone.");
        stone.setType("ingredient");
        stone.setPossibleQuantity(5);
        stone.setActualQuantity(0);
        inventoryList[Constants.STONE] = stone;
        
        // Log
        
        Item log = new Item("Log");
        log.setDescription("A large log obtained by cutting down a tree.");
        log.setType("ingredient");
        log.setPossibleQuantity(2);
        log.setActualQuantity(0);
        inventoryList[Constants.LOG] = log;
        
        // Gut String
        
        Item gutString = new Item("Gut String");
        gutString.setDescription("String made from animal gut. Can be used as bow string or thread.");
        gutString.setType("ingredient");
        gutString.setPossibleQuantity(10);
        gutString.setActualQuantity(0);
        inventoryList[Constants.GUTSTRING] = gutString;
        
        
        // FOOD codes***************************************************************************************
        // Berry
        
        Item berry = new Item("Berry");
        berry.setDescription("A wild berry. Provides fruit to round out your diet!");
        berry.setType("ingredient");
        berry.setPossibleQuantity(50);
        berry.setActualQuantity(0);
        inventoryList[Constants.BERRY] = berry;
        
        // Cooked Meat
        
        Item cookedMeat = new Item("Cooked Meat");
        cookedMeat.setDescription("Cooked meat, ready to eat! Has lots of protein to keep your strength up!");
        cookedMeat.setType("ingredient");
        cookedMeat.setPossibleQuantity(10);
        cookedMeat.setActualQuantity(0);
        inventoryList[Constants.COOKEDMEAT] = cookedMeat;
        
        GameControl.game.setInventory(inventoryList);
        return inventoryList;
    }
    
        // Sort Inventory
         public static Item[] getSortedInventoryList(){
        
        Item[] inventoryList =
                    Survivalist.getCurrentGame().getInventory();
        
        Item tempItem;
        for(int i =0; i < inventoryList.length-1; i++){
            for(int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0){
                    tempItem =inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempItem;
                }
            }
        }
        return inventoryList;
    }
    
    private static Npc[] createNpcList() {
        // created array(list) of Npcs
        Npc[] npcList =
                new Npc[Constants.NUMBER_OF_NPCS];
        
        // Npc codes******************************************************************************************
        // Uncle Darwin
        
        Npc uncleDarwin = new Npc("Uncle Darwin");
        npcList[Constants.UNCLEDARWIN] = uncleDarwin;
        
        // Aviator Bill
        
        Npc aviatorBill = new Npc("Aviator Bill");
        npcList[Constants.AVIATORBILL] = aviatorBill;
        
        // Forest Ranger Dan
        
        Npc rangerDan = new Npc("Ranger Dan");
        npcList[Constants.RANGERDAN] = rangerDan;
        
        GameControl.game.setNpc(npcList);
        return npcList;
        
    }
    
    private static class game {

        public game() {
        }
    }
    
    private static Scene[] createSceneList() {
        // created array(list) of Scenes
        Scene[] SceneList =
                new Scene[Constants.NUMBER_OF_SCENES];
        
        // Npc codes******************************************************************************************
        // Forest
        
        Scene forest = new Scene("Forest");
        SceneList[Constants.FOREST] = forest;
        
        // Water
        
        Scene water = new Scene("Water");
        SceneList[Constants.WATER] = water;
        
        // Grass
        
        Scene grass = new Scene("Grass");
        SceneList[Constants.GRASS] = grass;
        
        // Cliff
        
        Scene cliff = new Scene("Cliff");
        SceneList[Constants.CLIFF] = cliff;
        
        // Mountiain
        
        Scene mountain = new Scene("Mountain");
        SceneList[Constants.MOUNTAIN] = mountain;
        
    }
    
    private static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create the scenes for the game
        Scene[] scenes = createScenes() {
        
    }
        
        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        
        for (int row = 0; row < Constants.MAP_ROW_COUNT; row++) {
            for(int column = 0; column < Constants.MAP_COLUMN_COUNT; column++) {
                
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                map[row][column] = location;
            }
            
        }
        
        private static void assignScenesToLocations(Map map, Scene[] scenes) {
            Location[][] locations = map.getLocations();
            
            locations[0][0].setScene(scenes[Constants.FOREST]);
            locations[1][0].setScene(scenes[Constants.FOREST]);
            locations[2][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[3][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[4][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][0].setScene(scenes[Constants.MOUNTAIN]);
            locations[11][0].setScene(scenes[Constants.FOREST]);
            locations[12][0].setScene(scenes[Constants.FOREST]);
            locations[13][0].setScene(scenes[Constants.WATER]);
            locations[14][0].setScene(scenes[Constants.FOREST]);
            locations[15][0].setScene(scenes[Constants.FOREST]);
            locations[16][0].setScene(scenes[Constants.FOREST]);
            locations[17][0].setScene(scenes[Constants.FOREST]);
            locations[18][0].setScene(scenes[Constants.FOREST]);
            locations[19][0].setScene(scenes[Constants.FOREST]);
            
            
            
            
            
        
    }
    
}
