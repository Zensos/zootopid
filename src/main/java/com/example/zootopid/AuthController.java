package com.example.zootopid;

import com.zootopid.client.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


public class AuthController extends SceneController {

    @FXML
    protected TextField username, password, tel;

    @FXML
    protected Label username_label, balance;

    @FXML
    protected Button close_reward, redeem_reward, close_button;

    @FXML
    private ImageView reward_big_image;

    @FXML
    private Text reward_name, reward_pts, reward_text;

    @FXML
    private TextField amount;

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

    public static ObservableList<Reward> rewards = FXCollections.observableArrayList();
    public static ObservableList<Ticket> tickets = FXCollections.observableArrayList();

    LocalStorage localStorage = LocalStorage.getInstance();

    @FXML
    public void toggleRedeem(ActionEvent event) throws IOException {
        try {
            Button source = (Button) event.getSource();
            String id = source.getId();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("rewards.fxml"));
            fxmlLoader.setController(this);
            DialogPane dialogPane = fxmlLoader.load();
            Dialog dialog = new Dialog();
            dialog.setDialogPane(dialogPane);
            changeReward(id);

            this.close_reward.setOnAction(e -> {
                ((Button) e.getSource()).getScene().getWindow().hide();
            });
            this.redeem_reward.setOnAction(e -> {
                try {
                    if(localStorage.getUser().getPoint() >= Double.parseDouble(this.reward_pts.getText().replace("pts", ""))) {
                        redeemReward(localStorage.getUser());
                        loadSuccess();
                        ((Button) e.getSource()).getScene().getWindow().hide();
                    } else {
                        loadError();
                        ((Button) e.getSource()).getScene().getWindow().hide();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            });
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void redeemReward(Payment payment) {
        payment.decrement(Double.parseDouble(this.reward_pts.getText().replace("pts", "")));
        AuthController.rewards.add(new Reward(this.reward_name.getText(), Double.parseDouble(this.reward_pts.getText().replace("pts", "")), new Date()));
        this.balance.setText(localStorage.getUser().getPoint() + " PTS");
    }

    public void changeReward(String reward) {
        if(reward.equals("penguin")) {
                this.reward_name.setText("Penguin");
                this.reward_pts.setText("10000 pts");
                this.reward_text.setText("Penguin with a beanie");
            } else if (reward.equals("panda")) {
                this.reward_name.setText("Panda");
                this.reward_pts.setText("10000 pts");
                this.reward_text.setText("Our precious pookie panda doll");
            } else if (reward.equals("seal")) {
                this.reward_name.setText("Seal");
                this.reward_pts.setText("10000 pts");
                this.reward_text.setText("Adolescent rounded seal");
            } else if (reward.equals("ticket")) {
                this.reward_name.setText("Ticket Pass");
                this.reward_pts.setText("20000 pts");
                this.reward_text.setText("1 free Zootopid ticket pass");
            } else if (reward.equals("bicycle")) {
                this.reward_name.setText("Bicycle");
                this.reward_pts.setText("25000 pts");
                this.reward_text.setText("Our Biggest Reward for you");
            } else if (reward.equals("wristband")) {
                this.reward_name.setText("Wrist Band");
                this.reward_pts.setText("15000 pts");
                this.reward_text.setText("Our very own signature wristband");
            } else if (reward.equals("backpack")) {
                this.reward_name.setText("Backpack");
                this.reward_pts.setText("8000 pts");
                this.reward_text.setText("A backpack to pack some love.");
            } else if (reward.equals("pencil")) {
                this.reward_name.setText("Pencil");
                this.reward_pts.setText("5000 pts");
                this.reward_text.setText("A pencil to express your feelings.");
            }
        Image bgImage = new Image(getClass().getResourceAsStream("/image/rewards/big_image/" + reward + ".png"));
        this.reward_big_image.setImage(bgImage);
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

    @FXML
    protected void logout(ActionEvent event) throws IOException {
        switchToLogin(event);
        localStorage.setUser(null);
    }

    @FXML
    protected void toggleTopup(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("payment.fxml"));
        fxmlLoader.setController(this);
        DialogPane dialogPane = fxmlLoader.load();
        Dialog dialog = new Dialog();
        dialog.setDialogPane(dialogPane);
        this.close_button.setOnAction(e -> {
            ((Button) e.getSource()).getScene().getWindow().hide();
        });
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.showAndWait();
    }

    @FXML
    protected void topup(ActionEvent event) throws IOException {
        localStorage.getUser().increment(Double.parseDouble(amount.getText()));
        this.balance.setText(localStorage.getUser().getPoint() + " PTS");
        loadSuccess();
    }

}
