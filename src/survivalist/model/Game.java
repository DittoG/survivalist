/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist.model;

import java.io.Serializable;

/**
 *
 * @author Madison
 */
public class Game implements Serializable {
    
    private double totalTime;
    private Item[] inventory;
    private Player player;
    private Map map;
    private Animal[] animal;
    private Npc[] npc;
    private Building[] building;

    public Game() {
        this.totalTime = 0;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Animal[] getAnimal() {
        return animal;
    }

    public void setAnimal(Animal[] animal) {
        this.animal = animal;
    }

    public Npc[] getNpc() {
        return npc;
    }

    public void setNpc(Npc[] npc) {
        this.npc = npc;
    }

    public Building[] getBuilding() {
        return building;
    }

    public void setBuilding(Building[] building) {
        this.building = building;
    }
    
    
    
}
