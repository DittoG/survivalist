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
        
        Item tempItem;
        for(int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = i + 1; j < inventoryList.length; j++) {
                if(inventoryList[i].getDescription().compareToIgnoreCase(inventoryList[j].getDescription()) > 0) {
                    tempItem = inventoryList[i];
                    inventoryList[i] = inventoryList[j];
                    inventoryList[j] = tempItem;
                }
            }
        }
        
        //sort list
        //return list
        return inventoryList;
    }

    public static boolean checkAvailableResources(RequiredItem[] requiredResources) {
        // for each resource
        for (int i = 0; i < requiredResources.length; i++) {
            RequiredItem requiredItem = requiredResources[i];
            // get the required amount
            double requiredAmount = requiredItem.getRequiredAmount();
            // get the available amount
            double availableAmount = requiredItem.getInventoryItem().getActualQuantity();
            // IF the available amount < required amount
            if (availableAmount < requiredAmount) {
                // return False
                return false;
            }
        }
        // return True
        return true;

    }

}
