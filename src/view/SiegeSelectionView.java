package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SiegeSelectionView {

    public void show(Stage stage) {
        stage.setTitle("Sélection des sièges");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        // --- Exemple : 4x4 sièges ---
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Button btnSiege = new Button("S" + (i * 4 + j + 1));
                btnSiege.setMinSize(60, 40);
                btnSiege.setStyle("-fx-background-color: lightgreen;");

                btnSiege.setOnAction(e -> {
                    if (btnSiege.getStyle().contains("lightgreen")) {
                        btnSiege.setStyle("-fx-background-color: red;");
                    } else {
                        btnSiege.setStyle("-fx-background-color: lightgreen;");
                    }
                });

                grid.add(btnSiege, j, i);
            }
        }

        Scene scene = new Scene(grid, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}