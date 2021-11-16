package main.java.AwesomeCalculator.views;

import main.java.AwesomeCalculator.controllers.Controller;


import javax.swing.*;


public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button4;
    private JButton button7;
    private JButton button2;
    private JButton button5;
    private JButton button8;
    private JButton button9;
    private JButton button6;
    private JButton button3;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton button0;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonDecimalPoint;
    private JButton buttonCalculate;
    private JLabel operatorLabel;
    private JButton buttonClearAll;
    private JButton buttonClearLastCharacter;
    private JLabel leftLabel;
    private JLabel rightLabel;

    Controller controller;

    public MainWindow(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.initialize();

        button1.addActionListener(actionEvent -> controller.readInput(button1, readLabel()));
        button2.addActionListener(actionEvent -> controller.readInput(button2, readLabel()));
        button3.addActionListener(actionEvent -> controller.readInput(button3, readLabel()));
        button4.addActionListener(actionEvent -> controller.readInput(button4, readLabel()));
        button5.addActionListener(actionEvent -> controller.readInput(button5, readLabel()));
        button6.addActionListener(actionEvent -> controller.readInput(button6, readLabel()));
        button7.addActionListener(actionEvent -> controller.readInput(button7, readLabel()));
        button8.addActionListener(actionEvent -> controller.readInput(button8, readLabel()));
        button9.addActionListener(actionEvent -> controller.readInput(button9, readLabel()));
        button0.addActionListener(actionEvent -> controller.readInput(button0, readLabel()));
        buttonDecimalPoint.addActionListener(actionEvent -> controller.readInput(buttonDecimalPoint, readLabel()));

        buttonPlus.addActionListener(actionEvent -> controller.processTheOperator(buttonPlus, leftLabel, operatorLabel, rightLabel));
        buttonMinus.addActionListener(actionEvent -> controller.processTheOperator(buttonMinus, leftLabel, operatorLabel, rightLabel));
        buttonMultiply.addActionListener(actionEvent -> controller.processTheOperator(buttonMultiply, leftLabel, operatorLabel, rightLabel));
        buttonDivide.addActionListener(actionEvent -> controller.processTheOperator(buttonDivide, leftLabel, operatorLabel, rightLabel));

        buttonCalculate.addActionListener(actionEvent -> controller.showResults(leftLabel, operatorLabel, rightLabel));
        buttonClearAll.addActionListener(actionEvent -> controller.clearAll(leftLabel, operatorLabel, rightLabel));
        buttonClearLastCharacter.addActionListener(actionEvent -> {
                // TODO implement deletion of the last character in operatorLabel
        });
    }

    private void initialize(){
        controller = new Controller();
    }

    private JLabel readLabel(){
        return controller.isOperatorSet() ? leftLabel: rightLabel;
    }
}
