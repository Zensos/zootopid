package com.example.zootopid;

import com.zootopid.Crocodile;
import com.zootopid.Dog;
import com.zootopid.Panda;
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
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class HelloController {
    @FXML
    private Label animalName;
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView imageView;
    private Map<String, Class<?>> animals = new HashMap<>();

    public HelloController(){
        animals.put("Dog", Dog.class);
        animals.put("Panda", Panda.class);
        animals.put("Crocodile", Crocodile.class);

    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Button action = (Button)event.getSource();
        String id = action.getId();
        String uppercase_id = id.substring(0, 1).toUpperCase() + id.substring(1);
        Class<?> clazz = animals.get(uppercase_id);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("internal-dialog.fxml"));
        fxmlLoader.setController(this);
        DialogPane dialogPane = fxmlLoader.load();
        Dialog dia = new Dialog();
        dia.setDialogPane(dialogPane);
        this.animalName.setText(id);
        Image newImage = new Image(getClass().getResourceAsStream("/image/animal/" + id +"/" + id + ".png"));
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