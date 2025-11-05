package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Administrateur;
import model.Voyageur;

public class LoginView {

    public void show(Stage stage) {
        stage.setTitle("Système de réservation - Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label lblLogin = new Label("Login:");
        TextField txtLogin = new TextField();
        Label lblPassword = new Label("Mot de passe:");
        PasswordField txtPassword = new PasswordField();
        Button btnLogin = new Button("Se connecter");
        Label lblMessage = new Label();

        grid.add(lblLogin, 0, 0);
        grid.add(txtLogin, 1, 0);
        grid.add(lblPassword, 0, 1);
        grid.add(txtPassword, 1, 1);
        grid.add(btnLogin, 1, 2);
        grid.add(lblMessage, 1, 3);

        btnLogin.setOnAction(e -> {
            String login = txtLogin.getText();
            String pwd = txtPassword.getText();

            // --- Simulation de connexion ---
            if (login.equals("admin") && pwd.equals("1234")) {
                lblMessage.setText("Connexion Administrateur réussie");
                new AdminView().show(stage);
            } else if (login.equals("voyageur") && pwd.equals("1234")) {
                lblMessage.setText("Connexion Voyageur réussie");
                new VoyageurView().show(stage);
            } else {
                lblMessage.setText("Login ou mot de passe incorrect");
            }
        });

        Scene scene = new Scene(grid, 400, 200);
        stage.setScene(scene);
        stage.show();
    }
}
