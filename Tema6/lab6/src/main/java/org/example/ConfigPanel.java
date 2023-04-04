package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Clasa genereaza panoul de configurare plasat în partea superioară a cadrului.
 */
public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel dotsLabel, linesLabel;
    JSpinner dotsSpinner;
    JComboBox linesCombo;
    JButton createButton;
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    /**
     * Adaugam butoanele din panoul de configurare: "Number of dots" de tip JSpinner si "Line Probability" de tip JComboBox.
     */
    private void init() {
        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));

        linesLabel = new JLabel("Line probability:");
        Double[] edgeProbability = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        linesCombo = new JComboBox<>(edgeProbability);
        createButton = new JButton("Create new game");

        add(dotsLabel);
        add(dotsSpinner);
        add(linesLabel);
        add(linesCombo);
        add(createButton);

        createButton.addActionListener(this::createGame);
    }

    /**
     * Butonul de "Create New Game"
     * @param e
     */
    private void createGame(ActionEvent e) {
        DrawingPanel canvas = frame.canvas;
        canvas.createBoard();
        canvas.repaint();
    }

}
