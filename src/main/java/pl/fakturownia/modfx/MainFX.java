package pl.fakturownia.modfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.fakturownia.modfx.creator.Page;

import java.io.IOException;
import java.util.Objects;

public class MainFX extends Application {

    public MainFX() {}

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(Page.START_PAGE.getPageAddress())));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setTitle(Page.START_PAGE.getTitle());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() {
    }

    @Override
    public void stop() {
    }
}
