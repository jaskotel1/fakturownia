package pl.fakturownia.modfx;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainFX extends Application {

    public MainFX() {
        System.out.println("Constructor");
    }

    @Override
    public void start(Stage stage) {
        System.out.println("Start");
        stage.setTitle("Hello FX!");
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);
    }

    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
