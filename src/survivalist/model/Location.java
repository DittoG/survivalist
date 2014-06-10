/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.model;

import java.io.Serializable;


public class Location implements Serializable {
    
    //class instance variables
    private double row;
    private double column;
    private boolean visited;
    private Scene scene;
    private Npc[] npc;
    private Animal[] animal;
    private Building[] building;

    public Location() {
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Npc[] getNpc() {
        return npc;
    }

    public void setNpc(Npc[] npc) {
        this.npc = npc;
    }

    public Animal[] getAnimal() {
        return animal;
    }

    public void setAnimal(Animal[] animal) {
        this.animal = animal;
    }

    public Building[] getBuilding() {
        return building;
    }

    public void setBuilding(Building[] building) {
        this.building = building;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 29 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + ", npc=" + npc + ", animal=" + animal + ", building=" + building + '}';
    }
    
}