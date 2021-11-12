package main.java.AwesomeCalculator.views;

import main.java.AwesomeCalculator.models.MathematicalFormula;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    private JPanel mainPanel;
    private JLabel cheatSheetLabel;
    private JTextField inputTextField;
    private JLabel enterYourTextLabel;
    private JButton okButton;
    private JLabel resultsLabel;

    MathematicalFormula myFormula;

    public MainWindow(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        okButton.addActionListener(actionEvent -> {
                myFormula = new MathematicalFormula(inputTextField.getText().split(""));
                resultsLabel.setText(String.format("The result is: %f", myFormula.resolve()));
        });
    }

    private void initialization(){

    }
}
