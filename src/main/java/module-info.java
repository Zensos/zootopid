module com.example.zootopid {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.zootopid to javafx.fxml;
    exports com.example.zootopid;
}