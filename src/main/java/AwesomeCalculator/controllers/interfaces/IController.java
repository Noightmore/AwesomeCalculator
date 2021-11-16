package main.java.AwesomeCalculator.controllers.interfaces;

import javax.swing.*;

public interface IController {

    /*
     * documentation done in ASP .NET style
     */

    /**
     * when button is clicked, this method reads its name (integer)
     * and adds it to the displayed number
     *
     * @param button whole button object, only it's name is used
     * @param label middle value
     */
    void readInput(JButton button, JLabel label);

    /**
     * method that checks the state of the operator and does a proper call for the calculate method of the Calculator class
     * also sets the initial value
     *
     * @param button the whole button object, only the text it contains is used to determine the operation user desires
     * @param leftLabel main value that is used to store the outcome of the calculation or one of the numbers of the calculation
     * @param rightLabel stores the number that is going to be added to the main value
     * @param operatorLabel just displays the currently selected operator, does not store it
     */
    void processTheOperator(JButton button, JLabel leftLabel, JLabel operatorLabel, JLabel rightLabel);

    /**
     * method that finishes the last recorded calculation
     * and displays the output of the calculation (if user has pressed the "=" button) in the leftLabel
     * clears the other labels and reinitializes the state of Calculator class' operator attribute.
     *
     * @param leftLabel label which shows the result of the last calculation
     * @param rightLabel is cleared in the process
     * @param operatorLabel is cleared in the process
     */
    void showResults(JLabel leftLabel, JLabel operatorLabel, JLabel rightLabel);

    /**
     * method that clears all the labels
     * and reinitializes the entire Calculator class
     *
     * @param leftLabel is cleared in the process
     * @param rightLabel is cleared in the process
     * @param operatorLabel is cleared in the process
     */
    void clearAll(JLabel leftLabel, JLabel operatorLabel, JLabel rightLabel);

    /**
     * method that clears the last entered character depending on which label is not empty
     *
     * @param leftLabel label which could be changed in the process (is checked as last)
     * @param rightLabel label which could be changed in the process (is checked as first)
     * @param operatorLabel label which could be changed in the process (is checked as second)
     */
    void clearOneCharacter(JLabel leftLabel, JLabel operatorLabel, JLabel rightLabel);

    /**
     * method that checks whether has been set (+,-,*,/) is not x (the default value)
     */
    boolean isOperatorSet();
}
