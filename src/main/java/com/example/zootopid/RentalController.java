package com.example.zootopid;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Date;

public class RentalController extends SceneController {

    @FXML
    private TextField duck, transport;

    LocalStorage localStorage = LocalStorage.getInstance();


    @FXML
    public void purchaseTransport() throws IOException {
        int amount = Integer.parseInt(transport.getText()) * 40;
        if(localStorage.getUser().getPoint() >= amount) {
            localStorage.getUser().setPoint(localStorage.getUser().getPoint() - amount);
            AuthController.tickets.add(new Ticket("เช่ารถทัวร์", amount, new Date()));
            loadSuccess();
        } else {
            loadError();
        }
    }

    @FXML
    public void purchaseDuck() throws IOException {
        int amount = Integer.parseInt(duck.getText()) * 100;
        if(localStorage.getUser().getPoint() >= amount) {
            localStorage.getUser().setPoint(localStorage.getUser().getPoint() - amount);
            AuthController.tickets.add(new Ticket("เรือเป็ด", amount, new Date()));
            loadSuccess();
        } else {
            loadError();
        }
    }

}
