package pl.fakturownia.modfx.model;

public class InvoiceItemModel {

    private final Long id;
    private final String itemName;
    private final Long amount;
    private final String jm;
    private final Double netPrice;
    private final Double discount;
    private final Double netPriceDiscount;
    private final Integer vat;
    private final Double netAmount;
    private final Double vatAmount;
    private final Double grossAmount;
    private static long counter = 0;

    public InvoiceItemModel(String itemName, Long amount, String jm, Double netPrice, Double discount, Double netPriceDiscount, Integer vat,
                            Double amountPrice, Double amountVat, Double grossAmount) {
        this.id = ++counter;
        this.itemName = itemName;
        this.amount = amount;
        this.jm = jm;
        this.netPrice = netPrice;
        this.discount = discount;
        this.netPriceDiscount = netPriceDiscount;
        this.vat = vat;
        this.netAmount = amountPrice;
        this.vatAmount = amountVat;
        this.grossAmount = grossAmount;
    }

    public Long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public Long getAmount() {
        return amount;
    }

    public String getJm() {
        return jm;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getNetPriceDiscount() {
        return netPriceDiscount;
    }

    public Integer getVat() {
        return vat;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public Double getVatAmount() {
        return vatAmount;
    }

    public Double getGrossAmount() {
        return grossAmount;
    }

    @Override
    public String toString() {
        return "InvoiceItemModel{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", amount=" + amount +
                ", jm='" + jm + '\'' +
                ", netPrice=" + netPrice +
                ", discount=" + discount +
                ", netPriceDiscount=" + netPriceDiscount +
                ", vat=" + vat +
                ", amountPrice=" + netAmount +
                ", amountVat=" + vatAmount +
                ", grossPrice=" + grossAmount +
                '}';
    }
}
