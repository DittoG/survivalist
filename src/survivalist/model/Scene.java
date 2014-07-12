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
public class Scene implements Serializable {

    // define symbol variable
    private String symbol;

    // class instance variables
    private String name;
    private String description;

    // item instance variables
    private int noOfBranches;
    private int noOfFlatRocks;
    private int noOfSharpRocks;
    private int noOfFlint;
    private int noOfStone;
    private int noOfLogs;
    private int NoOfBerries;

    // animal instance variables
    private int noOfDeer;
    private int noOfElk;
    private int noOfRabbits;
    private int noOfRaccoons;
    private int noOfWolves;
    private int noOfMoose;
    private int noOfBear;

    // building instance variables
    private int noOfCabins;
    private int noOfTowers;
    private int noOfLeanTos;

    public Scene() {
    }

    public Scene(String name) {
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

    public int getNoOfBranches() {
        return noOfBranches;
    }

    public void setNoOfBranches(int noOfBranches) {
        this.noOfBranches = noOfBranches;
    }

    public int getNoOfFlatRocks() {
        return noOfFlatRocks;
    }

    public void setNoOfFlatRocks(int noOfFlatRocks) {
        this.noOfFlatRocks = noOfFlatRocks;
    }

    public int getNoOfSharpRocks() {
        return noOfSharpRocks;
    }

    public void setNoOfSharpRocks(int noOfSharpRocks) {
        this.noOfSharpRocks = noOfSharpRocks;
    }

    public int getNoOfFlint() {
        return noOfFlint;
    }

    public void setNoOfFlint(int noOfFlint) {
        this.noOfFlint = noOfFlint;
    }

    public int getNoOfStone() {
        return noOfStone;
    }

    public void setNoOfStone(int noOfStone) {
        this.noOfStone = noOfStone;
    }

    public int getNoOfLogs() {
        return noOfLogs;
    }

    public void setNoOfLogs(int noOfLogs) {
        this.noOfLogs = noOfLogs;
    }

    public int getNoOfBerries() {
        return NoOfBerries;
    }

    public void setNoOfBerries(int NoOfBerries) {
        this.NoOfBerries = NoOfBerries;
    }

    public int getNoOfDeer() {
        return noOfDeer;
    }

    public void setNoOfDeer(int noOfDeer) {
        this.noOfDeer = noOfDeer;
    }

    public int getNoOfElk() {
        return noOfElk;
    }

    public void setNoOfElk(int noOfElk) {
        this.noOfElk = noOfElk;
    }

    public int getNoOfRabbits() {
        return noOfRabbits;
    }

    public void setNoOfRabbits(int noOfRabbits) {
        this.noOfRabbits = noOfRabbits;
    }

    public int getNoOfRaccoons() {
        return noOfRaccoons;
    }

    public void setNoOfRaccoons(int noOfRaccoons) {
        this.noOfRaccoons = noOfRaccoons;
    }

    public int getNoOfWolves() {
        return noOfWolves;
    }

    public void setNoOfWolves(int noOfWolves) {
        this.noOfWolves = noOfWolves;
    }

    public int getNoOfMoose() {
        return noOfMoose;
    }

    public void setNoOfMoose(int noOfMoose) {
        this.noOfMoose = noOfMoose;
    }

    public int getNoOfBear() {
        return noOfBear;
    }

    public void setNoOfBear(int noOfBear) {
        this.noOfBear = noOfBear;
    }

    public int getNoOfCabins() {
        return noOfCabins;
    }

    public void setNoOfCabins(int noOfCabins) {
        this.noOfCabins = noOfCabins;
    }

    public int getNoOfTowers() {
        return noOfTowers;
    }

    public void setNoOfTowers(int noOfTowers) {
        this.noOfTowers = noOfTowers;
    }

    public int getNoOfLeanTos() {
        return noOfLeanTos;
    }

    public void setNoOfLeanTos(int noOfLeanTos) {
        this.noOfLeanTos = noOfLeanTos;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + this.noOfBranches;
        hash = 11 * hash + this.noOfFlatRocks;
        hash = 11 * hash + this.noOfSharpRocks;
        hash = 11 * hash + this.noOfFlint;
        hash = 11 * hash + this.noOfStone;
        hash = 11 * hash + this.noOfLogs;
        hash = 11 * hash + this.NoOfBerries;
        hash = 11 * hash + this.noOfDeer;
        hash = 11 * hash + this.noOfElk;
        hash = 11 * hash + this.noOfRabbits;
        hash = 11 * hash + this.noOfRaccoons;
        hash = 11 * hash + this.noOfWolves;
        hash = 11 * hash + this.noOfMoose;
        hash = 11 * hash + this.noOfBear;
        hash = 11 * hash + this.noOfCabins;
        hash = 11 * hash + this.noOfTowers;
        hash = 11 * hash + this.noOfLeanTos;
        hash = 11 * hash + Objects.hashCode(this.symbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.noOfBranches != other.noOfBranches) {
            return false;
        }
        if (this.noOfFlatRocks != other.noOfFlatRocks) {
            return false;
        }
        if (this.noOfSharpRocks != other.noOfSharpRocks) {
            return false;
        }
        if (this.noOfFlint != other.noOfFlint) {
            return false;
        }
        if (this.noOfStone != other.noOfStone) {
            return false;
        }
        if (this.noOfLogs != other.noOfLogs) {
            return false;
        }
        if (this.NoOfBerries != other.NoOfBerries) {
            return false;
        }
        if (this.noOfDeer != other.noOfDeer) {
            return false;
        }
        if (this.noOfElk != other.noOfElk) {
            return false;
        }
        if (this.noOfRabbits != other.noOfRabbits) {
            return false;
        }
        if (this.noOfRaccoons != other.noOfRaccoons) {
            return false;
        }
        if (this.noOfWolves != other.noOfWolves) {
            return false;
        }
        if (this.noOfMoose != other.noOfMoose) {
            return false;
        }
        if (this.noOfBear != other.noOfBear) {
            return false;
        }
        if (this.noOfCabins != other.noOfCabins) {
            return false;
        }
        if (this.noOfTowers != other.noOfTowers) {
            return false;
        }
        if (this.noOfLeanTos != other.noOfLeanTos) {
            return false;
        }
        if (this.symbol != other.symbol) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", noOfBranches=" + noOfBranches + ", noOfFlatRocks=" + noOfFlatRocks + ", noOfSharpRocks=" + noOfSharpRocks + ", noOfFlint=" + noOfFlint + ", noOfStone=" + noOfStone + ", noOfLogs=" + noOfLogs + ", NoOfBerries=" + NoOfBerries + ", noOfDeer=" + noOfDeer + ", noOfElk=" + noOfElk + ", noOfRabbits=" + noOfRabbits + ", noOfRaccoons=" + noOfRaccoons + ", noOfWolves=" + noOfWolves + ", noOfMoose=" + noOfMoose + ", noOfBear=" + noOfBear + ", noOfCabins=" + noOfCabins + ", noOfTowers=" + noOfTowers + ", noOfLeanTos=" + noOfLeanTos + ", symbol=" + symbol + '}';
    }

}
