module com.group8.gymfitnesscenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group8.gymfitnesscenter to javafx.fxml;
    exports com.group8.gymfitnesscenter;
}