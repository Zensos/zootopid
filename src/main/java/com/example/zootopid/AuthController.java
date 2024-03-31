package com.example.zootopid;

import com.zootopid.client.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Date;


public class AuthController extends SceneController {

    @FXML
    protected TextField username, password, tel;

    @FXML
    protected Label username_label, balance;

    @FXML
    protected ImageView reward_big_image;

    @FXML
    protected Text reward_name, reward_pts, reward_text;

    @FXML
    protected TableView reward_table;
    @FXML
    protected TableColumn<Reward, String> reward_type;
    @FXML
    protected TableColumn<Reward, Double> reward_amount;
    @FXML
    protected TableColumn<Reward, Date> reward_date;

    @FXML
    protected TableView ticket_table;
    @FXML
    protected TableColumn<Ticket, String> ticket_type;
    @FXML
    protected TableColumn<Ticket, Double> ticket_amount;
    @FXML
    protected TableColumn<Ticket, Date> ticket_date;

    public static ObservableList<Reward> rewards = FXCollections.observableArrayList(new Reward("eiei", 10, new Date()));
    public static ObservableList<Ticket> tickets = FXCollections.observableArrayList();

    LocalStorage localStorage = LocalStorage.getInstance();

    @FXML
    public void toggleRedeem(Event event) {
        Button source = (Button) event.getSource();
        String id = source.getId();
        changeReward(id);
    }

    public void changeReward(String reward) {
        if(reward.equals("penguin")) {
            this.reward_name.setText("Penguin");
            this.reward_pts.setText("10000 pts");
            this.reward_text.setText("Penguin with a beanie");
        }
    }

    @FXML
    public void initialize() {
        if(localStorage.getUser() != null) {
            this.balance.setText(localStorage.getUser().getPoint() + " PTS");
            this.username_label.setText(localStorage.getUser().getUsername());
            reward_type.setCellValueFactory(new PropertyValueFactory<Reward, String>("type"));
            reward_amount.setCellValueFactory(new PropertyValueFactory<Reward, Double>("amount"));
            reward_date.setCellValueFactory(new PropertyValueFactory<Reward, Date>("date"));

            this.reward_table.setItems(rewards);

            ticket_type.setCellValueFactory(new PropertyValueFactory<Ticket, String>("type"));
            ticket_amount.setCellValueFactory(new PropertyValueFactory<Ticket, Double>("amount"));
            ticket_date.setCellValueFactory(new PropertyValueFactory<Ticket, Date>("date"));

            this.ticket_table.setItems(tickets);
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
