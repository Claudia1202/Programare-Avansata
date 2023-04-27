package org.example;


public class App extends Thread
{
    public static void main(String args[]) {

        var explore = new Exploration(5);
        explore.addRobot(new Robot("Robot1", explore));
        explore.addRobot(new Robot("Robot2", explore));
        explore.addRobot(new Robot("Robot3", explore));

        long timeLimit = 40000;


       // explore.start();

        explore.keyboardCommand();

       try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
