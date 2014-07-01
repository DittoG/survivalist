/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.control;

import survivalist.Survivalist;
import survivalist.model.Item;
import survivalist.model.RequiredItem;

/**
 *
 * @author Madison
 */
public class InventoryControl {

    public static Item[] getSortedList() {
        Item[] inventoryList = Survivalist.getCurrentGame().getInventory().clone();
        
        //sort list
        //return list
        return inventoryList;
    }

    public static boolean checkAvailableResources(RequiredItem[] requiredResources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
