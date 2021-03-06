public class CodeTimer {

    private long executionTime;

    public CodeTimer() {
        this.executionTime = 0;
    }

    public void startTimer() {
        this.executionTime = System.nanoTime();
    }

    public void stopTimer() {
        this.executionTime = System.nanoTime() - executionTime;
    }

    public void resetTimer() {
        this.executionTime = 0;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public String toString() {
        return (String) executionTime;
    }
}
