module modfx {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.fakturownia.modfx.controller to javafx.graphics, javafx.fxml;
    exports pl.fakturownia.modfx to javafx.graphics, javafx.fxml;

    opens pl.fakturownia.modfx.controller to javafx.fxml;
}