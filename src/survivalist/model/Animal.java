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
public class Animal implements Serializable {

    private String name;
    private String description;
    private String type;
    private double meat;
    private double hitpoints;

    public Animal() {
    }

    public Animal(String name) {
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

    public double getMeat() {
        return meat;
    }

    public void setMeat(double meat) {
        this.meat = meat;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", description=" + description + ", type=" + type + ", meat=" + meat + ", hitpoints=" + hitpoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.meat) ^ (Double.doubleToLongBits(this.meat) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.hitpoints) ^ (Double.doubleToLongBits(this.hitpoints) >>> 32));
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.meat) != Double.doubleToLongBits(other.meat)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitpoints) != Double.doubleToLongBits(other.hitpoints)) {
            return false;
        }
        return true;
    }

}
