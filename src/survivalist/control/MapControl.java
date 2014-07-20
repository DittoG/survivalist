/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.control;

import javax.swing.JLabel;
import survivalist.Survivalist;
import survivalist.frames.MapMoveFrame;
import survivalist.model.Location;
import survivalist.model.Map;
import survivalist.model.Npc;
import survivalist.model.Player;
import survivalist.model.Scene;

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

        // move actors to starting location
        setStartLocation(survivalist.Survivalist.getCurrentGame().getPlayer(), survivalist.Survivalist.getCurrentGame().getNpc());

        // display map
        return map;
    }

    private static Scene[] createSceneList() {
        // created array(list) of Scenes
        Scene[] sceneList
                = new Scene[Constants.NUMBER_OF_SCENES];

        // Scene codes******************************************************************************************
        // Forest
        Scene forest = new Scene("Forest");
        forest.setDescription("A forest of trees");
        forest.setType("forest");
        forest.setNoOfBerries(14);
        forest.setNoOfBranches(13);
        forest.setNoOfFlatRocks(4);
        forest.setNoOfSharpRocks(2);
        forest.setNoOfLogs(3);
        forest.setNoOfFlint(0);
        forest.setNoOfStone(5);
        forest.setNoOfCabins(0);
        forest.setNoOfLeanTos(0);
        forest.setNoOfTowers(0);
        forest.setNoOfDeer(4);
        forest.setNoOfElk(1);
        forest.setNoOfRabbits(3);
        forest.setNoOfRaccoons(4);
        forest.setNoOfWolves(0);
        forest.setNoOfMoose(0);
        forest.setNoOfBear(1);
        forest.setSymbol("†");
        sceneList[Constants.FOREST] = forest;

        // Forest 2
        Scene forest2 = new Scene("Forest 2");
        forest2.setDescription("A forest of trees");
        forest2.setType("forest");
        forest2.setNoOfBerries(20);
        forest2.setNoOfBranches(1);
        forest2.setNoOfFlatRocks(3);
        forest2.setNoOfSharpRocks(5);
        forest2.setNoOfLogs(4);
        forest2.setNoOfFlint(3);
        forest2.setNoOfStone(3);
        forest2.setNoOfCabins(0);
        forest2.setNoOfLeanTos(0);
        forest2.setNoOfTowers(0);
        forest2.setNoOfDeer(4);
        forest2.setNoOfElk(2);
        forest2.setNoOfRabbits(2);
        forest2.setNoOfRaccoons(3);
        forest2.setNoOfWolves(2);
        forest2.setNoOfMoose(1);
        forest2.setNoOfBear(0);
        forest2.setSymbol("†");
        sceneList[Constants.FOREST2] = forest2;

        // Forest 3
        Scene forest3 = new Scene("Forest 3");
        forest3.setDescription("A forest of trees");
        forest3.setType("forest");
        forest3.setNoOfBerries(10);
        forest3.setNoOfBranches(15);
        forest3.setNoOfFlatRocks(5);
        forest3.setNoOfSharpRocks(1);
        forest3.setNoOfLogs(12);
        forest3.setNoOfFlint(3);
        forest3.setNoOfStone(8);
        forest3.setNoOfCabins(0);
        forest3.setNoOfLeanTos(0);
        forest3.setNoOfTowers(0);
        forest3.setNoOfDeer(6);
        forest3.setNoOfElk(4);
        forest3.setNoOfRabbits(8);
        forest3.setNoOfRaccoons(2);
        forest3.setNoOfWolves(4);
        forest3.setNoOfMoose(0);
        forest3.setNoOfBear(0);
        forest3.setSymbol("†");
        sceneList[Constants.FOREST3] = forest3;

        // Stream
        Scene stream = new Scene("Stream");
        stream.setDescription("A small stream");
        stream.setType("stream");
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
        stream.setNoOfDeer(1);
        stream.setNoOfElk(0);
        stream.setNoOfRabbits(4);
        stream.setNoOfRaccoons(0);
        stream.setNoOfWolves(0);
        stream.setNoOfMoose(0);
        stream.setNoOfBear(1);
        stream.setSymbol("≈");
        sceneList[Constants.STREAM] = stream;

        // Stream 2
        Scene stream2 = new Scene("Stream 2");
        stream2.setDescription("A small stream");
        stream2.setType("stream");
        stream2.setNoOfBerries(0);
        stream2.setNoOfBranches(0);
        stream2.setNoOfFlatRocks(2);
        stream2.setNoOfSharpRocks(0);
        stream2.setNoOfLogs(0);
        stream2.setNoOfFlint(0);
        stream2.setNoOfStone(8);
        stream2.setNoOfCabins(0);
        stream2.setNoOfLeanTos(0);
        stream2.setNoOfTowers(0);
        stream2.setNoOfDeer(2);
        stream2.setNoOfElk(2);
        stream2.setNoOfRabbits(2);
        stream2.setNoOfRaccoons(0);
        stream2.setNoOfWolves(2);
        stream2.setNoOfMoose(0);
        stream2.setNoOfBear(0);
        stream2.setSymbol("≈");
        sceneList[Constants.STREAM2] = stream2;

        // Stream 3
        Scene stream3 = new Scene("Stream");
        stream3.setDescription("A small stream");
        stream3.setType("stream");
        stream3.setNoOfBerries(0);
        stream3.setNoOfBranches(0);
        stream3.setNoOfFlatRocks(3);
        stream3.setNoOfSharpRocks(2);
        stream3.setNoOfLogs(0);
        stream3.setNoOfFlint(0);
        stream3.setNoOfStone(1);
        stream3.setNoOfCabins(0);
        stream3.setNoOfLeanTos(0);
        stream3.setNoOfTowers(0);
        stream3.setNoOfDeer(0);
        stream3.setNoOfElk(0);
        stream3.setNoOfRabbits(0);
        stream3.setNoOfRaccoons(0);
        stream3.setNoOfWolves(0);
        stream3.setNoOfMoose(0);
        stream3.setNoOfBear(0);
        stream3.setSymbol("≈");
        sceneList[Constants.STREAM3] = stream3;

        // Grass
        Scene grass = new Scene("Grass");
        grass.setDescription("A patch of land covered in grass");
        grass.setType("grass");
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
        grass.setNoOfDeer(10);
        grass.setNoOfElk(2);
        grass.setNoOfRabbits(8);
        grass.setNoOfRaccoons(2);
        grass.setNoOfWolves(0);
        grass.setNoOfMoose(0);
        grass.setNoOfBear(0);
        grass.setSymbol("-");
        sceneList[Constants.GRASS] = grass;

        // Grass2
        Scene grass2 = new Scene("Grass 2");
        grass2.setDescription("A patch of land covered in grass");
        grass2.setType("grass");
        grass2.setNoOfBerries(0);
        grass2.setNoOfBranches(0);
        grass2.setNoOfFlatRocks(3);
        grass2.setNoOfSharpRocks(0);
        grass2.setNoOfLogs(0);
        grass2.setNoOfFlint(0);
        grass2.setNoOfStone(4);
        grass2.setNoOfCabins(0);
        grass2.setNoOfLeanTos(0);
        grass2.setNoOfTowers(0);
        grass2.setNoOfDeer(12);
        grass2.setNoOfElk(2);
        grass2.setNoOfRabbits(4);
        grass2.setNoOfRaccoons(0);
        grass2.setNoOfWolves(2);
        grass2.setNoOfMoose(1);
        grass2.setNoOfBear(0);
        grass2.setSymbol("-");
        sceneList[Constants.GRASS2] = grass2;

        // Grass3
        Scene grass3 = new Scene("Grass 3");
        grass3.setDescription("A patch of land covered in grass");
        grass3.setType("grass");
        grass3.setNoOfBerries(0);
        grass3.setNoOfBranches(0);
        grass3.setNoOfFlatRocks(5);
        grass3.setNoOfSharpRocks(0);
        grass3.setNoOfLogs(0);
        grass3.setNoOfFlint(0);
        grass3.setNoOfStone(8);
        grass3.setNoOfCabins(0);
        grass3.setNoOfLeanTos(0);
        grass3.setNoOfTowers(0);
        grass3.setNoOfDeer(4);
        grass3.setNoOfElk(8);
        grass3.setNoOfRabbits(16);
        grass3.setNoOfRaccoons(1);
        grass3.setNoOfWolves(0);
        grass3.setNoOfMoose(0);
        grass3.setNoOfBear(1);
        grass3.setSymbol("-");
        sceneList[Constants.GRASS3] = grass3;

        // Cliff
        Scene cliff = new Scene("Cliff");
        cliff.setDescription("An impassable rocky cliff");
        cliff.setType("cliff");
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
        cliff.setNoOfDeer(0);
        cliff.setNoOfElk(4);
        cliff.setNoOfRabbits(0);
        cliff.setNoOfRaccoons(3);
        cliff.setNoOfWolves(0);
        cliff.setNoOfMoose(0);
        cliff.setNoOfBear(0);
        cliff.setSymbol("¦");
        sceneList[Constants.CLIFF] = cliff;

        // Cliff 2
        Scene cliff2 = new Scene("Cliff 2");
        cliff2.setDescription("An impassable rocky cliff");
        cliff2.setType("cliff");
        cliff2.setNoOfBerries(0);
        cliff2.setNoOfBranches(0);
        cliff2.setNoOfFlatRocks(6);
        cliff2.setNoOfSharpRocks(2);
        cliff2.setNoOfLogs(0);
        cliff2.setNoOfFlint(4);
        cliff2.setNoOfStone(10);
        cliff2.setNoOfCabins(0);
        cliff2.setNoOfLeanTos(0);
        cliff2.setNoOfTowers(0);
        cliff2.setNoOfDeer(4);
        cliff2.setNoOfElk(0);
        cliff2.setNoOfRabbits(0);
        cliff2.setNoOfRaccoons(5);
        cliff2.setNoOfWolves(2);
        cliff2.setNoOfMoose(0);
        cliff2.setNoOfBear(0);
        cliff2.setSymbol("¦");
        sceneList[Constants.CLIFF2] = cliff2;

        // Cliff 3
        Scene cliff3 = new Scene("Cliff 3");
        cliff3.setDescription("An impassable rocky cliff");
        cliff3.setType("cliff");
        cliff3.setNoOfBerries(0);
        cliff3.setNoOfBranches(0);
        cliff3.setNoOfFlatRocks(6);
        cliff3.setNoOfSharpRocks(8);
        cliff3.setNoOfLogs(0);
        cliff3.setNoOfFlint(8);
        cliff3.setNoOfStone(2);
        cliff3.setNoOfCabins(0);
        cliff3.setNoOfLeanTos(0);
        cliff3.setNoOfTowers(0);
        cliff3.setNoOfDeer(2);
        cliff3.setNoOfElk(2);
        cliff3.setNoOfRabbits(2);
        cliff3.setNoOfRaccoons(3);
        cliff3.setNoOfWolves(0);
        cliff3.setNoOfMoose(0);
        cliff3.setNoOfBear(0);
        cliff3.setSymbol("¦");
        sceneList[Constants.CLIFF3] = cliff3;

        // Mountiain
        Scene mountain = new Scene("Mountain");
        mountain.setDescription("Larger than a hill");
        mountain.setType("mountain");
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
        mountain.setNoOfDeer(6);
        mountain.setNoOfElk(8);
        mountain.setNoOfRabbits(6);
        mountain.setNoOfRaccoons(4);
        mountain.setNoOfWolves(3);
        mountain.setNoOfMoose(0);
        mountain.setNoOfBear(1);
        mountain.setSymbol("^");
        sceneList[Constants.MOUNTAIN] = mountain;

        // Mountiain 2
        Scene mountain2 = new Scene("Mountain 2");
        mountain2.setDescription("Larger than a hill");
        mountain2.setType("mountain");
        mountain2.setNoOfBerries(55);
        mountain2.setNoOfBranches(9);
        mountain2.setNoOfFlatRocks(6);
        mountain2.setNoOfSharpRocks(2);
        mountain2.setNoOfLogs(5);
        mountain2.setNoOfFlint(8);
        mountain2.setNoOfStone(4);
        mountain2.setNoOfCabins(0);
        mountain2.setNoOfLeanTos(0);
        mountain2.setNoOfTowers(0);
        mountain2.setNoOfDeer(8);
        mountain2.setNoOfElk(3);
        mountain2.setNoOfRabbits(8);
        mountain2.setNoOfRaccoons(2);
        mountain2.setNoOfWolves(4);
        mountain2.setNoOfMoose(0);
        mountain2.setNoOfBear(0);
        mountain2.setSymbol("^");
        sceneList[Constants.MOUNTAIN2] = mountain2;

        // Mountiain 3
        Scene mountain3 = new Scene("Mountain 3");
        mountain3.setDescription("Larger than a hill");
        mountain3.setType("mountain");
        mountain3.setNoOfBerries(15);
        mountain3.setNoOfBranches(8);
        mountain3.setNoOfFlatRocks(3);
        mountain3.setNoOfSharpRocks(2);
        mountain3.setNoOfLogs(5);
        mountain3.setNoOfFlint(3);
        mountain3.setNoOfStone(4);
        mountain3.setNoOfCabins(0);
        mountain3.setNoOfLeanTos(0);
        mountain3.setNoOfTowers(0);
        mountain3.setNoOfDeer(1);
        mountain3.setNoOfElk(0);
        mountain3.setNoOfRabbits(2);
        mountain3.setNoOfRaccoons(6);
        mountain3.setNoOfWolves(0);
        mountain3.setNoOfMoose(0);
        mountain3.setNoOfBear(2);
        mountain3.setSymbol("^");
        sceneList[Constants.MOUNTAIN3] = mountain3;

        // Road
        Scene road = new Scene("Road");
        road.setDescription("A man-made road");
        road.setType("road");
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
        road.setNoOfDeer(0);
        road.setNoOfElk(0);
        road.setNoOfRabbits(0);
        road.setNoOfRaccoons(4);
        road.setNoOfWolves(0);
        road.setNoOfMoose(0);
        road.setNoOfBear(1);
        road.setSymbol("║");
        sceneList[Constants.ROAD] = road;

        // Crash Site
        Scene crashSite = new Scene("Crash Site");
        crashSite.setDescription("The crash site");
        crashSite.setType("crash site");
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
        crashSite.setNoOfDeer(0);
        crashSite.setNoOfElk(0);
        crashSite.setNoOfRabbits(0);
        crashSite.setNoOfRaccoons(0);
        crashSite.setNoOfWolves(0);
        crashSite.setNoOfMoose(0);
        crashSite.setNoOfBear(0);
        crashSite.setSymbol("×");
        sceneList[Constants.CRASH_SITE] = crashSite;
        return sceneList;

    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        // First Row
        locations[0][0].setScene(scenes[Constants.FOREST]);
        locations[1][0].setScene(scenes[Constants.FOREST2]);
        locations[2][0].setScene(scenes[Constants.MOUNTAIN2]);
        locations[3][0].setScene(scenes[Constants.MOUNTAIN2]);
        locations[4][0].setScene(scenes[Constants.MOUNTAIN]);
        locations[5][0].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][0].setScene(scenes[Constants.MOUNTAIN]);
        locations[7][0].setScene(scenes[Constants.MOUNTAIN]);
        locations[8][0].setScene(scenes[Constants.MOUNTAIN2]);
        locations[9][0].setScene(scenes[Constants.MOUNTAIN2]);
        locations[10][0].setScene(scenes[Constants.MOUNTAIN]);
        locations[11][0].setScene(scenes[Constants.FOREST3]);
        locations[12][0].setScene(scenes[Constants.FOREST]);
        locations[13][0].setScene(scenes[Constants.STREAM]);
        locations[14][0].setScene(scenes[Constants.FOREST2]);
        locations[15][0].setScene(scenes[Constants.FOREST]);
        locations[16][0].setScene(scenes[Constants.FOREST]);
        locations[17][0].setScene(scenes[Constants.FOREST3]);
        locations[18][0].setScene(scenes[Constants.FOREST]);
        locations[19][0].setScene(scenes[Constants.FOREST2]);

        // Second Row
        locations[0][1].setScene(scenes[Constants.FOREST2]);
        locations[1][1].setScene(scenes[Constants.FOREST2]);
        locations[2][1].setScene(scenes[Constants.FOREST]);
        locations[3][1].setScene(scenes[Constants.MOUNTAIN]);
        locations[4][1].setScene(scenes[Constants.MOUNTAIN]);
        locations[5][1].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][1].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][1].setScene(scenes[Constants.MOUNTAIN]);
        locations[8][1].setScene(scenes[Constants.MOUNTAIN2]);
        locations[9][1].setScene(scenes[Constants.MOUNTAIN]);
        locations[10][1].setScene(scenes[Constants.FOREST]);
        locations[11][1].setScene(scenes[Constants.FOREST3]);
        locations[12][1].setScene(scenes[Constants.STREAM]);
        locations[13][1].setScene(scenes[Constants.FOREST]);
        locations[14][1].setScene(scenes[Constants.FOREST3]);
        locations[15][1].setScene(scenes[Constants.FOREST]);
        locations[16][1].setScene(scenes[Constants.FOREST2]);
        locations[17][1].setScene(scenes[Constants.FOREST2]);
        locations[18][1].setScene(scenes[Constants.GRASS]);
        locations[19][1].setScene(scenes[Constants.STREAM3]);

        // Third Row
        locations[0][2].setScene(scenes[Constants.FOREST2]);
        locations[1][2].setScene(scenes[Constants.FOREST2]);
        locations[2][2].setScene(scenes[Constants.FOREST2]);
        locations[3][2].setScene(scenes[Constants.MOUNTAIN]);
        locations[4][2].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][2].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][2].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][2].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][2].setScene(scenes[Constants.MOUNTAIN]);
        locations[9][2].setScene(scenes[Constants.FOREST3]);
        locations[10][2].setScene(scenes[Constants.FOREST2]);
        locations[11][2].setScene(scenes[Constants.STREAM]);
        locations[12][2].setScene(scenes[Constants.FOREST3]);
        locations[13][2].setScene(scenes[Constants.FOREST2]);
        locations[14][2].setScene(scenes[Constants.FOREST]);
        locations[15][2].setScene(scenes[Constants.FOREST]);
        locations[16][2].setScene(scenes[Constants.FOREST3]);
        locations[17][2].setScene(scenes[Constants.GRASS2]);
        locations[18][2].setScene(scenes[Constants.GRASS2]);
        locations[19][2].setScene(scenes[Constants.STREAM3]);

        // Fourth Row
        locations[0][3].setScene(scenes[Constants.GRASS2]);
        locations[1][3].setScene(scenes[Constants.FOREST3]);
        locations[2][3].setScene(scenes[Constants.FOREST3]);
        locations[3][3].setScene(scenes[Constants.MOUNTAIN2]);
        locations[4][3].setScene(scenes[Constants.MOUNTAIN]);
        locations[5][3].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][3].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][3].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][3].setScene(scenes[Constants.MOUNTAIN]);
        locations[9][3].setScene(scenes[Constants.FOREST]);
        locations[10][3].setScene(scenes[Constants.FOREST2]);
        locations[11][3].setScene(scenes[Constants.STREAM]);
        locations[12][3].setScene(scenes[Constants.FOREST3]);
        locations[13][3].setScene(scenes[Constants.FOREST3]);
        locations[14][3].setScene(scenes[Constants.FOREST]);
        locations[15][3].setScene(scenes[Constants.FOREST]);
        locations[16][3].setScene(scenes[Constants.FOREST2]);
        locations[17][3].setScene(scenes[Constants.GRASS]);
        locations[18][3].setScene(scenes[Constants.GRASS2]);
        locations[19][3].setScene(scenes[Constants.STREAM3]);

        // Fifth Row
        locations[0][4].setScene(scenes[Constants.GRASS2]);
        locations[1][4].setScene(scenes[Constants.FOREST3]);
        locations[2][4].setScene(scenes[Constants.FOREST3]);
        locations[3][4].setScene(scenes[Constants.FOREST]);
        locations[4][4].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][4].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][4].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][4].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][4].setScene(scenes[Constants.FOREST3]);
        locations[9][4].setScene(scenes[Constants.FOREST2]);
        locations[10][4].setScene(scenes[Constants.STREAM2]);
        locations[11][4].setScene(scenes[Constants.FOREST]);
        locations[12][4].setScene(scenes[Constants.FOREST]);
        locations[13][4].setScene(scenes[Constants.FOREST3]);
        locations[14][4].setScene(scenes[Constants.FOREST2]);
        locations[15][4].setScene(scenes[Constants.FOREST3]);
        locations[16][4].setScene(scenes[Constants.GRASS]);
        locations[17][4].setScene(scenes[Constants.GRASS2]);
        locations[18][4].setScene(scenes[Constants.STREAM3]);
        locations[19][4].setScene(scenes[Constants.STREAM3]);

        // Sixth Row
        locations[0][5].setScene(scenes[Constants.ROAD]);
        locations[1][5].setScene(scenes[Constants.GRASS]);
        locations[2][5].setScene(scenes[Constants.FOREST3]);
        locations[3][5].setScene(scenes[Constants.FOREST3]);
        locations[4][5].setScene(scenes[Constants.FOREST2]);
        locations[5][5].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][5].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][5].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][5].setScene(scenes[Constants.FOREST3]);
        locations[9][5].setScene(scenes[Constants.FOREST3]);
        locations[10][5].setScene(scenes[Constants.STREAM]);
        locations[11][5].setScene(scenes[Constants.FOREST2]);
        locations[12][5].setScene(scenes[Constants.FOREST2]);
        locations[13][5].setScene(scenes[Constants.FOREST]);
        locations[14][5].setScene(scenes[Constants.FOREST]);
        locations[15][5].setScene(scenes[Constants.GRASS]);
        locations[16][5].setScene(scenes[Constants.GRASS2]);
        locations[17][5].setScene(scenes[Constants.GRASS2]);
        locations[18][5].setScene(scenes[Constants.STREAM3]);
        locations[19][5].setScene(scenes[Constants.STREAM3]);

        // Seventh Row
        locations[0][6].setScene(scenes[Constants.ROAD]);
        locations[1][6].setScene(scenes[Constants.GRASS]);
        locations[2][6].setScene(scenes[Constants.FOREST3]);
        locations[3][6].setScene(scenes[Constants.FOREST2]);
        locations[4][6].setScene(scenes[Constants.FOREST2]);
        locations[5][6].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][6].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][6].setScene(scenes[Constants.MOUNTAIN]);
        locations[8][6].setScene(scenes[Constants.FOREST2]);
        locations[9][6].setScene(scenes[Constants.FOREST]);
        locations[10][6].setScene(scenes[Constants.STREAM]);
        locations[11][6].setScene(scenes[Constants.FOREST3]);
        locations[12][6].setScene(scenes[Constants.FOREST3]);
        locations[13][6].setScene(scenes[Constants.FOREST]);
        locations[14][6].setScene(scenes[Constants.FOREST]);
        locations[15][6].setScene(scenes[Constants.GRASS2]);
        locations[16][6].setScene(scenes[Constants.GRASS2]);
        locations[17][6].setScene(scenes[Constants.GRASS]);
        locations[18][6].setScene(scenes[Constants.STREAM3]);
        locations[19][6].setScene(scenes[Constants.STREAM3]);

        // Eighth Row
        locations[0][7].setScene(scenes[Constants.ROAD]);
        locations[1][7].setScene(scenes[Constants.GRASS]);
        locations[2][7].setScene(scenes[Constants.FOREST2]);
        locations[3][7].setScene(scenes[Constants.FOREST3]);
        locations[4][7].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][7].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][7].setScene(scenes[Constants.MOUNTAIN]);
        locations[7][7].setScene(scenes[Constants.FOREST3]);
        locations[8][7].setScene(scenes[Constants.FOREST]);
        locations[9][7].setScene(scenes[Constants.STREAM]);
        locations[10][7].setScene(scenes[Constants.FOREST2]);
        locations[11][7].setScene(scenes[Constants.FOREST2]);
        locations[12][7].setScene(scenes[Constants.FOREST]);
        locations[13][7].setScene(scenes[Constants.FOREST3]);
        locations[14][7].setScene(scenes[Constants.GRASS]);
        locations[15][7].setScene(scenes[Constants.GRASS2]);
        locations[16][7].setScene(scenes[Constants.GRASS2]);
        locations[17][7].setScene(scenes[Constants.GRASS]);
        locations[18][7].setScene(scenes[Constants.STREAM3]);
        locations[19][7].setScene(scenes[Constants.STREAM3]);

        // Ninth Row
        locations[0][8].setScene(scenes[Constants.ROAD]);
        locations[1][8].setScene(scenes[Constants.GRASS2]);
        locations[2][8].setScene(scenes[Constants.FOREST3]);
        locations[3][8].setScene(scenes[Constants.FOREST]);
        locations[4][8].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][8].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][8].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][8].setScene(scenes[Constants.FOREST3]);
        locations[8][8].setScene(scenes[Constants.FOREST]);
        locations[9][8].setScene(scenes[Constants.STREAM]);
        locations[10][8].setScene(scenes[Constants.FOREST3]);
        locations[11][8].setScene(scenes[Constants.FOREST3]);
        locations[12][8].setScene(scenes[Constants.FOREST2]);
        locations[13][8].setScene(scenes[Constants.FOREST2]);
        locations[14][8].setScene(scenes[Constants.GRASS2]);
        locations[15][8].setScene(scenes[Constants.GRASS]);
        locations[16][8].setScene(scenes[Constants.GRASS]);
        locations[17][8].setScene(scenes[Constants.GRASS2]);
        locations[18][8].setScene(scenes[Constants.CRASH_SITE]);
        locations[19][8].setScene(scenes[Constants.STREAM3]);

        // Tenth Row
        locations[0][9].setScene(scenes[Constants.ROAD]);
        locations[1][9].setScene(scenes[Constants.GRASS2]);
        locations[2][9].setScene(scenes[Constants.FOREST3]);
        locations[3][9].setScene(scenes[Constants.FOREST]);
        locations[4][9].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][9].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][9].setScene(scenes[Constants.MOUNTAIN]);
        locations[7][9].setScene(scenes[Constants.FOREST3]);
        locations[8][9].setScene(scenes[Constants.FOREST]);
        locations[9][9].setScene(scenes[Constants.STREAM]);
        locations[10][9].setScene(scenes[Constants.FOREST3]);
        locations[11][9].setScene(scenes[Constants.FOREST3]);
        locations[12][9].setScene(scenes[Constants.FOREST]);
        locations[13][9].setScene(scenes[Constants.FOREST2]);
        locations[14][9].setScene(scenes[Constants.GRASS]);
        locations[15][9].setScene(scenes[Constants.GRASS]);
        locations[16][9].setScene(scenes[Constants.GRASS2]);
        locations[17][9].setScene(scenes[Constants.GRASS]);
        locations[18][9].setScene(scenes[Constants.STREAM3]);
        locations[19][9].setScene(scenes[Constants.STREAM3]);

        // Eleventh Row
        locations[0][10].setScene(scenes[Constants.ROAD]);
        locations[1][10].setScene(scenes[Constants.GRASS]);
        locations[2][10].setScene(scenes[Constants.FOREST2]);
        locations[3][10].setScene(scenes[Constants.FOREST]);
        locations[4][10].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][10].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][10].setScene(scenes[Constants.MOUNTAIN]);
        locations[7][10].setScene(scenes[Constants.FOREST2]);
        locations[8][10].setScene(scenes[Constants.FOREST]);
        locations[9][10].setScene(scenes[Constants.STREAM]);
        locations[10][10].setScene(scenes[Constants.FOREST3]);
        locations[11][10].setScene(scenes[Constants.FOREST]);
        locations[12][10].setScene(scenes[Constants.FOREST3]);
        locations[13][10].setScene(scenes[Constants.FOREST]);
        locations[14][10].setScene(scenes[Constants.GRASS]);
        locations[15][10].setScene(scenes[Constants.GRASS2]);
        locations[16][10].setScene(scenes[Constants.GRASS]);
        locations[17][10].setScene(scenes[Constants.GRASS]);
        locations[18][10].setScene(scenes[Constants.STREAM3]);
        locations[19][10].setScene(scenes[Constants.STREAM3]);

        // Twelfth Row
        locations[0][11].setScene(scenes[Constants.ROAD]);
        locations[1][11].setScene(scenes[Constants.GRASS]);
        locations[2][11].setScene(scenes[Constants.FOREST]);
        locations[3][11].setScene(scenes[Constants.FOREST]);
        locations[4][11].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][11].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][11].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][11].setScene(scenes[Constants.FOREST]);
        locations[8][11].setScene(scenes[Constants.FOREST]);
        locations[9][11].setScene(scenes[Constants.STREAM]);
        locations[10][11].setScene(scenes[Constants.FOREST]);
        locations[11][11].setScene(scenes[Constants.FOREST2]);
        locations[12][11].setScene(scenes[Constants.FOREST2]);
        locations[13][11].setScene(scenes[Constants.FOREST]);
        locations[14][11].setScene(scenes[Constants.GRASS]);
        locations[15][11].setScene(scenes[Constants.GRASS2]);
        locations[16][11].setScene(scenes[Constants.GRASS]);
        locations[17][11].setScene(scenes[Constants.GRASS2]);
        locations[18][11].setScene(scenes[Constants.GRASS]);
        locations[19][11].setScene(scenes[Constants.STREAM3]);

        // Thirteenth Row
        locations[0][12].setScene(scenes[Constants.ROAD]);
        locations[1][12].setScene(scenes[Constants.GRASS]);
        locations[2][12].setScene(scenes[Constants.FOREST3]);
        locations[3][12].setScene(scenes[Constants.FOREST]);
        locations[4][12].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][12].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][12].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][12].setScene(scenes[Constants.MOUNTAIN]);
        locations[8][12].setScene(scenes[Constants.FOREST3]);
        locations[9][12].setScene(scenes[Constants.STREAM]);
        locations[10][12].setScene(scenes[Constants.FOREST2]);
        locations[11][12].setScene(scenes[Constants.FOREST]);
        locations[12][12].setScene(scenes[Constants.FOREST2]);
        locations[13][12].setScene(scenes[Constants.FOREST]);
        locations[14][12].setScene(scenes[Constants.FOREST3]);
        locations[15][12].setScene(scenes[Constants.GRASS]);
        locations[16][12].setScene(scenes[Constants.GRASS2]);
        locations[17][12].setScene(scenes[Constants.GRASS]);
        locations[18][12].setScene(scenes[Constants.GRASS2]);
        locations[19][12].setScene(scenes[Constants.STREAM3]);

        // Fourteenth Row
        locations[0][13].setScene(scenes[Constants.ROAD]);
        locations[1][13].setScene(scenes[Constants.GRASS]);
        locations[2][13].setScene(scenes[Constants.FOREST2]);
        locations[3][13].setScene(scenes[Constants.FOREST3]);
        locations[4][13].setScene(scenes[Constants.MOUNTAIN]);
        locations[5][13].setScene(scenes[Constants.MOUNTAIN]);
        locations[6][13].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][13].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][13].setScene(scenes[Constants.MOUNTAIN2]);
        locations[9][13].setScene(scenes[Constants.FOREST3]);
        locations[10][13].setScene(scenes[Constants.STREAM]);
        locations[11][13].setScene(scenes[Constants.FOREST3]);
        locations[12][13].setScene(scenes[Constants.FOREST]);
        locations[13][13].setScene(scenes[Constants.FOREST3]);
        locations[14][13].setScene(scenes[Constants.FOREST]);
        locations[15][13].setScene(scenes[Constants.FOREST2]);
        locations[16][13].setScene(scenes[Constants.GRASS]);
        locations[17][13].setScene(scenes[Constants.GRASS2]);
        locations[18][13].setScene(scenes[Constants.GRASS]);
        locations[19][13].setScene(scenes[Constants.STREAM3]);

        // Fifteenth Row
        locations[0][14].setScene(scenes[Constants.ROAD]);
        locations[1][14].setScene(scenes[Constants.GRASS2]);
        locations[2][14].setScene(scenes[Constants.FOREST3]);
        locations[3][14].setScene(scenes[Constants.FOREST]);
        locations[4][14].setScene(scenes[Constants.FOREST3]);
        locations[5][14].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][14].setScene(scenes[Constants.MOUNTAIN]);
        locations[7][14].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][14].setScene(scenes[Constants.MOUNTAIN2]);
        locations[9][14].setScene(scenes[Constants.MOUNTAIN]);
        locations[10][14].setScene(scenes[Constants.FOREST3]);
        locations[11][14].setScene(scenes[Constants.STREAM2]);
        locations[12][14].setScene(scenes[Constants.FOREST]);
        locations[13][14].setScene(scenes[Constants.FOREST3]);
        locations[14][14].setScene(scenes[Constants.FOREST]);
        locations[15][14].setScene(scenes[Constants.FOREST2]);
        locations[16][14].setScene(scenes[Constants.FOREST2]);
        locations[17][14].setScene(scenes[Constants.GRASS2]);
        locations[18][14].setScene(scenes[Constants.GRASS]);
        locations[19][14].setScene(scenes[Constants.STREAM3]);

        // Sixteenth Row
        locations[0][15].setScene(scenes[Constants.GRASS2]);
        locations[1][15].setScene(scenes[Constants.GRASS]);
        locations[2][15].setScene(scenes[Constants.FOREST3]);
        locations[3][15].setScene(scenes[Constants.FOREST2]);
        locations[4][15].setScene(scenes[Constants.FOREST]);
        locations[5][15].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][15].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][15].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][15].setScene(scenes[Constants.MOUNTAIN]);
        locations[9][15].setScene(scenes[Constants.MOUNTAIN]);
        locations[10][15].setScene(scenes[Constants.MOUNTAIN]);
        locations[11][15].setScene(scenes[Constants.FOREST]);
        locations[12][15].setScene(scenes[Constants.STREAM2]);
        locations[13][15].setScene(scenes[Constants.FOREST3]);
        locations[14][15].setScene(scenes[Constants.FOREST2]);
        locations[15][15].setScene(scenes[Constants.FOREST]);
        locations[16][15].setScene(scenes[Constants.FOREST2]);
        locations[17][15].setScene(scenes[Constants.FOREST3]);
        locations[18][15].setScene(scenes[Constants.GRASS]);
        locations[19][15].setScene(scenes[Constants.STREAM3]);

        // Seventeenth Row
        locations[0][16].setScene(scenes[Constants.GRASS]);
        locations[1][16].setScene(scenes[Constants.FOREST3]);
        locations[2][16].setScene(scenes[Constants.FOREST2]);
        locations[3][16].setScene(scenes[Constants.FOREST]);
        locations[4][16].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][16].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][16].setScene(scenes[Constants.MOUNTAIN]);
        locations[7][16].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][16].setScene(scenes[Constants.MOUNTAIN]);
        locations[9][16].setScene(scenes[Constants.MOUNTAIN2]);
        locations[10][16].setScene(scenes[Constants.MOUNTAIN]);
        locations[11][16].setScene(scenes[Constants.MOUNTAIN2]);
        locations[12][16].setScene(scenes[Constants.FOREST]);
        locations[13][16].setScene(scenes[Constants.FOREST3]);
        locations[14][16].setScene(scenes[Constants.FOREST]);
        locations[15][16].setScene(scenes[Constants.FOREST2]);
        locations[16][16].setScene(scenes[Constants.FOREST2]);
        locations[17][16].setScene(scenes[Constants.FOREST3]);
        locations[18][16].setScene(scenes[Constants.GRASS2]);
        locations[19][16].setScene(scenes[Constants.STREAM3]);

        // Eighteenth Row
        locations[0][17].setScene(scenes[Constants.FOREST3]);
        locations[1][17].setScene(scenes[Constants.FOREST3]);
        locations[2][17].setScene(scenes[Constants.FOREST]);
        locations[3][17].setScene(scenes[Constants.FOREST2]);
        locations[4][17].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][17].setScene(scenes[Constants.MOUNTAIN2]);
        locations[6][17].setScene(scenes[Constants.MOUNTAIN]);
        locations[7][17].setScene(scenes[Constants.MOUNTAIN2]);
        locations[8][17].setScene(scenes[Constants.MOUNTAIN2]);
        locations[9][17].setScene(scenes[Constants.MOUNTAIN]);
        locations[10][17].setScene(scenes[Constants.MOUNTAIN]);
        locations[11][17].setScene(scenes[Constants.MOUNTAIN2]);
        locations[12][17].setScene(scenes[Constants.MOUNTAIN]);
        locations[13][17].setScene(scenes[Constants.FOREST3]);
        locations[14][17].setScene(scenes[Constants.FOREST]);
        locations[15][17].setScene(scenes[Constants.FOREST3]);
        locations[16][17].setScene(scenes[Constants.FOREST2]);
        locations[17][17].setScene(scenes[Constants.FOREST]);
        locations[18][17].setScene(scenes[Constants.FOREST2]);
        locations[19][17].setScene(scenes[Constants.STREAM3]);

        // Nineteenth Row
        locations[0][18].setScene(scenes[Constants.FOREST2]);
        locations[1][18].setScene(scenes[Constants.FOREST3]);
        locations[2][18].setScene(scenes[Constants.FOREST]);
        locations[3][18].setScene(scenes[Constants.MOUNTAIN3]);
        locations[4][18].setScene(scenes[Constants.MOUNTAIN2]);
        locations[5][18].setScene(scenes[Constants.MOUNTAIN3]);
        locations[6][18].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][18].setScene(scenes[Constants.MOUNTAIN]);
        locations[8][18].setScene(scenes[Constants.MOUNTAIN3]);
        locations[9][18].setScene(scenes[Constants.MOUNTAIN]);
        locations[10][18].setScene(scenes[Constants.MOUNTAIN2]);
        locations[11][18].setScene(scenes[Constants.MOUNTAIN3]);
        locations[12][18].setScene(scenes[Constants.MOUNTAIN2]);
        locations[13][18].setScene(scenes[Constants.FOREST]);
        locations[14][18].setScene(scenes[Constants.FOREST]);
        locations[15][18].setScene(scenes[Constants.FOREST2]);
        locations[16][18].setScene(scenes[Constants.FOREST2]);
        locations[17][18].setScene(scenes[Constants.FOREST3]);
        locations[18][18].setScene(scenes[Constants.FOREST]);
        locations[19][18].setScene(scenes[Constants.FOREST3]);

        // Twentieth Row
        locations[0][19].setScene(scenes[Constants.FOREST3]);
        locations[1][19].setScene(scenes[Constants.FOREST2]);
        locations[2][19].setScene(scenes[Constants.FOREST3]);
        locations[3][19].setScene(scenes[Constants.MOUNTAIN]);
        locations[4][19].setScene(scenes[Constants.MOUNTAIN]);
        locations[5][19].setScene(scenes[Constants.MOUNTAIN3]);
        locations[6][19].setScene(scenes[Constants.MOUNTAIN2]);
        locations[7][19].setScene(scenes[Constants.MOUNTAIN]);
        locations[8][19].setScene(scenes[Constants.MOUNTAIN2]);
        locations[9][19].setScene(scenes[Constants.MOUNTAIN3]);
        locations[10][19].setScene(scenes[Constants.MOUNTAIN2]);
        locations[11][19].setScene(scenes[Constants.MOUNTAIN3]);
        locations[12][19].setScene(scenes[Constants.MOUNTAIN]);
        locations[13][19].setScene(scenes[Constants.MOUNTAIN2]);
        locations[14][19].setScene(scenes[Constants.FOREST3]);
        locations[15][19].setScene(scenes[Constants.FOREST2]);
        locations[16][19].setScene(scenes[Constants.FOREST3]);
        locations[17][19].setScene(scenes[Constants.FOREST]);
        locations[18][19].setScene(scenes[Constants.FOREST3]);
        locations[19][19].setScene(scenes[Constants.FOREST3]);
    }

    public static void assignLableToLocations(Map map, javax.swing.JLabel jLabel) {
        // get all locations
        Location[][] locations = map.getLocations();

        JLabel jlforest48 = new MapMoveFrame().getJlForest48();
        locations[0][0].setMapLabel(jlforest48);

        JLabel jlforest49 = new MapMoveFrame().getJlForest49();
        locations[1][0].setMapLabel(jlforest49);

        JLabel jlMountain1 = new MapMoveFrame().getJlMountain1();
        locations[2][0].setMapLabel(jlMountain1);

        JLabel jlMountain63 = new MapMoveFrame().getJlMountain63();
        locations[3][0].setMapLabel(jlMountain63);

        JLabel jlMountain70 = new MapMoveFrame().getJlMountain70();
        locations[4][0].setMapLabel(jlMountain70);

        JLabel jlMountain71 = new MapMoveFrame().getJlMountain71();
        locations[5][0].setMapLabel(jlMountain71);

        JLabel jlMountain72 = new MapMoveFrame().getJlMountain72();
        locations[6][0].setMapLabel(jlMountain72);

        JLabel jlMountain73 = new MapMoveFrame().getJlMountain73();
        locations[7][0].setMapLabel(jlMountain73);

        JLabel jlMountain74 = new MapMoveFrame().getJlMountain74();
        locations[8][0].setMapLabel(jlMountain74);

        JLabel jlMountain75 = new MapMoveFrame().getJlMountain75();
        locations[9][0].setMapLabel(jlMountain75);

        JLabel jlMountain9 = new MapMoveFrame().getJlMountain9();
        locations[10][0].setMapLabel(jlMountain9);

        JLabel jlforest54 = new MapMoveFrame().getJlForest54();
        locations[11][0].setMapLabel(jlforest54);

        JLabel jlforest55 = new MapMoveFrame().getJlForest55();
        locations[12][0].setMapLabel(jlforest55);

        JLabel jlWater31 = new MapMoveFrame().getJlWater31();
        locations[13][0].setMapLabel(jlWater31);

        JLabel jlforest56 = new MapMoveFrame().getJlForest56();
        locations[12][0].setMapLabel(jlforest56);

        JLabel jlforest57 = new MapMoveFrame().getJlForest57();
        locations[12][0].setMapLabel(jlforest57);

        JLabel jlforest58 = new MapMoveFrame().getJlForest58();
        locations[12][0].setMapLabel(jlforest58);

        JLabel jlforest59 = new MapMoveFrame().getJlForest59();
        locations[12][0].setMapLabel(jlforest59);

        JLabel jlforest60 = new MapMoveFrame().getJlForest60();
        locations[12][0].setMapLabel(jlforest60);

        JLabel jlforest53 = new MapMoveFrame().getJlForest53();
        locations[12][0].setMapLabel(jlforest53);

        // First Row
        // locations[0][0].setMapLabel(MapMoveFrame.getJlForest48());
    }

    static void setStartLocation(Player player, Npc[] npcList) {

        Npc aviatorBill = npcList[Constants.AVIATORBILL];
        MapControl.setStartLocation(aviatorBill, 18, 9);

        Npc uncleDarwin = npcList[Constants.UNCLEDARWIN];
        MapControl.setStartLocation(uncleDarwin, 18, 8);

        Npc rangerDan = npcList[Constants.RANGERDAN];
        MapControl.setStartLocation(rangerDan, 0, 12);

        MapControl.moveToLocation(player, 18, 8);
    }
    
    private static void setStartLocation(Npc npcList, int column, int row) {
        
        
        
    }

    private static void setStartLocation(Player player, int column, int row) {
        
        player.getLocation().setColumn(column);
        player.getLocation().setRow(row);
    }

    public static void moveToLocation(Player player, int column, int row) {
        // get the location of the player (X coordinate)
        player.getLocation().getColumn();
        // get the location of the player (Y coordinate)
        player.getLocation().getRow();
        // get the location to which you wish to move
        // passed in with the parameters, isn't it?

        // IF the location has been visited
        if (survivalist.Survivalist.getCurrentGame().getMap().getLocations()[column][row].isVisited()) {

            // move the player to that location
            player.getLocation().setColumn(column);
            player.getLocation().setRow(row);

            // let the player know he has traveled to the location
            System.out.println("You have traveled to the location.");

            // ELSE IF the location has not been visited
        } else if (!survivalist.Survivalist.getCurrentGame().getMap().getLocations()[column][row].isVisited()
                
                // AND the destination is 1 square away
                && player.getLocation().getColumn() - column <= 1 || column - player.getLocation().getColumn() <= 1
                || player.getLocation().getRow() - row <= 1 || row - player.getLocation().getRow() <= 1) {
            
            // move the playeer to the location
            player.getLocation().setColumn(column);
            player.getLocation().setRow(row);
            
            // let the player know he has traveled to the location
            System.out.println("You have traveled to the location.");
            
            // ELSE IF the location has not been visited
        } else if (!survivalist.Survivalist.getCurrentGame().getMap().getLocations()[column][row].isVisited()
                
                // AND the location is more than 1 square away
                && player.getLocation().getColumn() - column > 1 || column - player.getLocation().getColumn() > 1
                || player.getLocation().getRow() - row > 1 || row - player.getLocation().getRow() > 1) {
            
            // tell the player he must get closer to move to that area.
            System.out.println("You must explore closer to that area before you can travel there.");
        }
        
        // IF
                // the location is of the type cliff AND the player doesn't have a grappling hook in the inventory
                // return "You need a grappling hook to climb that area"
            // ELSE 
                // move the player to the location
                // return "You have moved to the new location"
    }
}
