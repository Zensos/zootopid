package com.example.zootopid;

import com.zootopid.animal.Animal;
import com.zootopid.animal.red.*;
import com.zootopid.animal.blue.*;
import com.zootopid.animal.green.*;
import com.zootopid.animal.orange.*;
import com.zootopid.animal.aquarium.*;

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

    public HelloController() {
        // aquarium
        animals.put("dolphin", Dolphin.class);
        animals.put("jellyfish", JellyFish.class);
        animals.put("neemo", Neemo.class);
        animals.put("octopus", Octopus.class);
        animals.put("pufferfish", PufferFish.class);
        animals.put("shark", Shark.class);
        animals.put("turtle", Turtle.class);
        animals.put("whale", Whale.class);

        // blue
        animals.put("penguin", Penguin.class);
        animals.put("polarbear", PolarBear.class);
        animals.put("seal", Seal.class);

        // green
        animals.put("bunny", Bunny.class );
        animals.put("deer", Deer.class);
        animals.put("fox", Fox.class);
        animals.put("koala", Koala.class);
        animals.put("owl", Owl.class);
        animals.put("panda", Panda.class );
        animals.put("parrot", Parrot.class );
        animals.put("sheep", Sheep.class );

        // orange
        animals.put("elephant", Elephant.class );
        animals.put("giraffe", Giraffe.class );
        animals.put("kangaroo", Kangaroo.class );
        animals.put("lion", Lion.class );
        animals.put("monkey", Monkey.class );
        animals.put("rhino", Rhino.class );
        animals.put("tiger", Tiger.class );
        animals.put("zebra", Zebra.class );

        // red
        animals.put("crocodile", Crocodile.class);
        animals.put("flamingo", Flamingo.class);
        animals.put("hippo", Hippo.class);

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