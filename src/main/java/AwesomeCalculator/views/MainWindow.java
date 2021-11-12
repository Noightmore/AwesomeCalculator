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

    Controller controller;

    public MainWindow(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.initialize();

        button1.addActionListener(actionEvent -> controller.read(button1, mainLabel));
        button2.addActionListener(actionEvent -> controller.read(button2, mainLabel));
        button3.addActionListener(actionEvent -> controller.read(button3, mainLabel));
        button4.addActionListener(actionEvent -> controller.read(button4,mainLabel));
        button5.addActionListener(actionEvent -> controller.read(button5, mainLabel));
        button6.addActionListener(actionEvent -> controller.read(button6, mainLabel));
        button7.addActionListener(actionEvent -> controller.read(button7, mainLabel));
        button8.addActionListener(actionEvent -> controller.read(button8, mainLabel));
        button9.addActionListener(actionEvent -> controller.read(button9, mainLabel));
        button0.addActionListener(actionEvent -> controller.read(button0,mainLabel));
        buttonDecimalPoint.addActionListener(actionEvent -> controller.read(buttonDecimalPoint, mainLabel));

        buttonPlus.addActionListener(actionEvent -> controller.process(buttonPlus,mainLabel));
        buttonMinus.addActionListener(actionEvent -> controller.process(buttonMinus,mainLabel));
        buttonMultiply.addActionListener(actionEvent -> controller.process(buttonMultiply,mainLabel));
        buttonDivide.addActionListener(actionEvent -> controller.process(buttonDivide,mainLabel));

        buttonCalculate.addActionListener(actionEvent -> controller.showResults(mainLabel));
    }

    private void initialize(){
        controller = new Controller();
    }
}
