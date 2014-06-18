/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.control;

import survivalist.model.Location;
import survivalist.model.Map;
import survivalist.model.Npc;
import survivalist.model.Player;
import survivalist.model.Scene;
import survivalist.Survivalist;

/**
 *
 * @author Madison
 */
public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create the scenes for the game
        Scene[] scenes = createSceneList();
        
        // assign scenes to locations
        assignScenesToLocations(map, scenes);
        
        // assign viewable symbol to scene
        
        
        // move actors to starting location
        moveToLocation(Survivalist.getCurrentGame().getPlayer(), Survivalist.getCurrentGame().getNpc());
        
        // display map
        
        return map;
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
        forest.setSymbol("#");
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

    static void moveToLocation(Player player, Npc[] npcList) {
        
         Npc aviatorBill = npcList[Constants.AVIATORBILL];
         MapControl.moveToLocation(aviatorBill, 1, 1);
         
         Npc uncleDarwin = npcList[Constants.UNCLEDARWIN];
         MapControl.moveToLocation(uncleDarwin, row, column);
         
         Npc rangerDan = npcList[Constants.RANGERDAN];
         MapControl.moveToLocation(rangerDan, row, column);
         
         Player player = player[Constants.PLAYER];
         MapControl.moveToLocation(player, row, column);
    }
    
    private static void moveToLocation(Npc npcList, int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static void moveToLocation(Player player, int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
