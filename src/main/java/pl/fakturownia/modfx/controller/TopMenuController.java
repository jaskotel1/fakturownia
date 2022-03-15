package pl.fakturownia.modfx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import pl.fakturownia.modfx.creator.Page;
import pl.fakturownia.modfx.creator.SceneCreator;

public class TopMenuController {

    @FXML
    private MenuItem closeButton;

    @FXML
    private MenuItem appInfo;

    @FXML
    private MenuItem simpleInvoice;

    private final SceneCreator sceneCreator = new SceneCreator();

    public void closeButtonAction() {
        System.exit(0);
    }

    public void switchToSimpleInvoice(ActionEvent event) {
        sceneCreator.switchToPage(simpleInvoice.getParentPopup().getOwnerWindow(), Page.SIMPLE_INVOICE.getPageAddress(), Page.SIMPLE_INVOICE.getTitle());
    }

    public void switchToAppInfo(ActionEvent event) {
        sceneCreator.switchToPage(appInfo.getParentPopup().getOwnerWindow(), Page.APP_INFO.getPageAddress(), Page.APP_INFO.getTitle());
    }

}