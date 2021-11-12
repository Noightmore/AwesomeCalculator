package main.java.AwesomeCalculator.controllers;

import main.java.AwesomeCalculator.models.Calculator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Objects;

public class Controller {

    private  Calculator calc;

    public Controller() {
        this.initialize();
    }

    public void read(@NotNull JButton b, @NotNull JLabel label){
        String text = label.getText();
        label.setText(text + b.getText());
    }

    public void process(@NotNull JButton b, @NotNull JLabel label){
        if(!Objects.equals(calc.getOperation(), "x")){
            calc.calculate(Double.parseDouble(label.getText()));
            label.setText("");
        }
        if(calc.getNumberToProcess() == 0){
            calc.setNumberToProcess(
                    Double.parseDouble(label.getText())
            );
            label.setText("");
        }
        calc.setOperation(b.getText());
    }

    public  void showResults(@NotNull JLabel label){
        label.setText(String.format("%f", calc.getNumberToProcess()));
    }

    private void initialize(){
        calc = new Calculator(0, "x");
    }
}
