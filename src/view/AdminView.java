package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AdminView {

    public void show(Stage stage) {
        stage.setTitle("Interface Administrateur");

        // --- Menu principal ---
        TabPane tabPane = new TabPane();

        // Onglet 1 : Gestion des voyageurs
        Tab tabVoyageurs = new Tab("Voyageurs", creerOngletGestion("Voyageurs"));
        // Onglet 2 : Gestion des avions
        Tab tabAvions = new Tab("Avions", creerOngletGestion("Avions"));
        // Onglet 3 : Gestion des vols
        Tab tabVols = new Tab("Vols", creerOngletGestion("Vols"));
        // Onglet 4 : Gestion des billets
        Tab tabBillets = new Tab("Billets", creerOngletGestion("Billets"));

        tabPane.getTabs().addAll(tabVoyageurs, tabAvions, tabVols, tabBillets);

        Scene scene = new Scene(tabPane, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    // Méthode pour créer un onglet de gestion simple
    private BorderPane creerOngletGestion(String type) {
        BorderPane pane = new BorderPane();

        // --- Zone de boutons ---
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10));

        Button btnAjouter = new Button("Ajouter " + type);
        Button btnModifier = new Button("Modifier");
        Button btnSupprimer = new Button("Supprimer");
        Button btnAfficher = new Button("Afficher");

        hBox.getChildren().addAll(btnAjouter, btnModifier, btnSupprimer, btnAfficher);

        // --- Zone d'affichage (table vide pour l'instant) ---
        TextArea textArea = new TextArea();
        textArea.setPromptText("Résultats de gestion des " + type.toLowerCase());
        textArea.setPrefHeight(400);

        pane.setTop(hBox);
        pane.setCenter(textArea);

        return pane;
    }
}