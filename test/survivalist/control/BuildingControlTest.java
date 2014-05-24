/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Madison
 */
public class BuildingControlTest {
    
    public BuildingControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcBuildingArea method, of class BuildingControl.
     */
    @Test
    public void testCalcBuildingArea() {
        System.out.println("calcBuildingArea");
        
        /*****************************
         * Test case #1
         *****************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double length = 10;
        double width = 8;
        
        double expResult = 80; // expected output returned value
        
        // create instance of BuildingControl class
        BuildingControl instance = new BuildingControl();
     
        // call function to run test
        double result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #2
         *****************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 1
        length = 10;
        width = 4;
        
        expResult = 0; // expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
     
        // call function to run test
        result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #3
         *****************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 1
        length = 6;
        width = 10;
        
        expResult = 0; // expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
     
        // call function to run test
        result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #4
         *****************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 1
        length = 20;
        width = 16;
        
        expResult = 0; // expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
     
        // call function to run test
        result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #5
         *****************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 1
        length = 21;
        width = 15;
        
        expResult = 0; // expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
     
        // call function to run test
        result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #6
         *****************************/
        System.out.println("\tTest case #6");
        
        // input values for test case 1
        length = 7;
        width = 5;
        
        expResult = 35; // expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
     
        // call function to run test
        result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #7
         *****************************/
        System.out.println("\tTest case #7");
        
        // input values for test case 1
        length = 20;
        width = 15;
        
        expResult = 300; // expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
     
        // call function to run test
        result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
    }
    
}
