/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.model;

/**
 *
 * @author Madison
 */
public class RequiredItem {
    
    private Item inventoryItem;
    private int requiredAmount;

    public RequiredItem() {
    }

    public RequiredItem(Item inventoryItem, int requiredAmount) {
        this.inventoryItem = inventoryItem;
        this.requiredAmount = requiredAmount;
    }

    public Item getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(Item inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    
    
}
