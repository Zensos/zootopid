package com.example.zootopid;

import com.zootopid.animal.Animal;
import com.zootopid.animal.aquarium.*;
import com.zootopid.zone.Zone;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class AquariumController extends SceneController {
    @FXML
    private Label animal_name;
    @FXML
    private ImageView animal_image, zone_background;
    @FXML
    private Label zone_name, std_id;
    @FXML
    private Pane pane_1, pane_2;

    @FXML
    private Text description, near_by;

    private Map<String, Class<?>> animals = new HashMap<>();
    public AquariumController() {
        // aquarium
        animals.put("dolphin", Dolphin.class);
        animals.put("jellyfish", JellyFish.class);
        animals.put("nemo", Nemo.class);
        animals.put("octopus", Octopus.class);
        animals.put("pufferfish", PufferFish.class);
        animals.put("shark", Shark.class);
        animals.put("turtle", Turtle.class);
        animals.put("whale", Whale.class);
    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Button action = (Button)event.getSource();
        String id = action.getId();
        System.out.println(id);
        Class<?> clazz = animals.get(id);
        System.out.println(clazz);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Animal animal = (Animal)instance;
        Zone zone = animal.getZone();
        System.out.println(zone);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("internal-dialog.fxml"));
        fxmlLoader.setController(this);
        DialogPane dialogPane = fxmlLoader.load();
        Dialog dialog = new Dialog();
        dialog.setDialogPane(dialogPane);


        if(animal.getZone().getZoneName().toLowerCase().equals("green")) {
            Image bgImage = new Image(getClass().getResourceAsStream("/image/background/" + zone.getZoneName().toLowerCase() + ".gif"));
            System.out.println(bgImage);
            this.zone_background.setImage(bgImage);
        } else {
            Image bgImage = new Image(getClass().getResourceAsStream("/image/background/" + zone.getZoneName().toLowerCase() + ".png"));
            this.zone_background.setImage(bgImage);
        }


        Image newImage = new Image(getClass().getResourceAsStream("/image/animal/" + id + "/" + id + ".png"));
        this.animal_name.setText(id);
        this.animal_image.setImage(newImage);
        this.zone_name.setText("Zone " + zone.getZoneName().substring(0, 1));
        this.pane_1.setStyle("-fx-background-color:" + changeColor(zone.getZoneName()) + ";-fx-background-radius:8");
        this.pane_2.setStyle("-fx-background-color:" + changeColor(zone.getZoneName()) + ";-fx-background-radius:8");
        this.description.setText("dagdasgasgdsag");
        this.near_by.setText(animal.getNearByAnimals());

        dialog.initModality(Modality.APPLICATION_MODAL);
        Button closeButton = new Button();
        closeButton.setOnAction(e -> {
            ((Button) e.getSource()).getScene().getWindow().hide();
        });
        closeButton.setVisible(false);
        dialogPane.getButtonTypes().add(ButtonType.CLOSE);
        dialog.showAndWait();

    }

    private String changeColor(String zone) {
        switch (zone) {
            case "Red":
                return "#FDD3C9";
            case "Orange":
                return "#FDB865";
            case "Green":
                return "#93C1B7";
            case "Blue":
                return "#BFF0FB";
            case "Aquarium":
                return "#63D8F5";
            default:
                return "#FDD3C9";
        }
    }

}
