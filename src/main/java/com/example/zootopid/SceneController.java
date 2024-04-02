package com.example.zootopid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML
    public void switchToShow(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("show.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToZoo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ticketprice.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToMap(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("map.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToStore(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ticketprice.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToProfile(ActionEvent event) throws  IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profile.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToFacility(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("facilitymap.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToRental(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("rental_duck.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToTransport(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("rental_transport.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void loadError() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("error.fxml"));
        DialogPane dialogPane = fxmlLoader.load();
        Dialog dialog = new Dialog();
        dialog.setDialogPane(dialogPane);
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.showAndWait();
    }

    public void loadSuccess() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("success.fxml"));
        DialogPane dialogPane = fxmlLoader.load();
        Dialog dialog = new Dialog();
        dialog.setDialogPane(dialogPane);
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.showAndWait();
    }
}
