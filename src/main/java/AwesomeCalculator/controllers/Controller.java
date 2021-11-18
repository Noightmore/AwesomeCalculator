package main.java.AwesomeCalculator.controllers;

import main.java.AwesomeCalculator.controllers.converters.Converter;
import main.java.AwesomeCalculator.controllers.interfaces.IController;
import main.java.AwesomeCalculator.enums.OperationTypes;
import main.java.AwesomeCalculator.models.Calculator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Objects;

public class Controller implements IController {

    private static final String CLEARED = "";

    private Calculator calc;

    public Controller() {
        this.initialize();
    }

    public void readInput(@NotNull JButton button, @NotNull JLabel label){
        String text = label.getText();
        label.setText(text + button.getText());
    }

    public void processTheOperator(@NotNull JButton button, @NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){

        if(calc.getOperation() != OperationTypes.UNSET && !Objects.equals(rightLabel.getText(), CLEARED)){
            calc.calculate(Double.parseDouble(rightLabel.getText()));
            rightLabel.setText(CLEARED);
            leftLabel.setText(String.format("%f",calc.getValue()));
        }

        if(calc.getValue() == 0){
            calc.setValue(
                    Double.parseDouble(leftLabel.getText())
            );
        }

        calc.setOperation(
                Converter.charToEnum(
                        button
                                .getText()
                                .toCharArray()[0])
        );
        operatorLabel.setText(
                String.format(
                        "%c",
                        Converter.enumToChar(
                                calc.getOperation()))
        );
    }

    public void showResults(@NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){
        if(!Objects.equals(leftLabel.getText(), CLEARED)
                && !Objects.equals(operatorLabel.getText(), CLEARED)
                && !Objects.equals(rightLabel.getText(), CLEARED)){

            calc.calculate(
                    Double.parseDouble(rightLabel.getText())
            );
            leftLabel.setText(
                    String.format(
                            "%f",
                            calc.getValue())
            );
            calc.setOperation(OperationTypes.UNSET);
            operatorLabel.setText(CLEARED);
            rightLabel.setText(CLEARED);
        }
    }

    public void clearAll(@NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){
        this.initialize();
        rightLabel.setText(CLEARED);
        operatorLabel.setText(CLEARED);
        leftLabel.setText(CLEARED);
    }

    public void clearOneCharacter(@NotNull JLabel leftLabel, @NotNull JLabel operatorLabel, @NotNull JLabel rightLabel){
        if(!Objects.equals(rightLabel.getText(), CLEARED)){
            String currentLabelTextWithoutLastChar = rightLabel
                    .getText()
                    .substring(0, rightLabel
                            .getText()
                            .toCharArray()
                            .length-1
                    );
            rightLabel.setText(currentLabelTextWithoutLastChar);
        }else if(!Objects.equals(operatorLabel.getText(), CLEARED)){
            operatorLabel.setText(CLEARED);
        }else if(!Objects.equals(leftLabel.getText(), CLEARED)){
            String currentLabelTextWithoutLastChar = leftLabel
                    .getText()
                    .substring(0, leftLabel
                            .getText()
                            .toCharArray()
                            .length-1
            );
            leftLabel.setText(currentLabelTextWithoutLastChar);
            if(Objects.equals(leftLabel.getText(), CLEARED)) this.initialize();
        }else{
            this.initialize();
        }
    }

    public boolean isOperatorSet(){
        return calc.getOperation() == OperationTypes.UNSET;
    }

    private void initialize(){
        calc = new Calculator(0, OperationTypes.UNSET);
    }
}
