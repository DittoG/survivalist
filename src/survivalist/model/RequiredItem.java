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
    private double requiredQuantity;

    public RequiredItem() {
    }

    public RequiredItem(Item inventoryItem, double requiredAmount) {
        this.inventoryItem = inventoryItem;
        this.requiredQuantity = requiredAmount;
    }

    public Item getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(Item inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public double getRequiredAmount() {
        return requiredQuantity;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredQuantity = requiredAmount;
    }
    
    
}
