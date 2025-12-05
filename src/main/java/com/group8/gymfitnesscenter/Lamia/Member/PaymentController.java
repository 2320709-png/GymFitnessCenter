package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PaymentController extends BaseController {

    @FXML private ComboBox<String> paymentType;
    @FXML private TextField cardNumberField;
    @FXML private PasswordField cvvField;
    @FXML private Label expireLabel;


    @FXML
    private void payButton() {

        String selectedPlan = paymentType.getValue();

        if (selectedPlan == null) {
            showAlert(Alert.AlertType.WARNING, "Payment Error",
                    "Please select a membership plan before proceeding.");
            return;
        }


        String card = cardNumberField.getText().trim();
        String cvv = cvvField.getText().trim();

        if (card.length() < 6 || cvv.length() < 3) {
            showAlert(Alert.AlertType.ERROR, "Verification Failed",
                    "Invalid Card/Bank details.\nPlease enter correct information.");
            return;
        }


        boolean paymentSuccess = simulatePayment(selectedPlan, card, cvv);

        if (!paymentSuccess) {
            showAlert(Alert.AlertType.ERROR, "Payment Failed",
                    "Transaction could not be completed.");
            return;
        }


        UserData.setMembership(selectedPlan);


        sendReceipt(selectedPlan);

        showAlert(Alert.AlertType.INFORMATION, "Payment Successful",
                "Your membership has been updated to:\n" + selectedPlan);
    }


    private boolean simulatePayment(String plan, String card, String cvv) {

        return true;
    }

    private void sendReceipt(String plan) {
        System.out.println("Receipt sent to: " + UserData.getEmail());
        System.out.println("Membership Plan Purchased: " + plan);
        System.out.println("Membership ID: " + UserData.getMemberID());
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
