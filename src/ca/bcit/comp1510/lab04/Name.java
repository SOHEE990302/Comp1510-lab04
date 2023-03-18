package ca.bcit.comp1510.lab04;

/**
 * name of first name, middle name and last name.
 * @author Sohee Hwang
 * @version 2023
 *
 */
public class Name {
    /**
     * name of first name, middle name and last name.
     *
     */
    private String firstName;
    
    /**
     * name of first name, middle name and last name.
     *
     */
    private String middleName;
    
    /**
     * name of first name, middle name and last name.
     */
    private String lastName;
    
    /**
     * Constructs an name object by defining its first, middle, and last name.
     * 
     * @param first
     *            first name
     * @param middle
     *            middle name
     * @param last
     *            last name
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    

    /**
     * Return first name.
     * 
     * @return the first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Return middle name.
     * 
     * @return the middle name.
     */
    public String getMiddleName() {
        return middleName;
    } 
    
    /**
     * Return last name.
     * 
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }  
    
    //mutators
    /**
     * Set first name.
     * 
     * @param name
     *            a string to name
     */
    public void setFirstName(String name) {
        firstName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length());
    }
    
    /**
     * Set middle name.
     * 
     * @param name
     *            a string to name
     */
    public void setMiddleName(String name) {
        firstName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length());
    }
    
    /**
     * Set last name.
     * 
     * @param name
     *            a string to name
     */
    public void setLastName(String name) {
        lastName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length());
    }

    /**
     * Return the full name.
     * 
     * @return the full name.
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

}
