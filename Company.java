/**
 * A class representing a company.
 * @author Jack Kelly
 * @version 1
 **/
public class Company {

    private int numEmployees;
    private String name;
    private Building headQuarters;

    /* *********************
     * Your code goes here *
     * *********************/


    /* ********************************
     * Do not edit below this comment *
     * ********************************/

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 17;
        result = prime * result + numEmployees;
        result = prime * result + name.hashCode();
        result = prime * result + headQuarters.hashCode();
        return result;
    }

    /**
     * A constructor for the Company class.
     * @param numEmployees value to set numEmployees to
     * @param name String to set name equal to
     * @param hq Building to set hq equal to
     **/
    public Company(int numEmployees, String name, Building hq) {
        this.numEmployees = numEmployees;
        this.name = name;
        this.headQuarters = hq;
    }

    /**
     * getter for headQuarters.
     * @return the value of headQuarters
     **/
    public Building getHeadQuarters() {
        return headQuarters;
    }

    /**
     * setter for headQuarters.
     * @param value the value to set it to
     **/
    public void setHeadQuarters(Building value) {
        headQuarters = value;
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

    /**
     * getter for numEmployees.
     * @return the value of numEmployees
     **/
    public int getNumEmployees() {
        return numEmployees;
    }

    /**
     * setter for numEmployees.
     * @param value the value to set it to
     **/
    public void setNumEmployees(int value) {
        numEmployees = value;
    }


}
