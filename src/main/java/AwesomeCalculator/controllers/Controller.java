package main.java.AwesomeCalculator.controllers;

import main.java.AwesomeCalculator.models.Calculator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class Controller {

    private Calculator calc;

    public Controller() {
        this.initialize();
    }

    public void readInput(@NotNull JButton b, @NotNull JLabel label){
        if(calc.getOperation() == '=') clearAll(label);
        String text = label.getText();
        label.setText(text + b.getText());
    }

    public void processTheNumbers(@NotNull JButton b, @NotNull JLabel label){
        if(calc.getOperation() != 'x'){
            calc.calculate(Double.parseDouble(label.getText()));
            label.setText("");
        }
        if(calc.getNumberToProcess() == 0){
            calc.setNumberToProcess(
                    Double.parseDouble(label.getText())
            );
            label.setText("");
        }
        calc.setOperation(b.getText().toCharArray()[0]);

        // System.out.println(b.getText().toCharArray()[0]);
    }

    public void showResults(@NotNull JLabel label){
        label.setText(String.format("%f", calc.getNumberToProcess()));
    }

    public void clearAll(@NotNull JLabel label){
        this.initialize();
        label.setText("");
    }

    private void initialize(){
        calc = new Calculator(0, 'x');
    }
}