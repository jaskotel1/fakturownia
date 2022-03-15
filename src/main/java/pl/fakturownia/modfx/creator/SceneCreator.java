package pl.fakturownia.modfx.creator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Objects;

public class SceneCreator {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToPage(Window window, String pageAddress, String title) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(pageAddress)));
            stage = (Stage) window;
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
