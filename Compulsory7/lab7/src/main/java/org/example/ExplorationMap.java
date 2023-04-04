package org.example;



import java.util.*;

public class ExplorationMap {
     final Cell[][] matrix;
     int rows;
     int cols;
     int n;

     public ExplorationMap(int n) {
         this.cols=n;
         this.rows=n;
        matrix = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = new Cell();
            }
        }
    }

    public boolean visit(int row, int col, Robot robot) {
        synchronized (matrix[row][col]) {
            if (!matrix[row][col].isVisited()) {
                List<Token> tokens = robot.getCellTokens();
                matrix[row][col].addTokens(tokens);
                matrix[row][col].setVisited(true);
                System.out.println(robot.getName() + " visited cell (" + row + "," + col + ") and added " + tokens.toString());
                return true;
            } else {
                return false;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }


}