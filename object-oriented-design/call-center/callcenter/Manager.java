/**.
 * File: Manager.java
 * ------------------
 * Manager is an employee class, with rank value equal to 1.
 **/
package callcenter;

class Manager extends Employee {

    public Manager(CallHandler callHandler) {
        super(callHandler);
        rank = Rank.Manager;
    }
}
