package main.java.AwesomeCalculator.models;

public class Calculator {

    private double value;
    private char operation;

    public char getOperation() {
        return operation;
    }
    public void setOperation(char operation){
        this.operation = operation;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public Calculator(double value, char operation) {
        this.value = value;
        this.operation = operation;
    }

    // might want to use enum instead
    public void calculate(double num){
        switch (operation){
            case '+':
                this.value += num;
                break;
            case '-':
                this.value -= num;
                break;
            case '*':
                this.value *= num;
                break;
            case '/':
                this.value /= num;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
