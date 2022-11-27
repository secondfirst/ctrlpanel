package org.example;

import org.example.control.MainListener;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        println("== started == ");
        var main = new MainListener();
        main.setSize(new Dimension(600, 400));
        main.setVisible(true);
        main.setLocation(300,300);

        println("== startedeed == ");
    }

    public static void println(String message) {
        System.out.println(message);
    }
}