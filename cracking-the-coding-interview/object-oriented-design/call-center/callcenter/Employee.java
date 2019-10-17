/**.
 * File: Employee.java
 * -------------------
 * Employee is a super class for Director, Manager, and Respondent
 * classes. It is implemented as an abstract class, since there
 * should be no reason to instantiate an Employee type directly.
 **/
package callcenter;

abstract class Employee {

    private Call currentCall = null;
    protected Rank rank;
    private CallHandler callHandler;

    /**. class constructor **/
    public Employee(CallHandler handler) {
        callHandler = handler;
    }

    /**. start the conversation **/
    public void receiveCall(Call call) {
        currentCall = call;
    }

    /**. the issue is resolved, finish the call **/
    public void callCompleted() {
        if (currentCall != null) {
            /* disconnect the call */
            currentCall.disconnect();

            /* free the employee */
            currentCall = null;
        }

        /* check if there's a call waiting in the queue */
        assignNewCall();
    }

    /**.
     * The issue has not been resolved. Escalate the call, and
     * assign a new call to the employee.
     **/
    public void escalateAndReassign() {
        if (currentCall != null) {
            /* escalate call */
            currentCall.incrementRank();
            callHandler.dispatchCall(currentCall);

            /* free the employee */
            currentCall = null;
        }

        /* assign a new call */
        assignNewCall();
    }

    /**. 
     * @post Assign a new call to an employee, if the 
     * employee is free 
     **/
    public boolean assignNewCall() {
        if (!isFree()) {
            return false;
        }
        return callHandler.assignCall(this);
    }

    /**. @return Returns whether or not the employee is free **/
    public boolean isFree() {
        return currentCall == null;
    }

    /**. @return Return the rank of an employee **/
    public Rank getRank() { return rank; }

}
