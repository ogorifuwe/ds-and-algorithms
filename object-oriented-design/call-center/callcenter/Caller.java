/**.
 * File: Caller.java
 * -----------------
 * A caller makes a call to the call center.
 **/
package callcenter;

public class Caller {
    
    private int userId; // caller's identification 
    private String name; // caller's name

    public Caller(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

}
