package org.example;


public class App extends Thread
{
    public static void main(String args[]) {

        var explore = new Exploration(5);
        explore.addRobot(new Robot("Robot 1", explore));
        explore.addRobot(new Robot("Robot 2", explore));
        explore.addRobot(new Robot("Robot 3", explore));
        explore.start();
        try {
            Thread.sleep(20000); // Stop the threads after 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        explore.stop();}
}
