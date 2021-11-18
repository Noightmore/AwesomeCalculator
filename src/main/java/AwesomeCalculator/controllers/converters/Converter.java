package main.java.AwesomeCalculator.controllers.converters;

import main.java.AwesomeCalculator.enums.OperationTypes;

public class Converter {
    public static OperationTypes charToEnum(char op){
        switch (op){
            case '+':
                return OperationTypes.PLUS;
            case '-':
                return OperationTypes.MINUS;
            case '*':
                return OperationTypes.MULTIPLY;
            case '/':
                return OperationTypes.DIVIDE;
            default:
                return OperationTypes.UNSET;
        }
    }

    public static char enumToChar(OperationTypes op){
        switch (op){
            case PLUS:
                return '+';
            case MINUS:
                return '-';
            case MULTIPLY:
                return '*';
            case DIVIDE:
                return '/';
            default:
                return 'x';
        }
    }
}
