

package survivalist.model;

import java.io.Serializable;

public class Map implements Serializable {
 
    //class instance variables
    private int numberOfRows;
    private int numberOfColumns;
    private Location[][] locations;

    public Map() {
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.numberOfRows;
        hash = 67 * hash + this.numberOfColumns;
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
        final Map other = (Map) obj;
        if (this.numberOfRows != other.numberOfRows) {
            return false;
        }
        if (this.numberOfColumns != other.numberOfColumns) {
            return false;
        }
        return true;
    }
    
}
