package ca.bcit.comp1510.lab04;

/**
 * Name is a class for first, middle, and last name.
 * @author Sohee Hwang
 * @version 2023
 */
public class Student {
    //6.variables
    /** firstName
     * variable.*/
    private String firstName;

    /** lastName variable.*/
    private String lastName;
    
    /** yearofBirth 
     * variable.*/
    private int birthYear;
    
    /** studentNumber
     *  variable.*/
    private String studentNumber;
    
    /** GPA 
     * variable.*/
    private int gradeAverage;
    
    //7.constructor

    /**
     * Constructs an Student object.
     * 
     * @param first
     *            first name
     * @param last
     *            last name
     * @param year
     *            year of birth
     * @param number
     *            student number 
     * @param score
     *            GPA score
     */
    public Student(String first, String last, int year,
            String number, int score) {
        firstName = first;
        lastName = last;
        birthYear = year;
        studentNumber = number;
        gradeAverage = score;
    }
    
    //8.
    //accessors
    /**
     * Return first name.
     * 
     * @return the first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Return last name.
     * 
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    } 
    
    /**
     * Return year of birth.
     * 
     * @return the year of birth.
     */
    public int getBirthYear() {
        return birthYear;
    }  
    
    /**
     * Return student number.
     * 
     * @return the student number.
     */
    public String getStudentNumber() {
        return studentNumber;
    }  
    
    /**
     * Return GPA.
     * 
     * @return the GPA.
     */
    public int getGradeAverage() {
        return gradeAverage;
    }  
        
    //mutators
    /**
     * Set first name.
     * 
     * @param name
     *            a string to name
     */
    public void setFirstName(String name) {
        firstName = name;
    }
    
    /**
     * Set last name.
     * 
     * @param name
     *            a string to name
     */
    public void setLastName(String name) {
        lastName = name;
    } 
    
    /**
     * Set year of birth.
     * 
     * @param year
     *            a int to year
     */
    public void setBirthYear(int year) {
        birthYear = year;
    } 
    
    /**
     * Set student number.
     * 
     * @param number
     *            a string to number
     */
    public void setStudentNumber(String number) {
        studentNumber = number;
    } 
    
    /**
     * Set GPA.
     * 
     * @param score
     *            a double to score
     */
    public void setGradeAverage(int score) {
        gradeAverage = score;
    } 
    
    //9. toString method
    /**
     * Return the whole student information.
     * 
     * @return the student information.
     */
    public String toString() {
        return firstName + " " + lastName + " "
                + birthYear + " " + studentNumber + " "
                + gradeAverage;
    }

    
    
    
}
