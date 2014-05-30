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
        
        // input values for test case 2
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
        
        // input values for test case 3
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
        
        // input values for test case 4
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
        
        // input values for test case 5
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
        
        // input values for test case 6
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
        
        // input values for test case 7
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
    
     /**
     * Test of calcWoodNeeded method, of class BuildingControl.
     */
    @Test
    public void testCalcWoodNeeded() {
        System.out.println("calcWoodNeeded");
        
        /*****************************
         * Test case #1
         *****************************/
        System.out.println("\tTest Case #1");
        
        // input values for test case 1
        double inputLength = 10;
        double inputWidth = 8;
        
        double expResult = 320;// expected output returned value
        
        // create instance of BuildingControl class
        BuildingControl instance = new BuildingControl();
        
        // call function to run test
        double result = instance.calcWoodNeeded(inputLength, inputWidth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #2
         *****************************/
        System.out.println("\tTest Case #2");
        
        // input values for test case 2
        inputLength = 10;
        inputWidth = 0;
        
        expResult = 0;// expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
        
        // call function to run test
        result = instance.calcWoodNeeded(inputLength, inputWidth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #3
         *****************************/
        System.out.println("\tTest Case #3");
        
        // input values for test case 3
        inputLength = 0;
        inputWidth = 10;
        
        expResult = 0;// expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
        
        // call function to run test
        result = instance.calcWoodNeeded(inputLength, inputWidth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #4
         *****************************/
        System.out.println("\tTest Case #4");
        
        // input values for test case 4
        inputLength = 20;
        inputWidth = 51;
        
        expResult = 0;// expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
        
        // call function to run test
        result = instance.calcWoodNeeded(inputLength, inputWidth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #5
         *****************************/
        System.out.println("\tTest Case #5");
        
        // input values for test case 5
        inputLength = 51;
        inputWidth = 15;
        
        expResult = 0;// expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
        
        // call function to run test
        result = instance.calcWoodNeeded(inputLength, inputWidth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #6
         *****************************/
        System.out.println("\tTest Case #6");
        
        // input values for test case 6
        inputLength = 1;
        inputWidth = 1;
        
        expResult = 4;// expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
        
        // call function to run test
        result = instance.calcWoodNeeded(inputLength, inputWidth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #7
         *****************************/
        System.out.println("\tTest Case #7");
        
        // input values for test case 7
        inputLength = 50;
        inputWidth = 50;
        
        expResult = 10000;// expected output returned value
        
        // create instance of BuildingControl class
        instance = new BuildingControl();
        
        // call function to run test
        result = instance.calcWoodNeeded(inputLength, inputWidth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
    }
    
}
