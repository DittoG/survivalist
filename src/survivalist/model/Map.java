package survivalist.model;

import java.io.Serializable;

public class Map implements Serializable {

    //class instance variables
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {

        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be greater than zero");
            return;
        }

        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;

        // create 2D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                //assign the Location object to the current position in an array
                locations[row][column] = location;

            }
        }

    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", locations=" + locations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.noOfRows;
        hash = 11 * hash + this.noOfColumns;
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
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        return true;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

}
