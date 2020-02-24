/**
 * A class representing a building.
 * @author Jack Kelly
 * @version 1
 **/
public class Building {

    private int numFloors;
    private boolean residential;
    private String name;
    private String address;

    /* **********************
     * Your code goes here *
     * *********************/
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        Building o = (Building) other;

        return (this.numFloors == o.numFloors && this.name == o.name 
            && this.address == o.address && this.residential == o.residential);
    }


    /* ********************************
     * Do not edit below this comment *
     * ********************************/

    /**
     * Constructor for the building class.
     * @param floors value to set numFloors to
     * @param res value to set residential to
     * @param name value to set Name to
     * @param addr value to set address to
     **/
    public Building(int floors, boolean res, String name, String addr) {
        this.numFloors = floors;
        this.residential = res;
        this.name = name;
        this.address = addr;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 17;
        result = prime * result + numFloors;
        result = prime * result + name.hashCode();
        result = prime * result + address.hashCode();
        result = prime * result + ((residential) ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("The %s building has %d floors and is located at %s", name, numFloors, address);
    }

    /**
     * Setter for numFloors.
     * @param numFloors - the number of floors to set it to
     **/
    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    /**
     * Setter for residential.
     * @param res - the boolean to set it to
     **/
    public void setResidential(boolean res) {
        residential = res;
    }

    /**
     * Setter for name.
     * @param name - the name to set it to
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for address.
     * @param addr - the address to set it to
     **/
    public void setAddress(String addr) {
        this.address = addr;
    }

    /**
     * getter for numFloors.
     * @return the value of the numFloors variable
     **/
    public int getNumFloors() {
        return numFloors;
    }

    /**
     * getter for residential.
     * @return the value of residential
     **/
    public boolean getResidential() {
        return residential;
    }

    /**
     * getter for name.
     * @return the value of name
     **/
    public String getName() {
        return name;
    }

    /**
     * getter for address.
     * @return the value of address
     **/
    public String getAddress() {
        return address;
    }
}
