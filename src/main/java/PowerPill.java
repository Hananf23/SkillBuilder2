/**
 * This class defines how power pills behave in
 * a game. The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill {
    // static field
    public static final int DEFAULT_POWER = 10;

    // instance variables
    private int power;
    private String name;

    // constructors

    /**
     * Initializes this power pill to a default power value
     * and sets the name of the pill to name.
     * @param name the name of this power pill.
     */
    public PowerPill(String name) {
        this.name = name;
        this.power = DEFAULT_POWER;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // accessor methods

    /**
     * Gets the power level of this power pill.
     * @return the power level of this power pill.
     */
    public int getPower() {
        return power;
    }

    /**
     * Gets the name of this power pill.
     * @return the name of this power pill.
     */
    public String getName() {
        return name;
    }

    // mutator methods

    /**
     * Sets the power level of this power pill.
     * @param power the new power level for this power pill.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Sets the name of this power pill.
     * @param name the new name for this power pill.
     */
    public void setName(String name) {
        this.name = name;
    }

    // toString method

    /**
     * Returns a string representation of this power pill
     * formatted as "PowerPill <name> = <power>".
     * @return a string representation of this power pill.
     */
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }
}
