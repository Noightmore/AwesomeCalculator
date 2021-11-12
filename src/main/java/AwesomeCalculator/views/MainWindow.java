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
    private JLabel mainLabel;
    private JButton buttonClearAll;

    Controller controller;

    public MainWindow(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.initialize();

        button1.addActionListener(actionEvent -> controller.readInput(button1, mainLabel));
        button2.addActionListener(actionEvent -> controller.readInput(button2, mainLabel));
        button3.addActionListener(actionEvent -> controller.readInput(button3, mainLabel));
        button4.addActionListener(actionEvent -> controller.readInput(button4,mainLabel));
        button5.addActionListener(actionEvent -> controller.readInput(button5, mainLabel));
        button6.addActionListener(actionEvent -> controller.readInput(button6, mainLabel));
        button7.addActionListener(actionEvent -> controller.readInput(button7, mainLabel));
        button8.addActionListener(actionEvent -> controller.readInput(button8, mainLabel));
        button9.addActionListener(actionEvent -> controller.readInput(button9, mainLabel));
        button0.addActionListener(actionEvent -> controller.readInput(button0,mainLabel));
        buttonDecimalPoint.addActionListener(actionEvent -> controller.readInput(buttonDecimalPoint, mainLabel));

        buttonPlus.addActionListener(actionEvent -> controller.processTheNumbers(buttonPlus,mainLabel));
        buttonMinus.addActionListener(actionEvent -> controller.processTheNumbers(buttonMinus,mainLabel));
        buttonMultiply.addActionListener(actionEvent -> controller.processTheNumbers(buttonMultiply,mainLabel));
        buttonDivide.addActionListener(actionEvent -> controller.processTheNumbers(buttonDivide,mainLabel));

        buttonCalculate.addActionListener(actionEvent -> controller.showResults(mainLabel));
        buttonClearAll.addActionListener(actionEvent -> controller.clearAll(mainLabel));
    }

    private void initialize(){
        controller = new Controller();
    }
}
