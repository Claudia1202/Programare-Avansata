package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/**
 * Clasa genereaza panoul de control plasat în partea inferioara a cadrului.
 */
public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exit = new JButton("Exit");
    JButton export = new JButton("Export");
    JButton save = new JButton("Save");
    JButton reset = new JButton("Reset");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    /**
     * Adaugam butoanele din partea de jos: "Save", "Exit", "Load", "Reset".
     */
    private void init() {
        setLayout(new GridLayout(1, 4));

        add(export);
        add(save);
        add(reset);
        add(exit);

        exit.addActionListener(this::exitGame);
        export.addActionListener(e -> {
            try {
                export(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        save.addActionListener(this::saveGame);
        reset.addActionListener(this::resetGame);
    }

    //Butoanele
    private void resetGame(ActionEvent e) {

        frame.canvas.repaint();
    }

    private void saveGame(ActionEvent e) {

    }

    private void export(ActionEvent e) throws IOException {
        BufferedImage image = new BufferedImage(frame.canvas.getWidth(), frame.canvas.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        frame.canvas.paint(g2d);
        ImageIO.write(image, "png", new File("image.png"));
        g2d.dispose();
    }

    private void exitGame(ActionEvent e) {
        frame.dispose();
    }
}