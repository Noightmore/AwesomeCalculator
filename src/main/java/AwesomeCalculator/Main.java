package main.java.AwesomeCalculator;

import main.java.AwesomeCalculator.views.MainWindow;

import javax.swing.*;

public class Main {

    private static final String MY_APP_TITLE = "Awesome Calculator";

    public static void main(String[] args) {
        JFrame mainWindow;
        mainWindow = new MainWindow(MY_APP_TITLE);
        mainWindow.setVisible(true);
    }
}
