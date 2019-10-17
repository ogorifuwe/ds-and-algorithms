/**.
 * File: Director.java
 * -------------------
 * Director is an employee class, with rank value equal to 2.
 **/
package callcenter;

class Director extends Employee {
    
    public Director(CallHandler callHandler) {
        super(callHandler);
        rank = Rank.Director;
    }
} 
