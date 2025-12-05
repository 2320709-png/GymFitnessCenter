package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;

public class FeedBackController extends BaseController {

    @FXML
    private Slider ratingSlider;

    @FXML
    private TextArea feedbackText;

    @FXML
    public void initialize() {
        ratingSlider.setValue(3); // default rating
    }

    @FXML
    private void submitFeedback(ActionEvent event) {
        int rating = (int) ratingSlider.getValue();
        String review = feedbackText.getText().trim();

        // Validate input
        if (review.isEmpty()) {
            showAlert("Error", "Please write a feedback message!");
            return;
        }

        // Simulate saving feedback
        // You can later store it in file/database
        showAlert("Thank You!",
                "Your feedback has been submitted.\nRating: " + rating + "\nReview: " + review);

        // Clear form
        ratingSlider.setValue(3);
        feedbackText.clear();
    }



    // Reusable alert method
    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }
}
