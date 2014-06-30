/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.control;

import survivalist.model.Building;
import survivalist.model.Location;

/**
 *
 * @author Madison
 */
public class BuildingControl {

    public static void addBuildingToLocation(Building building, Location currentLocation) {
        
       building.setLocation(currentLocation);
        
    }

    public double calcBuildingArea(double length, double width) {

        if (length < 7 || length > 20) { //  length value not within the accepted range?
            return 0;
        }

        if (width < 5 || width > 15) { // width value not within the accepted range?
            return 0;
        }

        double area = width * length;

        return area;
    }

    public double calcWoodNeeded(double inputLength, double inputWidth) {

        if (inputLength < 1 || inputLength > 50) { //  length value not within the accepted range?
            return 0;
        }

        if (inputWidth < 1 || inputWidth > 50) { // width value not within the accepted range?
            return 0;
        }

        double woodNeeded = inputWidth * inputLength * 4;

        return woodNeeded;

    }

}
