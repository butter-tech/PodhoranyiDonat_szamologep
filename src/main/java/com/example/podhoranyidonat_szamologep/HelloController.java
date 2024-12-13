package com.example.podhoranyidonat_szamologep;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField aInput, bInput, cInput;
    @FXML
    private Label x1Label, x2Label;

    @FXML
    private void calculate() {
        try {
            // Beviteli adatok ellenőrzése
            double a = Double.parseDouble(aInput.getText());
            double b = Double.parseDouble(bInput.getText());
            double c = Double.parseDouble(cInput.getText());

            // Diszkrimináns számítása
            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                x1Label.setText("Nem oldható meg");
                x2Label.setText("a valós számok halmazán");
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                x1Label.setText(String.format("x1 = x2 = %.2f", x));
                x2Label.setText("");
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                x1Label.setText(String.format("x1 = %.2f", x1));
                x2Label.setText(String.format("x2 = %.2f", x2));
            }
        } catch (NumberFormatException e) {
            x1Label.setText("Hiba: Csak számot adjon meg!");
            x2Label.setText("");
        }
    }
}
