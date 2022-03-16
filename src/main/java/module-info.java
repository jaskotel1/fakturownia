module modfx {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;

    exports pl.fakturownia.modfx.controller to javafx.graphics, javafx.fxml;
    exports pl.fakturownia.modfx to javafx.graphics, javafx.fxml;

    opens pl.fakturownia.modfx.controller to javafx.fxml;
    opens pl.fakturownia.modfx.model to javafx.base;
}