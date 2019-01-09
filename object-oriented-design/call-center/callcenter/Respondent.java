/**.
 * File: Respondent.java
 * ---------------------
 * Respondent is an employee class, with rank value equal to 2.
 **/
package callcenter;

class Respondent extends Employee {
    
    public Respondent(CallHandler callHandler) {
        super(callHandler);
        rank = Rank.Respondent;
    }
}
