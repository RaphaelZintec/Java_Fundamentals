package Project1.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class MainApp extends Application {
    private StackPane root = new StackPane();
    private Scene scene = new Scene(root, 300, 200);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Color Change App");

        // Créez un bouton "Jaune"
        Button yellowButton = new Button("Jaune");
        yellowButton.setOnAction(e -> {
            root.setStyle("-fx-background-color: yellow;");
        });

        // Créez un bouton "Vert"
        Button greenButton = new Button("Vert");
        greenButton.setOnAction(e -> {
            root.setStyle("-fx-background-color: green;");
        });

        root.getChildren().addAll(yellowButton, greenButton);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
