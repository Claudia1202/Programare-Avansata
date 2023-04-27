package org.example;

public class Timekeeper extends Thread {
     Exploration exploration;
     long timeLimit;

    public Timekeeper(Exploration exploration, long timeLimit) {
        this.exploration = exploration;
        this.timeLimit = timeLimit;
        setDaemon(true);
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < timeLimit) {

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Elapsed time: " + (System.currentTimeMillis() - startTime) / 1000 + " seconds");
        }
        System.out.println("Time limit exceeded, stopping exploration");
        exploration.stop();
    }


}
