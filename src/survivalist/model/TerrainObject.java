package survivalist.model;

import java.io.Serializable;
import java.util.Objects;

public class TerrainObject implements Serializable {

    //class instance variables
    private double explored;
    private String type;
    private String description;
    private String symbol;
    private double travelTime;

    public TerrainObject() {
    }

    public double getExplored() {
        return explored;
    }

    public void setExplored(double explored) {
        this.explored = explored;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public String toString() {
        return "TerrainObject{" + "explored=" + explored + ", type=" + type + ", description=" + description + ", symbol=" + symbol + ", travelTime=" + travelTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.explored) ^ (Double.doubleToLongBits(this.explored) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.symbol);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
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
        final TerrainObject other = (TerrainObject) obj;
        if (Double.doubleToLongBits(this.explored) != Double.doubleToLongBits(other.explored)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        return true;
    }

}
