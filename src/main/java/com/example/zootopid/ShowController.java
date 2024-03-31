package com.example.zootopid;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

import java.io.IOException;
import java.util.Date;

public class ShowController extends SceneController {

    @FXML
    protected Label summary;

    protected double total;

    LocalStorage localStorage = LocalStorage.getInstance();

    public ShowController() {
    }

    @FXML
    private void checkPrice(ActionEvent event) {
        ToggleButton source = (ToggleButton) event.getSource();
        boolean val = source.selectedProperty().getValue();
        double price = Double.parseDouble(source.getText());
        if(val) {
            total += price;
        } else {
            total -= price;
        }
        this.summary.setText(total + "");
    }

    @FXML
    public void purchase() throws IOException {
        if(total > 0 && localStorage.getUser().getPoint() >= total) {
            AuthController.tickets.add(new Ticket("แสดงโชว์", total, new Date()));
            loadSuccess();
        } else {
            loadError();
        }
    }


}
