package com.example.zootopid;

import com.zootopid.animal.Animal;
import com.zootopid.animal.aquarium.Dolphin;
import com.zootopid.animal.red.Crocodile;
import com.zootopid.animal.green.Panda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;

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
        animals.put("dolphin", Dolphin.class);
        animals.put("panda", Panda.class);
        animals.put("crocodile", Crocodile.class);

    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Button action = (Button)event.getSource();
        String id = action.getId();
        Class<?> clazz = animals.get(id);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        System.out.println(((Animal)instance).getZone());
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