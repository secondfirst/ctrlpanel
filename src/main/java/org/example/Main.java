package org.example;

import org.example.control.MainListener;

public class Main {
    public static void main(String[] args) {

        println("== started == ");
        var main = new MainListener();
        main.setVisible(true);
        main.setLocation(300,300);

        println("== startedeed == ");
    }

    public static void println(String message) {
        System.out.println(message);
    }
}