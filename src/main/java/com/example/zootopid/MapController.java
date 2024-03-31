package com.example.zootopid;

import com.zootopid.animal.Animal;
import com.zootopid.animal.red.*;
import com.zootopid.animal.blue.*;
import com.zootopid.animal.green.*;
import com.zootopid.animal.orange.*;
import com.zootopid.animal.aquarium.*;

import com.zootopid.zone.Zone;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class MapController extends SceneController {
    @FXML
    private Label animal_name;

    @FXML
    private GridPane nearby;
    @FXML
    private ImageView animal_image, zone_background;
    @FXML
    private Label zone_name, std_id;
    @FXML
    private Pane pane_1, pane_2;

    @FXML
    private Text description, near_by;

    @FXML
    private Button close_button;

    private Map<String, Class<?>> animals = new HashMap<>();

    public MapController() {
        // aquarium
        animals.put("dolphin", Dolphin.class);
        animals.put("jellyfish", JellyFish.class);
        animals.put("nemo", Nemo.class);
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
        animals.put("bunny", Bunny.class);
        animals.put("deer", Deer.class);
        animals.put("fox", Fox.class);
        animals.put("koala", Koala.class);
        animals.put("owl", Owl.class);
        animals.put("panda", Panda.class);
        animals.put("parrot", Parrot.class);
        animals.put("sheep", Sheep.class);

        // orange
        animals.put("elephant", Elephant.class);
        animals.put("giraffe", Giraffe.class);
        animals.put("kangaroo", Kangaroo.class);
        animals.put("lion", Lion.class);
        animals.put("monkey", Monkey.class);
        animals.put("rhino", Rhino.class);
        animals.put("tiger", Tiger.class);
        animals.put("zebra", Zebra.class);

        // red
        animals.put("crocodile", Crocodile.class);
        animals.put("flamingo", Flamingo.class);
        animals.put("hippo", Hippo.class);
    }

    @FXML
    protected void toggleAquarium(ActionEvent event) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aquarium.fxml"));
        DialogPane dialogPane = fxmlLoader.load();
        Dialog dialog = new Dialog();
        dialog.setDialogPane(dialogPane);

        dialog.initModality(Modality.APPLICATION_MODAL);
        Button closeButton = new Button();
        closeButton.setOnAction(e -> {
            ((Button) e.getSource()).getScene().getWindow().hide();
        });
        closeButton.setVisible(false);
        dialogPane.getButtonTypes().add(ButtonType.CLOSE);
        dialog.showAndWait();

    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Button action = (Button)event.getSource();
        String id = action.getId();
        Class<?> clazz = animals.get(id);
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Animal animal = (Animal)instance;
        Zone zone = animal.getZone();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("internal-dialog.fxml"));
        fxmlLoader.setController(this);
        DialogPane dialogPane = fxmlLoader.load();
        Dialog dialog = new Dialog();
        dialog.setDialogPane(dialogPane);


        if(animal.getZone().getZoneName().toLowerCase().equals("green")) {
            Image bgImage = new Image(getClass().getResourceAsStream("/image/background/" + changeZone(zone.getZoneName().toLowerCase()) + ".gif"));
            this.zone_background.setImage(bgImage);
        } else {
            Image bgImage = new Image(getClass().getResourceAsStream("/image/background/" + changeZone(zone.getZoneName().toLowerCase()) + ".png"));
            this.zone_background.setImage(bgImage);
        }


        Image newImage = new Image(getClass().getResourceAsStream("/image/animal/" + id + "/" + id + ".png"));
        this.animal_name.setText(id.toUpperCase());
        this.animal_image.setImage(newImage);
        this.zone_name.setText("ZONE " + zone.getZoneName().substring(0, 1));
        this.pane_1.setStyle("-fx-background-color:" + changeColor(zone.getZoneName()) + ";-fx-background-radius:8");
        this.pane_2.setStyle("-fx-background-color:" + changeColor(zone.getZoneName()) + ";-fx-background-radius:8");
        this.description.setText(animal.getDescription());
        String[] val = animal.getNearByAnimals().split("\n");
        for(int i = 0; i < val.length;i++) {
            String[] splitted = val[i].split(" ");
            Label label1 = new Label(splitted[0]);
            Label label2 = new Label(" ".repeat(6) + splitted[1]);
            label1.setPrefSize(100, 30);
            label2.setPrefSize(100, 30);
            label1.setFont(Font.font("Arial", 20));
            label2.setFont(Font.font("Arial", 20));

            nearby.add(label1, 0, i);
            nearby.add(label2, 1, i);
        }
        this.close_button.setOnAction(e -> {
            ((Button) e.getSource()).getScene().getWindow().hide();
        });
        dialog.initModality(Modality.APPLICATION_MODAL);
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
            default:
                return "#63D8F5";
        }
    }

    private String changeZone(String zone) {
        if(zone.equals("red") || zone.equals("blue") || zone.equals("green") || zone.equals("orange")) {
            return zone;
        } else {
            return "aquarium";
        }
    }

}
