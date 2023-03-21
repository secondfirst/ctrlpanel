package org.example.control;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static java.time.format.DateTimeFormatter.ofPattern;

public class MainListener extends Frame implements ActionListener
{
    Label label1,label2,label3,labelTime, labelTask;
    TextField text1,text2,text3, taskName;
    HashMap<String,TextField> tasks;
    Button button1,button2,button3,button4,button5, startTask;
    public MainListener()
    {
        label1 = new Label("分類");
        label2 = new Label("タスク");
        label3 = new Label("Result");

        Instant time = Instant.now();
        var format = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s").withZone(ZoneId.systemDefault());
        labelTime = new Label(format.format(time));
        labelTask = new Label("task");
        text1 = new TextField(10);
        text2 = new TextField(10);
        text3 = new TextField(10);
        taskName = new TextField(20);
        button1 = new Button("Add");
        button2 = new Button("Sub");
        button3 = new Button("Multi");
        button4 = new Button("Div");
        startTask = new Button("開始");
        button5 = new Button("Close");
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(label3);
        add(text3);
        add(labelTime);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(taskName);
        add(startTask);
        add(labelTask);
        setSize(600,500);
        setTitle("AWTCalculator");
        setLayout(new FlowLayout());
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        startTask.addActionListener(this);
    }
    public void actionPerformed(ActionEvent action) {
        double a1=0,b1=0,c1=0;
        var helper = new ViewHelper();
        try
        {
            a1 = helper.parseTextAsDouble(text1);
        }
        catch (NumberFormatException e) {
            text1.setText("Invalid input entered");
        }
        try
        {
            b1 = helper.parseTextAsDouble(text2);
        }
        catch (NumberFormatException e) {
            text2.setText("Invalid input entered");
        }
        if(action.getSource()==button1)
        {
            text3.setText(String.valueOf(add(a1, b1)));
        }
        if(action.getSource()==button2)
        {
            text3.setText(String.valueOf(sub(a1, b1)));
        }
        if(action.getSource()==button3)
        {
            text3.setText(String.valueOf(multi(a1, b1)));
        }
        if(action.getSource()==button4)
        {
            text3.setText(String.valueOf(div(a1, b1)));
        }
        if(action.getSource() == button5)
        {
            System.exit(0);
        }
        if(action.getSource() == startTask)
        {
            try
            {
                labelTask.setText(helper.parseTextAsString(taskName));
            }
            catch (NumberFormatException e) {
                taskName.setText("Invalid input entered");
            }
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }
    public static double multi(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        return a / b;
    }
}