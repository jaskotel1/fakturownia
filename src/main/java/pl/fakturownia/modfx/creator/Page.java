package pl.fakturownia.modfx.creator;

public enum Page {
    START_PAGE("/fxml/startPage/startPage.fxml", "Fakturownia"),
    SIMPLE_INVOICE("/fxml/invoice/invoice.fxml", "Fakturownia - Stwórz fakturę"),
    APP_INFO("/fxml/help/appInfo.fxml", "Fakturownia - O programie");

    private final String pageAddress;
    private final String title;

    Page(String pageAddress, String title) {
        this.pageAddress = pageAddress;
        this.title = title;
    }

    public String getPageAddress() {
        return pageAddress;
    }

    public String getTitle() {
        return title;
    }
}
