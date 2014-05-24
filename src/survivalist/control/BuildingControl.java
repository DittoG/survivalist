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
public class BuildingControl {
    
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
        
        if (inputLength < 1 || inputLength > 51) { //  length value not within the accepted range?
            return 0;
        }
        
        if (inputWidth < 1 || inputWidth > 51) { // width value not within the accepted range?
            return 0;
        }
        
        double woodNeeded = inputWidth * inputLength * 3;
        
        return woodNeeded;
        
    }

}
