package main.java.AwesomeCalculator.models;

public class Calculator {

    private double numberToProcess;
    private char operation;

    public char getOperation() {
        return operation;
    }
    public void setOperation(char operation){
        this.operation = operation;
    }

    public double getNumberToProcess() {
        return numberToProcess;
    }
    public void setNumberToProcess(double numberToProcess) {
        this.numberToProcess = numberToProcess;
    }

    public Calculator(double numberToProcess, char operation) {
        this.numberToProcess = numberToProcess;
        this.operation = operation;
    }

    // TODO: resolve schizophrenic issues regarding calculations
    // all fails in here
    public void calculate(double num){
        System.out.println("methods been called");
        switch (operation){
            case '+':
                this.numberToProcess += num;
                System.out.println(this.numberToProcess);
                System.out.println(num);
                break;
            case '-':
                this.numberToProcess -= num;
                break;
            case '*':
                this.numberToProcess *= num;
                break;
            case '/':
                this.numberToProcess /= num;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
