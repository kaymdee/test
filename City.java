/**
 * Class representing a City.
 * @author Jack Kelly
 * @version 1
 **/

public class City {

    public static void main(String[] args) {
  
    }
    private String name;
    private Building[] buildings;
    private Company[] companies;

    /* **********************
     * Your code goes here *
     * *********************/


    /* ********************************
     * Do not edit below this comment *
     * ********************************/

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (other instanceof City) {
            City temp = (City) other;
            return temp.name.equals(this.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "The city of " + name + " has " + buildings.length
            + " buildings and " + companies.length + " companies.";
    }


    /**
     * A constructor for the City class.
     * @param name value to set Name to
     * @param buildings array to set buildings to
     * @param companies array to set companies to
     **/
    public City(String name, Building[] buildings, Company[] companies) {
        this.name = name;
        this.buildings = buildings;
        this.companies = companies;
    }

    /**
     * getter for companies.
     * @return the value of companies
     **/
    public Company[] getCompanies() {
        return companies;
    }

    /**
     * setter for companies.
     * @param value the value to set it to
     **/
    public void setCompanies(Company[] value) {
        companies = value;
    }


    /**
     * getter for buildings.
     * @return the value of buildings
     **/
    public Building[] getBuildings() {
        return buildings;
    }

    /**
     * setter for buildings.
     * @param value the value to set it to
     **/
    public void setBuildings(Building[] value) {
        buildings = value;
    }

    /**
     * getter for name.
     * @return the value of name
     **/
    public String getName() {
        return name;
    }

    /**
     * setter for name.
     * @param value the value to set it to
     **/
    public void setName(String value) {
        name = value;
    }

}
