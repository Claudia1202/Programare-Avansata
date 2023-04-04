package org.example;

import java.util.List;
import java.util.Random;

public class Robot implements Runnable {
     String name;
     boolean running;
     Exploration explore;
     Random rand;
     SharedMemory tokenList;
    List<Token> extractedTokens;

    public Robot(String name, Exploration explore) {
        this.name = name;
        this.explore = explore;
        this.running = true;
        this.rand = new Random();
        this.tokenList = explore.getMem();
    }

    public SharedMemory getTokenList() {
        return tokenList;
    }

    public void stop() {
        this.running = false;
    }


    public void run() {
        while (running) {
            int row = rand.nextInt(explore.getMap().getRows());
            int col = rand.nextInt(explore.getMap().getCols());

             int numTokensToExtract = rand.nextInt(3)+1;
             extractedTokens = tokenList.extractTokens(numTokensToExtract);

             explore.getMap(). visit(row, col, this);

            try {
                Thread.sleep(rand.nextInt(400) + 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Token> getCellTokens(){
        return this.extractedTokens;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
