package com.example.zootopid;

import com.zootopid.client.User;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StoreController extends SceneController {

    @FXML
    protected TextField th_adult, th_child, th_student, th_elder, fr_adult, fr_child, th_adult_aq, th_child_aq, th_student_aq, th_elder_aq, fr_adult_aq, fr_child_aq, rental_car, rental_motorcycle, rental_bicycle;

    @FXML
    protected Label total;

    @FXML
    protected Button submit;
    @FXML
    protected Label balance;

    LocalStorage localStorage = LocalStorage.getInstance();

    public void initialize() {
        attachListener(th_adult);
        attachListener(th_child);
        attachListener(th_student);
        attachListener(th_elder);
        attachListener(fr_adult);
        attachListener(fr_child);
        attachListener(th_adult_aq);
        attachListener(th_child_aq);
        attachListener(th_student_aq);
        attachListener(th_elder_aq);
        attachListener(fr_adult_aq);
        attachListener(fr_child_aq);
        attachListener(rental_car);
        attachListener(rental_motorcycle);
        attachListener(rental_bicycle);
    }

    private void attachListener(TextField textField) {
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                calculateTotal();
            }
        });
    }

    private void calculateTotal() {
        double th_zoo_aquarium = (
                (Double.parseDouble(th_adult.getText().isEmpty() ? "0" : th_adult.getText()) * 200) +
                        (Double.parseDouble(th_child.getText().isEmpty() ? "0" : th_child.getText()) * 100) +
                        (Double.parseDouble(th_student.getText().isEmpty() ? "0" : th_student.getText()) * 150) +
                        (Double.parseDouble(th_elder.getText().isEmpty() ? "0" : th_elder.getText()) * 50) +
                        (Double.parseDouble(th_adult_aq.getText().isEmpty() ? "0" : th_adult_aq.getText()) * 200) +
                        (Double.parseDouble(th_child_aq.getText().isEmpty() ? "0" : th_child_aq.getText()) * 100) +
                        (Double.parseDouble(th_student_aq.getText().isEmpty() ? "0" : th_student_aq.getText()) * 150) +
                        (Double.parseDouble(th_elder_aq.getText().isEmpty() ? "0" : th_elder_aq.getText()) * 50)
        );

        double fr_zoo_aquarium = (
                (Double.parseDouble(fr_adult.getText().isEmpty() ? "0" : fr_adult.getText()) * 300) +
                        (Double.parseDouble(fr_child.getText().isEmpty() ? "0" : fr_child.getText()) * 200) +
                        (Double.parseDouble(fr_adult_aq.getText().isEmpty() ? "0" : fr_adult_aq.getText()) * 300) +
                        (Double.parseDouble(fr_child_aq.getText().isEmpty() ? "0" : fr_child_aq.getText()) * 200)
        );

        double rental = (
                (Double.parseDouble(rental_car.getText().isEmpty() ? "0" : rental_car.getText()) * 200) +
                        (Double.parseDouble(rental_motorcycle.getText().isEmpty() ? "0" : rental_motorcycle.getText()) * 100) +
                        (Double.parseDouble(rental_bicycle.getText().isEmpty() ? "0" : rental_bicycle.getText()) * 50)
        );
        this.total.setText((th_zoo_aquarium + fr_zoo_aquarium + rental) + "");

    }

    public void purchase() throws IOException {
        localStorage.getUser().setPoint(localStorage.getUser().getPoint() + 10);
    }

}
