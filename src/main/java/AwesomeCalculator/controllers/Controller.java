package main.java.AwesomeCalculator.controllers;

import main.java.AwesomeCalculator.controllers.interfaces.IController;
import main.java.AwesomeCalculator.models.Calculator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Objects;

public class Controller implements IController {

    private static final String CLEARED_LABEL = "";

    private Calculator calc;

    public Controller() {
        this.initialize();
    }

    public void readInput(@NotNull JButton button, @NotNull JLabel label){
        String text = label.getText();
        label.setText(text + button.getText());
    }

    public void processTheOperator(@NotNull JButton button, @NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){

        if(calc.getOperation() != 'x' && !Objects.equals(rightLabel.getText(), CLEARED_LABEL)){
            calc.calculate(Double.parseDouble(rightLabel.getText()));
            rightLabel.setText(CLEARED_LABEL);
            leftLabel.setText(String.format("%f",calc.getValue()));
        }

        if(calc.getValue() == 0){
            calc.setValue(
                    Double.parseDouble(leftLabel.getText())
            );
        }

        calc.setOperation(button.getText().toCharArray()[0]);
        operatorLabel.setText(String.format("%c",calc.getOperation()));
    }

    public void showResults(@NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){
        calc.calculate(Double.parseDouble(rightLabel.getText()));
        leftLabel.setText(String.format("%f", calc.getValue()));
        calc.setOperation('x');
        operatorLabel.setText(CLEARED_LABEL);
        rightLabel.setText(CLEARED_LABEL);
    }

    public void clearAll(@NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){
        this.initialize();
        rightLabel.setText(CLEARED_LABEL);
        operatorLabel.setText(CLEARED_LABEL);
        leftLabel.setText(CLEARED_LABEL);
    }

    public boolean isOperatorSet(){
        return calc.getOperation() == 'x';
    }

    private void initialize(){
        calc = new Calculator(0, 'x');
    }
}
