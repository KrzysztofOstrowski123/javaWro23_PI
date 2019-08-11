package Stopper;

public class Stopwatch {
    private boolean isRunning;
    private long startTime;

    public void Start() {
        if(isRunning)
            return;
        isRunning = true;
        startTime = System.nanoTime();

    }


    public long Stop() {
        if(!isRunning)
            return -1;
        long currentTime = System.nanoTime();
        isRunning = false;
        return currentTime - startTime;

    }



}
