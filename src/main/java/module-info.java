module com.group8.gymfitnesscenter {
    requires javafx.controls;
    requires javafx.fxml;





    opens com.group8.gymfitnesscenter to javafx.fxml;
    exports com.group8.gymfitnesscenter;
    exports com.group8.gymfitnesscenter.Lamia;
    opens com.group8.gymfitnesscenter.Lamia to javafx.fxml;
    exports com.group8.gymfitnesscenter.Lamia.Member;
    opens com.group8.gymfitnesscenter.Lamia.Member to javafx.fxml;
    exports com.group8.gymfitnesscenter.Lamia.Trainer;
    opens com.group8.gymfitnesscenter.Lamia.Trainer to javafx.fxml;
    exports com.group8.gymfitnesscenter.salesManager;
    opens com.group8.gymfitnesscenter.salesManager to javafx.fxml;
}
