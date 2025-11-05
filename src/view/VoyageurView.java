package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VoyageurView {

    public void show(Stage stage) {
        stage.setTitle("Interface Voyageur");

        VBox vbox = new VBox(15);
        vbox.setPadding(new Insets(20));

        Label lblVols = new Label("Vols disponibles :");
        ListView<String> listVols = new ListView<>();
        listVols.getItems().addAll(
                "Vol 1 : Casablanca → Paris",
                "Vol 2 : Rabat → Madrid",
                "Vol 3 : Tanger → Rome"
        );

        Button btnReserver = new Button("Réserver un siège");

        Label lblMessage = new Label();

        btnReserver.setOnAction(e -> {
            String volChoisi = listVols.getSelectionModel().getSelectedItem();
            if (volChoisi == null) {
                lblMessage.setText("⚠ Veuillez sélectionner un vol !");
            } else {
                lblMessage.setText("✅ Réservation sur " + volChoisi);
                new SiegeSelectionView().show(stage); // passe à la fenêtre de sélection des sièges
            }
        });

        vbox.getChildren().addAll(lblVols, listVols, btnReserver, lblMessage);

        Scene scene = new Scene(vbox, 500, 400);
        stage.setScene(scene);
        stage.show();
    }
}