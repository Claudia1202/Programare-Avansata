package org.example;

import java.util.*;

public class Exploration {
    SharedMemory mem;
    ExplorationMap map;
    List<Robot> robots;
    long timeLimit=30000;


    public Exploration(int n) {
        this.mem = new SharedMemory(n);
        this.map = new ExplorationMap(n);
        this.robots = new ArrayList<>();
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public SharedMemory getMem() {
        return mem;
    }

    public ExplorationMap getMap() {
        return map;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public void start() {
        Timekeeper timekeeper = new Timekeeper(this, timeLimit);
        timekeeper.setDaemon(true);
        timekeeper.start();
        for (Robot robot : robots) {
            new Thread(robot).start();
            System.out.println("Robot start");
        }
    }

    public void stop() {
        for (Robot robot : robots) {
            robot.stop();
            System.out.println(robot.getName() + " placed " + robot.getCountTokens() + " tokens");
        }
        System.exit(0);
    }

    public void startAllRobots() {
        for (Robot robot : robots) {
            robot.isPaused=false;
            System.out.println("Robot started");
        }
    }

    public void pauseAllRobots() {
        for (Robot robot : robots) {
             robot.isPaused=true;
            System.out.println("Robot paused");
        }
    }

    public void startRobot(String name) {
        for (Robot robot : robots) {
            if (robot.getName().equals(name)) {
               robot.isPaused=false;
                break;
            }
        }
    }

    public void pauseRobot(String name) {
        for (Robot robot : robots) {
            if (robot.getName().equals(name)) {
                robot.isPaused=true;
                break;
            }
        }
    }

    public void pauseRobot(String name, int duration) {
        for (Robot robot : robots) {
            if (robot.getName().equals(name)) {
                robot.isPaused=true;
                Thread pause = new Thread(() -> {
                    try {
                        Thread.sleep(duration);
                        robot.running = true;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                pause.start();
                break;
            }
        }
    }

    public void keyboardCommand() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] fullCommand = input.split(" ");
            if (fullCommand.length == 0) {
                continue;
            }
            String command = fullCommand[0];
            if (command.equals("first_start")) {
                //timekeeper.start();
                start();}

            else if (command.equals("start_all")) {
                    startAllRobots();
                } else if (command.equals("pause_all")) {
                    pauseAllRobots();
                } else if (command.equals("start")) {
                    if (fullCommand.length < 2) {
                        System.out.println("Missing robot name");
                        continue;
                    }
                    String name = fullCommand[1];
                    startRobot(name);
                } else if (command.equals("pause")) {
                    if (fullCommand.length < 2) {
                        System.out.println("Missing robot name");
                        continue;
                    }
                    String name = fullCommand[1];
                    if (fullCommand.length > 2) {
                        int duration = Integer.parseInt(fullCommand[2]);
                        pauseRobot(name, duration);
                    } else {
                        pauseRobot(name);
                    }
                }
            }
        }


    }


