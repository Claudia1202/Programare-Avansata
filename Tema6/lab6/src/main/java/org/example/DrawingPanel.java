package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int W = 800, H = 600;
    private int numVertices;
    private double edgeProbability;
    private int[] x, y;
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the tools needed to draw in the image
    List<Line> selectedLines = new ArrayList<>();

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        initPanel();
        createBoard();
    }
    boolean player1=true;

    private void initPanel() {
        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point click = e.getPoint();
                for (int i = 0; i < numVertices; i++) {
                    for (int j = i + 1; j < numVertices; j++) {
                        if (Math.random() <= edgeProbability) {
                            Line2D line = new Line2D.Double(x[i], y[i], x[j], y[j]);
                            double distance = line.ptSegDist(click);

                            Line currentLine = new Line(i, j);

                                if (distance < 5) { // the threshold is 5 pixels
                                    if(!selectedLines.contains(currentLine)) {
                                        // Check if the line is already colored
                                        boolean alreadyColored = false;
                                        for (Line l : selectedLines) {
                                            if ((l.getStart() == currentLine.getStart() && l.getEnd() == currentLine.getEnd())
                                                    || (l.getStart() == currentLine.getEnd() && l.getEnd() == currentLine.getStart())) {
                                                alreadyColored = true;
                                                break;
                                            }
                                        }
                                        if (!alreadyColored) {


                                            if (player1 == true) {
                                                graphics.setColor(Color.RED);
                                                currentLine.setColor(Color.RED);

                                                player1 = false;
                                            } else {
                                                graphics.setColor(Color.BLUE);
                                                currentLine.setColor(Color.BLUE);

                                                player1 = true;
                                            }


                                            graphics.drawLine(x[i], y[i], x[j], y[j]);
                                            selectedLines.add(currentLine);
                                            repaint();
                                            return;
                                        }
                                }
                            }


                        }
                    }
                }
            }
        });
    }

    /*private boolean checkForTriangle(Line l) {
        int vertex1 = l.getStart();
        int vertex2 = l.getEnd();
        Color color = graphics.getColor();
        for (Line line : selectedLines) {
            if (line.getColor() == color) {
                int lineV1 = line.getStart();
                int lineV2 = line.getEnd();
                if (lineV1 == vertex1 || lineV1 == vertex2 ||
                        lineV2 == vertex1 || lineV2 == vertex2) {
                    continue;
                }
                Line2D l1 = new Line2D.Double(x[vertex1], y[vertex1], x[vertex2], y[vertex2]);
                Line2D l2 = new Line2D.Double(x[lineV1], y[lineV1], x[lineV2], y[lineV2]);
                if (l1.intersectsLine(l2)) {
                    for (Line linee : selectedLines) {
                        if (linee.getColor() == color) {
                            int lineeV1 = linee.getStart();
                            int lineeV2 = linee.getEnd();
                            Line2D l3 = new Line2D.Double(x[lineeV1], y[lineeV1], x[lineeV2], y[lineeV2]);
                            if (l3.intersectsLine(l1) && l3.intersectsLine(l2))
                                return true;

                        }
                    }
                }
            }
        }
        return false;
    }
*/


    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);
    }
    final void createBoard() {
        numVertices = (Integer) frame.configPanel.dotsSpinner.getValue();
        edgeProbability = (Double) frame.configPanel.linesCombo.getSelectedItem();
        createOffscreenImage();
        createVertices();
        drawLines();
        drawVertices();
        selectedLines.clear(); // reset the selected lines
        player1 = true; // reset the first player
        repaint();
    }

    /**
     * Creeaza punctele
     */
    private void createVertices() {
        int x0 = W / 2; int y0 = H / 2; //middle of the board
        int radius = H / 2 - 10; //board radius
        double alpha = 2 * Math.PI / numVertices; // the angle
        x = new int[numVertices];
        y = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            x[i] = x0 + (int) (radius * Math.cos(alpha * i));
            y[i] = y0 + (int) (radius * Math.sin(alpha * i));
        }
    }

    /**
     * Deseneaza lniile
     */
    private void drawLines() {
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {
                if (Math.random() <= edgeProbability) {
                    graphics.drawLine(x[i], y[i], x[j], y[j]);
                }
            }
        }
    }

    /**
     * Deseneaza punctele
     */
    private void drawVertices() {
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < numVertices; i++) {
            graphics.fillOval(x[i] - 5, y[i] - 5, 10, 10);
        }
    }

    @Override
    public void update(Graphics g) { }

    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.drawImage(image, 0, 0, this);
    }


}