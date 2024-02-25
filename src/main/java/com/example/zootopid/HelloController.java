package com.example.zootopid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label animalName;
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView imageView;


    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        Button lol = (Button)event.getSource();
        System.out.println(lol.getId());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("internal-dialog.fxml"));
        fxmlLoader.setController(this);
        DialogPane dialogPane = fxmlLoader.load();

        Dialog dia = new Dialog();
        dia.setDialogPane(dialogPane);
        this.animalName.setText("NIGGA PANDA");
        Image newImage = new Image(getClass().getResourceAsStream("/image/animal/" + lol.getId() +"/" + lol.getId() + ".png"));
        this.imageView.setImage(newImage);
        dia.initModality(Modality.APPLICATION_MODAL);
        Button closeButton = new Button();
        closeButton.setOnAction(e -> {
            ((Button) e.getSource()).getScene().getWindow().hide();
        });
        closeButton.setVisible(false);
        dialogPane.getButtonTypes().add(ButtonType.CLOSE);
        dia.showAndWait();
    }
}