package ca.bcit.comp1510.lab04;

/**
 * Represents one die (singular of dice) with faces showing values between 1 and
 * 6.
 * 
 * @author Lewis & Loftus 9e
 * @author Sohee Hwang
 * @version 2023
 * 
 *     Answer.
 *     1. Do you need getters and setters for max? Should you have them?
 *     No, you do not need getters and setters for max because max is final,
 *     so its value cannot be changed.
 *     2. Can you have getters and setters for max?
 *     No, you cannot have getters and setters for max because max is final.
 *     3. Why do you think it makes sense (or not) to have max be final?
 *     It makes sense to have max be final because the number of sides
 *     for a die should not change after it is created.
 *     4. What does max’s being final say about 
 *     the abstraction of a MultiDie object?
 *     Max's being final says that the abstraction of a MuliDie object
 *     is that it represents a physical die that has a fixed number of sides.
 *     5. Is max an instance variable?
 *     Yes, max is an instance variable.
 * 
 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value to 1.
     * @param numSides int
     */
    public MultiDie(int numSides) {
        max = numSides;
        faceValue = 1;
        roll();
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}
