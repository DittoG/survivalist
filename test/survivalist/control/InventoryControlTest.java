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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcBuildingArea method, of class InventoryControl.
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
        
        // create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
     
        // call function to run test
        double result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************************
         * Test case #1
         *****************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        length = 10;
        width = 8;
        
        expResult = 80; // expected output returned value
        
        // create instance of InventoryControl class
        instance = new InventoryControl();
     
        // call function to run test
        result = instance.calcBuildingArea(length, width);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
    }
    
}
