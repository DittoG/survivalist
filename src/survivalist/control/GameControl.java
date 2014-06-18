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
    
    private static Scene[] createSceneList() {
        // created array(list) of Scenes
        Scene[] sceneList =
                new Scene[Constants.NUMBER_OF_SCENES];
        
        // Scene codes******************************************************************************************
        // Forest
        
        Scene forest = new Scene("Forest");
        forest.setDescription("A forest of trees");
        forest.setNoOfBerries(100);
        forest.setNoOfBranches(30);
        forest.setNoOfFlatRocks(5);
        forest.setNoOfSharpRocks(2);
        forest.setNoOfLogs(10);
        forest.setNoOfFlint(3);
        forest.setNoOfStone(5);
        forest.setNoOfCabins(0);
        forest.setNoOfLeanTos(0);
        forest.setNoOfTowers(0);
        sceneList[Constants.FOREST] = forest;
        
        // Forest 2
        
        Scene forest2 = new Scene("Forest 2");
        forest.setDescription("A forest of trees");
        forest.setNoOfBerries(200);
        forest.setNoOfBranches(10);
        forest.setNoOfFlatRocks(3);
        forest.setNoOfSharpRocks(5);
        forest.setNoOfLogs(5);
        forest.setNoOfFlint(6);
        forest.setNoOfStone(3);
        forest.setNoOfCabins(0);
        forest.setNoOfLeanTos(0);
        forest.setNoOfTowers(0);
        sceneList[Constants.FOREST2] = forest;
        
        // Forest 3
        
        Scene forest3 = new Scene("Forest 3");
        forest.setDescription("A forest of trees");
        forest.setNoOfBerries(50);
        forest.setNoOfBranches(30);
        forest.setNoOfFlatRocks(6);
        forest.setNoOfSharpRocks(1);
        forest.setNoOfLogs(15);
        forest.setNoOfFlint(3);
        forest.setNoOfStone(15);
        forest.setNoOfCabins(0);
        forest.setNoOfLeanTos(0);
        forest.setNoOfTowers(0);
        sceneList[Constants.FOREST3] = forest;
        
        // Stream
        
        Scene stream = new Scene("Stream");
        stream.setDescription("A small stream");
        stream.setNoOfBerries(0);
        stream.setNoOfBranches(0);
        stream.setNoOfFlatRocks(2);
        stream.setNoOfSharpRocks(0);
        stream.setNoOfLogs(0);
        stream.setNoOfFlint(0);
        stream.setNoOfStone(3);
        stream.setNoOfCabins(0);
        stream.setNoOfLeanTos(0);
        stream.setNoOfTowers(0);
        sceneList[Constants.STREAM] = stream;
        
        // Stream 2
        
        Scene stream2 = new Scene("Stream 2");
        stream.setDescription("A small stream");
        stream.setNoOfBerries(0);
        stream.setNoOfBranches(0);
        stream.setNoOfFlatRocks(2);
        stream.setNoOfSharpRocks(0);
        stream.setNoOfLogs(0);
        stream.setNoOfFlint(0);
        stream.setNoOfStone(8);
        stream.setNoOfCabins(0);
        stream.setNoOfLeanTos(0);
        stream.setNoOfTowers(0);
        sceneList[Constants.STREAM2] = stream;
        
        // Grass
        
        Scene grass = new Scene("Grass");
        grass.setDescription("A patch of land covered in grass");
        grass.setNoOfBerries(0);
        grass.setNoOfBranches(0);
        grass.setNoOfFlatRocks(1);
        grass.setNoOfSharpRocks(0);
        grass.setNoOfLogs(0);
        grass.setNoOfFlint(0);
        grass.setNoOfStone(1);
        grass.setNoOfCabins(0);
        grass.setNoOfLeanTos(0);
        grass.setNoOfTowers(0);
        sceneList[Constants.GRASS] = grass;
        
        // Grass2
        
        Scene grass2 = new Scene("Grass 2");
        grass.setDescription("A patch of land covered in grass");
        grass.setNoOfBerries(0);
        grass.setNoOfBranches(0);
        grass.setNoOfFlatRocks(3);
        grass.setNoOfSharpRocks(0);
        grass.setNoOfLogs(0);
        grass.setNoOfFlint(0);
        grass.setNoOfStone(4);
        grass.setNoOfCabins(0);
        grass.setNoOfLeanTos(0);
        grass.setNoOfTowers(0);
        sceneList[Constants.GRASS2] = grass;
        
        // Cliff
        
        Scene cliff = new Scene("Cliff");
        cliff.setDescription("An impassable rocky cliff");
        cliff.setNoOfBerries(0);
        cliff.setNoOfBranches(0);
        cliff.setNoOfFlatRocks(2);
        cliff.setNoOfSharpRocks(3);
        cliff.setNoOfLogs(0);
        cliff.setNoOfFlint(0);
        cliff.setNoOfStone(5);
        cliff.setNoOfCabins(0);
        cliff.setNoOfLeanTos(0);
        cliff.setNoOfTowers(0);
        sceneList[Constants.CLIFF] = cliff;
        
         // Cliff 2
        
        Scene cliff2 = new Scene("Cliff 2");
        cliff.setDescription("An impassable rocky cliff");
        cliff.setNoOfBerries(0);
        cliff.setNoOfBranches(0);
        cliff.setNoOfFlatRocks(6);
        cliff.setNoOfSharpRocks(2);
        cliff.setNoOfLogs(0);
        cliff.setNoOfFlint(4);
        cliff.setNoOfStone(10);
        cliff.setNoOfCabins(0);
        cliff.setNoOfLeanTos(0);
        cliff.setNoOfTowers(0);
        sceneList[Constants.CLIFF2] = cliff;
        
        // Mountiain
        
        Scene mountain = new Scene("Mountain");
        mountain.setDescription("A small stream");
        mountain.setNoOfBerries(75);
        mountain.setNoOfBranches(5);
        mountain.setNoOfFlatRocks(2);
        mountain.setNoOfSharpRocks(3);
        mountain.setNoOfLogs(2);
        mountain.setNoOfFlint(4);
        mountain.setNoOfStone(2);
        mountain.setNoOfCabins(0);
        mountain.setNoOfLeanTos(0);
        mountain.setNoOfTowers(0);
        sceneList[Constants.MOUNTAIN] = mountain;
        
        // Mountiain 2
        
        Scene mountain2 = new Scene("Mountain 2");
        mountain.setDescription("A small stream");
        mountain.setNoOfBerries(55);
        mountain.setNoOfBranches(9);
        mountain.setNoOfFlatRocks(6);
        mountain.setNoOfSharpRocks(2);
        mountain.setNoOfLogs(5);
        mountain.setNoOfFlint(8);
        mountain.setNoOfStone(4);
        mountain.setNoOfCabins(0);
        mountain.setNoOfLeanTos(0);
        mountain.setNoOfTowers(0);
        sceneList[Constants.MOUNTAIN2] = mountain;
        
        // Road
        
        Scene road = new Scene("Road");
        road.setDescription("A man-made road");
        road.setNoOfBerries(0);
        road.setNoOfBranches(0);
        road.setNoOfFlatRocks(0);
        road.setNoOfSharpRocks(0);
        road.setNoOfLogs(0);
        road.setNoOfFlint(0);
        road.setNoOfStone(0);
        road.setNoOfCabins(0);
        road.setNoOfLeanTos(0);
        road.setNoOfTowers(0);
        sceneList[Constants.ROAD] = road;
        
        // Crash Site
        
        Scene crashSite = new Scene("Crash Site");
        crashSite.setDescription("The crash site");
        crashSite.setNoOfBerries(0);
        crashSite.setNoOfBranches(0);
        crashSite.setNoOfFlatRocks(0);
        crashSite.setNoOfSharpRocks(0);
        crashSite.setNoOfLogs(0);
        crashSite.setNoOfFlint(0);
        crashSite.setNoOfStone(0);
        crashSite.setNoOfCabins(0);
        crashSite.setNoOfLeanTos(0);
        crashSite.setNoOfTowers(0);
        sceneList[Constants.CRASH_SITE] = road;
        return sceneList;
        
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
        return map;
        
        private static void assignScenesToLocations(Map map, Scene[] scenes) {
            Location[][] locations = map.getLocations();
            
            // First Row
            
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
            locations[13][0].setScene(scenes[Constants.STREAM]);
            locations[14][0].setScene(scenes[Constants.FOREST]);
            locations[15][0].setScene(scenes[Constants.FOREST]);
            locations[16][0].setScene(scenes[Constants.FOREST]);
            locations[17][0].setScene(scenes[Constants.FOREST]);
            locations[18][0].setScene(scenes[Constants.FOREST]);
            locations[19][0].setScene(scenes[Constants.FOREST]);
            
            // Second Row
            
            locations[0][1].setScene(scenes[Constants.FOREST]);
            locations[1][1].setScene(scenes[Constants.FOREST]);
            locations[2][1].setScene(scenes[Constants.FOREST]);
            locations[3][1].setScene(scenes[Constants.MOUNTAIN]);
            locations[4][1].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][1].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][1].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][1].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][1].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][1].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][1].setScene(scenes[Constants.FOREST]);
            locations[11][1].setScene(scenes[Constants.FOREST]);
            locations[12][1].setScene(scenes[Constants.STREAM]);
            locations[13][1].setScene(scenes[Constants.FOREST]);
            locations[14][1].setScene(scenes[Constants.FOREST]);
            locations[15][1].setScene(scenes[Constants.FOREST]);
            locations[16][1].setScene(scenes[Constants.FOREST]);
            locations[17][1].setScene(scenes[Constants.FOREST]);
            locations[18][1].setScene(scenes[Constants.GRASS]);
            locations[19][1].setScene(scenes[Constants.WATER]);
            
            // Third Row
            
            locations[0][2].setScene(scenes[Constants.FOREST]);
            locations[1][2].setScene(scenes[Constants.FOREST]);
            locations[2][2].setScene(scenes[Constants.FOREST]);
            locations[3][2].setScene(scenes[Constants.MOUNTAIN]);
            locations[4][2].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][2].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][2].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][2].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][2].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][2].setScene(scenes[Constants.FOREST]);
            locations[10][2].setScene(scenes[Constants.FOREST]);
            locations[11][2].setScene(scenes[Constants.STREAM]);
            locations[12][2].setScene(scenes[Constants.FOREST]);
            locations[13][2].setScene(scenes[Constants.FOREST]);
            locations[14][2].setScene(scenes[Constants.FOREST]);
            locations[15][2].setScene(scenes[Constants.FOREST]);
            locations[16][2].setScene(scenes[Constants.FOREST]);
            locations[17][2].setScene(scenes[Constants.GRASS]);
            locations[18][2].setScene(scenes[Constants.GRASS]);
            locations[19][2].setScene(scenes[Constants.WATER]);
            
            // Fourth Row
            
            locations[0][3].setScene(scenes[Constants.GRASS]);
            locations[1][3].setScene(scenes[Constants.FOREST]);
            locations[2][3].setScene(scenes[Constants.FOREST]);
            locations[3][3].setScene(scenes[Constants.MOUNTAIN]);
            locations[4][3].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][3].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][3].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][3].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][3].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][3].setScene(scenes[Constants.FOREST]);
            locations[10][3].setScene(scenes[Constants.FOREST]);
            locations[11][3].setScene(scenes[Constants.STREAM]);
            locations[12][3].setScene(scenes[Constants.FOREST]);
            locations[13][3].setScene(scenes[Constants.FOREST]);
            locations[14][3].setScene(scenes[Constants.FOREST]);
            locations[15][3].setScene(scenes[Constants.FOREST]);
            locations[16][3].setScene(scenes[Constants.FOREST]);
            locations[17][3].setScene(scenes[Constants.GRASS]);
            locations[18][3].setScene(scenes[Constants.GRASS]);
            locations[19][3].setScene(scenes[Constants.WATER]);
            
            // Fifth Row
            
            locations[0][4].setScene(scenes[Constants.GRASS]);
            locations[1][4].setScene(scenes[Constants.FOREST]);
            locations[2][4].setScene(scenes[Constants.FOREST]);
            locations[3][4].setScene(scenes[Constants.FOREST]);
            locations[4][4].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][4].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][4].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][4].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][4].setScene(scenes[Constants.FOREST]);
            locations[9][4].setScene(scenes[Constants.FOREST]);
            locations[10][4].setScene(scenes[Constants.STREAM]);
            locations[11][4].setScene(scenes[Constants.FOREST]);
            locations[12][4].setScene(scenes[Constants.FOREST]);
            locations[13][4].setScene(scenes[Constants.FOREST]);
            locations[14][4].setScene(scenes[Constants.FOREST]);
            locations[15][4].setScene(scenes[Constants.FOREST]);
            locations[16][4].setScene(scenes[Constants.GRASS]);
            locations[17][4].setScene(scenes[Constants.GRASS]);
            locations[18][4].setScene(scenes[Constants.WATER]);
            locations[19][4].setScene(scenes[Constants.WATER]);
            
            // Sixth Row
            
            locations[0][5].setScene(scenes[Constants.ROAD]);
            locations[1][5].setScene(scenes[Constants.GRASS]);
            locations[2][5].setScene(scenes[Constants.FOREST]);
            locations[3][5].setScene(scenes[Constants.FOREST]);
            locations[4][5].setScene(scenes[Constants.FOREST]);
            locations[5][5].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][5].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][5].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][5].setScene(scenes[Constants.FOREST]);
            locations[9][5].setScene(scenes[Constants.FOREST]);
            locations[10][5].setScene(scenes[Constants.STREAM]);
            locations[11][5].setScene(scenes[Constants.FOREST]);
            locations[12][5].setScene(scenes[Constants.FOREST]);
            locations[13][5].setScene(scenes[Constants.FOREST]);
            locations[14][5].setScene(scenes[Constants.FOREST]);
            locations[15][5].setScene(scenes[Constants.GRASS]);
            locations[16][5].setScene(scenes[Constants.GRASS]);
            locations[17][5].setScene(scenes[Constants.GRASS]);
            locations[18][5].setScene(scenes[Constants.WATER]);
            locations[19][5].setScene(scenes[Constants.WATER]);
            
            // Seventh Row
            
            locations[0][6].setScene(scenes[Constants.ROAD]);
            locations[1][6].setScene(scenes[Constants.GRASS]);
            locations[2][6].setScene(scenes[Constants.FOREST]);
            locations[3][6].setScene(scenes[Constants.FOREST]);
            locations[4][6].setScene(scenes[Constants.FOREST]);
            locations[5][6].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][6].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][6].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][6].setScene(scenes[Constants.FOREST]);
            locations[9][6].setScene(scenes[Constants.FOREST]);
            locations[10][6].setScene(scenes[Constants.STREAM]);
            locations[11][6].setScene(scenes[Constants.FOREST]);
            locations[12][6].setScene(scenes[Constants.FOREST]);
            locations[13][6].setScene(scenes[Constants.FOREST]);
            locations[14][6].setScene(scenes[Constants.FOREST]);
            locations[15][6].setScene(scenes[Constants.GRASS]);
            locations[16][6].setScene(scenes[Constants.GRASS]);
            locations[17][6].setScene(scenes[Constants.GRASS]);
            locations[18][6].setScene(scenes[Constants.WATER]);
            locations[19][6].setScene(scenes[Constants.WATER]);
            
            // Eighth Row
            
            locations[0][7].setScene(scenes[Constants.ROAD]);
            locations[1][7].setScene(scenes[Constants.GRASS]);
            locations[2][7].setScene(scenes[Constants.FOREST]);
            locations[3][7].setScene(scenes[Constants.FOREST]);
            locations[4][7].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][7].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][7].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][7].setScene(scenes[Constants.FOREST]);
            locations[8][7].setScene(scenes[Constants.FOREST]);
            locations[9][7].setScene(scenes[Constants.STREAM]);
            locations[10][7].setScene(scenes[Constants.FOREST]);
            locations[11][7].setScene(scenes[Constants.FOREST]);
            locations[12][7].setScene(scenes[Constants.FOREST]);
            locations[13][7].setScene(scenes[Constants.FOREST]);
            locations[14][7].setScene(scenes[Constants.GRASS]);
            locations[15][7].setScene(scenes[Constants.GRASS]);
            locations[16][7].setScene(scenes[Constants.GRASS]);
            locations[17][7].setScene(scenes[Constants.GRASS]);
            locations[18][7].setScene(scenes[Constants.WATER]);
            locations[19][7].setScene(scenes[Constants.WATER]);
            
            // Ninth Row
            
            locations[0][8].setScene(scenes[Constants.ROAD]);
            locations[1][8].setScene(scenes[Constants.GRASS]);
            locations[2][8].setScene(scenes[Constants.FOREST]);
            locations[3][8].setScene(scenes[Constants.FOREST]);
            locations[4][8].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][8].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][8].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][8].setScene(scenes[Constants.FOREST]);
            locations[8][8].setScene(scenes[Constants.FOREST]);
            locations[9][8].setScene(scenes[Constants.STREAM]);
            locations[10][8].setScene(scenes[Constants.FOREST]);
            locations[11][8].setScene(scenes[Constants.FOREST]);
            locations[12][8].setScene(scenes[Constants.FOREST]);
            locations[13][8].setScene(scenes[Constants.FOREST]);
            locations[14][8].setScene(scenes[Constants.GRASS]);
            locations[15][8].setScene(scenes[Constants.GRASS]);
            locations[16][8].setScene(scenes[Constants.GRASS]);
            locations[17][8].setScene(scenes[Constants.GRASS]);
            locations[18][8].setScene(scenes[Constants.CRASH]);
            locations[19][8].setScene(scenes[Constants.WATER]);
            
            // Tenth Row
            
            locations[0][9].setScene(scenes[Constants.ROAD]);
            locations[1][9].setScene(scenes[Constants.GRASS]);
            locations[2][9].setScene(scenes[Constants.FOREST]);
            locations[3][9].setScene(scenes[Constants.FOREST]);
            locations[4][9].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][9].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][9].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][9].setScene(scenes[Constants.FOREST]);
            locations[8][9].setScene(scenes[Constants.FOREST]);
            locations[9][9].setScene(scenes[Constants.STREAM]);
            locations[10][9].setScene(scenes[Constants.FOREST]);
            locations[11][9].setScene(scenes[Constants.FOREST]);
            locations[12][9].setScene(scenes[Constants.FOREST]);
            locations[13][9].setScene(scenes[Constants.FOREST]);
            locations[14][9].setScene(scenes[Constants.GRASS]);
            locations[15][9].setScene(scenes[Constants.GRASS]);
            locations[16][9].setScene(scenes[Constants.GRASS]);
            locations[17][9].setScene(scenes[Constants.GRASS]);
            locations[18][9].setScene(scenes[Constants.WATER]);
            locations[19][9].setScene(scenes[Constants.WATER]);
            
            // Eleventh Row
            
            locations[0][10].setScene(scenes[Constants.ROAD]);
            locations[1][10].setScene(scenes[Constants.GRASS]);
            locations[2][10].setScene(scenes[Constants.FOREST]);
            locations[3][10].setScene(scenes[Constants.FOREST]);
            locations[4][10].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][10].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][10].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][10].setScene(scenes[Constants.FOREST]);
            locations[8][10].setScene(scenes[Constants.FOREST]);
            locations[9][10].setScene(scenes[Constants.STREAM]);
            locations[10][10].setScene(scenes[Constants.FOREST]);
            locations[11][10].setScene(scenes[Constants.FOREST]);
            locations[12][10].setScene(scenes[Constants.FOREST]);
            locations[13][10].setScene(scenes[Constants.FOREST]);
            locations[14][10].setScene(scenes[Constants.GRASS]);
            locations[15][10].setScene(scenes[Constants.GRASS]);
            locations[16][10].setScene(scenes[Constants.GRASS]);
            locations[17][10].setScene(scenes[Constants.GRASS]);
            locations[18][10].setScene(scenes[Constants.WATER]);
            locations[19][10].setScene(scenes[Constants.WATER]);
            
            // Twelfth Row
            
            locations[0][11].setScene(scenes[Constants.ROAD]);
            locations[1][11].setScene(scenes[Constants.GRASS]);
            locations[2][11].setScene(scenes[Constants.FOREST]);
            locations[3][11].setScene(scenes[Constants.FOREST]);
            locations[4][11].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][11].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][11].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][11].setScene(scenes[Constants.FOREST]);
            locations[8][11].setScene(scenes[Constants.FOREST]);
            locations[9][11].setScene(scenes[Constants.STREAM]);
            locations[10][11].setScene(scenes[Constants.FOREST]);
            locations[11][11].setScene(scenes[Constants.FOREST]);
            locations[12][11].setScene(scenes[Constants.FOREST]);
            locations[13][11].setScene(scenes[Constants.FOREST]);
            locations[14][11].setScene(scenes[Constants.GRASS]);
            locations[15][11].setScene(scenes[Constants.GRASS]);
            locations[16][11].setScene(scenes[Constants.GRASS]);
            locations[17][11].setScene(scenes[Constants.GRASS]);
            locations[18][11].setScene(scenes[Constants.GRASS]);
            locations[19][11].setScene(scenes[Constants.WATER]);
            
            // Thirteenth Row
            
            locations[0][12].setScene(scenes[Constants.ROAD]);
            locations[1][12].setScene(scenes[Constants.GRASS]);
            locations[2][12].setScene(scenes[Constants.FOREST]);
            locations[3][12].setScene(scenes[Constants.FOREST]);
            locations[4][12].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][12].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][12].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][12].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][12].setScene(scenes[Constants.FOREST]);
            locations[9][12].setScene(scenes[Constants.STREAM]);
            locations[10][12].setScene(scenes[Constants.FOREST]);
            locations[11][12].setScene(scenes[Constants.FOREST]);
            locations[12][12].setScene(scenes[Constants.FOREST]);
            locations[13][12].setScene(scenes[Constants.FOREST]);
            locations[14][12].setScene(scenes[Constants.FOREST]);
            locations[15][12].setScene(scenes[Constants.GRASS]);
            locations[16][12].setScene(scenes[Constants.GRASS]);
            locations[17][12].setScene(scenes[Constants.GRASS]);
            locations[18][12].setScene(scenes[Constants.GRASS]);
            locations[19][12].setScene(scenes[Constants.WATER]);
            
            // Fourteenth Row
            
            locations[0][13].setScene(scenes[Constants.ROAD]);
            locations[1][13].setScene(scenes[Constants.GRASS]);
            locations[2][13].setScene(scenes[Constants.FOREST]);
            locations[3][13].setScene(scenes[Constants.FOREST]);
            locations[4][13].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][13].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][13].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][13].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][13].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][13].setScene(scenes[Constants.FOREST]);
            locations[10][13].setScene(scenes[Constants.STREAM]);
            locations[11][13].setScene(scenes[Constants.FOREST]);
            locations[12][13].setScene(scenes[Constants.FOREST]);
            locations[13][13].setScene(scenes[Constants.FOREST]);
            locations[14][13].setScene(scenes[Constants.FOREST]);
            locations[15][13].setScene(scenes[Constants.FOREST]);
            locations[16][13].setScene(scenes[Constants.GRASS]);
            locations[17][13].setScene(scenes[Constants.GRASS]);
            locations[18][13].setScene(scenes[Constants.GRASS]);
            locations[19][13].setScene(scenes[Constants.WATER]);
            
            // Fifteenth Row
            
            locations[0][14].setScene(scenes[Constants.ROAD]);
            locations[1][14].setScene(scenes[Constants.GRASS]);
            locations[2][14].setScene(scenes[Constants.FOREST]);
            locations[3][14].setScene(scenes[Constants.FOREST]);
            locations[4][14].setScene(scenes[Constants.FOREST]);
            locations[5][14].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][14].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][14].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][14].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][14].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][14].setScene(scenes[Constants.FOREST]);
            locations[11][14].setScene(scenes[Constants.STREAM]);
            locations[12][14].setScene(scenes[Constants.FOREST]);
            locations[13][14].setScene(scenes[Constants.FOREST]);
            locations[14][14].setScene(scenes[Constants.FOREST]);
            locations[15][14].setScene(scenes[Constants.FOREST]);
            locations[16][14].setScene(scenes[Constants.FOREST]);
            locations[17][14].setScene(scenes[Constants.GRASS]);
            locations[18][14].setScene(scenes[Constants.GRASS]);
            locations[19][14].setScene(scenes[Constants.WATER]);
            
            // Sixteenth Row
            
            locations[0][15].setScene(scenes[Constants.GRASS]);
            locations[1][15].setScene(scenes[Constants.GRASS]);
            locations[2][15].setScene(scenes[Constants.FOREST]);
            locations[3][15].setScene(scenes[Constants.FOREST]);
            locations[4][15].setScene(scenes[Constants.FOREST]);
            locations[5][15].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][15].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][15].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][15].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][15].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][15].setScene(scenes[Constants.MOUNTAIN]);
            locations[11][15].setScene(scenes[Constants.FOREST]);
            locations[12][15].setScene(scenes[Constants.STREAM]);
            locations[13][15].setScene(scenes[Constants.FOREST]);
            locations[14][15].setScene(scenes[Constants.FOREST]);
            locations[15][15].setScene(scenes[Constants.FOREST]);
            locations[16][15].setScene(scenes[Constants.FOREST]);
            locations[17][15].setScene(scenes[Constants.FOREST]);
            locations[18][15].setScene(scenes[Constants.GRASS]);
            locations[19][15].setScene(scenes[Constants.WATER]);
            
            // Seventeenth Row
            
            locations[0][16].setScene(scenes[Constants.GRASS]);
            locations[1][16].setScene(scenes[Constants.FOREST]);
            locations[2][16].setScene(scenes[Constants.FOREST]);
            locations[3][16].setScene(scenes[Constants.FOREST]);
            locations[4][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[11][16].setScene(scenes[Constants.MOUNTAIN]);
            locations[12][16].setScene(scenes[Constants.FOREST]);
            locations[13][16].setScene(scenes[Constants.FOREST]);
            locations[14][16].setScene(scenes[Constants.FOREST]);
            locations[15][16].setScene(scenes[Constants.FOREST]);
            locations[16][16].setScene(scenes[Constants.FOREST]);
            locations[17][16].setScene(scenes[Constants.FOREST]);
            locations[18][16].setScene(scenes[Constants.GRASS]);
            locations[19][16].setScene(scenes[Constants.WATER]);
            
            // Eighteenth Row
            
            locations[0][17].setScene(scenes[Constants.FOREST]);
            locations[1][17].setScene(scenes[Constants.FOREST]);
            locations[2][17].setScene(scenes[Constants.FOREST]);
            locations[3][17].setScene(scenes[Constants.FOREST]);
            locations[4][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[11][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[12][17].setScene(scenes[Constants.MOUNTAIN]);
            locations[13][17].setScene(scenes[Constants.FOREST]);
            locations[14][17].setScene(scenes[Constants.FOREST]);
            locations[15][17].setScene(scenes[Constants.FOREST]);
            locations[16][17].setScene(scenes[Constants.FOREST]);
            locations[17][17].setScene(scenes[Constants.FOREST]);
            locations[18][17].setScene(scenes[Constants.FOREST]);
            locations[19][17].setScene(scenes[Constants.WATER]);
            
            // Nineteenth Row
            
            locations[0][18].setScene(scenes[Constants.FOREST]);
            locations[1][18].setScene(scenes[Constants.FOREST]);
            locations[2][18].setScene(scenes[Constants.FOREST]);
            locations[3][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[4][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[11][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[12][18].setScene(scenes[Constants.MOUNTAIN]);
            locations[13][18].setScene(scenes[Constants.FOREST]);
            locations[14][18].setScene(scenes[Constants.FOREST]);
            locations[15][18].setScene(scenes[Constants.FOREST]);
            locations[16][18].setScene(scenes[Constants.FOREST]);
            locations[17][18].setScene(scenes[Constants.FOREST]);
            locations[18][18].setScene(scenes[Constants.FOREST]);
            locations[19][18].setScene(scenes[Constants.FOREST]);
            
            // Twentieth Row
            
            locations[0][19].setScene(scenes[Constants.FOREST]);
            locations[1][19].setScene(scenes[Constants.FOREST]);
            locations[2][19].setScene(scenes[Constants.FOREST]);
            locations[3][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[4][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[5][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[6][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[7][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[8][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[9][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[10][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[11][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[12][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[13][19].setScene(scenes[Constants.MOUNTAIN]);
            locations[14][19].setScene(scenes[Constants.FOREST]);
            locations[15][19].setScene(scenes[Constants.FOREST]);
            locations[16][19].setScene(scenes[Constants.FOREST]);
            locations[17][19].setScene(scenes[Constants.FOREST]);
            locations[18][19].setScene(scenes[Constants.FOREST]);
            locations[19][19].setScene(scenes[Constants.FOREST]);
    }
    
}
