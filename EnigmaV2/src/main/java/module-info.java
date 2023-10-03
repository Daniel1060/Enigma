module com.mycompany.enigmav2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.enigmav2 to javafx.fxml;
    exports com.mycompany.enigmav2;
}
