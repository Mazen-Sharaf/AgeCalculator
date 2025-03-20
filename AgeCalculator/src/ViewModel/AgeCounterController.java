package ViewModel;

import Model.AgeCalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AgeCounterController {

    @FXML
    public Button calculate; // The Button
    @FXML
    private DatePicker datePicker; //the datepicker Field
    @FXML
    private TextField result; //the textfield with the resault

    @FXML
    void datePicker(ActionEvent evt) {
        // makes the DatePicker Launch
    }

    @FXML
    void calculate(ActionEvent evt) {
        if (datePicker.getValue() != null) {
            AgeCalculator ageCalculator = new AgeCalculator(datePicker.getValue());
            result.setText(ageCalculator.getResult());
        }
    }
}
