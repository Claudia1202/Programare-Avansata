package org.example;

import java.awt.*;

public class Line {

   int ver1;
   int ver2;
   Color color;

    public Line(int ver1, int ver2) {
        this.ver1=ver1;
        this.ver2=ver2;
    }

    public int getVer1() {
        return this.ver1;
    }

    public int getVer2() {
        return ver2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getStart() {
        return ver1;
    }
    public int getEnd() {
        return ver2;
    }
}
