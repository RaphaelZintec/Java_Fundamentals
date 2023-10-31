package Project1.Application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class InterfaceController implements Initializable {
    @FXML
    private Button jouerRejouerButton;
    @FXML
    private Button choisirAutreJeuButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Ajoutez ici la logique pour gérer les boutons et les événements
        jouerRejouerButton.setOnAction(event -> {
            // Action à effectuer lorsque le bouton Jouer/Rejouer est cliqué
        });

        choisirAutreJeuButton.setOnAction(event -> {
            // Action à effectuer lorsque le bouton Choisir un autre jeu est cliqué
        });
    }
}
