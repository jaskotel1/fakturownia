package pl.fakturownia.modfx.model;

import javafx.beans.property.SimpleStringProperty;

public class TotalsModel {

    private final SimpleStringProperty vatAmount;
    private final SimpleStringProperty netPrice;
    private final SimpleStringProperty vat;
    private final SimpleStringProperty gross;

    public TotalsModel(SimpleStringProperty vatAmount, SimpleStringProperty netPrice, SimpleStringProperty vat, SimpleStringProperty gross) {
        this.vatAmount = vatAmount;
        this.netPrice = netPrice;
        this.vat = vat;
        this.gross = gross;
    }

    public String getVatAmount() {
        return vatAmount.get();
    }

    public SimpleStringProperty vatAmountProperty() {
        return vatAmount;
    }

    public String getNetPrice() {
        return netPrice.get();
    }

    public SimpleStringProperty netPriceProperty() {
        return netPrice;
    }

    public String getVat() {
        return vat.get();
    }

    public SimpleStringProperty vatProperty() {
        return vat;
    }

    public String getGross() {
        return gross.get();
    }

    public SimpleStringProperty grossProperty() {
        return gross;
    }
}
