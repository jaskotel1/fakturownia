package pl.fakturownia.modfx.model;

import javafx.beans.property.SimpleStringProperty;

public class InvoiceItemModel {

    private final SimpleStringProperty id;
    private final SimpleStringProperty itemName;
    private final SimpleStringProperty amount;
    private final SimpleStringProperty jm;
    private final SimpleStringProperty netPrice;
    private final SimpleStringProperty discount;
    private final SimpleStringProperty netPriceDiscount;
    private final SimpleStringProperty vat;
    private final SimpleStringProperty amountPrice;
    private final SimpleStringProperty amountVat;
    private final SimpleStringProperty grossPrice;

    public InvoiceItemModel(SimpleStringProperty id, SimpleStringProperty itemName, SimpleStringProperty amount, SimpleStringProperty jm,
                            SimpleStringProperty netPrice, SimpleStringProperty discount, SimpleStringProperty netPriceDiscount,
                            SimpleStringProperty vat, SimpleStringProperty amountPrice, SimpleStringProperty amountVat, SimpleStringProperty grossPrice) {
        this.id = id;
        this.itemName = itemName;
        this.amount = amount;
        this.jm = jm;
        this.netPrice = netPrice;
        this.discount = discount;
        this.netPriceDiscount = netPriceDiscount;
        this.vat = vat;
        this.amountPrice = amountPrice;
        this.amountVat = amountVat;
        this.grossPrice = grossPrice;
    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public String getItemName() {
        return itemName.get();
    }

    public SimpleStringProperty itemNameProperty() {
        return itemName;
    }

    public String getAmount() {
        return amount.get();
    }

    public SimpleStringProperty amountProperty() {
        return amount;
    }

    public String getJm() {
        return jm.get();
    }

    public SimpleStringProperty jmProperty() {
        return jm;
    }

    public String getNetPrice() {
        return netPrice.get();
    }

    public SimpleStringProperty netPriceProperty() {
        return netPrice;
    }

    public String getDiscount() {
        return discount.get();
    }

    public SimpleStringProperty discountProperty() {
        return discount;
    }

    public String getNetPriceDiscount() {
        return netPriceDiscount.get();
    }

    public SimpleStringProperty netPriceDiscountProperty() {
        return netPriceDiscount;
    }

    public String getVat() {
        return vat.get();
    }

    public SimpleStringProperty vatProperty() {
        return vat;
    }

    public String getAmountPrice() {
        return amountPrice.get();
    }

    public SimpleStringProperty amountPriceProperty() {
        return amountPrice;
    }

    public String getAmountVat() {
        return amountVat.get();
    }

    public SimpleStringProperty amountVatProperty() {
        return amountVat;
    }

    public String getGrossPrice() {
        return grossPrice.get();
    }

    public SimpleStringProperty grossPriceProperty() {
        return grossPrice;
    }
}
