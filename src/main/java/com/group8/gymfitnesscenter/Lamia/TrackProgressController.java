package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class TrackProgressController extends BaseController {

    @FXML private ComboBox<String> memberComboBox;
    @FXML private TextArea progressArea;
    @FXML private Label statusLabel;


    private final List<MemberProgress> progressList = new ArrayList<>();

    public void initialize() {
        // Example members, replace with real data
        memberComboBox.setItems(FXCollections.observableArrayList(
                "Lamia", "gg", "Anika"
        ));
    }

    @FXML
    private void handleUpdateProgress() {
        String member = memberComboBox.getValue();
        String progress = progressArea.getText();

        if(member == null || member.isEmpty()) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Please select a member.");
            return;
        }

        if(progress == null || progress.isEmpty()) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Please enter progress details.");
            return;
        }


        MemberProgress existing = progressList.stream()
                .filter(p -> p.getMemberName().equals(member))
                .findFirst().orElse(null);

        if(existing != null) {
            existing.setProgress(progress);
        } else {
            progressList.add(new MemberProgress(member, progress));
        }

        statusLabel.setStyle("-fx-text-fill: green;");
        statusLabel.setText("Progress updated for " + member);
    }

    @FXML
    private void handleGenerateReport() {
        String member = memberComboBox.getValue();

        if(member == null || member.isEmpty()) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Please select a member.");
            return;
        }

        MemberProgress existing = progressList.stream()
                .filter(p -> p.getMemberName().equals(member))
                .findFirst().orElse(null);

        if(existing == null) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("No progress data found for " + member);
            return;
        }


        statusLabel.setStyle("-fx-text-fill: green;");
        statusLabel.setText("Progress Report for " + member + ": " + existing.getProgress());
    }


    private static class MemberProgress {
        private final String memberName;
        private String progress;

        public MemberProgress(String memberName, String progress) {
            this.memberName = memberName;
            this.progress = progress;
        }

        public String getMemberName() { return memberName; }
        public String getProgress() { return progress; }
        public void setProgress(String progress) { this.progress = progress; }
    }
}
