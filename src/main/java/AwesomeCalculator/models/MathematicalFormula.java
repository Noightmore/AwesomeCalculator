package main.java.AwesomeCalculator.models;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static java.lang.Double.parseDouble;

public class MathematicalFormula {

    private final String[] formula;

    public MathematicalFormula(String[] formula) {
        this.formula = formula;
    }

    public double resolve(){
        return calculate(formula);
    }

    private double calculate(String @NotNull [] f){

        double solution = parseDouble(f[0]);

        for (int i=0; i <= formula.length-1 ; i++) {
            switch(formula[i]){
                case "+":
                    solution += parseDouble(f[i+1]);
                case "-":
                    solution -= parseDouble(f[i+1]);
                default:
            }
        }
        return solution;
    }

//    private double[] removeBrackets(){
//        double[] arrayWithoutBrackets;
//
//    }
//
//    private double[] removePrivilegedOperators(){
//
//    }

    @Override
    public String toString() {
        return Arrays.toString(formula);
    }
}
