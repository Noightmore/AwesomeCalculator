package main.java.AwesomeCalculator.controllers;

import main.java.AwesomeCalculator.Annotations.ControllerAnnotation;
import main.java.AwesomeCalculator.models.Calculator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.lang.annotation.Annotation;
import java.util.Objects;

public class Controller implements ControllerAnnotation {

    private Calculator calc;

    public Controller() {
        this.initialize();
    }

    public void readInput(@NotNull JButton b, @NotNull JLabel label){
        String text = label.getText();
        label.setText(text + b.getText());
    }

    public void processTheOperator(@NotNull JButton b, @NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){

        if(calc.getOperation() != 'x' && !Objects.equals(rightLabel.getText(), "")){
            calc.calculate(Double.parseDouble(rightLabel.getText()));
            rightLabel.setText("");
            leftLabel.setText(String.format("%f",calc.getValue()));
        }

        if(calc.getValue() == 0){
            calc.setValue(
                    Double.parseDouble(leftLabel.getText())
            );
        }

        calc.setOperation(b.getText().toCharArray()[0]);
        operatorLabel.setText(String.format("%c",calc.getOperation()));
    }

    public void showResults(@NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){
        calc.calculate(Double.parseDouble(rightLabel.getText()));
        leftLabel.setText(String.format("%f", calc.getValue()));
        calc.setOperation('x');
        operatorLabel.setText("");
        rightLabel.setText("");
    }

    public void clearAll(@NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){
        this.initialize();
        rightLabel.setText("");
        operatorLabel.setText("");
        leftLabel.setText("");
    }

    public boolean isOperatorSet(){
        return calc.getOperation() == 'x';
    }

    private void initialize(){
        calc = new Calculator(0, 'x');
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
