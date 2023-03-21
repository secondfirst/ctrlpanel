package org.example.control;

import java.awt.*;

public class ViewHelper {
    public double parseTextAsDouble(TextField tx) {
        return Double.parseDouble(tx.getText());
    }
    public String parseTextAsString(TextField tx) {
        return tx.getText();
    }
}
