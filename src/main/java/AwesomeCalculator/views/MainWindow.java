package main.java.AwesomeCalculator.views;

import main.java.AwesomeCalculator.models.Calculator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Objects;

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
    private JLabel mainLabel;
    private JButton buttonPlus;
    private JButton buttonCalculate;
    private JButton buttonMinus;
    private JButton button0;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonDecimalPoint;

    String text = "";
    Calculator calc;

    public MainWindow(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.initialize();

        button1.addActionListener(actionEvent -> read(button1));
        button2.addActionListener(actionEvent -> read(button2));
        button3.addActionListener(actionEvent -> read(button3));
        button4.addActionListener(actionEvent -> read(button4));
        button5.addActionListener(actionEvent -> read(button5));
        button6.addActionListener(actionEvent -> read(button6));
        button7.addActionListener(actionEvent -> read(button7));
        button8.addActionListener(actionEvent -> read(button8));
        button9.addActionListener(actionEvent -> read(button9));
        button0.addActionListener(actionEvent -> read(button0));
        buttonDecimalPoint.addActionListener(actionEvent -> read(buttonDecimalPoint));

        buttonPlus.addActionListener(actionEvent -> {

        });
        buttonMinus.addActionListener(actionEvent -> {

        });
        buttonMultiply.addActionListener(actionEvent -> {

        });
        buttonDivide.addActionListener(actionEvent -> {

        });

    }

    private void initialize(){
        calc = new Calculator(0, "x");
    }
    private void read(@NotNull JButton b){
        text = mainLabel.getText();
        mainLabel.setText(
                text += b.getText()
        );
    }

    private void process(@NotNull JButton b){
        calc.setNumberToProcess(
                Double.parseDouble(mainLabel.getText())
        );
        // TODO: mathematical operations
        calc.setOperation(b.getText());


    }

}
