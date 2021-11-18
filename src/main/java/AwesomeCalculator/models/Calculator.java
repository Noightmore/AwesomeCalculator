package main.java.AwesomeCalculator.models;

import main.java.AwesomeCalculator.enums.OperationTypes;

public class Calculator {

    private double value;
    private OperationTypes operation;

    public Calculator(double value, OperationTypes operation) {
        this.value = value;
        this.operation = operation;
    }

    public OperationTypes getOperation() {
        return operation;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public void setOperation(OperationTypes operation){
        this.operation = operation;
    }

    public void calculate(double num){
        switch (operation){
            case PLUS:
                this.value += num;
                break;
            case MINUS:
                this.value -= num;
                break;
            case MULTIPLY:
                this.value *= num;
                break;
            case DIVIDE:
                this.value /= num;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
