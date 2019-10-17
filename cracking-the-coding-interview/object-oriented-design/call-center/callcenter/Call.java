/**.
 * File: Call.java
 * ---------------
 * Represents a call from a user. Calls have a minimum rank
 * and are assigned to the first employee who can handle that
 * call.
 **/
package callcenter;

public class Call {

    private Rank rank;// min rank of employee who can handle call
    private Caller caller;      // person who is calling
    private Employee handler;   // employee who is handling call

    public Call(Caller c) {
        rank = Rank.Respondent;
        caller = c;
    }

    /**. set employee who is handling call **/
    public void setHandler(Employee e) { handler = e; }

    /**. play recorded message to the customer **/
    public void reply(String message) {
        System.out.print(message + "\n");
    }

    public Rank getRank() { return rank; }

    public void setRank(Rank r) { rank = r; }

    public Rank incrementRank() {
        if (rank == Rank.Respondent) {
            rank = Rank.Manager;
        } else if (rank == Rank.Manager) {
            rank = Rank.Director;
        }
        return rank;
    }

    /**. Disconnect call **/
    public void disconnect() {
        reply("Thanks for calling");
    }
}
