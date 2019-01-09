/**.
 * File: Rank.java
 * ---------------
 * An employee has one of 3 ranks. Respondent, Manager, or
 * Director. With the latter been the highest weighted.
 **/
package callcenter;

public enum Rank {

    Respondent (0),
    Manager (1),
    Director (2);

    private int value;

    /**.
     * enum's constructor
     * @param v is the value of an employee's rank
     **/
    private Rank(int v) {
        value = v;
    }

    /**. @return the value of an employee's rank **/
    public int getValue() { return value; }
}
