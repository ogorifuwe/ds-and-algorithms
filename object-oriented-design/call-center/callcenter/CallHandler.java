/**.
 * File: CallHandler.java
 * ----------------------
 * Represents the body of the program, and all calls
 * are funneled first through it.
 **/
package callcenter;

import java.util.List;
import java.util.ArrayList;

public class CallHandler {
    /* we have 3 levels of employees: respondents,
     * managers, and directors */
    private final int LEVELS = 3;

    /* initialize with 10 respondents, 4 managers,
     * and 2 directors */
    private final int NUM_RESPONDENTS = 10;
    private final int NUM_MANAGERS = 4;
    private final int NUM_DIRECTORS = 2;

    /* List of employees, by level.
     * employeeLevels[0] = respondents
     * employeeLevels[1] = managers
     * employeeLevels[2] = directors
     */
    List<List<Employee>> employeeLevels;

    /* queues for each  call's rank */
    List<List<Call>> callQueues;

    public CallHandler() {
        employeeLevels = new ArrayList<List<Employee>>(LEVELS);
        callQueues = new ArrayList<List<Call>>(LEVELS);

        /* create respondents */
        ArrayList<Employee> respondents =
            new ArrayList<Employee>(NUM_RESPONDENTS);
        for (int i = 0; i < NUM_RESPONDENTS-1; ++i) {
            respondents.add(new Respondent(this));
        }
        employeeLevels.add(respondents);

        /* create managers */
        ArrayList<Employee> managers =
            new ArrayList<Employee>(NUM_MANAGERS);
        managers.add(new Manager(this));
        employeeLevels.add(managers);

        /* create directors */
        ArrayList<Employee> directors =
            new ArrayList<Employee>(NUM_DIRECTORS);
        directors.add(new Director(this));
        employeeLevels.add(directors);
    }

    /**. Gets the first available employee who can handle
     * this call **/
    public Employee getHandlerForCall(Call call) {
        for (int level = call.getRank().getValue();
                level < LEVELS - 1; ++level) {
            List<Employee> employeeLevel =
                                employeeLevels.get(level);
            for (Employee emp : employeeLevel) {
                if (emp.isFree()) {
                    return emp;
                }
            }
        }
        return null;
    }

    /**. Routes the call to an available employee, or
     * saves in a queue if no employee available **/
    public void dispatchCall(Caller caller) {
        Call call = new Call(caller);
        dispatchCall(call);
    }

    /**. Routes the call to an available employee, or
     * saves in a queue if no emplopyee vailable **/
    public void dispatchCall(Call call) {
        /* try to route the call to an employee with
         * minimal rank */
        Employee emp = getHandlerForCall(call);
        if (emp != null) {
            emp.receiveCall(call);
            call.setHandler(emp);
        } else {
            /* place the call into corresponding call queue
             * according to its rank */
            call.reply("Please wait for free employee to reply");
            callQueues.get(call.getRank().getValue()).add(call);
        }
    }

    /**. An employee got free. Look for a waiting call that
     * he/she can serve. Return ture if we were able to assign
     * call, flase otherwise. **/
    public boolean assignCall(Employee emp) {
        /* check the queues, starting from the highest rank
         * this employee can serve. */
        for (int rank = emp.getRank().getValue();
                rank >= 0; --rank) {
            List<Call> que = callQueues.get(rank);

            /* remove the first call, if any */
            if (que.size() > 0) {
                Call call = que.remove(0);
                if (call != null) {
                    emp.receiveCall(call);
                    return true;
                }
            }
        }
        return false;
    }
}
