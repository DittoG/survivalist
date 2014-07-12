/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalist.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Madison
 */
public class Item implements Serializable {

    //class instance variables
    private String name;
    private String description;
    private String type;
    private double possibleQuantity;
    private double actualQuantity;
    private RequiredItem[] requiredResources;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPossibleQuantity() {
        return possibleQuantity;
    }

    public void setPossibleQuantity(double possibleQuantity) {
        this.possibleQuantity = possibleQuantity;
    }

    public double getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(double actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public RequiredItem[] getRequiredResources() {
        return requiredResources;
    }

    public void setRequiredResources(RequiredItem[] requiredResources) {
        this.requiredResources = requiredResources;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + ", type=" + type + ", possibleQuantity=" + possibleQuantity + ", actualQuantity=" + actualQuantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.possibleQuantity) ^ (Double.doubleToLongBits(this.possibleQuantity) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.actualQuantity) ^ (Double.doubleToLongBits(this.actualQuantity) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.possibleQuantity) != Double.doubleToLongBits(other.possibleQuantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actualQuantity) != Double.doubleToLongBits(other.actualQuantity)) {
            return false;
        }
        return true;
    }

}
