package main.java.AwesomeCalculator.models;

public class Calculator {

    private double numberToProcess;
    private String operation;

    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation){
        this.operation = operation;
    }

    public double getNumberToProcess() {
        return numberToProcess;
    }
    public void setNumberToProcess(double numberToProcess) {
        this.numberToProcess = numberToProcess;
    }

    public Calculator(double numberToProcess, String operation) {
        this.numberToProcess = numberToProcess;
        this.operation = operation;
    }
}
