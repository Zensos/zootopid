package com.example.zootopid;

import com.zootopid.client.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;


public class AuthController extends SceneController {

    @FXML
    protected TextField username, password, tel;

    @FXML
    protected Label balance;

    LocalStorage localStorage = LocalStorage.getInstance();

    @FXML
    public void initialize() {
        if(localStorage.getUser() != null) {
            this.balance.setText(localStorage.getUser().getPoint() + "");
        }
    }

    @FXML
    private void signIn(ActionEvent event) throws IOException {
        String _username = username.getText();
        String _password = password.getText();
        String _tel = tel.getText();
        if(_username.equals("admin") && _password.equals("adminza1234")) {
            localStorage.setUser(new User("admin", "adminza1234", "01234214", "ADMIN"));
            this.switchToMap(event);
        } else if(_username.equals("zootopid") && _password.equals("zootopid1")){
            localStorage.setUser(new User("zootopid", "zootopid1", "0999999999", "MEMBER"));
            this.switchToMap(event);
        }
    }

}
